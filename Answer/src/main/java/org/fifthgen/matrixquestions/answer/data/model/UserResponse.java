package org.fifthgen.matrixquestions.answer.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class UserResponse {

    @Id
    private int id;

    private String username;

    @Enumerated(EnumType.ORDINAL)
    private Answer answer;

}
