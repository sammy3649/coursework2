package pro.sky.java.course2.coursework2.service;

import pro.sky.java.course2.coursework2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
