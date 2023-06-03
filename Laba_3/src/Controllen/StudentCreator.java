package Controllen;

import Model.*;

public class StudentCreator {

    public Student createStudent(Human human, int recordBookNumber) {
        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());

        student.setRecordBookNumber(recordBookNumber);
        student.setSex(human.getSex());

        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human typicalHuman = humanCreator.createTypicalHuman();
        Student typicalStudent = createStudent(typicalHuman, 6897895);
        return typicalStudent;
    }
}