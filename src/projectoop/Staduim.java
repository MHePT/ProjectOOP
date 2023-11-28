package projectoop;

public class Staduim extends Building{
    
    public Staduim(){
    }
    
    public Staduim(String Name,int stdcapacity){
        super(Name,stdcapacity);
    }
    
    @Override
    public String toString(){
        return "Staduim Name: "+Name+"\nStaduim Capacity: "+stdcapacity;
    }
    
}
