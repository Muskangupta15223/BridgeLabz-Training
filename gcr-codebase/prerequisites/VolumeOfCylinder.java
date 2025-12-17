import java.util.*;
class VolumeOfCylinder{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double PI = 3.14;
      System.out.println("Give radius: ");
      int radius = sc.nextInt();
      System.out.println("Give height: ");
      int height = sc.nextInt();
      System.out.println(PI* radius *radius*height);
   }
}
