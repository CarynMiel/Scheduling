/* Task.java
 * @CarynMiel
 * @since 01-09-2023
 * This class keeps track of tasks and organizes their information
 */

import java.utils.ArrayList;

public class Task
{
    // attributes
    private String name;
    private int time;
    private boolean status = false;
    private ArrayList<Task> dependencies;
    private String unit;

    // constructors
    public Task(String n, int t, ArrayList<Task> d, String u)
    {
        name = n;
        time = t;
        dependencies = t;
        unit = u;
    }
    public Task(String n, int t, String u)
    {
        name = n;
        time = t;
        unit = u;
    }

    // methods

    // accessor methods
    public String getName(){return name;}
    public int getTime(){return time;}
    public boolean getStatus(){return status;}
    public ArrayList<Task> getDependencies(){return dependencies;}
    public String getUnit(){return unit;}

    // mutator methods
    public void setName(String n){name = n;}
    public void setTime(int t){time = t;}
    public void setStatus(boolean s){status = s;}
    public void setDependencies(ArrayList<Task> d){dependencies = d;}
    public void setUnit(String u){unit = u;}

    // to string method
    public String toString()
    {
        return name + " takes " + time + unit + "and depends on the tasks, " + dependencies + " and it's completion status is " + status; 
    }

    // other methods
    public void addDependency(String d)
    {
        boolean add = true;
        ArrayList<TasK> dependents = d.getDependencies()
        for(int i = 0; i < dependents.size(); i++)
        {
            if(name == dependents.get(i))
            {
                add = false;
            }
        }
        if(add)
        {
            dependencies.add(d);
        }
    }
    public boolean isDependentOn(Task task)
    {
        for(int i = 0; i < dependencies.size(); i++)
        {
            if(task.getName == dependencies.get(i))
            {
                return true;
            }
        }
        return false;
    }
}