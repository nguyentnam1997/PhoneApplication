package entities;
import java.util.List;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private static int autoId;
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private List<Phone> listPhone;
    private double totalMoney;

    public Customer(String name, String address, int phoneNumber) {
        this.id = ++autoId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.listPhone = new ArrayList<>();
        this.totalMoney = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Phone> getListPhone() {
        return listPhone;
    }

    public void setListPhone(List<Phone> listPhone) {
        this.listPhone = listPhone;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
