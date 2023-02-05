package homework5;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class Task1{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Петров");
    }
    public static void addInPhoneBook() {
        phoneBook.put("Сидоров", List.of("+7-908-700-00-00", "+7-951-000-00-00"));
        phoneBook.put("Петров", List.of("+7-904-300-00-00", "+7-900-090-00-00"));
    }
    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}

