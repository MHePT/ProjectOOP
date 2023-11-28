package projectoop;

public class Lab extends Building{
    
    public Lab(){
    }
    
    public Lab(String Name,int stdcapacity){
        super(Name,stdcapacity);
    }
    
    @Override
    public String toString(){
        return "Lab Name: "+Name+"\nLab Capacity: "+stdcapacity;
    }
    
}
