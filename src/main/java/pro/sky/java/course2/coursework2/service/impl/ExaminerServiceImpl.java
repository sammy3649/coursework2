package pro.sky.java.course2.coursework2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.coursework2.exeptions.HaveNotQuestionsException;
import pro.sky.java.course2.coursework2.model.Question;
import pro.sky.java.course2.coursework2.service.ExaminerService;
import pro.sky.java.course2.coursework2.service.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    QuestionService questionService;
    Random random;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        HashSet<Question> examQuestion = new HashSet<>();
        if (amount > questionService.getAll().size()) {
            throw new HaveNotQuestionsException();
        } else {
            questionService.getRandomQuestion();
            examQuestion.add(questionService.getRandomQuestion());
        }
        return examQuestion;


    }

}
