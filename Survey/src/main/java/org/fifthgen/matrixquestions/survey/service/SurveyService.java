package org.fifthgen.matrixquestions.survey.service;

import lombok.AllArgsConstructor;
import org.fifthgen.matrixquestions.survey.data.model.Survey;
import org.fifthgen.matrixquestions.survey.data.repository.SurveyRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SurveyService {

    private SurveyRepository surveyRepository;

    public Survey getSurveyForId(int id) {
        return surveyRepository.getById(id);
    }

    public Survey addSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
}
