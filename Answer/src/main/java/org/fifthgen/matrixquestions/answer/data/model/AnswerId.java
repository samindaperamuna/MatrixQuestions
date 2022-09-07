package org.fifthgen.matrixquestions.answer.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AnswerId implements Serializable {

    private int responseId;
    private int qid;
    private String sid;
}
