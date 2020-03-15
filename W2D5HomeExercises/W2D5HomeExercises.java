/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d5homeexercises;



/**
 *
 * @author Ηλίας
 */
public class W2D5HomeExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("*****Exercise 1*****");
        System.out.println();
        /*
        1. What class in school are you going according to age;
           Use an if-else-if.
           For example: 5-12 dimotiko, ...
           Can you use a switch statement?
        */
        
        
        
        //Using if-else if
        
        schoolWithIf(16);
        
        //Using switch (Not working!!!)
        
//        schoolWithSwitch(12);
        
        
        
        System.out.println();
        System.out.println("*****Exercise 2*****");
        System.out.println();
        /*
        2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
        */
        
        
        
        calendar(2);
        
        
        
        System.out.println();
        System.out.println("*****Exercise 3*****");
        System.out.println();
        /*
        3. What season is according to month. Enter month from terminal.
        */
        
        
        //????????
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 4*****");
        System.out.println();
        /*
        4. Print the number of days each month has. Use switch.
        */
        
        
        monthDays(5);
        
        
        
        System.out.println();
        System.out.println("*****Exercise 5*****");
        System.out.println();
        /*
        5. Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). 
        */
        
        
        grades('B');
        
        
        
        System.out.println();
        System.out.println("*****Exercise 6*****");
        System.out.println();
        /*
        6. Based on age what can you do?
            lt 16>>You cannot drive
            16-17>>You can drive but not vote
            18-21>>You can vote but not drink
            gt 22>>You can do anything 
        */
        
        
        drivePermision(30);
        
        
        
        
        System.out.println();
        System.out.println("*****Exercise 7*****");
        System.out.println();
        /*
        7. Program should ask your weight and planet. 
           Compute your weight on the planet based on the table below:
            #    Planet    Relative gravity
            1    Venus        0.78
            2    Mars        0.39
            3    Jupiter    2.65
            4    Saturn    1.17
            5    Uranus    1.05
            6    Neptune    1.23
            So, for example, if your weight is 80 kg on earth, then you would weigh just over 31 kg on Mars, 
        since Mars' gravity is 0.39 times earth's gravity. (80 * 0.39 is 31.20)
        */
        
        
        //for later
        
        
        
        System.out.println();
        System.out.println("*****Exercise 8*****");
        System.out.println();
        /*        
        8. Use ternary to return a message child or adult. Older than 18 is adult.
        */
        

        //??????
        
        
        System.out.println();
        System.out.println("*****Exercise 9*****");
        System.out.println();
        /*
        9. Create a program that stores the names of your 4 best friends in an array. 
        Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
        */
        
        //for later
        
        
        System.out.println();
        System.out.println("*****Exercise 10*****");
        System.out.println();
        
        
    }
    
    static int schoolWithIf(int age){
        
        if (age > 5 && age < 12) {
            System.out.println("You are going dimotiko");
            
        }else if (age >= 12 && age <15) {
            System.out.println("You are going gymnasio");
            
        }else if (age >= 15 && age <18){
            System.out.println("You are going lukeio");
        }else{
            System.out.println("Invalid age");
        }
        return -1;
        
    }
    
//    static int schoolWithSwitch(int age){
//        
//        String school;
//        
//        switch (age){
//            case age > 5 && age < 12:
//                school = "dimotiko";
//                break;
//            case age >= 12 && age <15:
//                school = "gymnasio";
//                break;
//            case age >= 15 && age <18;
//                school = "lukeio";
//                break;
//            default:
//                System.out.println("Invalid age");
//        }
//        
//        
//        return -1;
//    }


    static int calendar(int day){
        
    switch (day) {
      case 1:
        System.out.println("Monday go to work");
        break;
      case 2:
        System.out.println("Tuesday go to work");
        break;
      case 3:
        System.out.println("Wednesday go to work");
        break;
      case 4:
        System.out.println("Thursday go to work");
        break;
      case 5:
        System.out.println("Friday go to work");
        break;
      case 6:
        System.out.println("Saturday relaxing");
        break;
      case 7:
        System.out.println("Sunday relaxing");
        break;   
    }
        return -1;
    }    
    

        static int monthDays(int month){
    
        switch (month){
            case 1:
            case 3:    
            case 5:    
            case 7:    
            case 8:    
            case 10:    
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            }
            
        return -1;
}
        
        static char grades(char grade){
            
      switch (grade) {
      case 'A':
        System.out.println("Perfect");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Pass");
        break;
      case 'D':
        System.out.println("Fail");
            
      }    
      return 'F';
        }      
        
        
        
        static int drivePermision(int age){
        
        if (age < 16) {
            System.out.println("You cannot drive");
            
        }else if (age >= 16 && age <=17) {
            System.out.println("You can drive but not vote");
            
        }else if (age >= 18 && age <21){
            System.out.println("You can vote but not drink");
        }else{
            System.out.println("You can do anything ");
        }
        return -1; 
        }
    
}
