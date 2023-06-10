package com.example.courseworktwo.Controller;

import com.example.courseworktwo.Question;
import com.example.courseworktwo.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return service.questionAdd(question, answer);

    }

    @GetMapping
    Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("/remove")
    Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return service.questionRemove(new Question(question, answer));
    }


}
