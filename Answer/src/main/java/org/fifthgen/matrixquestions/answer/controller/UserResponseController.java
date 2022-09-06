package org.fifthgen.matrixquestions.answer.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.fifthgen.matrixquestions.answer.service.UserResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("${api.base.path}/answer")
@AllArgsConstructor
public class UserResponseController {

    private UserResponseService userResponseService;

    @GetMapping("/answers")
    public List<UserResponse> listUserResponses() {
        log.info("listing all user responses");
        return userResponseService.getAllResponses();
    }

    @PostMapping("/answers")
    public UserResponse saveUserResponse(@RequestBody UserResponse userResponse) {
        log.info("new matrix question : {}", userResponse);
        return userResponseService.saveUserResponse(userResponse);
    }
}
