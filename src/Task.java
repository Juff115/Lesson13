
public class Task {
    private String name;
    private String desc;
    
    public Task(String n, String d){
        name= n;
        desc= d;
    }
    
    public void setName(String nm){
        name=nm;
    }
    
    public void setDecs(String de){
        desc=de;
    }
    
    public String getDesc(){ 
        return desc;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean validate(){
        if(name==null || desc==null || name.equals("") || desc.equals("")) return false;
        else return true;
    }
    
    public String toString() {
        return "Name: "+name +"\nDescription: "+desc+"\n============\n";
    }
    
}
