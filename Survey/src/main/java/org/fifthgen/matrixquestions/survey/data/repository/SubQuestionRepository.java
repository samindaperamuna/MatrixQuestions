package org.fifthgen.matrixquestions.survey.data.repository;

import org.fifthgen.matrixquestions.survey.data.model.SubQuestion;
import org.fifthgen.matrixquestions.survey.data.model.SubQuestionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubQuestionRepository extends JpaRepository<SubQuestion, SubQuestionId> {

    List<SubQuestion> findByQid(int qid);
}
