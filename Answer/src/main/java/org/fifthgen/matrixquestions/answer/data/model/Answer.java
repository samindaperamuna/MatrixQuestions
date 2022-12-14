package org.fifthgen.matrixquestions.answer.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@NoArgsConstructor
@Entity
@IdClass(AnswerId.class)
public class Answer {

    @Id
    private int responseId;

    @Id
    private int qid;

    @Id
    private String sid;

    private int value;
}
