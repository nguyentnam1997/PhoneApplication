package service;

import entities.Customer;
import entities.Phone;
import utils.Utils;
import view.Menu;

import java.util.*;

public class CustomerManager implements IService<Customer> {
    public void createCustomer(Scanner scanner, Map<Integer, Customer> listCustomer) {
        System.out.println("Input the customer's name:");
        String name = scanner.nextLine();
        System.out.println("Input the customer's address:");
        String address = scanner.nextLine();
        System.out.println("Input the phone number:");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(name, address, phoneNumber);
        listCustomer.put(customer.getId(), customer);
        System.out.println("Create new customer successful!");
    }

    public void remove(Scanner scanner, Map<Integer, Customer> listCustomer) {
        if (isEmptyList(listCustomer)) createCustomer(scanner, listCustomer);
        else {
            System.out.println("Input the id's customer want to remove:");
            int idRemove = Integer.parseInt(scanner.nextLine());
            if (listCustomer.containsKey(idRemove)) {
                listCustomer.remove(idRemove);
                System.out.println("Customer with id " + idRemove + " has been removed");
            }
            else {
                System.out.println("Customer with id " + idRemove + " doesn't exist");
            }
        }
    }
    public void search(Scanner scanner, Map<Integer, Customer> listCustomer) {
        if (isEmptyList(listCustomer)) createCustomer(scanner, listCustomer);
        else {
            System.out.println("1. Search customer by name");
            System.out.println("2. Search customer by phone number");
            System.out.println("3. Back to phone menu.");
            System.out.println("Please choose:");
            int choose = Integer.parseInt(scanner.nextLine());
            int count = 0;
            switch (choose) {
                case 1 -> {
                    System.out.println("Input the customer's name want to search:");
                    String nameSearch = scanner.nextLine();
                    for (Map.Entry<Integer, Customer> entry : listCustomer.entrySet()) {
                        if (entry.getValue().getName().equalsIgnoreCase(nameSearch)) {
                            System.out.println(entry.getValue());
                            count++;
                        }
                    }
                    if (count == 0) System.out.println("Customer with name " + nameSearch + " doesn't exist");
                }
                case 2 -> {
                    System.out.println("Input the customer's phone number want to search:");
                    String phoneNumberSearch = scanner.nextLine();
                    for (Map.Entry<Integer, Customer> entry : listCustomer.entrySet()) {
                        if (entry.getValue().getName().equalsIgnoreCase(phoneNumberSearch)) {
                            System.out.println(entry.getValue());
                            count++;
                        }
                    }
                    if (count == 0)
                        System.out.println("Customer with phone number " + phoneNumberSearch + " doesn't exist");
                }
            }
        }
    }
    public void showList(Map<Integer, Customer> listCustomer) {
        for (Map.Entry<Integer, Customer> entry : listCustomer.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public boolean isEmptyList(Map<Integer, Customer> listCustomer) {
        if (listCustomer.isEmpty()) {
            System.out.println("List customer is empty, please create first!");
            return true;
        }
        else return false;
    }
    public void optionsOfCustomer(Scanner scanner, Menu menu, Utils utils, Map<Integer, Customer> listCustomer) {
        do {
            menu.customerMenu();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    createCustomer(scanner, listCustomer);
                    continue;
                case 2:
                    remove(scanner, listCustomer);
                    continue;
                case 3:
                    search(scanner, listCustomer);
                    continue;
                case 4:
                    showList(listCustomer);
                    continue;
                case 5:
                    break;
            }
            break;
        }
        while (true);

    }
}
