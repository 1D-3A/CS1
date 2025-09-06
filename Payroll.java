import java.util.Scanner;
public class Payroll
{
   public static void main(String [] args)
   {
      int [] employeeID = {5658845,4520125,7895122,
                           8777541,8451277,1302850,
                           7580489};
      int [] hours = new int[7];
      double [] payRate = new double[7];
      double [] wages = new double [7];
   
      hours = hour(employeeID, hours);
      payRate = getPayRates(employeeID);
      wages = compute(payRate, hours);
      print(employeeID, wages);

   
    }
      //call method to enter hours
      public static int[] hour (int[] employeeID, int [] hours)
      {
         Scanner console = new Scanner(System.in);
         for(int i=0;i<employeeID.length;i++)
         {
            System.out.println("what is the number of hours worked by the employee" + employeeID[i]);
            hours[i]=console.nextInt();
            while(hours[i]<0)
            {
               System.out.println("what is the number of hours worked by the employee" + employeeID[i]);
               hours[i]=console.nextInt();
            }
         }
         console.close();
         return hours;
      }
      //call method to enter wages
     public static double[] getPayRates(int[] employeeId) {
        Scanner scanner = new Scanner(System.in);
        double payRates[] = new double[employeeId.length];
        for (int i = 0; i < employeeId.length; i++) {
            System.out.print("What is the pay rate for employee " + employeeId[i] + "? ");
            double payRate = scanner.nextDouble();
            while (payRate < 6) {
                System.out.print("Pay rate must be greater or equal to 6. Please enter a valid pay rate: ");
                payRate = scanner.nextDouble();
            }
            payRates[i] = payRate;
        }
        scanner.close();
        return payRates;
    }
      //call method to compute wages
   public static double[] compute(double payRate[], int[] hours)
   {
      double[] wages = new double[7];
      for(int i = 0; i < 7; i++)
         wages[i] = payRate[i]*hours[i];
      return wages;
   }
      //call method to print id and wages
      public static void print(int[] employeeID, double [] wages){
         for (int i =0;i<employeeID.length;i++)
         System.out.println(employeeID[i]);
                 
         for (int i =0;i<wages.length;i++)
         System.out.println(wages[i]);  
      }
  
}