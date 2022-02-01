//Name:Akshat Kapoor
//Student Number:100781511
//Description:to check if the triangle is formed or not.



import java.util.Scanner;

public class IsTriangle {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Read the points of the first line
        System.out.println("Insert the x value of the first point");
        double x1 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y1 = scan.nextDouble();
        Point point1 = new Point(x1, y1);//use of method, sends point values to point constructor
        System.out.println("nsert the x value of the first point");
        double x2 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y2 = scan.nextDouble();
        Point point2 = new Point(x2, y2);
        //construct the first line
        Line line1 = new Line(point1, point2);
        //get the length of the first line
        double line1Length = line1.getLenght();
        // do the same of Line 2 and Line 3
        //Read the points for second line
        System.out.println("Insert the x value of the first point");
        double x3 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y3 = scan.nextDouble();
        Point point3 = new Point(x3, y3);
        System.out.println("nsert the x value of the first point");
        double x4 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y4 = scan.nextDouble();
        Point point4 = new Point(x4, y4);
        //construct the second line
        Line line2 = new Line(point3, point4);
        //get the length of the second line
        double line2ength = line2.getLenght();
        //get the points for the second line.
        System.out.println("Insert the x value of the first point");
        double x5 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y5 = scan.nextDouble();
        Point point5 = new Point(x5, y5);
        System.out.println("nsert the x value of the first point");
        double x6 = scan.nextDouble();
        System.out.println("Insert the y value of the second point");
        double y6 = scan.nextDouble();
        Point point6 = new Point(x6, y6);
        //construct the third line
        Line line3 = new Line(point5, point6);
        //get the length of the third line
        double line3Length = line3.getLenght();
        System.out.println("line1:"+line1Length);
        if(line1Length<(line2ength+line3Length)&&line2ength<(line1Length+line3Length)&&line3Length<(line1Length+line2ength)){//To check if first distance is grater then the sum of
            // two line 2 and 3 distance
            System.out.print("Triangle formation is possible");//if it's true it possible to make a triangle

        }else {
            System.out.println("Triangle cannot be formed");//if false triangle caanot be hard
        }


        /*//if not then jumps to next condition
        else if(line2ength<(line1Length+line3Length)){//To check if second line distance is grater then the sum of
            // line 1 and 3 distance.
            System.out.print("Triangle formation is possible");

//if it's false, it jumps back to next condition
        }else if(line3Length<(line1Length+line2ength)){//To check if third line distance is grater then the sum of
            // line 2 and  distance.
            System.out.print("Triangle formation is possible");
            //if true it, then triangle can be formed
            //if all three conditions are false, not triangle can be formed
        }else{
            System.out.println("Triangle formation is not possible");
        }
        */




    }

}
