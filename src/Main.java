import static java.lang.Long.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        createFractal(1000);
    }


    public static void createFractal(long n){
        System.out.println();
        for(long i = 0; i < n  / 2; i++){
            System.out.print(" ");

        }
        System.out.print("|");

        for(long i = 0; i < n; i++){
            System.out.print("_");

        }
        System.out.print("|");


        if (n > 1) {
            createFractal(n / 2);
        }
    }
}