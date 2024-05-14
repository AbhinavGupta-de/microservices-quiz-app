package org.abhinavgpt.quizservice.exceptions;

public class NoQuestionFoundException extends RuntimeException {
    public NoQuestionFoundException(String message) {
        super(message);
    }
}
