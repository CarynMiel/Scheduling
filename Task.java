/* Task.java
 * @CarynMiel
 * @since 01-09-2023
 * This class keeps track of tasks and organizes their information
 */
public class Task
{
    // attributes
    private String name;
    private int time;
    private boolean status = false;
    private Task dependencies;
    private String unit;

    // constructors
    public Task(String n, int t, String u, Task d)
    {
        name = n;
        time = t;
        dependencies = d;
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
    public Task getDependencies(){return dependencies;}
    public String getUnit(){return unit;}

    // mutator methods
    public void setName(String n){name = n;}
    public void setTime(int t){time = t;}
    public void setStatus(boolean s){status = s;}
    public void setDependencies(Task d){dependencies = d;}
    public void setUnit(String u){unit = u;}

    // to string method
    public String toString()
    {
        String message = name + " takes " + time + " " + unit + " and depends on the tasks, " + dependencies; 
        if(message.indexOf("null") != -1)
        {
            message = message.substring(0, message.indexOf("depends")) + "does not depend on any other tasks";
        }
        else
        {
            message = message.substring(0, message.indexOf(", ") + 2) + dependencies.getName();
        }
        message += ". Its completion status is " + status;
        return message;
    }

    // other methods
    public boolean isDependentOn(Task task)
    {
        if(task.getName() == dependencies)
        {
            return true;
        }
        return false;
    }
}