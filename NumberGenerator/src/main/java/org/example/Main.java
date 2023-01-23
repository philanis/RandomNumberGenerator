package org.example;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int minimum = 1;
        int maximum = 49;
        int slots = 6;
        int[] randomArray = new int[slots];
        boolean isRepeated ;
        int randomNumber = 0;

        for(int i = 0; i < slots; i++){
            do{
                isRepeated = false;
                randomNumber = random.nextInt(maximum + 1 - minimum) + minimum;
                for( int j = 0; j <= i; j++){
                    if(randomArray[j] == randomNumber){
                        isRepeated = true;
                        break;
                    }
                }
            }while (isRepeated);
            randomArray[i] = randomNumber;
        }
        Arrays.sort(randomArray);
        System.out.println("The result of the draw:");
        for( int k = 0; k < slots; k++){
            System.out.print(randomArray[k] + " ");
        }
    }
}