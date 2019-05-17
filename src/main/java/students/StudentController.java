package students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class StudentController {

    private final StudentsRepository repository;

    StudentController(StudentsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    List<Student> all(){
        return repository.findAll();
    }

}
