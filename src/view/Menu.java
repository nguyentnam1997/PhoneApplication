package view;

public class Menu {
    public void startMenu() {
        System.out.println("========== Start menu ===========");
        System.out.println("1. Phone management.");
        System.out.println("2. Customer management.");
        System.out.println("3. Purchase service.");
        System.out.println("Please choose:");
    }
    public void phoneMenu() {
        System.out.println("-------- Phone ---------");
        System.out.println("1. Create new phone.");
        System.out.println("2. Remove phone.");
        System.out.println("3. Search phone.");
        System.out.println("4. Show phone list.");
        System.out.println("5. Back to main.");
        System.out.println("Please choose:");
    }
    public void customerMenu() {
        System.out.println("-------- Customer ---------");
        System.out.println("1. Create new customer.");
        System.out.println("2. Remove customer.");
        System.out.println("3. Search customer.");
        System.out.println("4. Show customer list.");
        System.out.println("5. Back to main.");
        System.out.println("Please choose:");
    }
}
