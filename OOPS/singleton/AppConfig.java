package OOPS.singleton;

public class AppConfig {
    private AppConfig(){

    }
    private static AppConfig obj=null;

    public static AppConfig getInstance(){
        obj=new AppConfig();
        return  obj;
    }
}
