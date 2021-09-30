# Session Clustering for OAuth 2.0 Applications With Spring Boot, Redis, and HAProxy

This repository contains example load balanced OAuth 2.0 application built with Spring Boot. If you'd like to see how it was built, please read, [Session Clustering for OAuth 2.0 Applications][blog].

**Prerequisites:** [Java 11 with GraalVM](https://sdkman.io/), [HTTPie](https://httpie.io/), and [Docker](https://docs.docker.com/engine/install/) v20.10+, and the [Okta CLI](https://cli.okta.com).

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

First, clone this repository:

```bash
git clone https://github.com/oktadev/okta-spring-sessions-example.git
```

You will need Java 11+, Install a JDK using [SDKMAN](https://sdkman.io)

Next, you'll need a free Okta developer account. Install the [Okta CLI](https://cli.okta.com/) and run `okta register` to sign up for a new account. If you already have an account, run `okta login`. Then, run `okta apps create`. Select the default app name, or change it as you see fit. Choose **Okta Spring Boot Starter** and press **Enter**. Accept the remaining defaults.

Start Redis and HAProxy using Docker Compose:

```bash
docker compose up
```

Start two terminal windows and start two instances of the Spring Boot application one on port `8081` and another on `8082`:

```bash
SERVER_PORT=8081 ./mvnw spring-boot:run

# and the second server

SERVER_PORT=8082 ./mvnw spring-boot:run
```

Open your browser to `http://localhost:8080`, after authentication reload the page a few times to toggle between servers.

## Help

Please post any questions as comments on [this example's blog post][blog], or on the [Okta Developer Forums](https://devforum.okta.com/).

## License

Apache 2.0, see [LICENSE](LICENSE).

[blog]: https://developer.okta.com/blog/2021/09/30/oauth-sessions-with-java
