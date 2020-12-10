package com.company;


import java.util.Scanner;

public class XandO {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        XandO game = new XandO();
        game.LetsPlay();


    }



    public String LetsPlay() {
        int x = 10,o = 11;

        System.out.println("Добро пожаловать в Игру Крестики и Нолики!");
        System.out.println("Чтож начнем игру =)");
        int i, j = 0;
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");   //вывод таблицы
            }
            System.out.println();

        }
        int coint = 0;

        while (coint < 5) {
            coint++;
            System.out.println("Выбери номер клетки, куда хочешь поставить число: ");
            int num1 = in.nextInt();

            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[0].length; j++) {
                    if (array[0][0] == num1) {   // 1
                        array[0][0] = x;
                        if(array[1][1] == o & array[0][1] == o & array[2][1] != x )array[2][1] = o;
                        else if(array[1][1] == o & array[2][0] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[1][1] == o & array[1][0] == o & array[1][2] != x)array[1][2] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x)array[1][0] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[0][1] == o & array[2][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[2][1] == o & array[0][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[0][2] == o & array[1][1] == o & array[2][0] != x ) array[2][0] = o;
                        else if(array[1][1] == o & array[2][1] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[2][0] == o & array[2][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][0] == o & array[2][2] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[2][2] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[1][2] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][1] == x & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[0][2] == x & array[0][1] == o) array[0][1] = o;
                        else if(array[1][0] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == x & array[1][0] != x) array[1][0] = o;
                        else if(array[0][1] == x & array[0][2] != x)array[0][2] = o;
                        else if(array[1][1] != x) array[1][1] = o;

                    }
                    if(array[0][1] == num1) { // 2
                        array[0][1] = x;
                        if(array[0][0] == o & array[1][0] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == o & array[1][2] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[2][0] == o & array[2][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][0] == o & array[2][2] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[2][2] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[1][2] == o & array[2][2] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[1][1] == o & array[2][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][2] == o & array[1][1] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][0] == x & array[0][2] != x) array[0][2] = o;
                        else if(array[0][2] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[2][1] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == x & array[2][1] != x) array[2][1] = o;
                        else  if(array[1][1] != x) array[1][1] = o;
                    }
                    if (array[0][2] == num1){ // 3
                        array[0][2] = x;
                        if(array[0][1] == o & array[1][1] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[1][1] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[0][1] == o & array[2][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == o & array[1][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[0][0] == o & array[1][0] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[2][2] == o & array[2][1] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[2][1] == o & array[2][0] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][0] == o & array[2][2] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[1][1] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][0] == o & array[2][2] == o & array[1][1] != x) array[1][1] = o;
                        else if (array[0][0] == x & array[0][1] != x) array[0][1] = o;
                        else if(array[0][1] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[1][2] == x & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == x & array[2][1] != x) array[2][1] = o;
                        else if(array[1][1] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] != x) array[1][1] = o;
                    }
                    if(array[1][0] == num1){ // 4
                        array[1][0] = x;
                        if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[0][1] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][0] == o & array[2][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[2][0] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[2][2] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[0][1] == o & array[1][1] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[1][1] == o & array[2][1] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[2][1] == o & array[0][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[0][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[2][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[1][1] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[1][1] == o & array[2][0] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][0] == o & array[0][2] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[1][2] == o & array[2][2] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][1] == x & array[1][2] != x)array[1][2] = o;
                        else if(array[1][2] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[0][0] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[1][1] != x) array[1][1] = o;
                    }
                    if(array[1][1] == num1) { // 5
                        array[1][1] = x;
                        if(array[0][0] == o & array[0][1] == o & array[0][2] != o) array[0][2] = o;
                        else if(array[0][2] == o & array[0][0] == o & array[0][1] != o) array[0][1] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != o) array[0][0] = o;
                        else if(array[0][0] == o & array[1][0] == o & array[2][0] != o) array[2][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != o) array[1][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != o) array[0][0] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != o) array[2][2] = o;
                        else if(array[1][2] == o & array[2][2] == o & array[0][2] != o) array[0][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != o) array[1][2] = o;
                        else if(array[2][2] == o & array[2][1] == o & array[2][0] != o) array[2][0] = o;
                        else if(array[2][0] == o & array[2][2] == o & array[2][1] != o) array[2][1] = o;
                        else if(array[2][1] == o & array[2][0] == o & array[2][2] != o) array[2][2] = o;
                        else if(array[0][0] == x & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == x & array[0][2] != x) array[0][2] = o;
                        else if(array[0][1] == x & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == x & array[0][1] != x) array[0][1] = o;
                        else if(array[1][0] == x & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == x & array[1][0] != x) array[1][0] = o;
                        else if(array[0][2] != x) array[0][2] = o;
                    }
                    if(array[1][2] == num1){ // 6
                        array[1][2] = x;

                        if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][2] == o & array[0][0] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][0] == o & array[2][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[2][0] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[2][2] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[0][0] == o & array[1][0] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[0][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[2][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[1][1] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[1][1] == o & array[2][0] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][0] == o & array[0][2] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[2][0] == o & array[2][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][1] == o & array[2][2] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[2][2] == o & array[2][0] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[1][1] == x & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[0][2] == x & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == x & array[0][2] != x) array[0][2] = o;
                        else if(array[1][1] != x) array[1][1] = o;
                    }
                    if(array[2][0] == num1) { // 7
                        array[2][0] = x;
                        if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][2] == o & array[0][0] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[0][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[2][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][1] == o & array[2][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[0][1] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[1][1] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[1][2] == o & array[2][2] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == o & array[1][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[0][0] == x & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[2][1] == x & array[2][2] != x) array[2][1] = o;
                        else if(array[2][2] == x & array[2][1] != x) array[2][1] = o;
                        else if(array[1][1] == x & array[0][2] != x) array[0][2] = o;
                        else if(array[0][2] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] != x) array[1][1] = o;

                    }
                    if(array[2][1] == num1) { // 8
                        array[2][1] = x;
                        if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[0][0] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[1][2] == o & array[1][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[0][0] == o & array[1][1] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[0][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[2][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[1][1] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == o & array[0][2] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[2][0] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][0] == o & array[1][0] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[0][2] == o & array[1][2] == o & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == o & array[0][2] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == o & array[2][2] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[2][0] == x & array[2][2] != x) array[2][2] = o;
                        else if(array[2][2] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[1][1] == x & array[0][1] != x) array[0][1] = o;
                        else if(array[0][1] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] != x) array[1][1] = o;
                    }
                    if(array[2][2] == num1){ // 9
                        array[2][2] = x;
                        if(array[0][0] == o & array[0][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][1] == o & array[0][2] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][2] == o & array[0][0] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[1][0] == o & array[1][1] == o & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == o & array[1][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[1][2] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[0][0] == o & array[1][0] == o & array[2][0] != x) array[2][0] = o;
                        else if(array[2][0] == o & array[0][0] == o & array[1][0] != x) array[1][0] = o;
                        else if(array[1][0] == o & array[2][0] == o & array[0][0] != x) array[0][0] = o;
                        else if(array[0][1] == o & array[2][1] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[0][1] == o & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == o & array[1][1] == o & array[0][1] != x) array[0][1] = o;
                        else if(array[2][0] == o & array[1][1] == o & array[0][2] != x) array[0][2] = o;
                        else if(array[0][2] == o & array[2][0] == o & array[1][1] != x) array[1][1] = o;
                        else if(array[1][1] == o & array[0][2] == o & array[2][0] != x) array[2][0] = o;
                        else  if(array[1][1] == x & array[0][0] != x) array[0][0] = o;
                        else if(array[0][0] == x & array[1][1] != x) array[1][1] = o;
                        else if(array[2][0] == x & array[2][1] != x) array[2][1] = o;
                        else if(array[2][1] == x & array[2][0] != x) array[2][0] = o;
                        else if(array[0][2] == x & array[1][2] != x) array[1][2] = o;
                        else if(array[1][2] == x & array[0][2] != x) array[0][2] = o;
                        else if(array[1][1] != x) array[1][1] = o;
                    }
                    System.out.print(" " + array[i][j] + " ");   //вывод таблицы
                }
                System.out.println();

            }


            if (array[0][0] == x & array[0][1] == x & array[0][2] == x
                    || array[1][0] == x & array[1][1] == x & array[1][2] == x
                    || array[2][0] == x & array[2][1] == x & array[2][2] == x
                    || array[0][0] == x & array[1][0] == x & array[2][0] == x
                    || array[0][1] == x & array[1][1] == x & array[2][1] == x
                    || array[0][2] == x & array[1][2] == x & array[2][2] == x
                    || array[0][0] == x & array[1][1] == x & array[2][2] == x
                    || array[0][2] == x & array[2][0] == x & array[1][1] == x)
            {
                System.out.println("поздравляю вы победили!!");
                System.exit(0);
            } else if (array[0][0] == o & array[0][1] == o  & array[0][2] == o
                    || array[1][0] == o & array[1][1] == o & array[1][2] == o
                    || array[2][0] == o & array[2][1] == o & array[2][2] == o
                    || array[0][0] == o & array[1][0] == o & array[2][0] == o
                    || array[0][1] == o & array[1][1] == o & array[2][1] == o
                    || array[0][2] == o & array[1][2] == o & array[2][2] == o
                    || array[0][0] == o & array[1][1] == o & array[2][2] == o
                    || array[0][2] == o & array[2][0] == o & array[1][1] == o) {
                System.out.println("Вы проиграли!!!");
                System.exit(0);
            }
            else if(coint == 5){
                System.out.println("Ничья");
                System.exit(0);
            }

        }
        return LetsPlay();
    }


}


