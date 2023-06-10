package com.example.courseworktwo.Exception;

import com.example.courseworktwo.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotExistQuestion extends RuntimeException {
    public NotExistQuestion(Question question){
        super("Пары вопрос-ответ " + question + " не существует");
    }
}
