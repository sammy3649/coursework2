package pro.sky.java.course2.coursework2.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HaveQuestionExeption extends RuntimeException {
    private static final String DEFAULT_MASSAGE = "the question is already there";

    public HaveQuestionExeption() {
        super(DEFAULT_MASSAGE);
    }

}
