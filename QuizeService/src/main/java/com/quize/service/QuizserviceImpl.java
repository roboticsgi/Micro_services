package com.quize.service;

import com.quize.entities.Quiz;
import com.quize.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizserviceImpl implements Quizservice {


    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuestionClient questionClient ;

    public QuizserviceImpl(QuizRepo quizRepo, QuestionClient questionClient) {
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizzes = quizRepo.findAll();
        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return  quiz;
        }).collect(Collectors.toList());
        return newQuizList;


    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz= quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
}
