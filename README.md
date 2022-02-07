# PruebaZemoga

These instructions will allow you to get a working copy of the project on your local machine for development and testing purposes.

## Pre requirements:

- Windows 10 or 11 operating system.
- Development IDE spring-tool-suite or IntelliJ IDEA Development IDE.
- Postman for using APIs.

## Installation:
- Import the project in any of the mentioned ides and run the project.
- Then you need to put the following requests in postman

### -. Api 1: consult user data
   URL: localhost:8080/api/portfolio/8 (8 is the portfolio id)
   Method: GET
   Body: does not apply
   
   When executed, it will show the correct answer as follows:
   
   {
    "consultarPortafolioDTO": {
        "description": "I am a systems engineer ",
        "experience": "I have experience in Oracle database and Java programming language.",
        "imageUrl": "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/evolucion-leonardo-dicaprio-principal-1573497722.jpg?crop=1.00xw:0.747xh;0,0.0811xh&resize=980:*",
        "lastNames": "Moreira",
        "names": "Virlis",
        "tweetsTimeLine": [
            "backend_test  : this is my test from Java fecha Sun Nov 08 18:12:45 COT 2020",
            "backend_test  : this is my message RPMC fecha Sun Nov 08 18:01:35 COT 2020"
        ]
    },
    "statusDTO": {
        "code": "0000",
        "message": "Ok"
    }
   }
   
   In case the request is not correct, the following will respond
   
   {
    "consultarPortafolioDTO": null,
    "statusDTO": {
        "code": "9999",
        "message": "Failed transaction"
    }
   }
   
   ### -. Api 2: Modify some user data
   URL: localhost:8080/api/portfolio/update
   Method: POST
   Body: 
   {
    "description": "I am a systems engineer ",
    "experience": "I have experience in Oracle database and Java programming language.",
    "idPortfolio": "8"
   }
   
   ### Note: The idPortfolio field is used to search for the user, not to modify it
   
   When executed, it will show the correct answer as follows:
   
   {
    "code": "0000",
    "message": "Ok"
   }
   
   In case the request is not correct, the following will respond
   
   {
    "code": "8888",
    "message": "Client not found"
   }
   
   #### I couldn't complete the front-end, because when I tried to consume any of the services I got  the following error message: "It has been blocked by CORS policy...". I looked for the springboot documentation, where it indicated that you can add some statements on the method, class or throughout the program, but it didn't work for me. I also added extensions to the browsers to avoid the blocking  but I kept receiving the the same error message
   
   #### Make some tests in java of the service implementation class, in the "consultClientDataTest" class. I used the @Mock and @Test statement.
   
   built with:
   - Spring-tool-suite-4-4.13.1 IDE.
   - Sprintboot framework.
   - Jdk 17.
   - Maven Dependency Manager.
   
   
