package service;

import entities.Customer;
import entities.Phone;

import java.util.Map;
import java.util.Scanner;

public class PurchaseService {
    public void purchasePhone(Scanner scanner, Map<Integer, Phone> phoneMap, Map<Integer, Customer> customerMap) {
        do {
            System.out.println("Input the customer's ID:");
            int customerId = Integer.parseInt(scanner.nextLine());
            if (customerMap.containsKey(customerId)) {
                Customer customer = customerMap.get(customerId);
                do {
                    System.out.println("Input the phone's ID want to buy:");
                    int phoneId = Integer.parseInt(scanner.nextLine());
                    if (phoneMap.containsKey(phoneId)) {
                        Phone phone = phoneMap.get(phoneId);
                        do {
                            System.out.println("Input the number of phones want to buy:");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            if (quantity > phone.getQuantity()) {
                                System.out.println("Exceeding the current quantity, please try again!");
                                continue;
                            }
                            else {
                                //thêm điện thoại vào List điện thoại của customer
                                customer.getListPhone().add(phone);
                                phone.setQuantity(quantity);
                                //tạo biến lưu trữ tiền hiện tại
                                double currentMoney = customer.getTotalMoney();
                                customer.setTotalMoney(currentMoney + phone.getPrice());
                            }
                            break;
                        }
                        while (true);
                    }
                    else {
                        System.out.println("Phone with id " + phoneId + " does not exist, try again!");
                        continue;
                    }
                    break;
                }
                while (true);
            }
            else {
                System.out.println("Customer with id " + customerId + " does not exist, try again!");
                continue;
            }
            break;
        }
        while (true);

    }
    public void giveBackPhone(Scanner scanner, Map<Integer, Phone> phoneMap, Map<Integer, Customer> customerMap) {
        do {
            System.out.println("Input the customer's ID:");
            int customerId = Integer.parseInt(scanner.nextLine());
            if (customerMap.containsKey(customerId)) {
                Customer customer = customerMap.get(customerId);
                do {
                    System.out.println("Input the phone's ID want to give back:");
                    int phoneId = Integer.parseInt(scanner.nextLine());
                    if (phoneMap.containsKey(phoneId)) {
                        Phone phone = phoneMap.get(phoneId);
                        do {
                            System.out.println("Input the number of phones want to give back:");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            if (quantity > phone.getQuantity()) {
                                System.out.println("Exceeding the current quantity, please try again!");
                                continue;
                            }
                            else {
                                //Xoá điện thoại trongư List điện thoại của customer
                                customer.getListPhone().remove(phone);
                                //tạo biến lưu trữ tiền hiện tại
                                double currentMoney = customer.getTotalMoney();
                                customer.setTotalMoney(currentMoney - phone.getPrice() * phone.getQuantity());
                            }
                            break;
                        }
                        while (true);
                    }
                    else {
                        System.out.println("Phone with id " + phoneId + " does not exist in cart, try again!");
                        continue;
                    }
                    break;
                }
                while (true);
            }
            else {
                System.out.println("Customer with id " + customerId + " does not exist, try again!");
                continue;
            }
            break;
        }
        while (true);
    }
}
