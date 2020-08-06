/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradecalcuator.java;

import java.util.Scanner;

/**
 *
 * @author adis3
 */
public class GradeCalcuatorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the subject: ");
        String subject=scan.nextLine();
        System.out.println("Enter your marks: ");
        int marks=scan.nextInt();
        
        if(marks<40){
            System.out.println("The Grade obtained in" + subject + "is F(Fail)");
        }
        else if(marks>=40 && marks<=44){
            System.out.println("The Grade obtained in" + subject + "is P(Pass)");
        }
        else if(marks>44 && marks<50){
            System.out.println("The Grade obtained in" + subject + "is C(Average)");
        }
        else if(marks>=50 && marks<55){
            System.out.println("The Grade obtained in" + subject + "is B(Above Average)");
        }
        else if(marks>=55 && marks<=60){
            System.out.println("The Grade obtained in" + subject + "is B+(Good)");
        }
        else if(marks>60 && marks<=74){
            System.out.println("The Grade obtained in" + subject + "is A(Very Good)");
        }
        else if(marks>74 && marks<=90){
            System.out.println("The Grade obtained in" + subject + "is A+(Excellent)");
        }
        else if(marks>90 && marks<=100){
            System.out.println("The Grade obtained in" + subject + "is O(Outstanding)");
        }
        
        // TODO code application logic here
    }
    
}
