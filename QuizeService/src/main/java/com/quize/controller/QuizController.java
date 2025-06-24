package com.quize.controller;

import com.quize.entities.Quiz;
import com.quize.service.QuizserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizserviceImpl quizservice;

    public QuizController(QuizserviceImpl quizservice) {
        this.quizservice = quizservice;
    }

    @GetMapping
    private List<Quiz> getAll(){
        return quizservice.get();
    }

    @GetMapping("/{id}")
    private Quiz getById(@PathVariable Long id){
        return quizservice.get(id);
    }

    @PostMapping
    private Quiz add(@RequestBody Quiz quiz){
        return quizservice.add(quiz);
    }



}
