package org.fifthgen.matrixquestions.answer.data.repository;

import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserResponseRepository extends JpaRepository<UserResponse, Integer> {
}
