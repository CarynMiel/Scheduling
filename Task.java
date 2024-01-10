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
    // @param n: the name of the new object, 
    //        t: the new time of the object, 
    //        u: the unit of time of the object,
    //        d: the dependencies of the object
    public Task(String n, int t, String u, Task d)
    {
        name = n;
        time = t;
        dependencies = d;
        unit = u;
    }
    // @param n: the name of the new object, 
    //        t: the new time of the object, 
    //        u: the unit of time of the object,
    public Task(String n, int t, String u)
    {
        name = n;
        time = t;
        unit = u;
    }

    // methods

    // accessor methods
    // @return the name attribute of the Task
    public String getName(){return name;}
    // @return the time attribute of the Task
    public int getTime(){return time;}
    // @return the status attirbute of the Task
    public boolean getStatus(){return status;}
    // @return the dependencies attribute of the Task
    public Task getDependencies(){return dependencies;}
    // @return the unit attribute of the Task
    public String getUnit(){return unit;}

    // mutator methods
    // @param n: new name of the task
    public void setName(String n){name = n;}
    // @param t: new time of the task
    public void setTime(int t){time = t;}
    // @param s: new status of the task
    public void setStatus(boolean s){status = s;}
    // @param d: new dependency of the task
    public void setDependencies(Task d){dependencies = d;}
    // @param u: new unit of the task
    public void setUnit(String u){unit = u;}

    // to string method
    // @return the object's attribute in string format
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
    // @param otherTask: the name of the other task that the user is checking if it is in the objects dependency
    public boolean isDependentOn(Task otherTask)
    {
        try 
        {
            if(dependencies.getName() == otherTask.getName())
            {
                return true;
            }
            return false;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
}