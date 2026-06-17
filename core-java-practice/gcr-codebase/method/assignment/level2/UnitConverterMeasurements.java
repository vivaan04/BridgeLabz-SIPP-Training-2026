/*
Question 6:
Create a UnitConvertor utility class to convert Fahrenheit to Celsius, Celsius to Fahrenheit, pounds to kilograms, kilograms to pounds, gallons to liters and liters to gallons.
*/
import java.util.Scanner;

public class UnitConverterMeasurements {

    public static double convertFahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }

    public static double convertCelsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }

    public static double convertPoundsToKilograms(double pounds){
        return pounds*0.453592;
    }

    public static double convertKilogramsToPounds(double kg){
        return kg*2.20462;
    }

    public static double convertGallonsToLiters(double gallons){
        return gallons*3.78541;
    }

    public static double convertLitersToGallons(double liters){
        return liters*0.264172;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double f=sc.nextDouble();
        double c=sc.nextDouble();
        double pounds=sc.nextDouble();
        double kg=sc.nextDouble();
        double gallons=sc.nextDouble();
        double liters=sc.nextDouble();

        System.out.println(convertFahrenheitToCelsius(f));
        System.out.println(convertCelsiusToFahrenheit(c));
        System.out.println(convertPoundsToKilograms(pounds));
        System.out.println(convertKilogramsToPounds(kg));
        System.out.println(convertGallonsToLiters(gallons));
        System.out.println(convertLitersToGallons(liters));
    }
}