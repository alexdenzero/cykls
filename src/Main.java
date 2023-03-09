
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int sallary = 29_000;
        int total = 0;
        int contribution = sallary - 14_000;
        int i = 1;
        for (; total < 2_459_000; i++) {
            total = contribution + total;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i);
        }
        System.out.println();
        for (int d = 10; d >= 1; d = d - 1) {
            System.out.print(d);
        }
        System.out.println();
    }


    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        double fertility = 17f / 1000;
        double mortality = 8f / 1000;
        ///int populationNa1000 = population / 1000;
        ///int fertilityNa1000 = populationNa1000 * 17;
        ///int mortalityNa1000 = populationNa1000 * 8;
        ////int totalpopulation = fertilityNa1000 - mortalityNa1000;
        //// =      population * 0.009;
        int i = 1;
        for (;i <= 10; i++) {
            population =(int) (population * (fertility - mortality)) + population;
            System.out.println("Год " + i + " , численность населения составляет " +population);
        }
    }


    public static void task4 () {
        System.out.println("Задача 4");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + ((total / 100) * 7);
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }


    public static void task5 () {
        System.out.println("Задача 5");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + ((total / 100) * 7);
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }


    public static void task6 () {
        System.out.println("Задача 6");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        for (; i <= 108; i++) {
            total = total + ((total / 100) * 7);
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }


    public static void task7 () {
        System.out.println("Задача 7");
        int day = 5;
        for (; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница " + day + "е - число. Необходимо подготовить отчет.");
        }
    }


    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int for200Years = 2023 - 200;
        int after100Years= 2023 + 100;
        for (; year <= after100Years; year = year + 79) {
            if (year >= for200Years) {
                System.out.println(year);
            }
        }
    }
}