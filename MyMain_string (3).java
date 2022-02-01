import java.util.Scanner;

public class MyMain_string{
    public static void main(String[] Args) {
        Scanner scan=new Scanner(System.in);// Get the input
        System.out.println("Enter the String: ");//ask fir the input
        Stringmanupulation manupulation1= new Stringmanupulation();//made a new object
        String input=scan.nextLine();//store each line
        System.out.println(manupulation1.conversion(input));//take the input to the method in the class, and then display the answer



    }
}


