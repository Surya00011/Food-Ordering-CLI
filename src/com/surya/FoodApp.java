package com.surya;
import java.util.Scanner;

public class FoodApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Welcome to Food_App..!");
            System.out.println("Press Y to See the list of available Items");
            System.out.println("Press N to Exit");

            choice = input.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'y':
                    FoodDatabase foodData = new FoodDatabase();
                    String[] foodList = foodData.getAvailableFoods();
                    System.out.println("Number of items available: " + foodList.length);
                    for(int i=0;i< foodList.length;i++){
                        System.out.println("Press "+(i+1)+" to order "+foodList[i]);
                    }
                    System.out.println("Press 0 to back to main menu");
                    int foodChoice = input.nextInt();
                    switch(foodChoice){
                        case 1:
                            Noodles noodles = new Noodles();
                            String[] typesOfNoodles = noodles.getTypesOfNoodles();
                            for(int i=0;i<typesOfNoodles.length;i++){
                                System.out.println("Press "+(i+1)+" to order "+typesOfNoodles[i]);
                            }
                            System.out.println("Press 0 to back");
                            int noodleChoice = input.nextInt();
                            String myOrder = noodles.orderNoodles(typesOfNoodles[noodleChoice-1]);
                            System.out.println(myOrder);
                            break;
                        case 0:
                            System.out.println("Back...");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;

                case 'n':
                    System.out.println("Exiting the app. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter Y or N.");
            }

            System.out.println();
        } while (choice != 'n');

        input.close();
    }
}
