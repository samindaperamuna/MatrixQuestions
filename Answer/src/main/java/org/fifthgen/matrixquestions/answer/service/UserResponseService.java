package org.fifthgen.matrixquestions.answer.service;

import lombok.AllArgsConstructor;
import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.fifthgen.matrixquestions.answer.data.repository.UserResponseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserResponseService {

    private UserResponseRepository userResponseRepository;

    public List<UserResponse> getAllResponses() {
        return userResponseRepository.findAll();
    }

    public UserResponse saveUserResponse(UserResponse userResponse) {
        return userResponseRepository.save(userResponse);
    }
}
