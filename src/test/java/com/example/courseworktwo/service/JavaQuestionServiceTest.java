package com.example.courseworktwo.service;

import com.example.courseworktwo.Exception.AlreadyExistQuestion;
import com.example.courseworktwo.Exception.NotExistQuestion;
import org.junit.jupiter.api.Test;

import static com.example.courseworktwo.Constants.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @Test
    void questionObjectAdd() {
        assertEquals(QA1, out.questionAdd(QA1));
    }

    @Test
    void testQuestionStringsAdd() {
        assertEquals(QA1, out.questionAdd(QUESTION1, ANSWER1));
    }

    @Test
    void questionRemove() {
        out.questionAdd(QA1);
        out.questionAdd(QA2);
        QATEST.questionAdd(QA2);
        assertEquals(QA1, out.questionRemove(QA1));
        assertEquals(QATEST, out);
    }

    @Test
    void getAll() {
        out.questionAdd(QA1);
        out.questionAdd(QA2);
        assertEquals(TESTSET, out.getAll());

    }

    @Test
    void getRandomQuestion() {
        out.questionAdd(QA1);
        assertEquals(QA1, out.getRandomQuestion());
    }

    @Test
    void shouldThrowAlreadyExistQuestionException(){
        out.questionAdd(QA1);
        out.questionAdd(QA2);
        assertThrows(AlreadyExistQuestion.class, ()->out.questionAdd(QA2));
    }
    @Test
    void shouldThrowANotExistQuestionException(){
        out.questionAdd(QA1);
        assertThrows(NotExistQuestion.class, ()->out.questionRemove(QA2));
    }
}