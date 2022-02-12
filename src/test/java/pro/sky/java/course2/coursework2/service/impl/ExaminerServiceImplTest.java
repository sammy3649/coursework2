package pro.sky.java.course2.coursework2.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.coursework2.exeptions.HaveNotFoundException;
import pro.sky.java.course2.coursework2.exeptions.HaveNotQuestionsException;
import pro.sky.java.course2.coursework2.model.Question;
import pro.sky.java.course2.coursework2.service.QuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static pro.sky.java.course2.coursework2.service.impl.Constants.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    ExaminerServiceImpl out;
    @Mock
    private QuestionService questionService;

    @BeforeEach
    void initTest() {
        out = new ExaminerServiceImpl(questionService);
    }

    @Test
    void getQuestion() {
        when(questionService.getRandomQuestion()).thenReturn(TEST_QUESTION1, TEST_QUESTION2, TEST_QUESTION3, TEST_QUESTION4);
        when(questionService.getAll()).thenReturn(EXPECTED);
        assertTrue(EXPECTED.containsAll(out.getQuestion(COUNT)));
    }

    @Test
    void getQuestionExceptionTest() {
        assertThrows(HaveNotQuestionsException.class, () -> out.getQuestion(QUESTIONS_COUNT));
    }
}