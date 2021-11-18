/* Java Inheritance Assignment
Create base class and child class
 */

import java.util.Scanner;
// Base class
public class Home {
    int no_OfRooms;
    public void no_Of_Light(int no_OfRooms) {
        int no_Oflight = no_OfRooms * 3;
        System.out.println("Total number of lights in home : " + no_Oflight);
    }
}

// child class
   class Room extends Home{
        public static void main(String[] args) {
            int get_No_Rooms;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rooms in your house :");
            get_No_Rooms= sc.nextInt();
            Room room = new Room();
            room.no_Of_Light(get_No_Rooms);
        }

    }

