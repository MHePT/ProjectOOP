package projectoop;

public class Employees {

    private String Name, ID;
    protected double Salary;
    protected int VacationDays;

    public Employees() {
        Name = "Untitled";
        ID = "0000";
        Salary = 10000;
        VacationDays = 15;
    }

    public Employees(String Name, String ID) {
        this.Name = Name;
        this.ID = ID;
        Salary = 10000;
        VacationDays = 15;
    }

    public String GetID() {
        return ID;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetID(String ID) {
        this.ID = ID;
    }
    
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public void setSalary(String Salary) {
        this.Salary = Integer.parseInt(Salary);
    }

    @Override
    public String toString() {
        String ret = "Employee Name: " + Name
                + "\nEmployee ID: " + ID
                + "\nEmployee Salary: " + Salary
                + "\nEmployee Vacation Days: " + VacationDays;
        return ret;
    }
}
