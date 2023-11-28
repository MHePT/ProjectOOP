package projectoop;

import java.util.ArrayList;

public class Student {

    private String Name, ID, Department;
    private boolean paidfees;
    private ArrayList<Courses> regCourses = new ArrayList<>();
    static int StudentNo;

    public Student() {
        Name = "Untitled";
        ID = "0000";
        StudentNo++;
        Department = "Untitled";
        paidfees = false;
    }

    public Student(String Name, String ID, String Department) {
        this.Name = Name;
        this.ID = ID;
        this.Department = Department;
        StudentNo++;
        paidfees = false;
    }

    public Student(String Name, String ID, Departments Department) {
        this.Name = Name;
        this.ID = ID;
        this.Department = Department.GetName();
        StudentNo++;
        paidfees = false;
    }

    public String GetName() {
        return Name;
    }

    public String GetID() {
        return ID;
    }
    
    public String GetDepartment() {
        return Department;
    }

    public int CoursesRegNo() {
        return regCourses.size();
    }

    public void SetID(String ID) {
        this.ID = ID;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void PayFees(boolean paidfees) {
        this.paidfees = paidfees;
    }

    public void SetDepartment(String Department) {
        this.Department = Department;
    }

    public void SetDepartment(Departments Department) {
        this.Department = Department.GetName();
    }

    public void DeleteCrs(Courses crs) {
        regCourses.remove(crs);
    }

    public void AddCrs(Courses crs) {
        regCourses.add(crs);
    }

    @Override
    public String toString() {
        String ret = "Student Name: " + Name
                + "\nStudent ID: " + ID
                + "\nDepartment: " + Department
                + "\nPayed Fees: " + paidfees
                + "\nCourses Enrolled: ";

        for (int i = 0; i < regCourses.size(); i++) {
            ret = ret + "\n" + regCourses.get(i).GetID() + "   "
                    + regCourses.get(i).GetName() + "   "
                    + regCourses.get(i).GetCreditHRs();
        }

        return ret;
    }
}
