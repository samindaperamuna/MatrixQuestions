package org.fifthgen.matrixquestions.question.data.repository;

import org.fifthgen.matrixquestions.question.data.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
