package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class QuestionId implements Serializable {

    private int qid;
    private int surveyId;
}
