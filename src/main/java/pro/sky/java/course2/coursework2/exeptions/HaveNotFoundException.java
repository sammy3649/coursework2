package pro.sky.java.course2.coursework2.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HaveNotFoundException extends RuntimeException {

    private static final String DEFAULT_MASSAGE = "question or answer is empty";

    public HaveNotFoundException() {
        super(DEFAULT_MASSAGE);
    }

}
