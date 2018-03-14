package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    private int id;
    private String name;
    private int age;
    private int enrollmentNum;
    private Course course;

    public Student() {
    }

    public Student(String name, int age, int enrollmentNum, Course course) {
        this.name = name;
        this.age = age;
        this.enrollmentNum = enrollmentNum;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name="enrollment_number")
    public int getEnrollmentNum() {
        return enrollmentNum;
    }

    public void setEnrollmentNum(int enrollmentNum) {
        this.enrollmentNum = enrollmentNum;
    }

    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
