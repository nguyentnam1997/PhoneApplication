import entities.Customer;
import entities.Phone;
import service.CustomerManager;
import service.PhoneStore;
import service.PurchaseService;
import utils.Utils;
import view.Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Phone> listPhone = new HashMap<>();
        Map<Integer, Customer> listCustomer = new HashMap<>();
        Menu menu = new Menu();
        Utils utils = new Utils();
        CustomerManager customerManager = new CustomerManager();
        PhoneStore phoneStore = new PhoneStore();
        PurchaseService purchaseService = new PurchaseService();
        do {
            menu.startMenu();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    phoneStore.optionsOfPhone(scanner, menu, utils, listPhone);
                    continue;
                }
                case 2 -> {
                    customerManager.optionsOfCustomer(scanner, menu, utils, listCustomer);
                    continue;
                }
                case 3 -> {
                    purchaseService.purchasePhone(scanner, listPhone, listCustomer);
                    continue;
                }
            }
            break;
        }
        while (utils.continueOrBreak(scanner));
    }
}