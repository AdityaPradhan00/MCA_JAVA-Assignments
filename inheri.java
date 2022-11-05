public class inheri {
    //public static void main(String arg[]){
    int a = 16;
}
class xy extends inheri{
    int a = 10;
    void show(){
        System.out.print(a);
        System.out.print("\n" + super.a);
    }
}
class xyz extends xy{

    void show(){
        //super.show();
        System.out.print("\nSecond: " + ((inheri)this).a);
    }
}
class t{
    public static void main(String arg[]){
       xy obj = new xy();
       xyz obj1 = new xyz();
       obj.show();
       obj1.show(); 
    }
}