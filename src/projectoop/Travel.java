package projectoop;

import java.util.ArrayList;

public class Travel {

    private double cost;
    private String Details, Name;
    private int duration;
    private ArrayList<Student> regStudents = new ArrayList<>();

    public Travel() {
        Name = "Untitled";
        Details = "No Details to show";
        cost = 0;
        duration = 0;
    }

    public Travel(String Name) {
        this.Name = Name;
    }

    public Travel(String Name, double fees) {
        this.cost = fees;
        this.Name = Name;
    }

    public Travel(String Name, double fees, String Details) {
        this.Name = Name;
        this.Details = Details;
        this.cost = fees;
    }
    
    public Travel(double cost, String Details, String Name, int duration) {
        this.cost = cost;
        this.Details = Details;
        this.Name = Name;
        this.duration = duration;
    }

    public void AddStudent(Student std) {
        regStudents.add(std);
        std.PayFees(false);
    }

    public void DelStudent(Student std) {
        regStudents.remove(std);
    }

    @Override
    public String toString() {
        String ret = "Travel Name: " + Name
                + "\nTravel Fees: " + cost
                + "\nTravel Details: " + Details
                + "\nTravel Duration: " + duration
                + "\nStudents Enrolled: ";

        for (int i = 0; i < regStudents.size(); i++) {
            ret = ret + "\n" + regStudents.get(i).GetName();
        }

        return ret;
    }
}
