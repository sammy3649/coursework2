package pro.sky.java.course2.coursework2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.coursework2.exeptions.HaveAnswerException;
import pro.sky.java.course2.coursework2.exeptions.HaveNotFoundException;
import pro.sky.java.course2.coursework2.exeptions.HaveNotQuestionsException;
import pro.sky.java.course2.coursework2.exeptions.HaveQuestionExeption;
import pro.sky.java.course2.coursework2.model.Question;
import pro.sky.java.course2.coursework2.service.QuestionService;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;

    public JavaQuestionService() {
        questions = new HashSet<>();
        questions.add(new Question("Что такое «переменная»??", "Смотри шпаргалку № 1.2"));
        questions.add(new Question("Что такое «цикл»?", "Смотри шпаргалку № 1.3"));
        questions.add(new Question("Чем сейчас занимаешься?", "Смотри шпаргалку № 1.2"));
        questions.add(new Question("Что такое «метод»?", "Смотри шпаргалку № 1.8"));
        questions.add(new Question("Опишите жизненный цикл приложения", "Смотри шпаргалку № 2.2"));
        questions.add(new Question("Расскажи об иерархии коллекций", "Смотри шпаргалку № 2.5"));

    }

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        return add(question1);
    }

    @Override
    public Question add(Question question) {
        checkNotNull(question);
        if (questions.stream().anyMatch(question1 -> Objects.equals(question1.getQuestion(), question.getQuestion()))) {
            throw new HaveAnswerException();
        }

        questions.add(question);

        return question;
    }

    @Override
    public Question remove(Question question) {
        checkNotNull(question);
        if (!questions.remove(question)) {
            throw new HaveNotQuestionsException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return new ArrayList<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        ArrayList<Question> questionsSet = new ArrayList<>(questions);
        Random random = new Random();
        return questionsSet.get(random.nextInt(questionsSet.size()));
    }

    private void checkNotNull(Question question) {
        if (question == null) {
            throw new HaveNotFoundException();
        }
    }
}
