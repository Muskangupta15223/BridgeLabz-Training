//Creating Class with name DistributionOfPen for dividing pens equally among students.
class DistributionOfPen{
   public static void main(String args[]){
      // Declaring variables totalPens and totalStudents.
      int totalPens = 14;
      int totalStudents = 3;

      // Calculating pens per student and remaining pens.
      int penPerStudent = totalPens / totalStudents;
      int remainingPen = totalPens % totalStudents;

      // Displaying distribution result.
      System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
   }
}