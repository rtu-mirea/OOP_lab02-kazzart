package com.company;

import java.util.Scanner;

public class Task2 {
    private StringBuffer txt;
    private String[] list;
    private String[] prices;

    Task2() {
        txt = new StringBuffer("");

    }

    void consoleInput() {
        Scanner in = new Scanner(System.in);
        txt = new StringBuffer(in.nextLine());
    }

    void consoleInputProcessing() {
        System.out.print("Введите информацию о продажах в формате(товар цена; ...): ");
        this.consoleInput();

        list = txt.toString().split("; ");
        prices = new String[list.length];
        for (int i = 0; i < list.length; i++){
            prices[i] = list[i].split(" ")[1];
        }
    }

    void zeroDelete() {
        String[] listCopy = list;
        String[] pricesCopy = prices;
        for (int i = 0; i < list.length; i++) {
            if (prices[i] == "0") {
                for (int j = 0; j < list.length; j++) {
                    if (j < i) {
                        listCopy[j] = list[j];
                        pricesCopy[j] = prices[j];
                    }
                    if (j > i) {
                        listCopy[j] = list[j + 1];
                        pricesCopy[j] = prices[j + 1];
                    }
                }
            }
        }
        list = listCopy;
        prices = pricesCopy;
        txt = new StringBuffer(String.join("; ", list));
    }

    void zeroDeleteProcessing() {
        this.zeroDelete();
        System.out.println("Сведения о продажах с суммой равной 0 удалены.");
    }

    void minMaxReplacement() {
        int min = 0;
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() < list[min].length()) {
                min = i;
            }
            if (list[i].length() < list[max].length()) {
                max = i;
            }
        }
        list[min] = list[max];
        prices[min] = list[max];
        txt = new StringBuffer(String.join("; ", list));
    }

    void minMaxReplacementProcessing() {
        this.minMaxReplacement();
        System.out.println("Данные минимальной длины заменены на данные максимальной длины.");
    }

    void newInfoAppend(String name, String val) {
        String[] listCopy = new String[list.length + 1];
        String[] pricesCopy = new String[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            listCopy[i] = list[i];
            pricesCopy[i] = prices[i];
        }
        listCopy[listCopy.length] = name + " " + val;
        pricesCopy[pricesCopy.length] = val;
    }

    void newInfoAppendProcessing() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String name = in.nextLine();
        System.out.print("Введите сумму: ");
        String val = in.nextLine();
        newInfoAppend(name, val);
        txt = new StringBuffer(String.join("; ", list));
    }

    void indexOutput(int index) {

        for (int i = 0; i < list.length; i++) {
            if (i == index - 1) {
                System.out.println("Наименование товара: " + list[i].split(" ")[0]);
                System.out.println("Сумма продаж: " + list[i].split(" ")[1]);
            }
        }
    }

    void indexOutputProcessing() {
        System.out.print("Введите номер продажи по списку: ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        indexOutput(index);
    }

    void consoleOutput() {
        System.out.print("Список продаж: " + String.join("; ", list));
    }
}
