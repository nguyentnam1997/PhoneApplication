package service;

import entities.Customer;
import entities.Phone;

import java.util.*;

public class CustomerManager implements IService<Customer> {
    public void inputCustomer(Scanner scanner, Map<Integer, Customer> customerMap) {
        System.out.println("Input the customer's name:");
        String name = scanner.nextLine();
        System.out.println("Input the customer's address:");
        String address = scanner.nextLine();
        System.out.println("Input the phone number:");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(name, address, phoneNumber);
        customerMap.put(customer.getId(), customer);
    }

    public void remove(Scanner scanner, Map<Integer, Customer> customerMap) {
        System.out.println("Input the id's customer want to remove:");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<Integer, Customer> entry: customerMap.entrySet()) {
            if (entry.getKey() == idRemove) {
                System.out.println("Customer with id " + idRemove + " has been removed");
                customerMap.remove(idRemove);
                break;
            }
        }
    }
    public void search(Scanner scanner, Map<Integer, Customer> customerMap) {
        System.out.println("1. Search by name");
        System.out.println("2. Search by phone number");
        System.out.println("Please choose:");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Input the customer's name want to search:");
                String nameSearch = scanner.nextLine();
                for (Map.Entry<Integer, Customer> entry: customerMap.entrySet()) {
                    if (entry.getValue().getName().equalsIgnoreCase(nameSearch)) {
                        System.out.println(entry.getValue());
                    }
                }
            case 2:
                System.out.println("Input the customer's phone number want to search:");
                String phoneNumberSearch = scanner.nextLine();
                for (Map.Entry<Integer, Customer> entry: customerMap.entrySet()) {
                    if (entry.getValue().getName().equalsIgnoreCase(phoneNumberSearch)) {
                        System.out.println(entry.getValue());
                    }
                }
        }
    }

}
