/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercisever2;

import java.util.Scanner;


public class W2D4HomeExercises {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        
        System.out.println("*****Exercise 1*****");
        System.out.println();
        
        /*
        Write a Java program to print the area and perimeter of a circle. 
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586 
        Use memory-friendly variables and print the result with printf.
         */
        
 
        findRadious(7.5);
     
        
        
        
        System.out.println();
        System.out.println("*****Exercise 2*****");
        System.out.println();

        /*
        Write a Java program to print the result of the following operations for x = 1 and y =2. 
        After every operation print the result of the whole operation, x and y.
        a. -x + x++ * 2
        b. (x++ + --y) + --y
        c. x + x
        At the end, after all the operations print the values of x and y. 
        */


        operations(1, 2);
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 3*****");
        System.out.println();
        
        /*
        Write a Java program to print the area and perimeter of a rectangle. 
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20 
        */

        rectanglePerimeter(5.5, 8.5);
        
       
        
        
        
        System.out.println();
        System.out.println("*****Exercise 4*****");
        System.out.println();
        
        
        /*
        Write a Java program to convert seconds to hour, minute and seconds.
        */
        
        hoursConverter(7600);
        
      
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 5*****");
        System.out.println();
        
 
        /*
        Write a program to enter names and year of birth of 3 people. 
        Print a message for each person showing his/her details.
        */
        
        
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 6*****");
        System.out.println();
        
        
        /*
        Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        */
        
        System.out.println("Enter temperature in Fahrenheit");
        tempeture(input.nextInt());
        
        
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 7*****");
        System.out.println();
        
        
        /*
        Write a Java program that reads a number in inches, converts it to meters.
        Note: One inch is 0.0254 meter.
        */
        
        converter(50);
        
        
        
        System.out.println();
        System.out.println("*****Exercise 8*****");
        System.out.println();
        
        /*
        Γράψτε ένα πρόγραμμα που δέχεται την τιμή ενός προϊόντος κ
        αι εμφανίζει σε μηνύματα τη τιμή του σε έκπτωση 10%, 20%, 30%, 40%, 50%, 60%.
        */
        
        
    }
    
    static double findRadious(double radius){
        
        double perimeter = Math.PI * radius * 2;
        double area = Math.PI * radius * radius;
        
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        return -1;
    }
    
    static  int operations(int x , int y){
        
        int operationA = (-x + x++ * 2);
        int operationB = (x++ + --y) + --y;
        int operationC = x + x;
        
        System.out.println("a. -x + x++ * 2 = " + operationA);
        System.out.println("x = " + x + " y = " + y);
        System.out.println();
        System.out.println("b. (x++ + --y) + --y = " + operationB);
        System.out.println("x = " + x + " y = " + y);
        System.out.println();
        System.out.println("c. = x + x = " + operationC);
        System.out.println("x = " + x + " y = " + y);
        System.out.println();
        return -1;
    }
    
    static double rectanglePerimeter(double height , double width){
        
        double perimeter = 2 * (height + width);	
        double area = width * height;	
        
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    return -1;
}
    
    static int hoursConverter(int seconds){
        
        double minutes = seconds / 60;
        double hours = minutes / 60;
        
        System.out.println("The " + seconds + " seconds are " + minutes + " minutes and " + hours + " hours");
        
        return -1;
    }
    
//    static void peopleInfo(String name,int age){
//        
//        name = input.nextLine();
//        age = input.nextInt();
//        System.out.println("The first name is " + name);
//        return -1;
//    }  
    
    static double tempeture(double temp){

    temp = ((temp - 32) * 5) / 9;

    System.out.println("temperature in Celsius = " + temp);
        return -1;
    }
    
    
    static double converter(double inches){
        
        double meter = inches * 0.0254;
        System.out.println(inches + " inches = " + meter + " meters");
        return -1;
    }
}
