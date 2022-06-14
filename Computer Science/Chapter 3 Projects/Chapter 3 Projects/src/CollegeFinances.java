import java.util.Scanner;
import java.text.NumberFormat;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Code Works!");

    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    /*
    costTotal = amount needed to pay loan off
    costMonthly = amount needed to pay monthly
    p = dollars borrowed monthly
    r = interest rate as decimal
    months = number of months
    */
    double costTotal, p, r, months, costMonthly ;
    System.out.print("\nInput the amount borrowed ($): ");
    p = scan.nextDouble();
    System.out.print("Input the annual interest rate (%): ");
    r = scan.nextDouble()/1200;
    System.out.print("Input the number of months: ");
    months = scan.nextDouble();
    // formula
    costTotal = (p*r*months) / (1-Math.pow((1+r),-months));
    System.out.println("\nTotal cost: "+fmt.format(costTotal));
    costMonthly = costTotal/months;
    System.out.println("Monthly cost: "+fmt.format(costMonthly));
    
  }
}