package com.example.courseworktwo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class QuantityCallerQuestionsBiggerThenQuestions extends RuntimeException {
    public QuantityCallerQuestionsBiggerThenQuestions() {
        super("Запрошено большее количество вопросов, чем хранится в сервисе");
    }
}
