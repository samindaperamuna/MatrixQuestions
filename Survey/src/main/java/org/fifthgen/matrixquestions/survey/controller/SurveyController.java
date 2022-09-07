package org.fifthgen.matrixquestions.survey.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fifthgen.matrixquestions.survey.controller.request.SurveyCreationRequest;
import org.fifthgen.matrixquestions.survey.data.model.Question;
import org.fifthgen.matrixquestions.survey.data.model.SubQuestion;
import org.fifthgen.matrixquestions.survey.data.model.Survey;
import org.fifthgen.matrixquestions.survey.service.SurveyService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("${api.base.path}/survey")
@AllArgsConstructor
public class SurveyController {

    private SurveyService surveyService;

    @PostMapping()
    public Survey createSurvey(@RequestBody SurveyCreationRequest surveyCreationRequest) {
        log.info("new surveyCreationRequest : {}", surveyCreationRequest);
        Survey survey = surveyCreationRequest.getSurvey();
        List<Question> questions = surveyCreationRequest.getQuestions();
        List<SubQuestion> subQuestions = surveyCreationRequest.getSubQuestions();

        for (Question question : questions)
            for (SubQuestion subQuestion : subQuestions) {
                if (question.getQid() == subQuestion.getQid()) {
                    if (question.getSubQuestions() == null)
                        question.setSubQuestions(new ArrayList<>());

                    question.getSubQuestions().add(subQuestion);
                }
            }

        survey.setQuestions(questions);

        return surveyService.addSurvey(survey);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Survey getSurvey(@PathVariable int id) {
        log.info("listing survey questions for id {}", id);
        return surveyService.getSurveyForId(id);
    }

    @GetMapping
    public List<Survey> getSurveys() {
        log.info("listing all surveys");
        return surveyService.getAllSurveys();
    }
}
