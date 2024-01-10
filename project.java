import java.util.Scanner;

public class project
{
    public static void main(String[] args)
    {
        Task research = new Task("research a party venue", 2, "hours");
        Task reserve = new Task("reserve party venue", 1, "hour", research);

        System.out.println(research);

        System.out.println();
        
        System.out.println("It takes " + reserve.getTime() + " " + reserve.getUnit() + " to " + reserve.getName() + ". You also first need to " + reserve.getDependencies() + ". The statement, This task is done is " + reserve.getStatus());
    }
}