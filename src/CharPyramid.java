import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class CharPyramid {
    public static void main(String[] args) {
        System.out.println("Task one"); // printing the task
        System.out.println("Enter a height"); // prompting the user
        Scanner userH = new Scanner(System.in); // creating a scanner
        int height = userH.nextInt(); // reading in the users height
        System.out.println("Enter a width"); // prompting the user
        Scanner userW = new Scanner(System.in); // creating a scanner
        int width = userH.nextInt(); // reading in the users width
        for (int row = 0; row < height; row++){ // creating a for loop for the rows of the shape
            for (int col = 0; col < width; col++){ // creating a for loop for the colums of the shape
                if (row%2 == 0 && col%2 == 0){ // creating an if statement for characters that have two even values
                    System.out.print("*"); // printing a star
                }else if (row%2 == 1 && col%2 == 1){ // creating an else if statement for characters that have two odd values
                    System.out.print("*"); // printing a star
                }else{ // creating else statement for the values not in the checkerboard
                    System.out.print("#"); // printing a hashtag
                }
            }System.out.println(); // entering
        }

        System.out.println("Task two"); // printing the task
        System.out.println("Please enter the width of the picture"); // prompting a user
        Scanner user1 = new Scanner (System.in); // creating a scanner
        int wide = user1.nextInt(); // reading in the users input
        System.out.println("Please enter a character"); // prompting the user
        Scanner chara = new Scanner(System.in); // creating a scanner
        String character = chara.nextLine(); // reading in the users input
        for (int row = 0; row < wide; row++){ // creating a for statement for the height
            for (int col = 0; col < wide - row - 1; col ++){ // creating a for statement for the width
                System.out.print(" "); // printing out a space between each character
            }
            for (int col = 0; col <= row * 2; col+=2){ // creating a for statement for where to print the characters
                System.out.print(character + " "); // printing out the character and a space
            }System.out.println(); // returning
        }
    }
}
