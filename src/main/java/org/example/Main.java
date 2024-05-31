package org.example;

import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calcVacationMonths(10_000, 3_000, 20_000);
        System.out.println("1. " + expected + "== ? == " + actual);
    }
}