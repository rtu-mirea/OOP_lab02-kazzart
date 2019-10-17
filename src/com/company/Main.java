package com.company;
import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Task1 line1 = new Task1();
        Task2 line2 = new Task2();
        Task3 line3 = new Task3();
        int comm0 = -1;
        Scanner in = new Scanner(System.in);
        outputMenu0();
        while (comm0 != 0) {
            System.out.print("Выберите проверяемое задание: ");
            comm0 = in.nextInt();
            switch (comm0) {
                case 1:
                    int comm1 = -1;
                    outputMenu1();
                    while (comm1 != 0) {
                        System.out.print("Введите команду: ");
                        comm1 = in.nextInt();
                        switch (comm1) {
                            case 1:
                                outputMenu1();
                                break;
                            case 2:
                                line1.consoleInputProcessing();
                                break;
                            case 3:
                                line1.soldSumProcessing();
                                break;
                            case 4:
                                line1.edit();
                                break;
                            case 5:
                                line1.ratingProcessing();
                                break;
                            case 6:
                                line1.indexOutputProcessing();
                                break;
                            case 7:
                                line1.consoleOutput();
                                break;
                            case 0:
                                System.out.println("Завершение выполнения задания 1...");
                                break;
                            default:
                                System.out.println("Введена неверная команда, повторите ввод");
                                break;
                        }
                    }
                    break;
                case 2:
                    int comm2 = -1;
                    outputMenu1();
                    while (comm2 != 0) {
                        System.out.print("Введите команду: ");
                        comm2 = in.nextInt();
                        switch (comm2) {
                            case 1:
                                outputMenu2();
                                break;
                            case 2:
                                line2.consoleInputProcessing();
                                break;
                            case 3:
                                line2.zeroDeleteProcessing();
                                break;
                            case 4:
                                line2.minMaxReplacementProcessing();
                                break;
                            case 5:
                                line2.newInfoAppendProcessing();
                                break;
                            case 6:
                                line2.consoleOutput();
                                break;
                            case 0:
                                System.out.println("Завершение выполнения задания 2...");
                                break;
                            default:
                                System.out.println("Введена неверная команда, повторите ввод");
                                break;
                        }
                    }
                    break;
                case 3:
                    int comm3 = -1;
                    outputMenu3();
                    while (comm3 != 0) {
                        System.out.print("Введите команду: ");
                        comm3 = in.nextInt();
                        switch (comm3) {
                            case 1:
                                outputMenu3();
                                break;
                            case 2:
                                line3.consoleInputProcessing();
                                break;
                            case 3:
                                line3.correctnessCheckProcessing();
                                break;
                            case 4:
                                line3.consoleTextInput();
                                break;
                            case 5:
                                line3.textTimeEdit();
                                break;
                            case 0:
                                System.out.println("Завершение выполнения задания 3...");
                                break;
                            default:
                                System.out.println("Введена неверная команда, повторите ввод");
                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Завершение программы...");
                    break;
                default:
                    System.out.println("Введена неверная команда, повторите ввод");
                    break;
            }
        }
    }

    public static void outputMenu0() {
        System.out.println("1. Первое задание");
        System.out.println("2. Второе задание");
        System.out.println("3. Третье задание");
        System.out.println("0. Выход");
    }

    public static void outputMenu1() {
        System.out.println("1. Вывести меню повторно");
        System.out.println("2. Ввести данные о продажах");
        System.out.println("3. Посчитать сумму всех продаж");
        System.out.println("4. Отредактировать список");
        System.out.println("5. Отсортировать список по количеству продаж");
        System.out.println("6. Вывести информацию о продаже по номеру продажи в списке");
        System.out.println("7. Вывести информацию о продажах");
        System.out.println("0. Назад");
    }

    public static void outputMenu2() {
        System.out.println("1. Вывести меню повторно");
        System.out.println("2. Ввести данные о продажах");
        System.out.println("3. Удалить из текста сведения о продажах с суммой равной 0");
        System.out.println("4. Заменить продажу с наименьшей длинной на продажу наибольшего размера.");
        System.out.println("5. Добавить информацию о продаже");
        System.out.println("7. Вывести информацию о продажах");
        System.out.println("0. Назад");
    }

    public static void outputMenu3() {
        System.out.println("1. Вывести меню повторно");
        System.out.println("2. Ввести время");
        System.out.println("3. Проверить на время на корректность");
        System.out.println("4. Ввести текст для редактирования");
        System.out.println("5. Удаление всех значений времени в промежутке 00:00 - 02:00 из текста");
        System.out.println("0. Назад");
    }

}
