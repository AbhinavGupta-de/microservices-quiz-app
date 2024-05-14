package org.abhinavgpt.questionservice.exceptions;

public class NoQuestionFoundException extends RuntimeException {
    public NoQuestionFoundException(String message) {
        super(message);
    }
}
