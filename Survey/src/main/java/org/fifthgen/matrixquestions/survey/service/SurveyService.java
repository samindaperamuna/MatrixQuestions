package org.fifthgen.matrixquestions.survey.service;

import lombok.AllArgsConstructor;
import org.fifthgen.matrixquestions.survey.data.model.Question;
import org.fifthgen.matrixquestions.survey.data.model.SubQuestion;
import org.fifthgen.matrixquestions.survey.data.model.Survey;
import org.fifthgen.matrixquestions.survey.data.repository.QuestionRepository;
import org.fifthgen.matrixquestions.survey.data.repository.SubQuestionRepository;
import org.fifthgen.matrixquestions.survey.data.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SurveyService {

    private SurveyRepository surveyRepository;
    private QuestionRepository questionRepository;
    private SubQuestionRepository subQuestionRepository;

    public Survey getSurveyForId(int id) {
        Survey survey = surveyRepository.getById(id);
        List<Question> questions = questionRepository.findBySurveyId(id);

        for (Question question: questions) {
            List<SubQuestion> subQuestions = subQuestionRepository.findByQid(question.getQid());
            question.setSubQuestions(subQuestions);
        }

        survey.setQuestions(questions);

        return survey;
    }

    public Survey addSurvey(Survey survey) {
        survey = surveyRepository.save(survey);

        for (Question question : survey.getQuestions()) {
            question.setSurveyId(survey.getId());
            questionRepository.save(question);

            for (SubQuestion subQuestion : question.getSubQuestions()) {
                subQuestionRepository.save(subQuestion);
            }
        }

        return survey;
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }
}
