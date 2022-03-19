package ru.itmo.homework.climbers;

import java.util.Arrays;

//Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
//идёт набор в группу или нет;
//массив альпинистов;
//гора;
//должна быть возможность добавить альпиниста в группу, если набор ещё идё
public class Group {
    private Climber[] climbers;
    private Mountain mountain;
    private boolean opened;


    public Group(Mountain mountain,int countClimbers) {
        this.climbers = new Climber[countClimbers];
        this.mountain = mountain;
    }


    public void addClimber(Climber climber) {
        if (climbers.length > 3) {
            System.out.println("Набор закрыт");
            return;
        }
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "climbers=" + Arrays.toString(climbers) +
                ", mountain=" + mountain +
                '}';
    }
}

