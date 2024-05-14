package org.abhinavgpt.questionservice.exceptionhandlers;

import org.abhinavgpt.questionservice.exceptions.NoQuestionFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoQuestionFoundException.class)
    public ResponseEntity<String> handleNoQuestionFoundException(NoQuestionFoundException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
