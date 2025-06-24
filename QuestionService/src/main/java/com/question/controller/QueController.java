package com.question.controller;

import com.question.entity.Question;
import com.question.service.impl.QueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QueController {

    @Autowired
    private QueServiceImpl queService;

    public QueController(QueServiceImpl queService) {
        this.queService = queService;
    }

    @GetMapping
    private List<Question> getAll(){
        return  queService.getAll();
    }

    @GetMapping("/{id}")
    private Question getOne(@PathVariable Long id){
        return queService.getOne(id);
    }

    @PostMapping
    private Question create(@RequestBody Question question){
        return  queService.create(question);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQueOfQuiz(@PathVariable Long quizId){
        return queService.getQueOfQuiz(quizId);
    }


}
