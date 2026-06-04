# Virat Bank - Distributed Microservices Application

A modern, production-ready retail banking backend built with **Java 21**, and **Microservices Architecture**.

## 🚀 Key Features & Architecture
* **Centralized Configuration:** Managed dynamically via Spring Cloud Config Server.
* **Service Discovery:** Self-registration and discovery using Spring Cloud Eureka Server.
* **API Gateway:** Core routing, load balancing, and security enforcement handled via Spring Cloud Gateway server.
* **Distributed Tracing & Observability:** Out-of-the-box system monitoring using **OpenTelemetry Java Agent**, feeding traces into **Grafana Tempo**, visualized cleanly via **Grafana UI**.
* **Identity & Access Management:** Secure API protection enforced by **Keycloak IAM** using OAuth2 and JWT tokens.
* **Asynchronous Messaging:** Event-driven communication integrated smoothly with **Apache Kafka**.

## 🛠️ Tech Stack
* **Backend:** Java 21, Spring Boot 4, Spring Cloud, Spring Data JPA
* **Database & Messaging:** MySQL 8.4, Apache Kafka
* **Observability:** OpenTelemetry, Grafana, Loki, Tempo, Prometheus, Alloy
* **DevOps:** Docker, Docker Compose

## 🏃 How to Run the Application Locally
1. Clone the repository.
2. Ensure Docker Desktop is running on an Intel/AMD x64 environment.
3. Boot up the entire 20-container ecosystem with a single command:
```bash
   docker compose up -d
```