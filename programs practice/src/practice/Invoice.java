package practice;

import java.util.Scanner;

public class Invoice {
    private String invoiceId;
    private double invoicePrice;
    private String vendorName;
    private String invoiceName;
    private String location;

    public Invoice() {
        invoiceId = "inv1";
        invoicePrice = 2300.50;
        vendorName = "vendor1";
        invoiceName = "abc ltd.";
        location = "Pune";
    }

    public void addInvoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Invoice ID: ");
        invoiceId = scanner.nextLine();

        System.out.print("Enter Invoice Price: ");
        invoicePrice = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character left in the buffer

        System.out.print("Enter Vendor Name: ");
        vendorName = scanner.nextLine();

        System.out.print("Enter Invoice Name: ");
        invoiceName = scanner.nextLine();

        System.out.print("Enter Location: ");
        location = scanner.nextLine();
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Invoice Price: " + invoicePrice);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Invoice Name: " + invoiceName);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            invoices[i] = new Invoice();
            invoices[i].addInvoice();
        }

        System.out.println("\nInvoices:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1) + ":");
            invoices[i].displayInvoice();
        }
    }
}