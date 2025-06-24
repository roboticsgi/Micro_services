package com.question.service.impl;

import com.question.Repo.QueRepo;
import com.question.entity.Question;
import com.question.service.QueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QueServiceImpl implements QueService {

    @Autowired
    private QueRepo queRepo;

    public QueServiceImpl(QueRepo queRepo) {
        this.queRepo = queRepo;
    }

    @Override
    public Question getOne(Long id) {
        return queRepo.findById(id).orElseThrow(()-> new RuntimeException("Que not found"));
    }

    @Override
    public List<Question> getAll() {
        return queRepo.findAll();
    }

    @Override
    public Question create(Question question) {
        return queRepo.save(question);
    }

    @Override
    public List<Question> getQueOfQuiz(Long quizId) {
        return queRepo.findByQuizId(quizId);
    }
}
