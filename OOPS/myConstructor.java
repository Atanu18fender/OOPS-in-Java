package OOPS;
class vehicles{
    int wheels;
    int lookingGlass;
    String color;
    vehicles(){ // default constructor
        System.out.println("object created with default constructor");
    }
    vehicles(int wheels){
        this.wheels=wheels;
        lookingGlass=2;
    }
    vehicles(int wheels,String color){
        this.wheels=wheels;
        lookingGlass=2;
        this.color=color;
    }
}

public class myConstructor {
    myConstructor(){
        System.out.println("object is now created.");
    }
    public static void main(String[] args){
//        myConstructor obj = new myConstructor();
        vehicles car =new vehicles(4);
        vehicles scooty =new vehicles(2);
        vehicles bike=new vehicles(2,"orange");
        vehicles urus=new vehicles();
        System.out.println("Number of wheels in car:"+car.wheels+" and number of Looking Glass:"+car.lookingGlass);
        System.out.println("Number of wheels in scooty:"+scooty.wheels+" and number of Looking Glass:"+scooty.lookingGlass);
        System.out.println("Number of wheels in bike:"+bike.wheels+" and Looking Glass:"+bike.lookingGlass+" color:"+bike.color);
    }
}
