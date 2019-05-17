package students;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(StudentsRepository repository) {
        return args -> {
            repository.save(new Student("Phuc","24","male","Sai gon","0123456788"));
            repository.save(new Student("Hai","27","male","Ha noi","0123456789"));
            repository.save(new Student("Hoang","26","male","Ha noi","0123456789"));
            repository.save(new Student("Duc","20","male","Hai duong","0123456712"));
            repository.save(new Student("Dam","18","female","Hai phong","0123123123"));
            repository.save(new Student("Quynh","22","female","Hai duong","0223456789"));
            repository.save(new Student("Mai","30","female","Hai duong","0223456789"));
            repository.save(new Student("Quynh","28","female","Hai phong","0223555444"));
            repository.save(new Student("Hoang Mai","22","female","Ha noi","0223456789"));
            repository.save(new Student("Quynh","22","female","Ha noi","0223456789"));
            repository.save(new Student("Quynh Anh","22","female","Ha noi","0223456789"));
            repository.save(new Student("Quynh","22","female","Hai duong","0223456789"));
            repository.save(new Student("Quynh","22","female","Ha noi","0223456789"));
            repository.save(new Student("Quynh","22","female","Sai gon","0223456789"));
            repository.save(new Student("Loan","22","female","Sai gon","0223456789"));
            repository.save(new Student("Quynh","22","female","Sai gon","0223456789"));
            repository.save(new Student("Quynh","22","female","Hai duong","0223456789"));
            repository.save(new Student("Son","22","female","Sai gon","0223456789"));
            repository.save(new Student("Tung","22","female","Sai gon","0223456789"));
            repository.save(new Student("Tuan","22","female","Sai gon","0223456789"));
            repository.save(new Student("Quynh","22","female","Sai gon","0223456789"));
            repository.save(new Student("Thuy","22","female","Sai gon","0223456789"));
        };
    }
}
