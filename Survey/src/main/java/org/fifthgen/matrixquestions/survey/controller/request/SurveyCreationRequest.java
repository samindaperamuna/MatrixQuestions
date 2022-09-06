package org.fifthgen.matrixquestions.survey.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.fifthgen.matrixquestions.survey.data.model.Question;
import org.fifthgen.matrixquestions.survey.data.model.SubQuestion;
import org.fifthgen.matrixquestions.survey.data.model.Survey;

import java.util.List;

@Data
@NoArgsConstructor
public class SurveyCreationRequest {

    private Survey survey;
    private List<Question> questions;
    private List<SubQuestion> subQuestions;
}
