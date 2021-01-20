package com.company;

public class TasksGroup2 {

    // 1 повторить символы n раз
    static String repeat (String str, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < n; j++) answer.append(str.charAt(i));
        }
        return answer.toString();
    }

    // 2 разница между max и min
    static int differenceMaxMin(int[] array) {
        int Max = -2147483648; int Min = 2147483647;
        for (int i = 0; i < array.length; i++){
            if (array[i] > Max) Max = array[i];
            if (array[i] < Min) Min = array[i];
        }
        if (Max < Min) return 0;
        return Max-Min;
    }

    // 3 среднее значение массива целое число ?
    static boolean isAvgWhole(int[] array) {
        double Avg; int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        Avg = sum; Avg /= array.length;
        return (Avg % 1 == 0);
    }

    // 4 каждое число заменяется на сумму: самого себя + всех предыдущих
    static int[] cumulativeSum(int[] array) {
        int[] answer = new int[array.length]; int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            answer[i] = sum;
        }
        return answer;
    }

    // 5 кол-во десятичных знаков в строке
    static int getDecimalPlaces(String x) {
        int answer = 0;
        boolean afterDot = false;
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) == '.') {afterDot = true; continue;}
            if (afterDot) {answer++;}
        }
        return answer;
    }

    // 6 Фибоначчи
    static int fibonacci(int x) {
        int a = 1;
        int b = 1;
        for (int i = 2; i <= x; ++i)
        {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 7 Почтовый индекс
    static boolean isValid(String ind) {
        int length = 5; int count = 0;
        for (int i = 0; i < ind.length(); i++)
        {
            if (Character.isDigit(ind.charAt(i))) count++;
        }
        return (count == length && ind.length() == length);
    }

    // 8 Странная пара
    static boolean isStrangePair(String arr1, String arr2) {
        if (arr1.length() != 0 && arr2.length() != 0) {
            return arr1.charAt(0) == arr2.charAt(arr2.length() - 1) && arr1.charAt(arr1.length() - 1) == arr2.charAt(0);
        } else {
            return false;
        }
    }

    // 9 Префикс и Суффикс
    static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }

    static boolean isSuffix(String word, String suffix) {
        return word.endsWith(suffix.substring(1));
    }

    // 10 Поля на шаге последовательности
    static int boxSeq(int step) {
        if (step == 0) {
            return 0;
        } else {
            return step % 2 == 0 ? step : step + 2;
        }
    }

}
