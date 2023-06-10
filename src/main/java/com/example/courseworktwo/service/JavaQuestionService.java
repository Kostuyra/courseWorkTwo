package com.example.courseworktwo.service;

import com.example.courseworktwo.Exception.AlreadyExistQuestion;
import com.example.courseworktwo.Exception.NotExistQuestion;
import com.example.courseworktwo.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questions;

    public JavaQuestionService() {
        this.questions = new HashSet<>();
    }


    @Override
    public Question questionAdd(String question, String answer) {
        Question questionAnswer = new Question(question, answer);
        if (containQuestion(questionAnswer)) {
            throw new AlreadyExistQuestion(questionAnswer);
        }
        questions.add(questionAnswer);
        return questionAnswer;
    }

    @Override
    public Question questionAdd(Question question) {
        if (containQuestion(question)) {
            throw new AlreadyExistQuestion(question);
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question questionRemove(Question question) {
        if (!containQuestion(question)) {
            throw new NotExistQuestion(question);
        }
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random r = new Random();
        Question[] arr = questions.stream().toArray(Question[]:: new);
        if (questions.size() == 1){
            return arr[0];
        }
        int i = r.nextInt(questions.size() - 1);
        return arr[i];
    }

    private boolean containQuestion(Question questionAnswer) {
        return questions.contains(questionAnswer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaQuestionService)) return false;
        JavaQuestionService that = (JavaQuestionService) o;
        return Objects.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questions);
    }
}

