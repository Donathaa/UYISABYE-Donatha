package casestudy.question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driver ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter the driver name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter the driver ID: ");
        String vehiclePlate = scanner.nextLine().trim();
        System.out.print("Enter the violation type (SPEEDING/ RED_LIGHT/ NO_HELMET/ DUI): ");
        String violationType = scanner.nextLine().trim();
        double fineAmount = 0;
        String paymentStatus = "UNPAID";
        int choice;

        do {
            System.out.println("==== TRAFFIC FINE MANAGEMENT SYSTEM ====");
            System.out.println("1. Violation Entry.");
            System.out.println("2. Fine Assessment.");
            System.out.println("3. Fine Payment.");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ViolationEntry violationEntry = new ViolationEntry(id, name, vehiclePlate, violationType, fineAmount, paymentStatus);
                    violationEntry.recordViolation();
                    paymentStatus = violationEntry.getPaymentStatus();
                    break;
                case 2:
                    FineAssessment assessment = new FineAssessment(id, name, vehiclePlate, violationType, fineAmount, paymentStatus);
                    assessment.assessFine();
                    break;
                case 3:
                    FinePayment payment = new FinePayment(id, name, vehiclePlate, violationType, fineAmount, paymentStatus);
                    payment.processPayment();
                    paymentStatus = payment.getPaymentStatus();
                    break;
                case 4:
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Error: Invalid Choice! Please Try again.");
                    break;
            }

        } while (choice != 4);
    }
}