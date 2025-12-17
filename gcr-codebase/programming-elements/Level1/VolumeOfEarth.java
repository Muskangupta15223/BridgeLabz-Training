//Creating Class with name VolumeOfEarth for calculating volume of the Earth
class VolumeOfEarth{
   public static void main(String args[]){
       // Declaring variables radiusOfEarth and constant value of PI
       double PI = 3.14;
       int radiusOfEarth = 6378;

       // Calculating volume in cubic kilometers and cubic miles
       double volumeInKm = (4/3) * PI * Math.pow(radiusOfEarth, 3);
       double volumeInMiles = volumeInKm * Math.pow(0.621371, 3);
       
       // Displaying volume of Earth
       System.out.println("The volume of earth in cubic kilometers is " +volumeInKm+ " and cubic miles is " + volumeInMiles);
   }
}