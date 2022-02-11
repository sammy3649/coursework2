package pro.sky.java.course2.coursework2.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.coursework2.exeptions.HaveQuestionExeption;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.coursework2.service.impl.Constants.*;

class JavaQuestionServiceTest {
    private JavaQuestionService out;

    @BeforeEach
    void initTest() {
        out = new JavaQuestionService();
    }

    @Test
    void add() {
        assertEquals(out.add(QUESTION_TEST1, ANSWER_TEST1), TOTAL_QUESTION1);
    }

    @Test
    void remove() {
        out.add(TOTAL_QUESTION);
        out.remove(TOTAL_QUESTION);
        assertFalse(out.getAll().contains(TOTAL_QUESTION));
    }

    @Test
    void getAll() {
        assertFalse(QUESTION_COLLECTION.containsAll(out.getAll()));
    }
}