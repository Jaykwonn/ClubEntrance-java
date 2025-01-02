import java.util.Scanner;

/**
 * Title: ClubEntrance
 * Semester: COP3337 Fall 2024
 * Jaykwonn James
 *
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * DESCRIPTION
 * My program is designed is like a doorman at a club with a limit of 100 people.
 * It keeps asking how many people want to enter or leave the club. It adds or subtracts people based on what you say.
 * If too many people try to enter at once, the program will stop them from getting in.
 * When the club is full at 100 people, the program stops.
 * CONCEPTS
 * Data types, loops, inputs, conditional statments
 */
public class ClubEntrance {
    public static void main(String[] args) {
        // Initialize the current capacity of the club to 0
        int capacity = 0;
        // Variable to hold the size of the group trying to enter or leave
        int groupSize;
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Loop continues until the club's capacity reaches 100
        while (capacity < 100)
        {
            System.out.print("Enter how many people want to enter or leave the club:");
            groupSize = sc.nextInt();
            capacity += groupSize;
            // Check if the new capacity exceeds 100. If it does, subtract the group size to revert the capacity and le group know they cannot enter
            if (capacity > 100){
                capacity -= groupSize;
                System.out.println("The group is too large to enter the club.");
            }
            // Display the current number of people in the club
            System.out.println("Currently there are " + capacity + " people in the club.");
            // Check if the club is now exactly at full capacity if so end program
            if (capacity == 100){
              System.out.println("The club is at capacity. Program will end.");
            }
        }


    }
}