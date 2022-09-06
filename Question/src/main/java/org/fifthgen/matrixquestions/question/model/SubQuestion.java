package org.fifthgen.matrixquestions.question.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class SubQuestion {

    private Answer answer;
}
