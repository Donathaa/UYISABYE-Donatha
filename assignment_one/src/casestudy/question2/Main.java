package casestudy.question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Guest ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the guest name: ");
        String name = scanner.nextLine();

        String roomStatus = "AVAILABLE";

        int stayDays = 0;
        String roomType = null;
        int choice;

        do{
            System.out.println("=== LEMIGO Hotel Services ===");
            System.out.println("1. Room Booking");
            System.out.println("2. Guest Checkout");
            System.out.println("3. Billing");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if(choice == 1 || choice == 3){
                System.out.print("Enter your stay days:");
                stayDays = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the type of room(STANDARD, DELUXE, SUITE): ");
                roomType = scanner.nextLine();
            }

            switch (choice){
                case 1:
                    RoomBooking booking = new RoomBooking(id, name, roomType, stayDays, roomStatus);
                    booking.bookRoom();
                    roomStatus = booking.getRoomStatus();
                    break;
                case 2:
                    GuestCheckout checkout = new GuestCheckout(id, name, roomType, stayDays, roomStatus);
                    checkout.checkoutGuest();
                    roomStatus = checkout.getRoomStatus();
                    break;
                case 3:
                    Billing billing = new Billing(id, name, roomType, stayDays, roomStatus);
                    billing.generateBill();
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid output! Try again.");
                    break;
            }

        }while (choice != 4);
    }
}
