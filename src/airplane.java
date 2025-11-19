public class airplane {
    /// instance variables
    /// 1. used in the whole class
    /// 2. should be at the top of the class
    /// 3. must have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;

    //contructor
    public airplane(){
        capacity = 250;
        name = "Jacob6";
        model = "boeing 737";
        isDoubleDecker = false;
        length = 150;


    }

    //constructor with parameter
    //todo: add a parameter for model, isdoubledecker
    public airplane(int pCapacity, String pName,String pModel, boolean pIsdoubledecker, int pLength){
        capacity = pCapacity;
        name = pName;
        model = pModel;
        isDoubleDecker = pIsdoubledecker;
        length = pLength;
        model = "boeing 737";

    }

    public void printinfo(){
        System.out.println(name); //mot readable
        System.out.println("Model:"+model); //readable simple
        System.out.println(capacity);
        System.out.println(isDoubleDecker);
        System.out.println(length);


    }

}
