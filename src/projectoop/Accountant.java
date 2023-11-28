package projectoop;

public class Accountant extends Employees{
    
    private String Name,ID;
    
    public Accountant(){
        Name="Untitled";
        ID="0000";
        Salary = 20000;
        VacationDays=15;
    }
    
    public Accountant(String Name,String ID){
        this.Name=Name;
        this.ID=ID;
        Salary = 20000;
        VacationDays=15;
    }
    
    @Override
    public String GetID() {
        return ID;
    }
    
    @Override
    public String GetName() {
        return Name;
    }
    
    @Override
    public void SetName(String Name) {
        this.Name = Name;
    }

    @Override
    public void SetID(String ID) {
        this.ID = ID;
    }
    
    public double CalcTax(Employees emp){
        return emp.Salary*0.14;
    }
    
    public void SetSalary(Employees emp,double Salary){
        emp.setSalary(Salary);
    }
    
    public void SetSalary(Employees emp,String Salary){
        emp.setSalary(Salary);
    }
    
    public void SetSalary(Employees emp,int Salary){
        emp.setSalary(Salary);
    }
    
    public void PayFee(Student std){
        std.PayFees(true);
    }
    
    @Override
    public String toString() {
        String ret = "Accountant Name: " + Name
                + "\nAccountant ID: " + ID
                + "\nAccountant Salary: " + Salary
                + "\nAccountant Vacation Days: " + VacationDays;
        return ret;
    }
        
}
