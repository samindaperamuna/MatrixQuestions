package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@IdClass(QuestionId.class)
public class Question {

    @Id
    private int qid;

    @Id
    private int surveyId;

    @Column(length = 500)
    private String value;

    @Transient
    private List<SubQuestion> subQuestions;
}
