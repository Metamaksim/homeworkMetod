public class Main {
    public static void main(String[] args) {
// Задание 1
        checkYear(2021);
        sentMessage(1,2023);
        countOfDays(5);
        String s = "yjfkfsfyuqwfqwfhf";
        dudlChekcer(s);

    }
        public static void checkYear (int year) {

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + "год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + "год не является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }
// Задание 2
    public static void sentMessage(int clientOS, int issueYears) {
        int issueYearsCouldInstallFull = 2022;
        if (clientOS == 1 && issueYears >= issueYearsCouldInstallFull) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && issueYears >= issueYearsCouldInstallFull) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && issueYears < issueYearsCouldInstallFull) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && issueYears < issueYearsCouldInstallFull) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("У нас есть приложения для iOS и Android!");
        }
    }

    public static void countOfDays (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки карты: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки карты: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней для доставки карты: 3");
        } else {
            System.out.println(" Ваша карта будет готова к выдаче на следующий день после обращения. \n Выберите и посетите отделение банка в любой удобный для Вас день, в течении меяца ");
        }
    }
    //Задание 4
    public static void dudlChekcer(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.print("Есть дублирующийся символ - " + s.charAt(i) + "\n");
                }
            }
            break;
        }
    }


    }

