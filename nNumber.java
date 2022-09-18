public class nNumber {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        for(int i = 0; i <= a; i++){
            if ( i % 2== 0){
                System.out.print(i + ",");
            }
        }
    }
}
