package examples;

public class StaticTests {

    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("Constructor");
    }

    public static void main(String[] args){

        System.out.println("in main");
        StaticTests st = new StaticTests();

    }

}
