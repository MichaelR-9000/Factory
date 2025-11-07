public class Factory {
//scope is whole class
public int yearfounded = 1798;
public String factoryName = "car factory";
public boolean isOpen = true;


    public static void main(String[] args) {
        System.out.println("welcome to Michael's factory");
        new Factory();

    }


    //constructor is a very special type of method which has the exact same name as the class
    public Factory(){
        isOpen = false;
        //scope for manager is only in the contructory
        String manager = "Santa";
        factoryinfo();

        //todo: chane the variables yearfounded to be a different value
        //call factoryInfo();

    }
    //make a method called factoryinfo

    public void factoryinfo(){

        System.out.println(yearfounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println();

    }


}
