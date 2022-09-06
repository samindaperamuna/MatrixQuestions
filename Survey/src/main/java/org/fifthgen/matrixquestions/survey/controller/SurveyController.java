package org.fifthgen.matrixquestions.survey.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fifthgen.matrixquestions.survey.data.model.Survey;
import org.fifthgen.matrixquestions.survey.service.SurveyService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("${api.base.path}/surveys")
@AllArgsConstructor
public class SurveyController {

    private SurveyService surveyService;

    @GetMapping("/{id}")
    public Survey getSurvey(@PathVariable int id) {
        log.info("listing survey questions for id {}", id);
        return surveyService.getSurveyForId(id);
    }

    @PostMapping()
    public Survey createSurvey(@RequestBody Survey survey) {
        log.info("new survey : {}", survey);
        return surveyService.addSurvey(survey);
    }
}
