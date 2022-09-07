package org.fifthgen.matrixquestions.survey.data.repository;

import org.fifthgen.matrixquestions.survey.data.model.Question;
import org.fifthgen.matrixquestions.survey.data.model.QuestionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, QuestionId> {

    List<Question> findBySurveyId(int surveyId);
}
