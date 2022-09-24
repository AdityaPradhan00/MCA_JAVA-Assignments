//Q. Write a program to accept two integers through command line arguments and display the addition,
//subtraction, multiplication and division
public class add{
    public static void main(String args[]){
        System.out.print("Sum: " + (Integer.parseInt(args[0])+Integer.parseInt(args[1])));//pasrsing the string numbers to integer 
        System.out.print("\nDifference: " + (Integer.parseInt(args[0])-Integer.parseInt(args[1])));
        System.out.print("\nProduct: " + Integer.parseInt(args[0])*Integer.parseInt(args[1]));
        System.out.print("\nQuotient: " + Float.parseFloat(args[0])/Float.parseFloat(args[1]));
    }
}