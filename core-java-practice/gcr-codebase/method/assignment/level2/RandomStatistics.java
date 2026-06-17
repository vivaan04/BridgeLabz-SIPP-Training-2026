/*
Question 12:
Write a program that generates five 4 digit random values and then finds their average value, minimum and maximum value.
*/
public class RandomStatistics {

    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }

        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0];
        int max=numbers[0];
        int sum=0;

        for(int n:numbers){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }

        return new double[]{(double)sum/numbers.length,min,max};
    }

    public static void main(String[] args){
        int[] numbers=generate4DigitRandomArray(5);

        for(int n:numbers){
            System.out.print(n+" ");
        }

        System.out.println();

        double[] result=findAverageMinMax(numbers);

        System.out.println("Average: "+result[0]);
        System.out.println("Minimum: "+(int)result[1]);
        System.out.println("Maximum: "+(int)result[2]);
    }
}