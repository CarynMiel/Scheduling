import java.util.Scanner;

public class project
{
    public static void main(String[] args)
    {
        Task research = new Task("research a party venue", 2, "hours");
        Task reserve = new Task("reserve party venue", 1, "hour", research);

        System.out.println(research);

        System.out.println();
        
        System.out.print("It takes ");
        System.out.print( + reserve.getTime());
        System.out.print(" ");
        System.out.print(reserve.getUnit());
        System.out.print(" to ");
        System.out.print(reserve.getName());
        System.out.print(". You also first need to ");
        System.out.print(reserve.getDependencies());
        System.out.print(". The statement, This task is done is ");
        System.out.println(reserve.getStatus());

        System.out.println();

        System.out.println("Research is dependent on reserve: " + research.isDependentOn(reserve));
        System.out.println("Reserve is dependent on research: " + reserve.isDependentOn(research));

        System.out.println();

        Task decorations = new Task("Set up decorations in party venue", 5, "hours");

        System.out.println(decorations);

        System.out.println();

        decorations.setDependencies(reserve);
        decorations.setName("buy decorations");
        decorations.setTime(2);
        decorations.setStatus(true);
        decorations.setUnit("days");

        System.out.println(decorations);
        

    }
}