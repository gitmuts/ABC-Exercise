**The journey to develop a USSD and mobile applications is broken down to the following steps:**
1.  Gather requirements
> This will involve talking to end users to get what they expect from the application(s).
> Doing research on simillar applications in the market.
> Talking to operations teams and developers to get non functional requirements such as: expected system load, how to monitor the system.

> From above, one is able to come up with a user journey, after which another meeting should be held with the various stakeholders, taking them through what has been
 documented and ensuring that nothing has been missed.   

2. Start system design
> This will be broken down to User experince(UX) design and architectural design.

> From the user journey one should be able to come up with the different user experiences the customers will be going through when interacting with the application. 
At this stage one asks themselves questions such: is the order in which I have placed the USSD menus straight forward enough? Or for a mobile APP, are the colors my brand colors, is the app friendly to use or users will have to be 
	trained to perform basic functions? From such questions one is able to refine the user journey to one which is most ideal.

> One of the other important factors to put into consideration is  the app or USSD application infrastructure, server and networking requirements.

> This will involve drawing the different architectural components e.g: VPN connection from telco, web server to receive traffic, backend to be called, 
data store to be used (DB) and caching if needed.

> In addition more factors to consider will be the platforms to support/Telco to connect to, for the APP whether to build an android, IOS and windows apps.

> Programming language to be used will also come up at this stage, putting into consideration the current team skillset and the effort required to 
	learn new technologies that will be used in the project.
  
  3. The next step will be system development
  > From the architecture document the system will be broken down the different components into smaller tasks. 
  
  > The size of these tasks should be ideally what one should be able to complete in 8 hours or less. 
  
  > From these one should be able to plan out which ones are the most important or are to be needed as soon as possible,
   say when working as a team of developers.
   
  > For a new project or when trying out new tools the first step will be setting up the development environment e.g. setting up a redis docker image
   if the team had not installed before.
 
  > After the developrs  can proceed and create a new git repository and start working on the broken down tasks, tracking each of them with tools such as trello or JIRA.
  
  > During development one of the important things will be daily standups to ensure everyone is upto speed with the current status and that team 
   challanges can be resolved early enough.
   
   
   4. Testing phase
   > Integration tests will be done for a particular module e.g: Is one module able to communicate to another module.
   
   > After integration tests are done the next round of tests will be System intergration test to confirm that say our system is able to call an external API
   
   > After intergration tests and SIT pass, the next tests will be user acceptance tests, mostly co-ordinated by the quality analysts and end users.
   
   > In each of these tests feedback will be sent back and forth to developers, who will resolve any issue that might be raised.

  5. Deployment
  
   > After the user has accepted that the system has met all the requirements that were shared, the operation team will prepare the solution for deployment.
   
   > From the system design document, the developer and operations team will come up with a checklist on the pre requisites for production e.g. database table creation
   
   > The next step will be execution of the deployment requirements, then finally deploy the solution.

  6. Monitoring and continous improvement
    
   > The operations team will provide production support and collecting user and system feedback. ie. Are the users finding the registration process 
   seamless? Is the system consuming too much memory? Is the system able to handle load during peak times?
   
   > From this feedback, the process can start all over again ie from user requirements gathering or for some cases go straight to development, then
   the change can be documented later.   
   
