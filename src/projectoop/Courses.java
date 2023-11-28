package projectoop;

import java.util.ArrayList;

public class Courses {

    private String ID, Name, crsLecturer, Department;
    private int CreditHRs;
    private ArrayList<Student> regStudents = new ArrayList<>();
    static int CoursesNo;
    
    public Courses() {
        ID = "0000";
        Name = "Untitled";
        CreditHRs = 0;
        crsLecturer = "Not Assigned";
        Department = "Untitled";
        CoursesNo++;
    }

    public Courses(String ID, String Name, int CreditHRs, Departments Department) {
        this.ID = ID;
        this.Name = Name;
        this.CreditHRs = CreditHRs;
        this.Department = Department.GetName();
        Department.AddCourse(this);
        crsLecturer = "Not Assigned";
        CoursesNo++;
    }

    public Courses(String ID, String Name, int CreditHRs, Departments Department, Lecturer crsLecturer) {
        this.ID = ID;
        this.Name = Name;
        this.CreditHRs = CreditHRs;
        this.Department = Department.GetName();
        Department.AddCourse(this);
        crsLecturer.AddCrs(this);
        this.crsLecturer = crsLecturer.GetName();
        CoursesNo++;
    }

    public Courses(String ID, String Name, int CreditHRs, Departments Department, Lecturer crsLecturer, Student std) {
        this.ID = ID;
        this.Name = Name;
        this.CreditHRs = CreditHRs;
        this.Department = Department.GetName();
        Department.AddCourse(this);
        crsLecturer.AddCrs(this);
        this.crsLecturer = crsLecturer.GetName();
        regStudents.add(std);
        std.AddCrs(this);
        CoursesNo++;
    }

    public String GetID() {
        return ID;
    }

    public String GetName() {
        return Name;
    }

    public int GetStudentsNo() {
        return regStudents.size();
    }

    public int GetCreditHRs() {
        return CreditHRs;
    }

    public String GetLecturer() {
        return crsLecturer;
    }

    public void SetID(String ID) {
        this.ID = ID;
    }

    public void SetLecturer(Lecturer Lec) {
        Lec.AddCrs(this);
        crsLecturer = Lec.GetName();
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetCreditHRs(int CreditHRs) {
        this.CreditHRs = CreditHRs;
    }

    public void SetDepartment(String Department) {
        this.Department = Department;
    }

    public void SetDepartment(Departments Department) {
        this.Department = Department.GetName();
    }

    public void Deletestd(Student std) {
        regStudents.remove(std);
        std.DeleteCrs(this);
    }

    public void Addstd(Student std) {
        regStudents.add(std);
        std.AddCrs(this);
    }

    @Override
    public String toString() {
        String ret = "Course Name: " + Name
                + "\nCourse ID: " + ID
                + "\nCourse Hours: " + CreditHRs
                + "\nDepartment: " + Department
                + "\nLecturer: " + crsLecturer
                + "\nStudents Enrolled: ";

        for (int i = 0; i < regStudents.size(); i++) {
            ret = ret + "\n" + regStudents.get(i).GetName();
        }

        return ret;
    }

}
