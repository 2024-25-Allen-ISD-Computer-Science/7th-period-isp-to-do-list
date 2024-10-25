import java.util.Scanner;
import java.util.ArrayList;

public class Test {

public static void main(String[] args) {

    int menuItem = -1;

    while(menuItem !=0) {
        menuItem = menu();

        switch(menuItem) {

        case 1: 
            showList();
            break;

        case 2: 
            addItem();
            break;

        case 3: 
            removeItem();
            break;

        case 0: 
            break;

        default: 
            System.out.println("Enter a valid option");
        }

    }
}

public static int menu() {

int choice; 

Scanner keyboard = new Scanner(System.in);
System.out.println("Main Menu");
System.out.println();
System.out.println("0. Exit the program");
System.out.println("1. Display to-do list");
System.out.println("2. Add item to list");
System.out.println("3. Remove item from list");
System.out.println();
System.out.print("Enter choice: ");
choice = keyboard.nextInt();

return choice;
}
