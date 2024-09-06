import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        //6 --> 1,2,3  1+2+3=6

        Scanner kb = new Scanner(System.in);

        int number = kb.nextInt();
        int total = 0;

        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if(total == number){
            System.out.println("Mükemmel Sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }


        }


    }
