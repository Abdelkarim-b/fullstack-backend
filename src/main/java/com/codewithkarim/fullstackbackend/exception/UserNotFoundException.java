package com.codewithkarim.fullstackbackend.exception;

public class  UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        // Le mot-clé « super » peut également être utilisé pour appeler le constructeur de la classe mère. public RuntimeException (String msg)
        // The "super" keyword can also be used to call the constructor of the parent class. public RuntimeException (String msg)
        super("Could not found the user with id: "+id);
    }
}
