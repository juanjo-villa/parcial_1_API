Spring Boot Project with MySQL and Docker Compose

Spring Boot application with CRUD operations for students, courses, professors, enrollments, and grades. Uses MySQL as the database and Docker Compose for configuration.


Application Configuration:

   1. Database Configuration:

The MySQL database is configured in the `docker-compose.yml` file with the following credentials:

- Database name: `parcial`
- User: `juan`
- Password: `23202183A6A5FB`
- Exposed port: `5500`

    2. Spring Boot Configuration

The Spring Boot application is configured in the `application.properties` file:

- Application port: `4500`
- Database URL: `jdbc:mysql://localhost:5500/parcial`
- Database user: `juan`
- Database password: `23202183A6A5FB`

## Execution

1. Clone the repository:
   ```bash
   git clone <REPOSITORY_URL>
   cd <PROJECT_NAME>
