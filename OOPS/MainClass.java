package OOPS;
class Cat{
    boolean hasFur;
    String color,breed;
    public void eat(){
        System.out.println("The cat is eating");
    }
    public void walk(){
        System.out.println("The cat is walking");
    }
    public void description(){
        System.out.println("My cat is "+color+" colored and it's breed is "+breed);
    }
}
class Dog{
    String name,breed;
    public void jump(){
        System.out.println("My dog is jumping");
    }
    public void description(){
        System.out.println("My dog name is :"+name+" and it's breed is :"+breed);
    }
}
public class MainClass {
    public static void main(String[] args){
        Cat cat1=new Cat();
        Cat cat2=new Cat();

//        cat1.color="black";
        cat1.breed="persian";

        cat1.eat();
        cat1.description();
        cat2.walk();

        Dog husky=new Dog();
        husky.breed="Husky";
        husky.name="Mapple";
        husky.description();
        Dog poodle=new Dog();
        poodle.name="Joey";
        poodle.description();
    }
}
