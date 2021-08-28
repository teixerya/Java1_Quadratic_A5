
/*Name: Ryan Teixeira
Assignment:  Assignment 4
Program: Information systems engineering

Keep track of defective items per day, summarize the data,
display the average number of rejected items per day and
display the standard deviation.

Standard deviation: the amount of variation and dispersion of a set of values.
  */

import java.util.Scanner;

public class DefectCounter {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[] myDefectNumbers = new int[6];
        int day = 1;

        //using a do - while loop
        //start while loop iteration at index 0, adds 1 until index 6
        while (day <= myDefectNumbers.length) {
            char another = 'y';
            //prints out the day, but then adds 1 until day number 6

            System.out.println("Day " + day);

            int defectItems = 0;

                while (another == 'y') {

                    //Prompt user for rejected items
                    System.out.print("Enter the total number"
                            + "of rejected times: ");
                    defectItems = in.nextInt();
                    myDefectNumbers[day - 1] = myDefectNumbers[day - 1] +
                            defectItems;


                    System.out.print("Another? (Y/N) ");
                    another = in.next().toLowerCase().charAt(0);

                    //repeat until user enters anything but 'y'


                }//Second While loop closing bracket

            System.out.println("Day " + day + " Total: "
                    + myDefectNumbers[day - 1] + "\n");
            day++;

        }//First while loop closing bracket
        //____________________________________________
        int max = myDefectNumbers[0];
        int highReject = 1;

        //locker number i value is greater than max.
        for (int i = 1; i < myDefectNumbers.length; i++){
            if (myDefectNumbers[i] > max) {
                max = myDefectNumbers[i];
                highReject = i + 1; //day value
            }
        }
        System.out.println("Day with highest # rejects: " + highReject);
        //____________________________________________
        //Average code calculation
        double total = 0;


        for (int j : myDefectNumbers) {
             total = total + j;
        }

        double average = total / myDefectNumbers.length ;
        System.out.printf("Average defects per day: %.1f\n",average);
        //____________________________________________
        //Standard deviation
        double standardDev = 0;
        for(int i:myDefectNumbers) {
        standardDev += Math.pow((i - average), 2);
        }//for loop close

        standardDev /= myDefectNumbers.length;

        standardDev = Math.sqrt(standardDev);

        System.out.printf("Deviation: %.2f\n", standardDev);

    }
}

