package OOPS.Inheritance;

public class mainClass {
    public static void main(String[] args){
        Teacher SKG=new Teacher("Sukalyan");
//        SKG.eat();
//        SKG.walk();
//        SKG.teach();
//
//        Singer s =new Singer();
//        s.name="Arijit";
//        s.sing();
//        s.eat();

//        ----------Upcasting---------

        Person p=SKG;

//        ---------Downcasting--------
//        Teacher t1=new Teacher();
//        Singer s1=new Singer();
//        Person p1=s1;
//        Teacher t =(Teacher)t1;
//        System.out.println(t1 instanceof Teacher);
//        System.out.println(s1 instanceof Singer);
//        System.out.println(t1 instanceof Person);
//        System.out.println(t instanceof Person);
//        System.out.println(p1 instanceof Teacher);

//        --------super keyword--------
        SKG.eat();
    }
}
