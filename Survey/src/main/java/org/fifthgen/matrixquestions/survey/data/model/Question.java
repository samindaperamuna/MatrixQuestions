package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Question implements Serializable {

    @Id
    @ManyToOne
    private Survey survey;

    @Id
    private int qid;
}
