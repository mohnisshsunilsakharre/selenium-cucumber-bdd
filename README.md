# 🥒 Selenium + Java + Cucumber BDD Automation Framework

## 🚀 Overview

This project is a web UI automation framework built using **Java, Selenium WebDriver, Cucumber BDD, TestNG, and Maven**. It automates the OrangeHRM login workflow using readable **Gherkin feature files**, step definitions, and the Page Object Model (POM) design pattern.

The framework includes browser setup and teardown, reusable page classes, external configuration, Cucumber HTML reporting, Extent Reports integration, and screenshot capture for failed scenarios.

## 🛠️ Tech Stack

- Java 21
- Selenium WebDriver
- Cucumber (Gherkin)
- Cucumber-TestNG
- Maven
- Extent Reports
- Extent Reports Cucumber 7 Adapter
- Apache POI
- Log4j / SLF4J
- Page Object Model (POM)

## ✨ Key Features

- BDD-style test scenarios written in Gherkin
- Automated OrangeHRM login validation
- Cucumber feature files and step definitions
- Page Object Model with Login and Home page classes
- Reusable WebDriver setup and teardown
- Configuration through `config.properties`
- Test execution through Cucumber TestNG runner
- Cucumber HTML and Extent HTML reporting
- Screenshot capture on failed scenarios

## 📁 Project Structure

```text
src/
├── main/
│   └── java/
│       ├── base/              # WebDriver and Extent report management
│       ├── pages/              # Page Object classes
│       └── utilities/          # Configuration and screenshot utilities
└── test/
    ├── java/
    │   ├── hooks/              # Cucumber hooks
    │   ├── runners/            # Cucumber TestNG runner
    │   └── stepdefinitions/    # Gherkin step implementations
    └── resources/
        ├── features/           # .feature files
        ├── config.properties
        └── extent.properties
```

## ▶️ Prerequisites

- JDK 21
- Maven
- Google Chrome
- An IDE such as Eclipse or IntelliJ IDEA (optional)

## ⚙️ Configuration

Review `src/test/resources/config.properties` and set the application URL, browser, and valid test credentials. Never publish private credentials in a public repository.

## ▶️ How to Run

From the project root, execute:

```bash
mvn clean test
```

The Cucumber TestNG runner is configured in:

```text
src/test/java/runners/TestRunner.java
```

## 📊 Test Reports

The project is configured to generate:

```text
reports/cucumber.html
reports/ExtentReport.html
```

Failure screenshots are configured to be saved under:

```text
reports/screenshots/
```

## 🧪 Current Test Coverage

- OrangeHRM valid login scenario
- Dashboard visibility after successful login

## 🧾 Example BDD Scenario

```gherkin
Feature: OrangeHRM Login

  Scenario: Valid Login
    Given User launches OrangeHRM login page
    When User enters valid username and password
    And User clicks login button
    Then User should be navigated to dashboard
```

## 👨‍💻 Author

**Mohnissh(Naaccht)**

---
*This repository is an educational BDD automation framework project. Add further scenarios as the framework evolves.*
