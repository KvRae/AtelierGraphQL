package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entity.Student;
import repository.StudentRepository;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private StudentRepository studentRepository;

    public Query(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> allStudents() {
        return studentRepository.getAllStudents();
    }
}

