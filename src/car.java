public class car {

    public int seats;
    public String engine;
    public boolean ismanual;

    public car() {
        seats = 4;
        engine = "big engine";
        ismanual = false;


    }

    public car(int cSeats, String cEngine, boolean cIsmanual){
        seats = cSeats;
        engine = cEngine;
        ismanual = cIsmanual;


    }

    public void printinfo() {
        System.out.println("this has "+seats+"seats");
        System.out.println(engine);
        System.out.println(ismanual);


    }
}
