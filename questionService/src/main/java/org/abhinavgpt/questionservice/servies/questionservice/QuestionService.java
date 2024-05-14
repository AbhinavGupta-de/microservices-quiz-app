package org.abhinavgpt.questionservice.servies.questionservice;

import org.abhinavgpt.questionservice.dtos.AddQuestionDTO;
import org.abhinavgpt.questionservice.exceptions.NoQuestionFoundException;
import org.abhinavgpt.questionservice.model.Question;
import org.abhinavgpt.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {

    QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new NoQuestionFoundException("No question found with id: " + id));
    }

    @Override
    public List<Question> getListQuestions(List<Long> ids) {
        return ids.stream().map(this::getQuestionById).toList();
    }

    @Override
    public Question addQuestion(AddQuestionDTO addQuestionDTO) {
        Question question = new Question(addQuestionDTO.question(), addQuestionDTO.correctAnswer(), addQuestionDTO.options(), addQuestionDTO.difficultyLevel(), addQuestionDTO.category());
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {

        Question questionToUpdate = questionRepository.findById(question.getId()).orElseThrow(() -> new NoQuestionFoundException("No question found with id: " + question.getId()));
        if (question.getTitle() != null) {
            questionToUpdate.setTitle(question.getTitle());
        }
        if (question.getCorrectAnswer() != null) {
            questionToUpdate.setCorrectAnswer(question.getCorrectAnswer());
        }
        if (question.getOptions() != null) {
            questionToUpdate.setOptions(question.getOptions());
        }
        if (question.getDifficulty() != null) {
            questionToUpdate.setDifficulty(question.getDifficulty());
        }
        if (question.getCategory() != null) {
            questionToUpdate.setCategory(question.getCategory());
        }
        return questionRepository.save(questionToUpdate);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    @Override
    public List<Question> getQuestionsByDifficulty(String difficulty) {
        return questionRepository.findByDifficulty(difficulty);
    }

    @Override
    public List<Question> getRandomQuestionsByCategoryAndDifficulty(String category, String difficulty, int limit) {
        return questionRepository.findRandomQuestionsByCategoryAndDifficulty(category, difficulty, limit);
    }
}