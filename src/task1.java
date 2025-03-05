public class task1 {
    public static void main(String[] args) {
        //task1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //task2
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            //task3
            int year = 2021;
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            //task4
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: 1");
            } else if (deliveryDistance <= 60) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3");
            } else {
                System.out.println("Доставки нет");
            }
            //task5
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Ошибка, нет такого месяца");
            }
        }
    }
}
