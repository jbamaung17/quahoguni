import db.DBHelper;
import enums.LevelType;
import models.Course;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("English", LevelType.MA);
        DBHelper.save(course1);
        Course course2 = new Course("Psychology", LevelType.MA);
        DBHelper.save(course2);

        Student student1 = new Student("Meg Griffin", 11, 6230, course2);
        DBHelper.save(student1);
        Student student2 = new Student("Pea Tear Griffin", 40, 6231, course1);



    }
}
