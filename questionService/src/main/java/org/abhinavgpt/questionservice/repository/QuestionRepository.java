package org.abhinavgpt.questionservice.repository;

import org.abhinavgpt.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCategory(String category);

    List<Question> findByDifficulty(String difficulty);

    List<Question> findByCategoryAndDifficulty(String category, String difficulty);

    @Query(value = "SELECT * FROM question q Where q.category=:category and q.difficulty=:difficulty ORDER BY RANDOM() LIMIT :limit", nativeQuery = true)
    List<Question> findRandomQuestionsByCategoryAndDifficulty(String category, String difficulty, int limit);
}
