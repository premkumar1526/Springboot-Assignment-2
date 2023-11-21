# Spring Boot Project Autowired
 
This is a simple Spring Boot project demonstrating basic configurations, bean wiring, and usage of `@Autowired` in a field-based manner.
 
## Bean Configuration
 
- **AppConfig**: Configuration class responsible for defining beans for `Book`, `Student`, `Library`, and `Classroom`.
 
## Classes
 
- **Book**: Represents a book with title and author fields.
- **Student**: Represents a student with name and age fields.
- **Library**: Represents a library that uses the `@Autowired` annotation for field-based dependency injection of `Book`.
- **Classroom**: Represents a classroom that uses the `@Autowired` annotation for constructor-based dependency injection of `Student`.
- **ApplicationRunnerImpl**: Implements the Spring `ApplicationRunner` interface and demonstrates the usage of beans in the `run` method.
 
## Running the Application
 
1. Clone the repository.
2. Open the project in your favorite IDE.
3. Build and run the `AutowiredApplication` class.
4. Check the console for the details of the book and student.
 
## Configuration Details
 
- `application.properties`: Contains configuration properties such as server port, logging settings, etc.
