package com.keyin.application;

import com.keyin.queue.*;
import com.keyin.history.*;

import java.util.Scanner;

public class Menu
{
    private static PatientQueue queue = new PatientQueue();
    private static PatientHistory history = new PatientHistory();


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        queue.loadSamplePatients();
        history.loadSampleRecords();

        while (true)
        {
            System.out.println("\n===== HOSPITAL SYSTEM MENU =====");
            System.out.println("1. Add Patient to Queue");
            System.out.println("2. Serve Patient");
            System.out.println("3. Emergency Insert Patient");
            System.out.println("4. Print Queue");
            System.out.println("5. View Oldest Record");
            System.out.println("6. View Newest Record");
            System.out.println("7. Next Patient Record");
            System.out.println("8. Previous Patient Record");
            System.out.println("9. Display Current Record");
            System.out.println("0. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Reason: ");
                    String reason = scanner.nextLine();

                    queue.addPatient(new Patient(id, name, reason));
                    break;

                case 2:
                    System.out.println("Served: " + queue.servePatient());
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient ID: ");
                    long emergId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String emergName = scanner.nextLine();

                    System.out.print("Enter Reason: ");
                    String emergReason = scanner.nextLine();

                    queue.insertEmergencyPatient(pos, new Patient(emergId, emergName, emergReason));
                    break;

                case 4:
                    queue.printQueue();
                    break;

                case 5:
                    history.showOldest();
                    break;

                case 6:
                    history.showNewest();
                    break;

                case 7:
                    history.nextRecord();
                    break;

                case 8:
                    history.previousRecord();
                    break;

                case 9:
                    history.displayCurrent();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
