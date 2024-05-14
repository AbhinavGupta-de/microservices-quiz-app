package org.abhinavgpt.quizservice.servies.questionservice;

import org.abhinavgpt.quizservice.model.Question;

public interface IQuestionService {
    Question getQuestionById(Long id);
}
