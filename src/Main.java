//import java.util.Arrays;
//import java.util.stream.IntStream;
//public class Main {
//    public static void printSeparator(){
//        System.out.println("+++++++++");
//        System.out.println("---------");
//    }
//    public static void printIssues(int issueCount){
//        System.out.println(issueCount);
//    }
//
//    public static int sum( int[] numders) {
//        int sum = 0;
//        for (int i = 0; i < numders.length; i++) {
//            sum = sum + numders[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//// Задача №1
//        System.out.println("Задача №1");
//        int[] issuesByMounts = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
//        printSeparator();
//        for (int i = 0; i < issuesByMounts.length; i++) {
//            printIssues(issuesByMounts[i]);
//            if ((i + 1 ) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesByMounts);
//        printIssues(total);
//
//    }
//}
import java.time.LocalDate;
public class Main {
    public static void leapYear(int yearNum) {
        double yearDiv4 = yearNum ;
        if (yearDiv4 % 4 == 0 && yearDiv4 % 100 != 0 || yearDiv4 % 400 == 0) {
            System.out.println(yearNum + " Является високосным годом");
        } else {
            System.out.println(yearNum + " Не я вляется високосным годом");
        }
    }
    public static void clientDevice(boolean clientOS, int clientDeviceYear) {
        String lightVersion;
        if (clientDeviceYear >= 2015) lightVersion = " ";
        else lightVersion = " облегченную ";
        if (clientOS) System.out.println("Установите" + lightVersion + "версию приложения для Android по ссылке");
        else System.out.println("Установите" + lightVersion + "версию приложения для iOS по ссылке");
    }
    public static void deliveryDays (int deliveryDistance) {
        System.out.println("Удаленность клиента " + deliveryDistance + " км");
        if (deliveryDistance > 100)
            System.out.println("Извините, так далеко мы не доставляем");
        else System.out.println("На доставку потребуется дней: " + ((deliveryDistance + 20) / 40));
    }
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        int yearNum = 2100;
        leapYear(yearNum);
        yearNum = 2000;
        leapYear(yearNum);
        int currentYear = LocalDate.now().getYear();
        System.out.print("Текущий год ");
        leapYear(currentYear);
        //Задача №2
        System.out.println("Задача №2 ");
        boolean clientOS = true;
        int clientDeviceYear = 2012;
        System.out.println("Год выпуска устройста клиента " + clientDeviceYear);
        clientDevice(clientOS, clientDeviceYear);
        clientOS = false;
        clientDeviceYear = LocalDate.now().getYear();
        System.out.println("Год выпуска устройста клиента " + clientDeviceYear);
        clientDevice(clientOS, clientDeviceYear);
        //Задача №3
        System.out.println("Задача №3 ");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);
        deliveryDistance = 105;
        deliveryDays(deliveryDistance);

    }



}