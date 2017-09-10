package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10 to convert it to Korean");
        int answer = scan.nextInt();

        switch (answer){
            case 1: System.out.print("Hana");
                break;
            case 2: System.out.print("Dul");
                break;
            case 3: System.out.print("Set");
                break;
            case 4: System.out.print("Net");
                break;
            case 5: System.out.print("Dausut");
                break;
            case 6: System.out.print("Yeosut");
                break;
            case 7: System.out.print("Ilgup");
                break;
            case 8: System.out.print("Yeodul");
                break;
            case 9: System.out.print("Ahope");
                break;
            case 10: System.out.print("Yul");
                break;
            default: System.out.print("No");
        }
    }
}
