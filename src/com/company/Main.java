package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] lastArray = new int[99999];
        int counterOfLastArray = 0;
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

            //Pt. I
            //searching for numbers within the range and removing unwanted number
            //by reducing it to zero
            while (t > 0) {
                //Wanted if
                if (t % 10 > 0 && t % 10 <= numberOfDigits) {
                    t /= 10;
                } else {
                    t = -1;
                    break;
                }
            }

            //Pt. II
            //Adding them to numbers[] with custom counter.
            if (t != -1) {
                numbers[counter] = i;
                counter += 1;
            }


            //Pt. III
            //picking elements from array.
            for (int iv = 0; iv < counter; iv += 1) {
                String sCopy = String.valueOf(numbers[iv]);


                //Pt. IV
                //checking numbers and deleting redundant like 111 x and 123 ok.
                for (int j = 0; j < sCopy.length(); j += 1) {
                    for (int k = j + 1; k < sCopy.length(); k += 1) {
                        if (sCopy.charAt(j) == sCopy.charAt(k)) {
                            numbers[iv] = 0;
                            break;
                        }
                    }
                }

                //Pt. V
                //adding the unique elements from numbers[] to lastArray[]
                if (numbers[iv] > 0) {
                    //System.out.println(numbers[iv] + "  is unique");
                    lastArray[counterOfLastArray] = numbers[iv];
                    counterOfLastArray += 1;
                }
            }
        }

        //Pt. VI
        //printing the elements of userInputString based on numbers.
        for (int q = 0; q < counterOfLastArray; q += 1) {
            int t = lastArray[q];
            while (t > 0) {
                System.out.print(userInputString.charAt(t%10-1));
                t /= 10;
            }
            System.out.println();
        }
    }


}
