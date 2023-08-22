package service;

import entities.Phone;

import java.util.Map;
import java.util.Scanner;

public class PhoneStore implements IService<Phone> {
    public void inputPhone(Scanner scanner, Map<Integer, Phone> phoneMap) {
        System.out.println("Input the phone's name:");
        String name = scanner.nextLine();
        System.out.println("Input the manufacturer of the phone:");
        String manufacturer = scanner.nextLine();
        System.out.println("Input describe:");
        String describe = scanner.nextLine();
        System.out.println("Input price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        Phone phone = new Phone(name, manufacturer, describe, price, quantity);
        phoneMap.put(phone.getId(), phone);
    }
    public void remove(Scanner scanner, Map<Integer, Phone> phoneMap) {
        System.out.println("Input the id's phone want to remove:");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<Integer, Phone> entry: phoneMap.entrySet()) {
            if (entry.getKey() == idRemove) {
                System.out.println("Phone with id " + idRemove + " has been removed");
                phoneMap.remove(idRemove);
                break;
            }
        }
    }
    public void search(Scanner scanner, Map<Integer, Phone> phoneMap) {
        System.out.println("1. Search by name");
        System.out.println("2. Search by brand");
        System.out.println("Please choose:");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Input the name of phone want to search:");
                String nameSearch = scanner.nextLine();
                for (Map.Entry<Integer, Phone> entry: phoneMap.entrySet()) {
                    if (entry.getValue().getName().equalsIgnoreCase(nameSearch)) {
                        System.out.println(entry.getValue());
                    }
                }
            case 2:
                System.out.println("Input the brand of phone want to search:");
                String brandSearch = scanner.nextLine();
                for (Map.Entry<Integer, Phone> entry: phoneMap.entrySet()) {
                    if (entry.getValue().getName().equalsIgnoreCase(brandSearch)) {
                        System.out.println(entry.getValue());
                    }
                }
        }
    }
}
