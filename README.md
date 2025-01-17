# Spring_QualifierANootation_Example

Spring Dependency Injection Example with Multiple Implementations

This project demonstrates Spring's Dependency Injection (DI) using annotations. It includes:

Two use cases:

Sim Implementations: Airtel and Jio to simulate calling functionality.

Notification Services: EmailNotification and SMSNotification for message services.

Classes like Person and UserNotification use @Autowired and @Qualifier to inject dependencies.

Configuration with @ComponentScan to automatically detect and manage beans.

The application context initializes the Spring beans, retrieves them, and displays messages from both services and SIM implementations.
