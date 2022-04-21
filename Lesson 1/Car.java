package ca.bcit.comp2501.lesson1.jasonwilder;

/**
 * @author Jason Wilder
 */
public class Car
{
   private String  make;
   private String  model;
   private int     modelYear;
   private boolean electric;
   private double  weightKg;

   public Car()
   {
      System.out.println("creating a car");
      System.out.println("constructor being called...");
      System.out.println(make);
      System.out.println(model);
      System.out.println(modelYear);
      System.out.println(electric);
      System.out.println(weightKg);
   }

   public void drive()
   {
      System.out.println("vrooooooooom");
   }
}
