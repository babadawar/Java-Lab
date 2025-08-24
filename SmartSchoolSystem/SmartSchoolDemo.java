import school.people.*;
import school.activities.*;

public class SmartSchoolDemo {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        Person student = new Student();
        teacher.performDuty();
        student.performDuty();

        Activity sports = new Sports();
        Activity music = new Music();
        Activity art = new Art();
        sports.participate();
        music.participate();
        art.participate();
    }
}
