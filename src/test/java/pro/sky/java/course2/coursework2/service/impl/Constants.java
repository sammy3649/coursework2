package pro.sky.java.course2.coursework2.service.impl;

import pro.sky.java.course2.coursework2.model.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Constants {
    public static final Question TEST_QUESTION1 = new Question("Что такое «переменная»??", "Смотри шпаргалку № 1.2");
    public static final Question TEST_QUESTION2 = new Question("Что такое «цикл»?", "Смотри шпаргалку № 1.3");
    public static final Question TEST_QUESTION3 = new Question("Чем сейчас занимаешься?", "Смотри шпаргалку № 1.2");
    public static final Question TEST_QUESTION4 = new Question("Что такое «метод»?", "Смотри шпаргалку № 1.8");
    public static final Collection<Question> QUESTION_COLLECTION = new ArrayList<>(List.of(
            new Question("Что такое «переменная»??", "Смотри шпаргалку № 1.2"),
            new Question("Что такое «цикл»?", "Смотри шпаргалку № 1.3"),
            new Question("Чем сейчас занимаешься?", "Смотри шпаргалку № 1.2"),
            new Question("Что такое «метод»?", "Смотри шпаргалку № 1.8")));
    public static final Collection<Question> EXPECTED = new ArrayList<>(List.of(
            new Question("Что такое «переменная»??", "Смотри шпаргалку № 1.2"),
            new Question("Что такое «цикл»?", "Смотри шпаргалку № 1.3"),
            new Question("Чем сейчас занимаешься?", "Смотри шпаргалку № 1.2"),
            new Question("Что такое «метод»?", "Смотри шпаргалку № 1.8"),
            new Question("Опишите жизненный цикл приложения", "Смотри шпаргалку № 2.2"),
            new Question("Расскажи об иерархии коллекций", "Смотри шпаргалку № 2.5")));

    public static final int COUNT = 4;
    public static final int QUESTIONS_COUNT = 5;
    public static final String QUESTION_TEST1 = "Что такое «переменная»??";
    public static final String ANSWER_TEST1 = "Смотри шпаргалку № 1.2";
    public static final Question TOTAL_QUESTION1 = new Question("Что такое «переменная»??", "Смотри шпаргалку № 1.2");
    public static final String QUESTION_TEST3 = "Что такое «Метод»??";
    public static final Question TOTAL_QUESTION = new Question("Что такое «метод»?", "Смотри шпаргалку № 1.8");



}
