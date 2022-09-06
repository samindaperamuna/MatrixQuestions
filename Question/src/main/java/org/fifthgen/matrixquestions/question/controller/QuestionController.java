package org.fifthgen.matrixquestions.question.controller;

import lombok.extern.slf4j.Slf4j;
import org.fifthgen.matrixquestions.question.data.model.Question;
import org.fifthgen.matrixquestions.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("${api.base.path}/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public void createQuestion(@RequestBody Question question) {
        log.info("new matrix question : {}", question);
        questionService.addQuestion(question);
    }
}
