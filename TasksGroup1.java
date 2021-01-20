package com.company;

public class TasksGroup1 {

    // 1 Остаток от деления
    static int mod(int numerator, int denominator) {
        return numerator % denominator;
    }

    // 2 Площадь треугольника
    static int triangleArea(int base, int height) {
        return (base*height)/2;
    }

    // 3 Кол-во ног животных
    static int animalLegs(int chickens, int cows, int pigs) {
        int chickenLegs = 2; int cowLegs = 4; int pigLegs = 4;
        return (chickens*chickenLegs + cows*cowLegs + pigs*pigLegs);
    }

    // 4 Профитная азартная игра
    static boolean profitableGambleCheck(double prob, double prize, double pay) {
        return (prob * prize > pay);
    }

    // 5 Какая операция ?
    static String operationCheck(int N, int a, int b) {
        if (N == a + b) return "added";
        if (N == a - b) return "subtracted";
        if (N == a * b) return "multiplied";
        if (N == a / b) return "divided";
        return "none";
    }

    // 6 ASCII
    static int ASCII(char symbol){
        return symbol;
    }

    // 7 Сумма чисел до ...
    static int addUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // 8 Третье ребро треугольника
    static int thirdEdge(int firstEdge, int secondEdge) {
        return (firstEdge + secondEdge - 1);
    }

    // 9 Сумма кубов
    static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i],3);
        }
        return sum;
    }

    // 10 добавить A к себе B раз и проверить делимость результата на C
    static boolean abcMath(int a, int b, int c){
        int result = 0;
        for (int i = 0; i < b; i++) result += a;
        return result % c == 0;
    }
}