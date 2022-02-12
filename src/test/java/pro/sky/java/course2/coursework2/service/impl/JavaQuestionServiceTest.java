package pro.sky.java.course2.coursework2.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.coursework2.exeptions.HaveAnswerException;
import pro.sky.java.course2.coursework2.exeptions.HaveNotQuestionsException;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.coursework2.service.impl.Constants.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    private JavaQuestionService out;

    @BeforeEach
    public void initTest() {
        out = new JavaQuestionService();
    }

    @Test
    void add() {
        assertEquals(out.add(QUESTION_TEST1, ANSWER_TEST1), TOTAL_QUESTION1);
        assertNotEquals(TOTAL_QUESTION1, out.add(QUESTION_TEST2, ANSWER_TEST2));
    }

    @Test
    void addTest() {
        out.add(TOTAL_QUESTION1);
        assertTrue(out.getAll().contains(TOTAL_QUESTION1));
    }

    @Test
    void addTest2() {
        out.add(TOTAL_QUESTION1);
        assertThrows(HaveAnswerException.class, () -> out.add(TOTAL_QUESTION1_NEW_ANSWER));
    }

    @Test
    void remove() {
        out.add(TOTAL_QUESTION1);
        out.remove(TOTAL_QUESTION1);
        assertFalse(out.getAll().contains(TOTAL_QUESTION1));
    }

    @Test
    void remove2() {
        out.add(TOTAL_QUESTION1_REMOVE);
        assertThrows(HaveNotQuestionsException.class, () -> out.remove(TOTAL_QUESTION1));
    }

    @Test
    void getAll() {
        assertFalse(QUESTION_COLLECTION.containsAll(out.getAll()));
    }

    @Test
    void getAll2() {
        assertTrue(EXPECTED.containsAll(out.getAll()));

    }
}