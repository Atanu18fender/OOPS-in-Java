package OOPS.packages;
import OOPS.packages.models.Teacher;
import OOPS.packages.models.student;
//import OOPS.packages.models.* -> we can access all the classes inside that package at a time.
public class  mainClass {
    public static void main(String[] args){
        student student1 = new student("Tom");
        String Name = student1.getName();
        System.out.print(Name);
        Teacher teacher = new Teacher();
    }
}
