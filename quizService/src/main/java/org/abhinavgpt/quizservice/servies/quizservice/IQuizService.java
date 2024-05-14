package org.abhinavgpt.quizservice.servies.quizservice;

import org.abhinavgpt.quizservice.dtos.AddQuizDTO;
import org.abhinavgpt.quizservice.model.Question;
import org.abhinavgpt.quizservice.model.Quiz;
import org.abhinavgpt.quizservice.model.Response;

import java.util.List;

public interface IQuizService {

    Quiz getQuizById(Long id);

    Quiz addQuiz(AddQuizDTO addQuizDTO);

    List<Question> getQuestionsByQuizId(Long id);

    Integer getScore(Long quizId, List<Response> responses);

}
