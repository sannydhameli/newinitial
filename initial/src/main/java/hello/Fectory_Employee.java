package hello;

public class Fectory_Employee
{
    Employee GetIntense(String str)
    {
        if(str.equals( "Intern"))
            return new Intern();
        else if(str.equals("Manager"))
            return new Manager();
        else if(str.equals("SoftwareEngineer"))
            return new SoftwareEngineer();
        else
            return new VicePresident();

    }
}
