public class Multiplication {
    void print(){
        System.out.println("Hello, World!");

        int[] numbers = {1, 2, 3, 4, 5, 6,7,8,9,10};
        int num = 3;

        System.out.println(Math.random());

        for(int i=0; i<numbers.length; i++){
            System.out.printf("%d x %d = %d", num, numbers[i], num*numbers[i]).println();
        }
    }

    void print(int num, int from, int to ){
         for(int i=from; i<to; i++){
            System.out.printf("%d x %d = %d", num, i , num*i).println();
        }
    }
}
