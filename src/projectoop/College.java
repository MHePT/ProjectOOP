package projectoop;

public class College {
    
    private String ID,Name;

    public College(){
        ID="0000";
        Name = "Untitled";
    }
    
    public College(String ID,String Name){
        this.ID=ID;
        this.Name = Name;
    }
    
    public String GetName(){
        return Name;
    }
    
    public String GetID(){
        return ID;
    }
    
    public void SetID(String ID){
        this.ID=ID;
    }
    
    public void SetName(String Name){
        this.Name=Name;
    }
        
    @Override
    public String toString() {
        String ret = "College Name: " + Name
                + "\nCollege ID: " + ID
                + "\nCourses No: "+Courses.CoursesNo
                + "\nStudents No: "+Student.StudentNo
                + "\nLecturers No: "+Lecturer.LecturerNo;
        
        return ret;
    }
    
}
