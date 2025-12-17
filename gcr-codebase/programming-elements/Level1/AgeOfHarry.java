//Creating Class with name AgeOfHarry for calculating age based on birth year and current year. 
class AgeOfHarry{
    public static void main(String args[]){
        // Creating variables birthYear and currentYear.
        int birthYear=2000, currentYear=2024;
        
        // Calculating age.
        int age = currentYear - birthYear;

        // Displaying the Harry's age
        System.out.println("Harry's age in 2024 is " + age);
    }
}