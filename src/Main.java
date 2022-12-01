public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Число некорректно");

        System.out.println("Задание 2");

        short clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Задание 3");

        float years = 800;

        if (((years % 4 != 0) || (years % 400 != 0)) && (years % 100 == 0)) {
            System.out.println("Год не высокосный");
        }
        else System.out.println("Год высокосный");

        System.out.println("Задание 4");
        int deliveryDistance = 100;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day+day));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (day+day+day));
        }
        else System.out.println("Извините, до Вас слишком далеко");

        System.out.println("Задание 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }
}