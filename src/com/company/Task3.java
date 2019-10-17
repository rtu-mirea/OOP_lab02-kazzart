package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class Task3 {
    private String txt1;
    private String txt2;

    Task3() {
        txt1 = new String("");
        txt2 = new String("");
    }

    void consoleInput() {
        Scanner in = new Scanner(System.in);
        txt1 = new String(in.nextLine());
    }

    void consoleInputProcessing() {
        System.out.print("Введите  время в формате \"ЧЧ:ММ\": ");
        this.consoleInput();
    }

    boolean correctnessCheck(String time) {
        return Pattern.matches("(([0-1]{1}[0-9]{1})|(2[0-3])):[0-5]{1}[0-9]{1}", time);
    }

    void correctnessCheckProcessing() {
        if (correctnessCheck(txt1)) {
            System.out.println("Ведено корректное время");
        } else {
            System.out.println("Введено некорректное время");
        }
    }

    void consoleTextInput() {
        Scanner in = new Scanner(System.in);
        txt2 = new String(in.nextLine());
    }

    void textTimeEdit() {
        txt2.replaceAll("(0[0-1]:[0-5][0-9])|(02:00)", "");
    }

}
