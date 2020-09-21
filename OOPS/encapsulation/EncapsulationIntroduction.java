package OOPS.encapsulation;

public class EncapsulationIntroduction {
    public static void main(String[] args){
        Student obj = new Student(-5);
        obj.setAge(10);
//        obj.standard=-9;
        obj.setName("Atanu");
        System.out.println("Standard: "+obj.ShowStandard());
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
