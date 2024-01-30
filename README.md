# Redis Utility Tool

## Overview

Redis Utility Tool is a robust Spring Boot application that simplifies interactions with Redis data stores. It provides
a suite of RESTful APIs to perform CRUD operations, manage, and query Redis data structures like hashmaps and sorted
sets. Featuring dynamic class loading, comprehensive Swagger API documentation, and Lettuce for optimal Redis
performance, it's the go-to solution for managing Redis data efficiently and effectively.

## Features

- **CRUD Operations**: Easy-to-use APIs for creating, reading, updating, and deleting Redis data.
- **Query Support**: Advanced querying capabilities for hashmaps and sorted sets.
- **Dynamic Class Loading**: Dropdowns in Swagger UI for selecting entity classes for object mapping.
- **Swagger Documentation**: Interactive and detailed API documentation.
- **Lettuce Integration**: High-performance Redis interactions.
- **Scalable & Secure**: Designed with scalability and security in mind.

## System Requirements

- Java 21
- Maven (for building the project)
- Redis server (local or remote)

## Setup and Installation

1. **Clone the Repository**
    ```bash
    git clone https://github.com/TecnicoR/redis-utility-tool.git
    cd redis-utility-tool
    ```

2. **Build the Project**
    ```bash
    mvn clean install
    ```

3. **Configure Application**
    - Update `src/main/resources/application.properties` or `src/main/resources/application.yml` with your Redis server
      details and any other configuration settings.

4. **Run the Application**
    ```bash
    java -jar target/redis-utility-tool-0.0.1-SNAPSHOT.jar
    ```

## Usage

Once the application is running, you can use the Swagger UI to interact with the APIs:

- **Swagger UI URL**: `http://localhost:8080/swagger-ui/`

## API Reference

Refer to the Swagger documentation at `http://localhost:8080/swagger-ui/` for a detailed description of all the
endpoints, their parameters, and usage.

## Contributing

Contributions are welcome! Please feel free to submit pull requests, create issues for bugs and feature requests, and
provide feedback.

## License

[MIT License](LICENSE) - see the LICENSE file for details.