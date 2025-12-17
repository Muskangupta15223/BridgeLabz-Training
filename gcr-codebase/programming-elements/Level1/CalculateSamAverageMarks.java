//Creating Class with name CalculateSamAverageMarks for calculating Average Marks of PCM.
class CalculateSamAverageMarks{
   public static void main(String args[]){
       // Declaring variables to store marks.
       int physicsMark=95;
       int chemistryMark=96;
       int mathsMark=94;

       // Calculating average percentage
       double average=(physicsMark + chemistryMark + mathsMark) / 3;

       // Displaying average marks.
       System.out.println("Sam's average mark in PCM is " + average);
    }
}