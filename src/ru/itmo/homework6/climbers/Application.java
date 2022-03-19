package ru.itmo.homework.climbers;

public class Application {
    public static void main(String[] args) {


        Mountain everest = new Mountain("Everest","Russia",8000);
        Mountain elbrus = new Mountain("Elbrus","Russia",5000);
        Mountain ararat = new Mountain("Ararat","Russia",8000);

        Climber climber1 = new Climber("Maxim","SPB");
        Climber climber2 = new Climber("Dima","SPB");
        Climber climber3 = new Climber("Anna","SPB");
        Climber climber4 = new Climber("Oleg","SPB");
        Climber climber5 = new Climber("Ula","SPB");
        Climber climber6 = new Climber("Arina","SPB");

        Group group1 = new Group(everest,10);
        Group group2 = new Group(elbrus,10);
        Group group3 = new Group(ararat,10);




        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);

        group2.addClimber(climber4);
        group2.addClimber(climber5);

        group3.addClimber(climber6);
        group3.addClimber(climber5);

        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);






    }
}
