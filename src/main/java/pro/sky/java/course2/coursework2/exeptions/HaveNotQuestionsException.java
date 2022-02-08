package pro.sky.java.course2.coursework2.exeptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class HaveNotQuestionsException extends RuntimeException {
    private static final String DEFAULT_MASSAGE = "there are not questions";

    public HaveNotQuestionsException() {
        super(DEFAULT_MASSAGE);
    }}
