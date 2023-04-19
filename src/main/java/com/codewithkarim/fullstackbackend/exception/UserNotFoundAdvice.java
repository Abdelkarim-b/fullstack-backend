package com.codewithkarim.fullstackbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice // @ControllerAdvice to indicate that it should apply to all controllers in the application
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleUserNotFoundException(UserNotFoundException exception){
        return exception.getMessage();
    }

    // public Map<String,String> exceptionHandler(UserNotFoundException exception){
    //    Map<String, String> errorMap = new HashMap<>();
    //    errorMap.put("error message", exception.getMessage());
    //    return  errorMap;
    //}
}
