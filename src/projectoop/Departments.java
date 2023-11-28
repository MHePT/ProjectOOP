package projectoop;

import java.util.ArrayList;

public class Departments {

    private String Name;
    private ArrayList<Courses> DepCourses = new ArrayList<>();
    private ArrayList<Lecturer> DepLecturer = new ArrayList<>();

    public Departments() {
        Name = "Untitled";
    }

    public Departments(String Name) {
        this.Name = Name;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void AddCourse(Courses crs) {
        DepCourses.add(crs);
    }

    public void AssignLecturer(Lecturer lec) {
        DepLecturer.add(lec);
    }

    public void DelCourse(Courses crs) {
        DepCourses.remove(crs);
    }

    public void DelLecturer(Lecturer lec) {
        DepLecturer.remove(lec);
    }

    public void GetCourses() {
        for (int i = 0; i < DepCourses.size(); i++) {
            System.out.println(DepCourses.get(i).GetName());
        }
    }

    public void GetLecturers() {
        for (int i = 0; i < DepLecturer.size(); i++) {
            System.out.println(DepLecturer.get(i).GetName());
        }
    }
    
    @Override
    public String toString() {
        String ret = "Department Name: " + Name
                + "\nDepartment Lecturers: ";
        
        for (int i = 0; i < DepLecturer.size(); i++) {
            ret = ret + "\n" + DepLecturer.get(i).GetName();
        }
        ret = ret + "\nDepartment Courses: ";
        
        for (int i = 0; i < DepCourses.size(); i++) {
            ret = ret + "\n" + DepCourses.get(i).GetName();
        }
        
        return ret;
    }

}
