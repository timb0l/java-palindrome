package snacks;

import java.util.Scanner;

//Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.
public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4-digit number..");
        String num = scan.next();
        int sum = 0;
        for (int a = 0; a < num.length(); a++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(a)));
        }
        System.out.println(sum);
    }
}