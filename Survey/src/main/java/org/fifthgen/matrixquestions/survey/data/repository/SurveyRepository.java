package org.fifthgen.matrixquestions.survey.data.repository;

import org.fifthgen.matrixquestions.survey.data.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
}
