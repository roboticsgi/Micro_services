package com.quize.service;

import com.quize.entities.Quiz;

import java.util.List;

public interface Quizservice {

    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz get(Long id);

}
