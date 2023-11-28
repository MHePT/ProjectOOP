package projectoop;

public class Building {
    
    protected String Name;
    protected int stdcapacity;
    
    public Building(){
        Name="Untitled";
        stdcapacity=0;
    }
    
    public Building(String Name,int stdcapacity){
        this.Name=Name;
        this.stdcapacity=stdcapacity;
    }
    
}
