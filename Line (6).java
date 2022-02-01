//Name:Akshat Kapoor
//Student Number:100781511
//Description:to check if the triangle is formed or not.





public class Line {
    public Point startpoint, endpoint;//instant variables

    public Line(Point startpoint, Point endpoint) {//get the points from the point class, that's why we used points
        //initialize the instant variables
        this.startpoint = startpoint;
        this.endpoint = endpoint;
    }

//Get length method to calculate the distance
    public double getLenght() {
        double distance = Math.sqrt(Math.pow(endpoint.getvaluex()- startpoint.getvaluex(), 2) + Math.pow(endpoint.getvaluey() - this.startpoint.getvaluey(), 2));
        System.out.println(distance);//get the points from point class and then use it calculate the distance

        return distance;//Send the calculated distance to isTriangles class, for if conditions

    }
}
