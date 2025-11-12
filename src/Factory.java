public class Factory {
//scope is whole class
public int yearfounded = 3005;
public String factoryName = "airplane factory";
public boolean isOpen = false;


    public static void main(String[] args) {
        System.out.println("welcome to Michael's factory");
        new Factory();

    }


    ///1. constructor is a very special type of method which has the exact same name as the class
    /// 2. is a method
    ///3. no void
    public Factory(){
        isOpen = false;
        //scope for manager is only in the contructory
        String manager = "Santa";
        factoryinfo();

        //todo: chane the variables yearfounded to be a different value
        //call factoryInfo();

        //type varName = value
        //object of type airplane
        airplane plane1 = new airplane();
        System.out.println(plane1.name);
        plane1.capacity = 300;
        plane1.isDoubleDecker = true;
        plane1.length = 3;
        plane1.model = "bigplane";
        System.out.println(plane1.model);
        airplane plane2 = new airplane();

        System.out.println(plane2.capacity);

        //HW: make 2 more airplane objects
        //for one of the objects change all the instance variables
        // for all or both objects print all the instance variables



    }
    //make a method called factoryinfo

    public void factoryinfo(){

        System.out.println(yearfounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println();

    }


}
