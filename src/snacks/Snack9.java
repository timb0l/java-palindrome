package snacks;
// Calcola la somma e la media dei primi 10 numeri.
public class Snack9 {
    public static void main(String[] args) {
        int avg;
        int sum = 0;
            for (int a = 1; a <= 10; a++){
                sum =+ a;
            }
        avg = (int) sum / 10;
    System.out.println("Average of number: " + avg);
    System.out.println("Summation of number: " + sum);
    }
}
