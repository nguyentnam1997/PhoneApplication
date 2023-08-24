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
        purchaseService.phoneApplication(scanner, menu, utils, phoneStore, customerManager, purchaseService, listPhone, listCustomer);
    }
}