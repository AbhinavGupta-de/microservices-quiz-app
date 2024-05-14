package org.abhinavgpt.quizservice.dtos;

import java.util.List;

public record AddQuizDTO(String name, String description, List<Long> questionIds) {
}
