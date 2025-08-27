/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class IfStatementLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PROBLEM NO.1");
        System.out.println("Age Category Checker");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input1.nextInt();

        if (age < 13) {
        System.out.println("You are a child");
        } else if (age >= 13 && age <= 19) {
        System.out.println("You are a teenager");
        } else {
        System.out.println("You are an adult");
        }

        
        
        System.out.println();
        System.out.println("PROBLEM NO.2");
        System.out.println("Temperature Evaluation");
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter today's temperature in celsius");
        double Celsius = input2.nextInt();

        if (Celsius < 0) {
        System.out.println("Freezing point");
        } else if (Celsius >= 0 && Celsius <= 25) {
        System.out.println("Normal weather");
        } else {
        System.out.println("Hot weather");
        }
        
         
        
        System.out.println();
        System.out.println("PROBLEM NO.3");
        System.out.println("Simple Grade Evaluator");
        
        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter your test score");
        int score = input3.nextInt();
        
        if (score>=90) {
        System.out.println("Exellent");
        }
        else if (score>=75 && score <=89){
        System.out.println("Good");
        }
        else { System.out.println("Needs Improvements");
        }
        
        
        
        System.out.println();
        System.out.println("PROBLEM NO.4");
        System.out.println("Circle Calculator");
        
        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double radius = input4.nextInt();
        
        double A = Math.PI * Math.pow (radius,2);
        System.out.println("The area is " + A);
        
        double C = (2 * Math.PI * radius);
        System.out.println("The circumference is " + C);

        if (radius <= 0) {
        System.out.println("Invalid radius");
        }
        
        
        
        System.out.println();
        System.out.println("PROBLEM NO.5");
        System.out.println("Even or odd number");
        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input5.nextInt();
        if (number % 2 == 0) {
        System.out.println(number + " is even");
        } else {
        System.out.println(number + " is odd");
        }

    }
}
