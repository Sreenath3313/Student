package org.example.demo;

// Importing Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Spring Boot application.
 *
 * @SpringBootApplication includes:
 * - @Configuration: marks this class as a source of bean definitions
 * - @EnableAutoConfiguration: enables auto-configuration of Spring context
 * - @ComponentScan: scans for components in this package and sub-packages
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Launches the Spring Boot application
        SpringApplication.run(DemoApplication.class, args);
    }
}
