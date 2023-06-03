package Controllen;

import Model.*;

public class HumanCreator {
    public Human createHuman(String name, String surname, String patronymic, Sex sex) {
        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);
        return human;
    }

    public Human createTypicalHuman() {
        return createHuman("Ivan", "Ivanov", "Ivanovish", Sex.MALE);
    }
}