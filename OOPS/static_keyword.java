package OOPS;
import OOPS.A.B;
import OOPS.A.C;
public class static_keyword {
    static {
        System.out.println("in block 1");
    }
    static {
        System.out.println("in block 2");
    }
    public static void main(String[] args){
        A objA=new A();
        B objB=objA.new B();
        C objC=new A.C();
        System.out.println("inside main function ");
    }
    static {
        System.out.println("in block 3");
    }
}
