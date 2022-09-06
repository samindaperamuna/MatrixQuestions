package org.fifthgen.matrixquestions.question.service;

import org.fifthgen.matrixquestions.question.data.model.Question;
import org.fifthgen.matrixquestions.question.data.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void addQuestion(Question question) {
        questionRepository.save(question);
    }
}
