package lesson5;

import java.util.Scanner;

/**
 * Java Core. Basic level. Lesson 5
 *
 * @author Maxo Khubulovi
 * @version dated Mart 18, 2023
 */


public class Main {
    Scanner scanner = new Scanner(System.in);
    // Task
//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//        * Конструктор класса должен заполнять эти поля при создании объекта;
//        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//        * Создать массив из 5 сотрудников
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;


    public static void main(String[] args) {
        Niggers[] workers = {new Niggers("Bobe ", "Mgoyan ", "Kniazevich ", 42, "Bobevorvzakone@mail.ru ", "Vorvsexvorov", 1000, "555213213"),
                new Niggers("Abo ", "Mgoyan ", "Kniziavech ", 40, "abobobebrat@mail.ru ", "pravirukavora", 800, "552134134"),
                new Niggers("Alik", "Mgoyan", "Bobeevich", 22, "chtotakoemail@ru", "podsosnik", 20, "242423242"),
                new Niggers("Nodo", "Mgoyan", "Neznoiuvich", 31, "mailmail@ri.", "levirukavora", 940, "34123124"),
                new Niggers("Temp", "Saroyan", "Toge neznaiuvic", 23, "nenzaiuu@mail.ri", "pomoshnikpodsosnika", 50, "23243242")};

        for (Niggers nigger : workers) {
            nigger.searchWorkers(40);
        }
    }

}
