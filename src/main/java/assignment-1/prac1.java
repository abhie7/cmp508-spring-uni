package assignment-1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class prac1 {

    @GetMapping("/student")
    public String getStudent() {
        return "rollno: 123, studentName: John Doe";
    }

    public static void main(String[] args) {
        SpringApplication.run(prac1.class, args);
    }
}

