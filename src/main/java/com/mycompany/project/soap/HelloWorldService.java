package com.mycompany.project.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "HelloWorldService")
public class HelloWorldService {
    
    @WebMethod(operationName = "saludar")
    public String saludar(@WebParam(name = "nombre") String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}