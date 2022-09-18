//Q. Write a program that accepts n-number of integers through command 
//line arguments and display only the even numbers out of it.
public class nNumber {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);//parsing the n-number into integer 
        for(int i = 0; i <= a; i++){//sorting out even numbers 
            if ( i % 2== 0){
                System.out.print(i + ",");
            }
        }
    }
}
