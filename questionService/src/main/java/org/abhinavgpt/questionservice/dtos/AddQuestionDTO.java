package org.abhinavgpt.questionservice.dtos;

import java.util.List;

public record AddQuestionDTO(String question, List<String> options, String correctAnswer, String difficultyLevel,
                             String category) {
}
