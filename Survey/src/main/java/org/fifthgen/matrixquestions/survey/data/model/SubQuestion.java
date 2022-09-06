package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@IdClass(SubQuestionId.class)
public class SubQuestion {

    @Id
    @Type(type = "char")
    private char sid;

    @Id
    private int qid;

    @Column(length = 500)
    private String value;
}
