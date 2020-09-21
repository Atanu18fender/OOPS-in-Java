package OOPS.encapsulation;

public class Student {
    private int age;
    private String name;
    public int standard;

    Student(int standard){ // constructor
        if(standard>0) {
            this.standard=standard;
        }
    }
    public int ShowStandard(){ // method
        return standard;
    }

    public int getAge(){
        return age;
    }
    public void  setAge(int age){
        if(age>20){
            System.out.println("You are too old for our nursery school.");
        }else {
            this.age=age;
        }
    }

    public void setName(String name){
        this.name=name.trim();
    }
    public String getName(){
        return name;
    }
}
