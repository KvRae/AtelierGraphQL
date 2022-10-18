package repository;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;
    public StudentRepository() {
        students = new ArrayList<>();
        students.add(new Student("123456", "Yaakoub Kamar El Eddin Debiaza", "Mohaedd@esprit.tn"));
        students.add(new Student("213564", "Khaled Kashmiri", "AhmedKashmiri@esprit.tn"));
        students.add(new Student("213565", "Ahmed karawita", "AhmedKarawit@esprit.tn"));
        students.add(new Student("213567", "Mouhamed Sombol", "MouhamedSombol@esprit.tn"));

    }

    public List<Student> getAllStudents() {
        return students;
    }



    public void saveStudent(Student student) {
        students.add(student);
    }
}

