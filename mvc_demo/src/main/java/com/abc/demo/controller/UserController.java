package com.abc.demo.controller;


import com.abc.demo.model.User;
import com.abc.demo.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {

    /*
     API will be accessible via IP:port/api/users
     Not security has been implemented yet, JWT tokens can be supported
     Post man collection included in project
     */

    final UserRepo userRepo;

    public UserController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping()
    public ResponseEntity<?> getUsers() {
        try{
            return new ResponseEntity(userRepo.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Error occurred, try later", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody User user) {
        try{
            // Do validations such as username, since unique
            log.info("Received request to create user {}", user);
            userRepo.save(user);
            return new ResponseEntity("User Created successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Error occurred, try later", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping()
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        try{
            log.info("Received request to update user {}", user);
            userRepo.save(user);
            return new ResponseEntity("User updated successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Error occurred, try later", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteUser(@RequestBody User user) {
        try{
            userRepo.delete(user);
            return new ResponseEntity("User deleted successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Error occurred, try later", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
