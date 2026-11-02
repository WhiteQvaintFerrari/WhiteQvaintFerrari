public class GradeAnalysis
{
   public static void main(String[] args)
   {
      int[] grades = {91,85,73,100,94,63,84,100,98,75,91,84};
      int average = 0;
      for (int x : grades)
      {
         average += x;
      }
         average = average / grades.length;
      System.out.println("The average of the grades is: " + average / grades.length + "%");
      int highest = grades[0];
      int lowest = grades[0];
      for (int opt : grades)
      {
         if (opt > highest)
         {
            highest = opt;
         }
         if (opt < lowest)
         {
            lowest = opt;
         }
      }
      System.out.println("lowest grade was: " + lowest);
      System.out.println("highest grade was: " + highest);
      
      for(int c = 0; c < grades.length; c++)
      {
         if (grades[c] >= average)
         {
            System.out.println("Test " + c + ": " + grades[c] + "% is above average.");
         } else if (grades[c] == average) {
            System.out.println("Test " + c + ": " + grades[c] + "% is the average.");
         } else {
            System.out.println("Test " + c + ": " + grades[c] + "% is below average.");

         }
         
      }
      int curve = (100 - highest)/2;
      for(int applied = 0; applied < grades.length; applied++)
      {
         grades[applied] = grades[applied] + curve;
      }
      
      for(int p = 0; p < grades.length; p++)
      {
         System.out.println(grades[p]);
      }
   }
}