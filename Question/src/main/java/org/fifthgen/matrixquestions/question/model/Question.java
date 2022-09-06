package org.fifthgen.matrixquestions.question.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Question {

    private List<SubQuestion> subQuestions;
}
