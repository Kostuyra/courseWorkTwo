package com.example.courseworktwo.service;

import com.example.courseworktwo.Exception.QuantityCallerQuestionsBiggerThenQuestions;
import com.example.courseworktwo.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        if (questionService.getAll().size() < amount) {
            throw new QuantityCallerQuestionsBiggerThenQuestions();
        }

        if (amount == questionService.getAll().size()){
            return questionService.getAll();
        }
        int i = 0;
        Question question;
        while (i < amount) {
            question = questionService.getRandomQuestion();
            if (!questions.contains(question)){
                questions.add(question);
                i++;
            }
        }
        return questions;
    }


}
