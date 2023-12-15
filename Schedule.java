import java.util.Scanner;
import java.util.ArrayList;

public class Schedule
{
    // creates a list of tasks that can only be used in any method in the schedule class
    private static ArrayList<Task> tasks = new ArrayList<Task>();

    public static void main(String[] args)
    {
        getTasks();

        for(int i = 0; i < tasks.size(); i++)
        {
            getDependencies(tasks.get(i));
        }
    } // end of main method

    // the method/function that will allow the user to input tasks
    public static void getTasks()
    {
        // a scanner so that the program can accept user input
        Scanner scan = new Scanner(System.in);

        // asks the user with the unit of messurement is and stores it
        System.out.println("What is the unit of time being meassuered?")
        String unit = scan.nextLine();

        // defines starter variabesl that will be user later for control or just to keep track of things
        char more = 'y';
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // keeps looping through until the user has no more tasks to add
        while(more == 'y')
        {
            // asks the user what the name of the task is and stores it
            System.out.println("What is name of the task? ");
            String name = scan.nextLine();

            // asks the user how long it will take for a task to complete
            System.out.println("About how many " + unit + " will the task take? ");
            double time = Double.parseDouble(scan.nextLine());

            // uses the information that was just gathered and creates a task and add it to the tasks list
            Task task = new Task(name, time, unit, alphabet[getNumberOfTasks()]);
            tasks.add(task);

            // asks the user if they have another task and takes the first letter as a lowercase letter
            System.out.println("Is there another task?");
            more = scan.nextLine().toLowerCase().charAt(0);

            // continues to ask the user the question until they put a valid answer
            while(more != 'y' || more != 'n')
            {
                System.out.println("That is not an option.");
                System.out.println("Is there another task?");
                more = scan.nextLine().toLowerCase().charAt(0);
            } // end of loop making sure the user picked yes or no

        } // end of loop asking for more tasks
        scan.close();
    } // end of getTasks method/function

    // gets the dependencies for the task
    public static void getDependencies(Task t)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does the task \"" + t.getName() + "\" have any tasks that it is directly dependent on?");
        scan.close();
    }
} // end of Schedule class 