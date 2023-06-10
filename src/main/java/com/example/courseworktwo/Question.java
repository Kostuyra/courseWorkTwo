package com.example.courseworktwo;

import java.util.Objects;

public class Question {
    private final String questions;
    private final String answer;

    public Question(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question questions1 = (Question) o;
        return Objects.equals(getQuestions(), questions1.getQuestions()) && Objects.equals(getAnswer(), questions1.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestions(), getAnswer());
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questions='" + questions + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
