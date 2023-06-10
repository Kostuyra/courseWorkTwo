package com.example.courseworktwo.Exception;

import com.example.courseworktwo.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CREATED)
public class AlreadyExistQuestion extends RuntimeException {
    public AlreadyExistQuestion(Question question) {
        super("Пара вопрос-ответ " + question + " уже существует");
    }
}
