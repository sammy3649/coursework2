package pro.sky.java.course2.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.coursework2.model.Question;
import pro.sky.java.course2.coursework2.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaServiceController {
    private final QuestionService questionService;

    public JavaServiceController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add2(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(questionService.add(question, answer));
    }

    @GetMapping("/remove")
    public Question remove2(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(questionService.add(question, answer));
    }

    @GetMapping("/find")
    public Collection<Question> getQuestion() {
        return questionService.getAll();
    }
}
