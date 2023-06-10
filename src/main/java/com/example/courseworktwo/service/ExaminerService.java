package com.example.courseworktwo.service;

import com.example.courseworktwo.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
