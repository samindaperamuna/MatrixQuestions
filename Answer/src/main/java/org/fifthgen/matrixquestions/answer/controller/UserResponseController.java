package org.fifthgen.matrixquestions.answer.controller;

import lombok.extern.slf4j.Slf4j;
import org.fifthgen.matrixquestions.answer.data.model.UserResponse;
import org.fifthgen.matrixquestions.answer.service.UserResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("${api.base.path}/questions")
public class UserResponseController {

    @Autowired
    private UserResponseService userResponseService;

    @PostMapping
    public void saveUserResponse(@RequestBody UserResponse userResponse) {
        log.info("new matrix question : {}", userResponse);
        userResponseService.saveUserResponse(userResponse);
    }
}
