package students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentsRepository repository;

    StudentController(StudentsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    List<Student> all(){
        return repository.findAll();
    }

    @PostMapping("/students")
    Student newStudent(@RequestBody Student newStudent){
        return repository.save(newStudent);
    }

    //single item

    @GetMapping("/students/{id}")
    Student one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()-> new StudentNotFoundException(id));

    }

    @PutMapping("/students/{id}")
    Student replaceStudent(@RequestBody Student newStudent, @PathVariable Long id){
        return repository.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setAge(newStudent.getAge());
                    student.setAddress(newStudent.getAddress());
                    student.setGender(newStudent.getGender());
                    student.setPhoneNum(newStudent.getPhoneNum());
                    return repository.save(newStudent);
                })
                .orElseGet(()->{
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
