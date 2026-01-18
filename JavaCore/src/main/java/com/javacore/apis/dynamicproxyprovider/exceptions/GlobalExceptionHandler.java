package com.javacore.apis.dynamicproxyprovider.exceptions;

import com.javacore.apis.dynamicproxyprovider.GenericResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<GenericResponse<Object>> handleNullPointerException(NullPointerException ex) {
        log.error("NullPointerException occurred: {}", ex.getMessage(), ex);
        
        GenericResponse<Object> response = GenericResponse.error(
            "A required value was not provided",
            HttpStatus.BAD_REQUEST,
            ex.getMessage()
        );
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<GenericResponse<Object>> handleIllegalArgumentException(IllegalArgumentException ex) {
        log.error("IllegalArgumentException occurred: {}", ex.getMessage(), ex);
        
        GenericResponse<Object> response = GenericResponse.error(
            "Invalid request parameter",
            HttpStatus.BAD_REQUEST,
            ex.getMessage()
        );
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<GenericResponse<Object>> handleMissingParameter(MissingServletRequestParameterException ex) {
        log.error("Missing required parameter: {}", ex.getMessage(), ex);
        
        GenericResponse<Object> response = GenericResponse.error(
            "Missing required parameter: " + ex.getParameterName(),
            HttpStatus.BAD_REQUEST,
            ex.getMessage()
        );
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<GenericResponse<Object>> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        log.error("Type mismatch error: {}", ex.getMessage(), ex);
        
        GenericResponse<Object> response = GenericResponse.error(
            "Invalid parameter type for: " + ex.getName(),
            HttpStatus.BAD_REQUEST,
            ex.getMessage()
        );
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<GenericResponse<Object>> handleNotFound(NoHandlerFoundException ex) {
        log.error("Endpoint not found: {}", ex.getRequestURL());

        GenericResponse<Object> response = GenericResponse.error(
                "Requested resource not found",
                HttpStatus.NOT_FOUND,
                "No handler found for " + ex.getHttpMethod() + " " + ex.getRequestURL()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GenericResponse<Object>> handleGenericException(Exception ex) {
        log.error("Unexpected error occurred: {}", ex.getMessage(), ex);
        
        GenericResponse<Object> response = GenericResponse.error(
            "An unexpected error occurred",
            HttpStatus.INTERNAL_SERVER_ERROR,
            ex.getMessage()
        );
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
