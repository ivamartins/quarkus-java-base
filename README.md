# quarkus-java-base

[![CI](https://github.com/ivamartins/quarkus-java-base/actions/workflows/ci.yml/badge.svg)](https://github.com/ivamartins/quarkus-java-base/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://openjdk.org/)

> Part of the **Code Solutions Java Modernization Framework** product line. Starting base for modernizing legacy Java systems with Quarkus (modern Java + GraalVM native).

Minimal, functional Quarkus (modern Java) base project.

## Why this base

- **Quarkus 3** for fast, lightweight Java development
- **GraalVM native compilation** ready (build native images for tiny memory + instant startup)
- **Ready to extend** for the stacks we work with: integration with Kafka, REST for legacy systems, AI agents, databases, etc.
- **Perfect for**:
  - Modernizing legacy Java EE / Play / Spring applications
  - Building scalable backends with cloud-native deployment
  - Adding AI automations on top of Java services

## Quick start

**Prerequisites:** Java 17+ and Maven (or use the wrapper `./mvnw`).

```bash
# Development mode (recommended for getting started)
./mvnw compile quarkus:dev

# Production build
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

The app will start on `http://localhost:8080`.

## Native build (GraalVM)

```bash
./mvnw package -Dnative
./target/quarkus-java-base-runner
```

Produces a tiny native binary (~50MB) with instant startup and minimal memory footprint.

## Run the tests

```bash
./mvnw test
```

## Tech stack

- Java 17+
- Quarkus 3
- RESTEasy Reactive (JAX-RS)
- Hibernate ORM with Panache
- GraalVM native compilation (optional)

> **Português?** Veja [`README.pt-BR.md`](./README.pt-BR.md).

## See also

- **Related base**: [springboot-langchain4j-rag-mcp](https://github.com/ivamartins/springboot-langchain4j-rag-mcp) (AI Agent Kit with Quarkus-style setup)
- **Product line**: [Java Modernization Framework](https://ivamartins.github.io/code-solutions-site/#produtos)
- **Code Solutions on LinkedIn**: [linkedin.com/company/code-solutions-it](https://www.linkedin.com/company/code-solutions-it/)
- **All Code Solutions open source**: [github.com/ivamartins](https://github.com/ivamartins)

## License

MIT — see `LICENSE`.
