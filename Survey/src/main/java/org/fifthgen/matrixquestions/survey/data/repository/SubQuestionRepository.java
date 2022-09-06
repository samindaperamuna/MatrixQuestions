package org.fifthgen.matrixquestions.survey.data.repository;

import org.fifthgen.matrixquestions.survey.data.model.SubQuestion;
import org.fifthgen.matrixquestions.survey.data.model.SubQuestionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubQuestionRepository extends JpaRepository<SubQuestion, SubQuestionId> {
}
