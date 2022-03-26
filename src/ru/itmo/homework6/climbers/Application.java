package ru.itmo.homework6.climbers;

public class Application {
    public static void main(String[] args) {


        Mountain everest = new Mountain("Everest","Russia",8000);
        Mountain elbrus = new Mountain("Elbrus","Russia",5000);
        Mountain ararat = new Mountain("Ararat","Russia",8000);

        Climber climber1 = new Climber("Maxim","Saint-Petersburg");
        Climber climber2 = new Climber("Dima","Saint-Petersburg");
        Climber climber3 = new Climber("Anna","Saint-Petersburg");
        Climber climber4 = new Climber("Oleg","Saint-Petersburg");
        Climber climber5 = new Climber("Ula","Saint-Petersburg");
        Climber climber6 = new Climber("Arina","Saint-Petersburg");

        Group group1 = new Group(false,everest,3);
        Group group2 = new Group(true,elbrus,3);
        Group group3 = new Group(true,ararat,3);




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
