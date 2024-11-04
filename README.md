# Social Connect Platform

A microservices-based networking platform designed for professionals to connect, share updates, and manage their connections. This project emphasizes scalability, real-time notifications, and modular services using Spring Boot, Kafka, Docker, and Kubernetes.

## Table of Contents

- [Project Overview](#project-overview)
- [Architecture](#architecture)
- [Services and Technologies](#services-and-technologies)
- [Setup and Installation](#setup-and-installation)
- [Future Plans](#future-plans)
- [Technologies Used](#technologies-used)

---

## Project Overview

This platform allows users to:
- Create profiles and manage professional connections.
- Share updates and receive real-time notifications.
- Use a reliable, scalable infrastructure ideal for professional networking.

---

## Architecture

This project follows a microservices architecture and includes the following components:

- **User Service**: Manages user profiles and handles JWT authentication.
- **Posts Service**: Handles CRUD operations for posts and likes, with Kafka producers for real-time updates.
- **Notification Service**: Manages notifications for connection requests and post activities, consuming Kafka events.
- **Discovery Service**: Eureka server for service discovery.
- **Connection Service**: Manages user connections using Neo4j, includes Kafka producer for connection events.

Each service is containerized with Docker and orchestrated using Kubernetes for scaling and resilience.

---

## Services and Technologies

| Service             | Description                                                                                  | Tech Stack                        |
|---------------------|----------------------------------------------------------------------------------------------|-----------------------------------|
| **User Service**    | JWT Authentication, user management with Hibernate ORM                                      | Spring Boot, Hibernate, JWT       |
| **Posts Service**   | CRUD operations for posts and likes, Kafka producers for real-time updates                   | Spring Boot, Kafka                |
| **Notification Service** | Kafka consumer for notifications (connection requests, post creation)                   | Spring Boot, Kafka                |
| **Discovery Service** | Eureka Server for service discovery among microservices                                   | Eureka                            |
| **Connection Service** | Manages connections using Neo4j, Cypher Query Language, Kafka producers for events        | Spring Boot, Neo4j, Cypher, Kafka |

---

## Setup and Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/username/social-connect-platform.git
    cd social-connect-platform
    ```

2. **Build Docker Images**:
    Build Docker images for each service:
    ```bash
    docker-compose build
    ```

3. **Start Services**:
    Start all services using Docker Compose:
    ```bash
    docker-compose up
    ```

4. **Access Services**:
    - The application runs on `http://localhost:<port-number>`.
    - Service ports are configured in `docker-compose.yml`.

---

## Future Plans

- **Deploy on Kubernetes** for high availability and auto-scaling.
- **Additional Features**: Social feeds, enhanced analytics, and content recommendations.

---

## Technologies Used

- **Languages**: Java
- **Frameworks**: Spring Boot (Microservices, AOP, Security)
- **Messaging**: Kafka for asynchronous event handling
- **Database**: Neo4j for connection management, Hibernate ORM for user data
- **Containerization**: Docker
- **Orchestration**: Kubernetes (deployment in progress)
