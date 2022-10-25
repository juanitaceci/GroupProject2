package com.Syntax.Task3;

 public class Car {
    /*3. Create a Class Car that would have the
   following fields: carPrice and color and method calculateSalePrice() which should be returning a price of the car.

   Create 2 sub classes: Sedan and Truck.
   The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
   in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount,
   otherwise 20% discount.

   The Sedan class has field as length and also does it is own implementation of
   calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
   otherwise 10% discount
     */

     double carPrice;
     String color;


     Car(String color, double carPrice) {
         this.color = color;
         this.carPrice = carPrice;
     }

     public double calculateSalePrice(){

         return carPrice;
     }

      }


  class Truck extends Car {

         double weight;

         Truck(String color, double carPrice, double weight) {
             super(color, carPrice);
             this.weight = weight;
         }

      public double calculateSalePrice() {
             if (weight > 2000) {
                 carPrice-=carPrice*0.10;
             } else {
                 carPrice-=carPrice*0.20;
             }
             return carPrice;
      }

  static class Sedan extends Car{

             double feet;
            // double carPrice;

      Sedan(String color, double carPrice, double feet) {
          super(color, carPrice);
          this.feet = feet;
      }

      public double calculateSalePrice() {
          if (feet > 20) {
              carPrice-=carPrice*0.05;
          } else {
              carPrice-=carPrice*0.10;
          }
          return carPrice;
      }

  }

    public static void main(String[] args) {

        Truck truck1=new Truck("Blue",3000, 500);
        System.out.println(truck1.calculateSalePrice());

        Sedan sedan=new Sedan("White", 2000, 21);
        System.out.println(sedan.calculateSalePrice());
    }
}
