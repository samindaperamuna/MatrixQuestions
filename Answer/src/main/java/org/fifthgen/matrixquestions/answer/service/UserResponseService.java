package org.fifthgen.matrixquestions.answer.service;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.fifthgen.matrixquestions.answer.data.model.Answer;
import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.fifthgen.matrixquestions.answer.data.repository.AnswerRepository;
import org.fifthgen.matrixquestions.answer.data.repository.UserResponseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserResponseService {

    private UserResponseRepository userResponseRepository;

    private AnswerRepository answerRepository;

    public List<UserResponse> getAllResponses() {
        List<UserResponse> responses = userResponseRepository.findAll();

        for (UserResponse userResponse : responses) {
            List<Answer> answers = answerRepository.findByResponseId(userResponse.getId());
            userResponse.setAnswers(answers);
        }

        return responses;
    }

    public UserResponse saveUserResponse(UserResponse userResponse) {
        UserResponse response = userResponseRepository.save(userResponse);

        for (Answer answer : userResponse.getAnswers()) {
            answer.setResponseId(response.getId());

            answerRepository.save(answer);
        }

        return response;
    }
}
