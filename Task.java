import java.util.ArrayList;

public class Task
{
    private String name;
    private double time;
    private char[] dependencies;
    private boolean isDone = false;
    private int priority;
    private char symbol;
    private String unit;

    private static int tasks = 0;

    public Task(String n, int t, String u, char s)
    {
        name = n;
        time = t;
        unit = u;
        symbol = s;
        tasks++;
    }

    public static addDependencies(int numberOf, char[] deps)
    {
        char[] temp = new char[numberOf];
        temp = deps;
    }

    public static int getNumberOfTasks()
    {
        return tasks;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "It will take " + time + unit + " to " + task;
    }
}