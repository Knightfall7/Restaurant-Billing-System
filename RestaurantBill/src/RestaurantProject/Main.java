package RestaurantProject;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice, Quantity = 1;
    public static String again;
    public static double total = 0, Pay;

    public static void menu() {
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("\t     WELCOME\n Gabi & Adrian's Restaurant");
        System.out.println("\tRestaurant Menu : ");
        System.out.println("\t1.Burger       kr 120.00");
        System.out.println("\t2.Kebab Pizza  kr 150.00");
        System.out.println("\t3.Coffee       kr 10.00");
        System.out.println("\t4.Sushi        kr 160.00");
        System.out.println("\t5.Chips        kr 25.00");
        System.out.println("\t6.Cancel       ");
    }

    public static void Order() {
        System.out.println("1 to Burger || 2 to Kebab Pizza || 3 to Coffee || 4 to Sushi || 5 to Chips");
        System.out.println("Press you want to order : ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Choice 1 : \n *Burger*");
            System.out.println("How many Burgers do you want : ");
            Quantity = input.nextInt();
            total = total + (Quantity * 120);
            System.out.println("You want to buy Again : ");
            System.out.println("Press Y for [Yes] and N for [No]");
            again = input.next();

            if (again.equalsIgnoreCase("Y"))
                Order();
            else {
                System.out.println("Enter payment : ");
                Pay = input.nextDouble();
                if (Pay < total)
                    System.out.println("Insufficient balance ");

                else {
                    System.out.println("total=" + total);
                    total = Pay - total;
                    System.out.println("Customer´s return " + total + " Thank you ");

                }

            }
        } else if (choice == 2) {
            System.out.println("Choice 2 : Kebab Pizza");
            System.out.println("How many Kebab Pizza do you want : ");
            Quantity = input.nextInt();
            total = total + (Quantity * 150);
            System.out.println("You want to buy Again : ");
            System.out.println("Press Y for [Yes] and N for [No]");
            again = input.next();

            if (again.equalsIgnoreCase("Y"))
                Order();
            else {
                System.out.println("Enter payment : ");
                Pay = input.nextDouble();
                if (Pay < total)
                    System.out.println("Insufficient balance ");
                else {
                    System.out.println("total=" + total);
                    total = Pay - total;
                    System.out.println("Customer´s return " + total + " Thank you ");

                }

            }
        } else if (choice == 3) {
            System.out.println("Choice 3 : Coffee");
            System.out.println("How many cups of Coffee do you want : ");
            Quantity = input.nextInt();
            total = total + (Quantity * 20);
            System.out.println("You want to buy Again : ");
            System.out.println("Press Y for [Yes] and N for [No]");
            again = input.next();

            if (again.equalsIgnoreCase("Y"))
                Order();
            else {
                System.out.println("Enter payment : ");
                Pay = input.nextDouble();
                if (Pay < total)
                    System.out.println("Insufficient balance ");
                else {
                    System.out.println("total=" + total);
                    total = Pay - total;
                    System.out.println("Customer´s return " + total + " Thank you ");

                }

            }
        } else if (choice == 4) {
            System.out.println("Choice 4 : Sushi");
            System.out.println("How many Sushi rolls do you want : ");
            Quantity = input.nextInt();
            total = total + (Quantity * 160);
            System.out.println("You want to buy Again : ");
            System.out.println("Press Y for [Yes] and N for [No]");
            again = input.next();

            if (again.equalsIgnoreCase("Y"))
                Order();
            else {
                System.out.println("Enter payment : ");
                Pay = input.nextDouble();
                if (Pay < total)
                    System.out.println("Insufficient balance ");
                else {
                    System.out.println("total=" + total);
                    total = Pay - total;
                    System.out.println("Customer´s return " + total + " Thank you ");

                }

            }
        } else if (choice == 5) {
            System.out.println("Choice 5 : Chips");
            System.out.println("How many Chips plates do you want : ");
            Quantity = input.nextInt();
            total = total + (Quantity * 25);
            System.out.println("You want to buy Again : ");
            System.out.println("Press Y for [Yes] and N for [No]");
            again = input.next();

            if (again.equalsIgnoreCase("Y"))
                Order();
            else {
                System.out.println("Enter payment : ");
                Pay = input.nextDouble();
                if (Pay < total)
                    System.out.println("Insufficient balance ");
                else {
                    System.out.println("total=" + total);
                    total = Pay - total;
                    System.out.println("Customer´s return " + total + " Thank you ");

                }

            }
        } else if (choice == 6) {
            System.exit(0);

        } else {
            System.out.println("Choose a Food in items : ");
            Order();

        }
    }
        public static void main (String[]args){
        menu();
        Order();
        menu();
        }
    }
