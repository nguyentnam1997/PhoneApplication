package service;

import entities.Phone;

import java.util.Map;
import java.util.Scanner;

public interface IService<T> {
    void remove(Scanner scanner, Map<Integer, T> t);
    void search(Scanner scanner, Map<Integer, T> t);
}
