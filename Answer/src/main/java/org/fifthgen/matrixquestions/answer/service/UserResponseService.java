package org.fifthgen.matrixquestions.answer.service;

import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.fifthgen.matrixquestions.answer.data.repository.UserResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserResponseService {

    @Autowired
    private UserResponseRepository userResponseRepository;

    public void saveUserResponse(UserResponse userResponse) {
        userResponseRepository.save(userResponse);
    }
}
