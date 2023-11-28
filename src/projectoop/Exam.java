package projectoop;

public class Exam {
    
    private String Name,Date;
    private Lecturer lec;
    private Courses crs;
    
    public Exam(String Name,String Date,Lecturer lec,Courses crs){
        this.Name=Name;
        this.Date = Date;
        this.crs=crs;
        this.lec=lec;
    }
    
    public String GetDate() {
        return Date;
    }
    
    public String GetName() {
        return Name;
    }
    
    public String GetLecturer() {
        return lec.GetName();
    }
    
    public String GetCourse() {
        return crs.GetName();
    }
    
    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetDate(String Date) {
        this.Date = Date;
    }
    
    public void SetLecturer(Lecturer lec) {
        this.lec= lec;
    }
    
    public void setCourse(Courses crs) {
        this.crs=crs;
    }
    
    @Override
    public String toString() {
        String ret = "Exam Name: " + Name
                + "\nExam Date: " + Date
                + "\nCourse: "+crs.GetName()
                + "\nLecturer Enrolled: "+lec.GetName();
        
        return ret;
    }
    
}
