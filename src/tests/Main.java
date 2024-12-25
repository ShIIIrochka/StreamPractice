package ru.tbank.hse.fd.streamPractise;

import ru.tbank.hse.fd.streamPractise.model.Car;
import ru.tbank.hse.fd.streamPractise.model.Owner;
import ru.tbank.hse.fd.streamPractise.service.CarService;
import ru.tbank.hse.fd.streamPractise.utils.Condition;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        // Создаем список машин
        List<Car> cars = Arrays.asList(
                new Car("Car1", 5, Condition.NEW, Arrays.asList(new Owner("Alice", 30, 5))),
                new Car("Car2", 12, Condition.USED, Arrays.asList(new Owner("Bob", 40, 10))),
                new Car("Car3", 15, Condition.BROKEN, Arrays.asList(new Owner("Adam", 50, 15))),
                new Car("Car4", 3, Condition.NEW, Arrays.asList(new Owner("Eve", 37, 8))),
                new Car("Car5", 11, Condition.BROKEN, Arrays.asList(new Owner("Charlie", 45, 12)))
        );

        // Проверяем метод getConditions
        List<String> conditions = carService.getConditions(cars);
        System.out.println("Conditions: " + conditions);

        // Вы можете добавить вызовы других методов для проверки их функциональности
    }
}
