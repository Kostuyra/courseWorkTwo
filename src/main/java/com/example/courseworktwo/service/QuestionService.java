package com.example.courseworktwo.service;

import com.example.courseworktwo.Question;

import java.util.Collection;

public interface QuestionService {
    Question questionAdd(String question, String answer);

    Question questionAdd(Question question);

    Question questionRemove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();


}
