package pro.sky.java.course2.coursework2.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HaveAnswerException extends RuntimeException {
    private static final String DEFAULT_MASSAGE = "the answer is already there";

    public HaveAnswerException() {
        super(DEFAULT_MASSAGE);
    }

}
