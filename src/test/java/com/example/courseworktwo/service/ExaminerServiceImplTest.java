package com.example.courseworktwo.service;

import com.example.courseworktwo.Exception.QuantityCallerQuestionsBiggerThenQuestions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.courseworktwo.Constants.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void getQuestions() {
        Mockito.when(questionService.getAll()).thenReturn(TESTSET);
        assertEquals(TESTSET,examinerService.getQuestions(2));
    }

    @Test
    void shouldCallQuantityCallerQuestionsBiggerThenQuestionsException(){
        Mockito.when(questionService.getAll()).thenReturn(TESTSET);
        assertThrows(QuantityCallerQuestionsBiggerThenQuestions.class, ()->examinerService.getQuestions(3));
    }
}