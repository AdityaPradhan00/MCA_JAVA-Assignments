import java.io.*;
//import java.util.*;

public class Scann {

    public static void main(String[] args) throws IOException {
       // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
       // int i = scan.nextInt();
        double d = Double.parseDouble(br.readLine());       // double d = scan.nextDouble();
        //scan.nextLine();
        //String s = scan.nextLine();         
        //scan.close();
        String s = br.readLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}