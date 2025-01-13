package com.mycompany.project.soap;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {
        HelloWorldService helloWorld = new HelloWorldService();
        String address = "http://localhost:8080/HelloWorldService";
        Endpoint.publish(address, helloWorld);
        System.out.println("Servicio web disponible en: " + address + "?wsdl");
    }
}