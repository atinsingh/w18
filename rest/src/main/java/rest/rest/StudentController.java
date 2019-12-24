package rest.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class StudentController {
    List<Student> students = new ArrayList<>();

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        student.setInternalId(UUID.randomUUID().toString());
        students.add(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
      for (Student st : students){
          if (st.getInternalId()==student.getInternalId()){
              st.setAddress(student.getAddress());
              return st;
          }
      }
      return student;
    }
    @GetMapping("/student")
    public List<Student> getAll(){
        return students;
    }
    @GetMapping("/student/{id}")
    public Student getOne(@PathVariable int id){
        Student st = null;
        for(Student st1: students){
            if(st1.getStudentId()==id){
                st = st1;
            }
        }
        return st;
    }
}
