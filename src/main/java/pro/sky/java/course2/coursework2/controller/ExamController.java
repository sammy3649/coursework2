package pro.sky.java.course2.coursework2.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.coursework2.model.Question;
import pro.sky.java.course2.coursework2.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get")
    public Collection<Question> getQuestion(@RequestParam int amount) {
        return examinerService.getQuestion(amount);
    }

}
