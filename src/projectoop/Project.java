package projectoop;

import java.util.ArrayList;

public class Project {
    
    private String Name,Details;
    private Student Head;
    private ArrayList<Student> regStudents = new ArrayList<>();

    public Project() {
        Name = "Untitled";
        Details="No details to show";
    }

    public Project(String Name) {
        this.Name = Name;
        Details="No details to show";
    }
    
    public Project(String Name,Student Head){
        this.Name = Name;
        this.Head=Head;
        Details="No details to show";
    }

    public Project(String Name, String Details, Student Head) {
        this.Name = Name;
        this.Details = Details;
        this.Head = Head;
    }
    
    public void ChangeHead(Student Head){
        this.Head = Head;
    }
    
    public void ChangeName(String Name){
        this.Name=Name;
    }
    
    public void SetDetails(String Details){
        this.Details=Details;
    }
    
    public String GetDetails(){
        return Details;
    }
    
    public String GetName(){
        return Name;
    }
    
    public String GetHead(){
        return Head.GetName();
    }
    
    public void Deletestd(Student std) {
        regStudents.remove(std);
    }
    
    public void Addstd(Student std) {
        regStudents.add(std);
    }
    
    @Override
    public String toString() {
        String ret = "Project Name: " + Name
                + "\nProject Head: " + Head.GetName()
                + "\nDetails: " + Details
                + "\nStudents Enrolled: ";
        
        for (int i = 0; i < regStudents.size(); i++) {
            ret = ret + "\n" + regStudents.get(i).GetName();
        }
        
        return ret;
    }

}
