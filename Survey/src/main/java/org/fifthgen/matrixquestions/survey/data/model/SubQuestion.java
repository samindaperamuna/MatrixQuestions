package org.fifthgen.matrixquestions.survey.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class SubQuestion implements Serializable {

    @Id
    @Type(type = "char")
    private char sid;

    @Id
    @ManyToOne
    private Question question;

    @Column(length = 500)
    private String value;
}
