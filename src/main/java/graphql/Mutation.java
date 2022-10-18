package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entity.Student;
import repository.StudentRepository;

public class Mutation implements GraphQLRootResolver {

    private StudentRepository studentRepository;

    public Mutation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String cin, String nompre, String email) {
        Student student = new Student(cin, nompre, email);
        studentRepository.saveStudent(student);
        return student;
    }
}


