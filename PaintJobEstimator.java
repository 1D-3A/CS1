import java.util.*;
public class PaintJobEstimator
{

// add the main to call the methods and print the results

//method to get/return the price of one gallon of paint, must validate that it is greater than 0 Sean/Tim

public static double priceValidation(double price) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter the price of one gallon of paint: ");
	price = console.nextDouble();
	while (price <= 0) {
		System.out.println("Price must be greater than 0. Please enter a valid price: ");
		price = console.nextDouble();
    }
	console.close();
	return price;
}

//method to get/return the area of a room, must validate that it is greater than 0 DJ/Jared
public static double roomArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the length of the room: ");
    double length = scanner.nextDouble();
    
    System.out.print("Enter the width of the room: ");
    double width = scanner.nextDouble();

    double area = length * width;
    scanner.close();
    if (area <= 0) {
        System.out.println("Area invalid. Please try again.");
        return roomArea();
    }
    return area;
}

//method to calculate/return the number of gallons of paint required Vinny/Kevin 

public static double calcGal(double area)
   {
      double calcGal;
      calcGal = area/115;
      return calcGal;
   }

//method to calculate/return the cost of the paint Sol/Adriana
 public static double CalcCost(double Pricepergallon, double NumberofGallon)
   {
      double PaintCost;            
      PaintCost=(Pricepergallon*NumberofGallon);
      return PaintCost;
   }

//method to calculate/return the number of hours of labor required Brendan/Shyam
 public static double labor(double sf)
   {
      double lb=115.0, ph=8.0, tl, numofhours;
      tl=lb/ph;
      numofhours=sf/tl;
      return numofhours;
   }

//method to calculate/return the labor cost Dara/Nimisha
 public static  double LaborCost(double hours)
      {
   
     double cost = hours*18;
     return cost;
         
         
         
         
         }

//method to calculate/return the total cost of the job DJ/Jared
public static double calcTotal(double paintCost, double laborCost) {
    return paintCost + laborCost;
}

public static void main(String[] args) {
    double price = 0; double area = 0; double gallons = 0; double paintCost = 0; double hours = 0; double laborCost = 0; double totalCost = 0;
    area = roomArea();
    price = priceValidation(0);
    gallons = calcGal(area);
    paintCost = CalcCost(price, gallons);
    hours = labor(area);
    laborCost = LaborCost(hours);
    totalCost = calcTotal(paintCost, laborCost);
    
    System.out.printf(" - Number of Gallons: %.2f\n", gallons);
    System.out.printf(" - Hours of Labor: $%.2f\n", hours);
    System.out.printf(" - Paint Cost: $%.2f\n", paintCost);
    System.out.printf(" - Labor Cost: $%.2f\n", laborCost);
    System.out.printf(" - Total Cost: $%.2f\n", totalCost);

    }

}