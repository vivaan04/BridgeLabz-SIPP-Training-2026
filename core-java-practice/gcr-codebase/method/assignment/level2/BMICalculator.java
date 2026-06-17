/*
Question 10:
Create a program to find the BMI and display the height, weight, BMI and status of each individual.
*/
import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight,double heightCm){
        double heightM=heightCm/100;
        return weight/(heightM*heightM);
    }

    public static String getStatus(double bmi){
        if(bmi<18.5) return "Underweight";
        if(bmi<25) return "Normal";
        if(bmi<30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] person=new double[10][3];

        for(int i=0;i<10;i++){
            person[i][0]=sc.nextDouble();
            person[i][1]=sc.nextDouble();
            person[i][2]=calculateBMI(person[i][0],person[i][1]);
        }

        for(int i=0;i<10;i++){
            System.out.println(person[i][0]+" "+person[i][1]+" "+person[i][2]+" "+getStatus(person[i][2]));
        }
    }
}