package projects.learning;

import java.util.Scanner;

public class SumOfNumbers {
    public static void getSumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        do{
            System.out.println("Enter number #" + count + ":");
            String input = scanner.nextLine();
            if(input.matches("-?\\d+")) {
                sum += Integer.parseInt(input);
                count++;
            }else if(input.matches("-?([0-9]*)\\.([0-9]*)")){
                sum += Double.parseDouble(input);
                count++;
            }else{
                System.out.println("Invalid number. Please enter a valid number:");
            }
        }while(count < 6);
        System.out.println(sum);
    }
}
