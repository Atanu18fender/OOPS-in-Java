package OOPS.Inheritance;

public class Singer extends Person{
    public Singer(String name){
        super(name);
    }
    public void sing(){
        System.out.println("Singer "+name+" is singing");
    }
    public void eat(){
        System.out.println("Singer "+name+" is eating");
    }
}
