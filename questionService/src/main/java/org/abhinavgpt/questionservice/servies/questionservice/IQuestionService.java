package org.abhinavgpt.questionservice.servies.questionservice;

import org.abhinavgpt.questionservice.dtos.AddQuestionDTO;
import org.abhinavgpt.questionservice.model.Question;

import java.util.List;

public interface IQuestionService {

    List<Question> getQuestions();

    List<Question> getListQuestions(List<Long> ids);

    Question getQuestionById(Long id);

    Question addQuestion(AddQuestionDTO addQuestionDTO);

    Question updateQuestion(Question question);

    void deleteQuestion(Long id);

    List<Question> getQuestionsByCategory(String category);

    List<Question> getQuestionsByDifficulty(String difficulty);

    List<Question> getRandomQuestionsByCategoryAndDifficulty(String category, String difficulty, int limit);

}
