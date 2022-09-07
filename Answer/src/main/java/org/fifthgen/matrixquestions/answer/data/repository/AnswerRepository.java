package org.fifthgen.matrixquestions.answer.data.repository;

import org.fifthgen.matrixquestions.answer.data.model.Answer;
import org.fifthgen.matrixquestions.answer.data.model.AnswerId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, AnswerId> {

    List<Answer> findByResponseId(int responseId);
}
