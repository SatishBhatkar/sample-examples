package com.sat.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

 @ExceptionHandler(Exception.class)
  public final ResponseEntity<ErrorMessage> getError(Exception ex){
     ErrorMessage errorMessage=new ErrorMessage(ex.getMessage()," What else I can do fr");
     return new ResponseEntity<ErrorMessage>(errorMessage,new HttpHeaders(), HttpStatus.BAD_REQUEST);
 }
}
