# SOAP Hello World Service

This project implements a basic SOAP web service using Java and Maven. It provides a simple "Hello World" operation that demonstrates the fundamental concepts of the SOAP architecture.

---

## Prerequisites

- **Java**: JDK 8 or higher.
- **Maven**: Version 3.6.0 or later.
- **Java IDE**: Eclipse, NetBeans, IntelliJ IDEA, or another preferred IDE.
- **SoapUI**: Optional, for testing.

---

## Project Structure

```plaintext
Project-Soap/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── project/
│                       └── soap/
│                           ├── HelloWorldService.java
│                           └── HelloWorldPublisher.java
└── pom.xml
```
# Setup
1. Clone the repository:
```git clone [repository-url]
cd Project-Soap
```
2. Ensure the dependencies in pom.xml are correctly configured:
```
<dependencies>
    <dependency>
        <groupId>com.sun.xml.ws</groupId>
        <artifactId>jaxws-rt</artifactId>
        <version>2.3.5</version>
    </dependency>
</dependencies>

```
# Main Components
HelloWorldService.java

* The main class for the SOAP service.
* Annotated with @WebService.
* Provides the greet method that accepts a name and returns a greeting.

# HelloWorldPublisher.java
* Class responsible for publishing the web service.
* Sets the endpoint at: http://localhost:8080/HelloWorldService.
* Starts a lightweight HTTP server to expose the WSDL.

# Usage
* Build the project:
```
mvn clean install
```
# Run the service:
1. Run the HelloWorldPublisher class directly.
2. Alternatively, run from the command line:
```
mvn exec:java -Dexec.mainClass="com.mycompany.project.soap.HelloWorldPublisher"
```
# Check the service:
* Open a web browser.
* Go to: http://localhost:8080/HelloWorldService?wsdl.
* The WSDL document for the service should be displayed.

# Testing
Using SoapUI
* Create a new SOAP project.

* Use the WSDL URL: http://localhost:8080/HelloWorldService?wsdl.

* Generate a test request for the greet operation.

* Modify the request XML as follows:
```
<soapenv:Envelope>
   <soapenv:Header/>
   <soapenv:Body>
      <soap:greet>
         <name>Juan</name>
      </soap:greet>
   </soapenv:Body>
</soapenv:Envelope>
```
Expected Response:
```
<soapenv:Envelope>
   <soapenv:Body>
      <ns2:greetResponse>
         <return>Hello, Juan!</return>
      </ns2:greetResponse>
   </soapenv:Body>
</soapenv:Envelope>
```
# Key Features
* Basic SOAP service implementation.
* Uses JAX-WS for web services.
* Automatic WSDL generation.
* Supports XML messaging.
* Simple greeting operation.

# Troubleshooting
If the service does not start:
* Check if port 8080 is available.
* Verify Java and Maven installations.
* Check the dependencies in the pom.xml file.

# If the WSDL is not accessible:
* Ensure the service is running.
* Verify the service URL.
* Check the firewall settings.

# Contributing
* Fork the repository.
* Create a branch for your feature:
```
git checkout -b feature/AmazingFeature
```
* Commit your changes:
```
git commit -m 'Add some AmazingFeature'
```

* Push the branch to the remote repository:
```
git push origin feature/AmazingFeature
```

* Open a Pull Request for review.

# RESULTS
![image](https://github.com/user-attachments/assets/ca586a68-f878-4a1f-8900-8fc75bc3edaa)
![image](https://github.com/user-attachments/assets/22c096f3-7e18-4ef6-bef4-41e1e507d7e7)



