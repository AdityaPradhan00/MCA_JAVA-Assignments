//Program that will get odd, even, and prime numbers within a range
//given by the user.
import java.io.*;
class Prog
{
    int num;
    void getEven(){
        System.out.print("Even: ");
        for(int i = 0; i <= num; i++){//sorting out even numbers 
            if ( i % 2== 0){
                System.out.print(i + ",");
            }
        }
    }
    void getOdd(){
        System.out.print("\n\nOdd: ");
        for(int i = 0; i <= num; i++){//sorting out odd numbers 
            if ( i % 2 != 0){
                System.out.print(i + ",");
            }
        }
    }

}
class OddEven{
    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Prog obj = new Prog();//creating constructor
        System.out.print("Enter the Range: ");
        obj.num = Integer.parseInt(br.readLine());
        obj.getEven();//calling getEven function
        obj.getOdd();
       // obj.getPrime();
    }
}