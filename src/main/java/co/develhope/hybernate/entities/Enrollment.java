package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
public class Enrollment{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    public Student student;

    @ManyToOne
    public SchoolClass schoolClass;


    public Enrollment() {
    }

    public Enrollment(int id, Student student, SchoolClass schoolClass) {
        this.id = id;
        this.student = student;
        this.schoolClass = schoolClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }


}