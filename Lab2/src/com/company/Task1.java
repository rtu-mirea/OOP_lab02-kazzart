package com.company;
import java.lang.System;
import java.util.Scanner;


public class Task1 {
    private String txt;
    private String[] list;
    private String[] prices;

    Task1() {
        txt = new String("");

    }

    void consoleInput() {
        Scanner in = new Scanner(System.in);
        txt = in.nextLine();
    }

    void consoleInputProcessing() {
        System.out.print("Введите информацию о продажах в формате(товар цена; ...): ");
        this.consoleInput();
        list = txt.split("; ");
        prices = new String[list.length];
        for (int i = 0; i < list.length; i++){
            prices[i] = list[i].split(" ")[1];
        }
    }

    int soldSum() {
        int res = 0;
        for (String el: prices) {
            res += Integer.parseInt(el);
        }
        return res;
    }

    void soldSumProcessing() {
        System.out.print("Сумма всех продаж: ");
        System.out.println(this.soldSum());
    }

    void edit() {
        this.txt.toLowerCase();
    }

    String rating() {
        String buf;
        String[] listCopy = list;
        String[] pricesCopy = prices;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 0; j < prices.length - 1 - i; j++) {
                if (Integer.parseInt(pricesCopy[j]) < Integer.parseInt(pricesCopy[j + 1])) {
                    buf = pricesCopy[j];
                    pricesCopy[j] = pricesCopy[j + 1];
                    pricesCopy[j + 1] = buf;
                    buf = listCopy[j];
                    listCopy[j] = listCopy[j + 1];
                    listCopy[j + 1] = buf;
                }
            }
        }
        String res = String.join(";", listCopy);
        return res;
    }

    void ratingProcessing() {
        System.out.println("Список продаж, отсортированный по количеству продаж: " + this.rating());
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
