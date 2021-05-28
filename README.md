## Tech stack:
* **SpringBoot** framework for dependency-injection/developing the API
* **Maven** for dependency management
* **Open-API-3.0** for API contract

## Endpoints:
* Make sure participation service is up and running
* Get: http://localhost:8081/v1/email/{email}
  **Example Request:**
``` 
 http://localhost:8081/v1/email/john.doe@epam.com
```

## For testing locally:

### Using maven:
1. Clone this repo
2. Run the command for building the project  **'mvn clean install'**
5. Run the command for starting the springboot server- **mvn spring-boot:run**
