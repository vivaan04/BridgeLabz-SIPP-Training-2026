/*
Question 8:
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it.
*/
import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static int findYoungest(int[] age){
        int min=0;
        for(int i=1;i<3;i++){
            if(age[i]<age[min]) min=i;
        }
        return min;
    }

    public static int findTallest(double[] height){
        int max=0;
        for(int i=1;i<3;i++){
            if(height[i]>height[max]) max=i;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] names={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextDouble();
        }

        System.out.println("Youngest: "+names[findYoungest(age)]);
        System.out.println("Tallest: "+names[findTallest(height)]);
    }
}