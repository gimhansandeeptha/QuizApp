package com.example.quizapp.controller;

import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String>createQuiz(@RequestParam String category, @RequestParam Integer numQ, @RequestParam String title){
        return new ResponseEntity<>("I am here !", HttpStatus.OK);
    }

}
