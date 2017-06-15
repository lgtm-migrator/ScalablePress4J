[![Build Status](https://travis-ci.org/gcauchis/ScalablePress4J.svg?branch=master)](https://travis-ci.org/gcauchis/ScalablePress4J) [![Javadocs](http://www.javadoc.io/badge/com.github.gcauchis/ScalablePress4j.svg)](http://www.javadoc.io/doc/com.github.gcauchis/ScalablePress4j) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.gcauchis/ScalablePress4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.gcauchis/ScalablePress4j) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/51a70ee3f0f14a949da114e1c717498b)](https://www.codacy.com/app/gcauchis/ScalablePress4J?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=gcauchis/ScalablePress4J&amp;utm_campaign=Badge_Grade) [![SonarQube Coverage](https://sonarcloud.io/api/badges/measure?key=com.github.gcauchis%3AScalablePress4j&metric=coverage)](https://sonarcloud.io/dashboard?id=com.github.gcauchis%3AScalablePress4j)
# Scalable Press java Wrapper

This is a java 8 wrapper for [Scalable Press API](https://scalablepress.com/docs/)

## Spring Bean
- ScalablePress4J is a service provider bean who provide APIs:
  - ProductApi implement [Product API](https://scalablepress.com/docs/#product-api)
  - QuoteApi implement [Quote API](https://scalablepress.com/docs/#quote-api)
  - OrderApi implement [Order API](https://scalablepress.com/docs/#order-api)
  - EventApi implement [Event API](https://scalablepress.com/docs/#event-api)
  - DesignApi implement [Design  API](https://scalablepress.com/docs/#design-api)
  - BillingApi implement [Billing  API](https://scalablepress.com/docs/#billing-api)
  - ReshipApi implement [Reship  API](https://scalablepress.com/docs/#reship-api)
  - MockupApi implement [Mockup  API](https://scalablepress.com/docs/#mockup-api)

## Configuration
- You need an application.properties with the property `scalablepress.api.basicauth` who contain your API key. You can obtain you API key on [https://scalablepress.com/docs/#authentication](https://scalablepress.com/docs/#authentication).

## Maven configuration

ScalablePress4J is available on [Maven Central](http://search.maven.org/#search|ga|1|a%3A%22ScalablePress4j%22). You just have to add the following dependency in your `pom.xml` file.

```xml
<dependency>
    <groupId>com.github.gcauchis</groupId>
    <artifactId>ScalablePress4j</artifactId>
    <version>0.1.2</version>
</dependency>
```

For ***snapshots***, add the following repository to your `pom.xml` file.
```xml
<repository>
    <id>sonatype snapshots</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
</repository>
```
The current snapshot version is `0.1.3-SNAPSHOT`.
