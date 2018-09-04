// Create a program that allows users to select from one of four options of shapes that they would like to get the area for.
// Accept the input from the user, and provide the results.
//
//Hints:
//Create 4 separate methods, and call the method based on the menu choice. (Suggested approach, menu - switch case calling the method)
//To find the area of plane shapes look at the tutorial here:
//
//
//

import java.util.*;

public class area_calc {
    public static void main(String[] args) {
        int user_option = 0;
        char quit = 'q';
        int user_length = 0;
        int user_width = 0;

        Scanner sc = new Scanner(System.in);

        while(quit != 'q') {

        System.out.println("SELECT FROM THE OPTIONS BELOW TO CALCULATE THE AREA OF SAID OBJECT:");
        System.out.println("___________________________________________________________________");
        System.out.println("    Select 1 to calculate the area of a Triangle\n");
        System.out.println("    Select 2 to calculate thea area of a Rectangle\n");
        System.out.println("    Select 3 to calculate the area of a Parallelogram\n");
        System.out.println("    Select 4 to calculate the ara of a square\n");
        System.out.println(" ---------------- TO QUIT, Press the Q button ---------------------");

        if (sc.hasNextInt());
            user_option = sc.nextInt();
            user_length =
            user_width = getInput("Enter a length: ");

            switch(user_option){
                case 1:


                break;


                case 2:


                    break;

                case 3:


                    break;


                case 4:


                    break;
            }

public class triangle() {

}

public class rectangle {


}

public class pgram {


}
}
