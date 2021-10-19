import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        double x=Math.random()*100000;
        return 10+(int)x%11;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2));
        System.out.println(Mathey.max(2, 1));
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1.5, 2.5));
        System.out.println(Mathey.max(3.4, 6.1));
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2,5));
        System.out.println(Mathey.max(2, 9,8));
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1.6, 2.5,5.9,4.1));
        System.out.println(Mathey.max(1.4, 5.9,9.7,3.4));
        System.out.println("Mathey.randomInteger tests");
        System.out.println(Mathey.randomInteger(3, 26));
        System.out.println(Mathey.randomInteger(95, 108));
        System.out.println("Mathey.randomInteger tests");
        System.out.println(Mathey.randomInteger(25));
        System.out.println(Mathey.randomInteger(88));
        System.out.println("Mathey.pow tests");
        System.out.println(Mathey.pow(25,2));
        System.out.println(Mathey.pow(2,11));
        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.pow(25,2));
        System.out.println(Mathey.pow(2,11));
        System.out.println("Mathey.round tests");
        System.out.println(Mathey.round(4.8));
        System.out.println(Mathey.round(7.9));
        System.out.println("Mathey.floor tests");
        System.out.println(Mathey.floor(45.3));
        System.out.println(Mathey.floor(12.4));
        System.out.println("Mathey.ceiling tests");
        System.out.println(Mathey.ceiling(3.4));
        System.out.println(Mathey.ceiling(6.9));
        System.out.println("Mathey.sqrt tests");
        System.out.println(Mathey.sqrt(89));
        System.out.println(Mathey.sqrt(66));
        int a=5;
        int b=12;
        int cSquared=Mathey.pow(a,2)+Mathey.pow(b,2);
        System.out.println(Mathey.round(Mathey.sqrt(cSquared)));
    }

}



