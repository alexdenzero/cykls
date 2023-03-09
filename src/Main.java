
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
        int vklad = sallary - 14_000;
        int i = 1;
        for (; total < 2_459_000; i++) {
            total = vklad + total;
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
        int naselenie = 12_000_000;
        int rohdaemostNa1000 = 12_000 * 17;
        int smertnostNa1000 = 12_000 * 8;
        int totalPipl = rohdaemostNa1000 - smertnostNa1000;
        int sTotalPiil = totalPipl + naselenie;
        for (int i = 1; i <= 10 ; i++) {
            sTotalPiil = sTotalPiil + totalPipl;
            System.out.println("Год " + i + " , численность населения составляет " +sTotalPiil);
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
        int patnica = 5;
        for (; patnica <= 31; patnica++) {
            patnica = patnica + 7;
            System.out.println("Сегодня пятница " + patnica + "е - число. Необходимо подготовить отчет.");
        }
    }


    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int za200Let = 2023 - 200;
        int posle200Let = 2023 + 100;
        for (; year <= 2123; year = year + 79) {
            if (year >= za200Let) {
                System.out.println(year);
            }
        }
    }
}