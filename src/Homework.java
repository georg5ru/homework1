import java.time.LocalDate;

public class Homework {

    public static void main(String[] args) {
        // Задача 1: Проверка високосного года
        int year = 2024;
        checkLeapYear(year);

        // Задача 2: Определение версии приложения
        int osType = 0; // 0 — iOS, 1 — Android
        int deviceYear = 2019; // Год выпуска устройства
        suggestAppVersion(osType, deviceYear);

        // Задача 3: Расчет дней доставки банковской карты
        int distance = 150; // Пример расстояния в километрах
        calculateDeliveryDays(distance);
    }

    /**
     * Задача 1: Метод проверяет, является ли год високосным, и выводит результат в консоль.
     */
    public static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Задача 2: Метод определяет версию приложения для установки на устройство.
     */
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = getOsName(osType);
        String appVersion = getAppVersion(deviceYear, currentYear);

        System.out.println("Установите " + appVersion + " версию приложения для " + osName);
    }

    private static String getOsName(int osType) {
        switch (osType) {
            case 0:
                return "iOS";
            case 1:
                return "Android";
            default:
                return "Неизвестная ОС";
        }
    }

    private static String getAppVersion(int deviceYear, int currentYear) {
        return (deviceYear < currentYear) ? "облегченную" : "обычную";
    }

    /**
     * Задача 3: Метод рассчитывает количество дней доставки в зависимости от расстояния.
     */
    public static void calculateDeliveryDays(int distance) {
        int deliveryDays = getDeliveryDays(distance);
        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна для расстояния " + distance + " км.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    private static int getDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1; // Если расстояние больше 100 км, доставка невозможна
        }
    }
}