//Alex Situ
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int dayCounter = 1; //variable keeps track of how many days have been printed so far
        int count; //variable keeps track of what day it is
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are in the month?");
        while(!input.hasNextInt()){
            input.next(); //skip whatever the user input if the input isn't an integer
            System.out.println("Please input a valid integer");
        }
        int numDays = input.nextInt();
        while (numDays > 31 || numDays < 28){//months have at least 28 days and no more than 31 days
            System.out.println("Please input a valid amount of days");
            numDays = input.nextInt();
        }
        input.nextLine(); //remove the space from enter input
        System.out.println("What day does the month start with?\n(Su Mo T W Th F Sa)");
        String startDay = input.nextLine();
        switch (startDay.toLowerCase()) {
            case "su":
            case "sunday":
                count = 1;
                break;
            case "mo":
            case "monday":
                count = 2;
                break;
            case "t":
            case "tuesday":
                count = 3;
                break;
            case "w":
            case "wednesday":
                count = 4;
                break;
            case "th":
            case "thursday":
                count = 5;
                break;
            case "f":
            case "friday":
                count = 6;
                break;
            case "sa":
            case "saturday":
                count = 7;
                break;
            default:
                System.out.println("Error, please input a valid response.");
                return;
        }
        System.out.println("Su  Mo  T   W   Th  F   Sa");
        for (int i = 1; i < count; i++) { //this loop creates the spaces needed to start writing the numbers under the correct day
            System.out.print(" ");//the four spaces represent skipping one day
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
        }
        while (dayCounter <= numDays) {//keeps printing numbers until the amount of days typed reaches the amount listed by user
            if (dayCounter <= 9) {//checks to see if day is single or not to create proper spacing
                System.out.print(dayCounter);
                System.out.print(" ");//three spaces needed for single digit numbers to "line up" next number
                System.out.print(" ");
                System.out.print(" ");
                count++;
            }
            else{
                System.out.print(dayCounter);//two spaces for double-digit numbers
                System.out.print(" ");
                System.out.print(" ");
                count++;
            }
            if (count > 7 ){
                System.out.println();
                count = 1; //reset to start counting at the start of the next week
            }

            dayCounter++;
        }
    }
}