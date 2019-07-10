package app;

public abstract class Employee implements Payable {
    String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }    
}


