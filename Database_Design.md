
### a. A user management database schema, where users have different roles. Include necessary constraints.


> - Table to hold users data
> - Table to hold roles data
> - Table to hold different users and their roles....since on user can have several roles


```
CREATE TABLE users (
  id serial PRIMARY KEY,
  username varchar(255) UNIQUE NOT NULL,
  name varchar(255) NOT NULL,
  active int,
  password varchar(255),
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP NULL
);
```


```
CREATE TABLE roles (
  id serial PRIMARY KEY,
  name varchar(255) UNIQUE NOT NULL,
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP
);
```


```
CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  created_at TIMESTAMP NOT NULL,
  PRIMARY KEY (user_id, role_id),
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id)
);
```

### b. Create SQL insert statements, to add 2 sample users, 3 sample roles, and to assign each user to have at least 2 of the created roles.
```

INSERT INTO users(username, name, active, created_at) values('jmark', 'John Mark', 1, CURRENT_TIMESTAMP);
INSERT INTO users(username, name, active, created_at) values('mjane', 'Mercy Jane', 1, CURRENT_TIMESTAMP);

INSERT INTO roles(name, created_at) VALUES('ROLE_CHECKER', CURRENT_TIMESTAMP);
INSERT INTO roles(name, created_at) VALUES('ROLE_MAKER', CURRENT_TIMESTAMP);
INSERT INTO roles(name, created_at) VALUES('ROLE_AUDIT', CURRENT_TIMESTAMP);

INSERT INTO user_role(user_id, role_id, created_at) VALUES((select id from users where username='jmark'), (select id from roles where name='ROLE_CHECKER'), CURRENT_TIMESTAMP);
INSERT INTO user_role(user_id, role_id, created_at) VALUES((select id from users where username='jmark'), (select id from roles where name='ROLE_AUDIT'), CURRENT_TIMESTAMP);

INSERT INTO user_role(user_id, role_id, created_at) VALUES((select id from users where username='mjane'), (select id from roles where name='ROLE_MAKER'), CURRENT_TIMESTAMP);
INSERT INTO user_role(user_id, role_id, created_at) VALUES((select id from users where username='mjane'), (select id from roles where name='ROLE_AUDIT'), CURRENT_TIMESTAMP);

```
### c. Create SQL select statements showing all users and respective roles.

```
Select u.*, r.name from users  u inner join user_role ur on u.id = ur.user_id inner join roles r on r.id = ur.role_id;
```

### d. Write a select statement that lists all roles for a specific user.

```
Select r.* from users  u inner join user_role ur on u.id = ur.user_id inner join roles r on r.id = ur.role_id where u.username='mjane';
```
### e. Write a select statement that lists all users that have a specific role.

```
Select u.* from users  u inner join user_role ur on u.id = ur.user_id inner join roles r on r.id = ur.role_id where r.name='ROLE_AUDIT';
```
