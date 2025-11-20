public class Main {

    void revolve(){
        System.out.println("This is Planet");
    }
    public static void main(String[] args) {
        
        
        Main earth = new Main();
        earth.revolve();

        Multiplication table = new Multiplication();
        table.print();
        table.print(5,11,20);
    }
}