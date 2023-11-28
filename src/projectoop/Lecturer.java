package projectoop;

import java.util.ArrayList;

public class Lecturer extends Employees {

    private String Name,ID,Department,email;
    private ArrayList<Courses> regCourses = new ArrayList<>();
    static int LecturerNo;

    public Lecturer(){
        Name = "Untitled";
        ID = "0000";
        LecturerNo++;
        Salary = 30000;
        email = "undefined@alexu.edu.eg";
        Department = "Untitled";
    }
    
    public Lecturer(String Name, String ID,Departments Department){
        this.Name = Name;
        this.ID = ID;
        LecturerNo++;
        this.Department=Department.GetName();
        Department.AssignLecturer(this);
        Salary = 30000;
    }
    
    
    public Lecturer(String Name, String ID,Departments Department,Courses crs){
        this.Name = Name;
        this.ID = ID;
        regCourses.add(crs);
        LecturerNo++;
        this.Department=Department.GetName();
        Department.AssignLecturer(this);
        Salary = 30000;
    }
    
    public Lecturer(String Name, String ID,Departments Department,Courses crs,String email){
        this.Name = Name;
        this.ID = ID;
        regCourses.add(crs);
        LecturerNo++;
        this.Department=Department.GetName();
        Department.AssignLecturer(this);
        Salary = 30000;
        this.email = email;
    }
    
    public void DeleteCrs(Courses crs) {
        regCourses.remove(crs);
    }

    public void AddCrs(Courses crs) {
        regCourses.add(crs);
    }

    @Override
    public String GetName() {
        return Name;
    }

    @Override
    public String GetID() {
        return ID;
    }

    @Override
    public void SetName(String Name) {
        this.Name = Name;
    }

    @Override
    public double getSalary() {
        return Salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void SetID(String ID) {
        this.ID = ID;
    }
    
    public void SetDepartment(Departments Department) {
        this.Department = Department.GetName();
        Department.DelLecturer(this);
        Department.AssignLecturer(this);
    }
    
    public String GetDepartmentName() {
        return Department;
    }
    
    
    @Override
    public String toString() {
        String ret = "Lecturer Name: " + Name
                + "\nLecturer ID: " + ID
                + "\nDepartment: "+Department
                + "\nSalary: "+Salary
                + "\nCourses Enrolled: ";
        
        for (int i = 0; i < regCourses.size(); i++) {
            ret = ret + "\n" + regCourses.get(i).GetID() + "   "
                    + regCourses.get(i).GetName() + "   "
                    + regCourses.get(i).GetCreditHRs();
        }
        
        return ret;
    }
}
