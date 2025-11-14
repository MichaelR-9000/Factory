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
    public airplane(int pCapacity){
        capacity = pCapacity;
        name = "Jacob6";
        model = "boeing 737";
        isDoubleDecker = false;
        length = 150;

    }

    public void printinfo(){
        System.out.println(name);
        System.out.println(model);
        System.out.println(capacity);
        System.out.println(isDoubleDecker);
        System.out.println(length);


    }
//todo make a method called print info() that prints the airplanes instance variables
}
