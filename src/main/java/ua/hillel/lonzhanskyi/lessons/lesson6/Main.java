package ua.hillel.lonzhanskyi.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //        FOR


        /*

        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
              )
              {
                  код
              }
         */

//        int i = 0;
//        for ( ; i < 10; i++) {
//            System.out.println("Hello World");
//            System.out.println(i);
//        }
//        System.out.println("i = " + i);


        // БЕСКIНЕЧНИЙ ЦИКЛ!!!
//        for (int i = 0; ; i++) {
//            System.out.println("Hello World");
//            System.out.println(i);
//        }


//        for (int i = 0; i < 5; ) {
//            System.out.println("Hello World");
//            System.out.println(i);
//            i++;
//        }


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        int i = 0;
//        for ( ; ; ) {
//            System.out.println("Hello World");
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }


//        for (int i = 0; i < 10; i++) {
//
//            if (i == 1 || i == 2) {
//                continue;
//            }
//
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//
//        }


//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }


//        for (int i = 0; i < 3; i++) {
//            System.out.println("start first loop");
//            System.out.println("first loop i = " + i);
//
//            for (int j = 0; j < 2; j++) {
//                System.out.println("second loop");
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//            }
//
//            System.out.println("end first loop");
//            System.out.println();
//        }


//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                for (int k = 0; k < 2; k++) {
//                    for (int l = 0; l < 3; l++) {
//                        counter++;
//                    }
//                }
//            }
//        }
//        System.out.println("counter = " + counter);


//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

        //version 1
//        for (int i = 0; i < 21; i += 2) {
//            System.out.println(i);
//        }

        //version 2
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }


//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }


        // WHILE

//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello World");
//            i++;
//        }

//        int i = 10;
//
//        do {
//            System.out.println("Hello world");
//        } while (i < 5);

//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int userValue = 0;
//        while (true) {
//            System.out.println("Please enter integer from 10 to 20");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                if (userValue >= 10 && userValue <= 20) {
//                    break;
//                } else {
//                    System.out.println("FROM 10 TO 20!!!");
//                    scanner.nextLine();
//                }
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
//        }
//        System.out.println("user value = " + userValue);
//    }

//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int integer = 10;
//
//        while (true) {
//            System.out.println(integer);
//            int random = (int) (Math.random() * 101); // 0 - 100
//            if (random >= 85 && random <= 100) {
//                System.out.println("WIN!!!!!!!!!!");
//                break;
//            }
//            integer -= 1;
////            integer--;
//            if (integer == -1) {
//                System.out.println("BOOOM!!!");
//                break;
//            }
//        }

//        ДЗ
//
//        У Японії числа 4 та 9 вважаються нещасливими.
//        Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.

//        int counter = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i / 10 == 4 || i % 10 == 4 || i / 10 == 9 || i % 10 == 9) {
//                continue;
//            }
//            System.out.println(i);
//            counter++;
//        }

//        int x = 42;
//
//        System.out.println(x / 10);
//        System.out.println(x % 10);



    }

}
