package service;

import entities.Phone;
import utils.Utils;
import view.Menu;

import java.util.Map;
import java.util.Scanner;

public class PhoneStore implements IService<Phone> {
    public void createPhone(Scanner scanner, Map<Integer, Phone> listPhone) {
        System.out.println("Input the phone's name:");
        String name = scanner.nextLine();
        System.out.println("Input the brand of the phone:");
        String brand = scanner.nextLine();
        System.out.println("Input describe:");
        String describe = scanner.nextLine();
        System.out.println("Input price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        Phone phone = new Phone(name, brand, describe, price, quantity);
        listPhone.put(phone.getId(), phone);
        System.out.println("Create new phone successful!");
    }
    public void remove(Scanner scanner, Map<Integer, Phone> listPhone) {
        if (isEmptyList(listPhone)) createPhone(scanner, listPhone);
        else {
            System.out.println("Input the id's phone want to remove:");
            int idRemove = Integer.parseInt(scanner.nextLine());
            if (listPhone.containsKey(idRemove)) {
                listPhone.remove(idRemove);
                System.out.println("Phone with id " + idRemove + " has been removed");
            }
            else {
                System.out.println("Phone with id " + idRemove + " doesn't exist");
            }
        }
    }
    public void search(Scanner scanner, Map<Integer, Phone> listPhone) {
        if (isEmptyList(listPhone)) createPhone(scanner, listPhone);
        else {
            do {
                System.out.println("1. Search phone by name.");
                System.out.println("2. Search phone by brand.");
                System.out.println("3. Back to phone menu.");
                System.out.println("Please choose:");
                int choose = Integer.parseInt(scanner.nextLine());
                int count = 0;
                switch (choose) {
                    case 1 -> {
                        System.out.println("Input the name of phone want to search:");
                        String nameSearch = scanner.nextLine();
                        for (Map.Entry<Integer, Phone> entry: listPhone.entrySet()) {
                            if (entry.getValue().getName().equalsIgnoreCase(nameSearch)) {
                                System.out.println(entry.getValue());
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("Phone with name " + nameSearch + " doesn't exist");
                            continue;
                        }
                    }
                    case 2 -> {
                        System.out.println("Input the brand of phone want to search:");
                        String brandSearch = scanner.nextLine();
                        for (Map.Entry<Integer, Phone> entry: listPhone.entrySet()) {
                            if (entry.getValue().getBrand().equalsIgnoreCase(brandSearch)) {
                                System.out.println(entry.getValue());
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("Phone with brand " + brandSearch + " doesn't exist!");
                            continue;
                        }
                    }
                    case 3 -> {
                    }
                }
                break;
            }
            while (true);

        }
    }
    public void showList(Map<Integer, Phone> listPhone) {
        for (Map.Entry<Integer, Phone> entry : listPhone.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public boolean isEmptyList(Map<Integer, Phone> listPhone) {
        if (listPhone.isEmpty()) {
            System.out.println("List phone is empty, please create first!");
            return true;
        }
        else return false;
    }
    public void optionsOfPhone(Scanner scanner, Menu menu, Utils utils, Map<Integer, Phone> listPhone) {
        do {
            menu.phoneMenu();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    createPhone(scanner, listPhone);
                    continue;
                case 2:
                    remove(scanner, listPhone);
                    continue;
                case 3:
                    search(scanner, listPhone);
                    continue;
                case 4:
                    showList(listPhone);
                case 5:
                    break;
            }
            break;
        }
        while (true);

    }
}
