[![CI/CD Pipeline](https://github.com/RUTENCO/lab2As/actions/workflows/build.yml/badge.svg)](https://github.com/RUTENCO/lab2As/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=coverage)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=bugs)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=RUTENCO_lab2As&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=RUTENCO_lab2As)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
