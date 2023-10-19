

        package org.example;
import java.util.Scanner;




/*public class Main {
    public static void main(String[] args) {
        int counter=0;
        int maxattempt=5;
        String password="FareLeva0";

        Scanner reader=new Scanner(System.in);


        while (counter<maxattempt){
            System.out.println("Enter password");
            String userpass=reader.nextLine();

            if (userpass.equals(password)){
                System.out.println("Congrats, Access Granted");
                break;
            }
            else {
                System.out.println("Nope try again");
                userpass=reader.nextLine();
                counter+=1;
            }



        }
        if (counter==maxattempt){
            System.out.println("Max attempts reached");


        };






    }
}*/



/*public class Main {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=reader.nextInt();

        System.out.println("Enter second number");
        int num2=reader.nextInt();

        System.out.println("Enter third number");
        int num3=reader.nextInt();

        int sum=num1+num2+num3;

        System.out.println("The sum is "+sum);

    }
}*/
/*public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;
        while (true){
            System.out.println("enter a number");
            read=reader.nextInt();

            if (read==0){
                break;
            }
            else {
                sum+=read;
                System.out.println("Sum now "+sum);
            }
        }
        System.out.println("Sum is "+sum);


    }

}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.println("enter first number");
        int firstNumber = reader.nextInt();


        System.out.println("enter second number");
        int lastnumber = reader.nextInt();



        while (firstNumber<=lastnumber){
            System.out.println(firstNumber);
            firstNumber++;

            if (firstNumber>lastnumber){
                break;
            }

        }

    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = reader.nextInt();
        int sum=0;

        for (int i=0;i<n+1;i++){
            int temp=(int)Math.pow(2,i);
            sum+= temp;
        }
        System.out.println("The sum of 2 to the power of n is"+sum);




    }


}*/
/*public class Main {
    public static void main(String[] args) {
        printText();


    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times should the text be printed");
        int numPrint=reader.nextInt();
        for (int i=0;i<numPrint;i++){
        printText();
        }


    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
       printStars(5);
        printStars(6);
        printStars(7);
    }


    public static void printStars(int numStar){
            for (int i=0;i<numStar;i++){
                System.out.print("*");
            }
        System.out.println();

    }
    }*/
