package com.example.courseworktwo.Constants;

import com.example.courseworktwo.Question;
import com.example.courseworktwo.service.JavaQuestionService;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constants {
    public static final String QUESTION1 = "q1";
    public static final String QUESTION2 = "q2";
    public static final String ANSWER1 = "a1";
    public static final String ANSWER2 = "a2";
    public static final Question QA1 = new Question(QUESTION1, ANSWER1);
    public static final Question QA2 = new Question(QUESTION2, ANSWER2);
    public static final JavaQuestionService QATEST = new JavaQuestionService();
    public static final Set<Question> TESTSET = Stream.of(QA1, QA2).collect(Collectors.toSet());



}
