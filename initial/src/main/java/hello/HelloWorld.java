package hello;


import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args)
  {
      Fectory_Employee Intense = new Fectory_Employee();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter what type of Employee You Want ? Intern , Manager , SoftwareEngineer , VicePresident : ");
      String str  = sc.next();
      System.out.println();
      Employee Ep = Intense.GetIntense(str);
      Ep.speek();




  }
}