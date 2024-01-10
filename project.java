import java.utils.Scanner;
import java.utils.ArrayList;

public class project
{
    public static void main(String[] args)
    {
        Task reserve = new Task("reserve party venue", 1, "hour");
        Task practice = new Task("practice the dance", 10, "hours");

        System.out.println(reserve);
        System.out.println(practice);
    }
}