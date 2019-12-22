package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int[] lastArray = new int[99999];
        //int counterOfLastArray = 0;
        Scanner scanner = new Scanner(System.in);
        String userInputString = scanner.next();
        int numberOfDigits = userInputString.length();
        int min = 0;
        int max = 0;
        for (int i = 1; i <= numberOfDigits; i += 1) {
            min = (min * 10) + i;
            max = (max * 10) + numberOfDigits - i + 1;
        }
        System.out.printf("min is: %d\n", min);
        System.out.printf("max is: %d\n", max);

        //Prologue
        for (int i = min; i <= max; i += 1) {

            int t = i;
            int[] numbers = new int[10000];
            int counter = 0;

            //Pt. 1
            while (t > 0) {
                if (t % 10 > 0 && t % 10 <= numberOfDigits) {
                    t /= 10;
                } else {
                    t = -1;
                    break;
                }
            }

            if (t != -1) {
                numbers[counter] = i;
                counter += 1;
            }

            for (int iz = 0; iz < counter; iz += 1) {
                //if (numbers[iz] > 0) {

                    System.out.println(numbers[iz]);
                    //System.out.println();
                    //lastArray[counterOfLastArray] = numbers[iz];
                    //counterOfLastArray += 1;
                //}
            }

            //System.out.println(1);
//            for (int q = 0; q <= 12; q += 1) {
//                System.out.println(lastArray[q]);
//            }


//            for (int j = 0; j < numberOfDigits; j+=1) {
//                for (int k = j + 1; k < numberOfDigits; k += 1) {
//                    if (numbers[j] == numbers[k]) {
//                        //System.out.println(i);
//                    }
//                    t = i;
//                    //System.out.println(t+" T is unique");
//                }
//            }
//            while (t > 0) {
//                System.out.println(userInputString.charAt(t%10-1));
//                t /= 10;
//            }
            //System.out.println();

        }
        // write your code here
    }


}
