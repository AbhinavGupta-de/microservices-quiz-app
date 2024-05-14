package org.abhinavgpt.quizservice.exceptions;

public class NoQuizFoundException extends RuntimeException{
    public NoQuizFoundException(String message) {
        super(message);
    }
}
