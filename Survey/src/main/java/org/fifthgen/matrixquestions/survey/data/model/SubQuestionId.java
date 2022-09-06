package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SubQuestionId implements Serializable {

    private char sid;
    private int qid;
}
