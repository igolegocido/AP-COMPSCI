/* 
Ryan Wei
09.20.21
Problem Set 1-A
*/
class equations{
    public static void main(String[] args){
        //Quadratic Formula
        double a = 1; //Coefficient of x^2
        double b = 5; //Coefficient of x
        double c = 6; //Constant
        double root1 = (-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); //The value of x when the numerator of the quadratic formula is subtracted
        double root2 = (-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);//The value of x when the numerator of the quadratic formula is added
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b +"x + "+ (int)c +" are " + root1 +" and "+root2+".");
        System.out.println(); //add blank line
        
        //Slope Formula
        double x1 = 0; //value of x for the first point
        double y1 = 0; //value of y for the first point
        double x2 = 2; //value of x for the second point
        double y2 = 3; //value of y for the second point
        double slope = (y2-y1)/(x2-x1); //value of slope of the line connecting the two points
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int)x1 +", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of "+ slope);
        System.out.println(); //add blank line
        
        //Midpoint Formula
        x1 = 0; //value of x for the first point
        y1 = 0; //value of y for the first point
        x2 = 2; //value of x for the second point
        y2 = 3; //value of y for the second point
        double midpointX = (x1+x2)/2;//x value of the midpoint between the two points
        double midpointY = (y1+y2)/2;//y value of the midpoint between the two points
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int)x1 +", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is (" +midpointX+", "+midpointY+")");
        System.out.println(); //add blank line
        
        //
    }
}