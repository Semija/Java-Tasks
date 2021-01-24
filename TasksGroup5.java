package com.company;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;

public class TasksGroup5 {

    // 1 Секретные сообщения
    static int[] encrypt(String deCode) {
        if (deCode.length() < 1) {
            return null;
        } else {
            int[] arr = new int[deCode.length()];
            arr[0] = deCode.charAt(0);

            for(int i = 1; i < arr.length; ++i) {
                arr[i] = deCode.charAt(i) - deCode.charAt(i - 1);
            }

            return arr;
        }
    }

    static String decrypt(int[] codes) {
        StringBuilder build = new StringBuilder();
        build.append((char)codes[0]);

        for(int i = 1; i < codes.length; ++i) {
            build.append((char)(build.charAt(i - 1) + codes[i]));
        }

        return build.toString();
    }

    // 2 Может ли двигаться фигура
    static boolean canMove(String figure, String from, String to) {
        int[] s = new int[]{from.charAt(0) - 65 + 1, Integer.parseInt(from.substring(1))};
        int[] e = new int[]{to.charAt(0) - 65 + 1, Integer.parseInt(to.substring(1))};
        switch(figure){

            case "Pawn":
                return e[0] - s[0] == 0 && e[1] - s[1] == 1;

            case "Horse":
                if (Math.abs(e[0] - s[0]) == 1 && Math.abs(e[1] - s[1]) == 2) {
                    return true;
                } else {
                    return Math.abs(e[0] - s[0]) == 2 && Math.abs(e[1] - s[1]) == 1;
                }

            case "Bishop":
                    return Math.abs(e[0] - s[0]) == Math.abs(e[1] - s[1]);

            case "Rook":
                if (Math.abs(e[0] - s[0]) == 0 && Math.abs(e[1] - s[1]) != 0) {
                    return true;
                } else {
                    return Math.abs(e[0] - s[0]) != 0 && Math.abs(e[1] - s[1]) == 0;
                }

            case "Queen":
                if (canMove("ROOK", from, to)) {
                    return true;
                } else {
                    return canMove("BISHOP", from, to);
                }

            case "King":
                return Math.abs(e[0] - s[0]) < 2 && Math.abs(e[1] - s[1]) < 2;
        }
            return false;
    }

    // 3 Можно ли дополнить слово
    static boolean canComplete(String s1, String s2) {
        if (s1.charAt(0) != s2.charAt(0)) return false;
        if (s1.charAt(s1.length() - 1) != s2.charAt(s2.length() - 1)) return false;

        int lastLetter = 0;
        for (int i = 0; i < s1.length(); i++) {
            int nowLetter = s2.indexOf(s1.charAt(i), lastLetter);
            if (nowLetter == -1) return false;
            lastLetter = nowLetter + 1;
        }
        return true;
    }

    // 4 произведение до длины в 1 цифру
    static int sumDigProd(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        int numSum = 0;
        for (int i : array) numSum += i;
        if (String.valueOf(numSum).length() == 1) return numSum;

        int num = numSum;
        while (String.valueOf(num).length() != 1) {
            int numMult = 1;
            while (num / 10 > 0) {
                numMult *= num % 10;
                num /= 10;
            }
            numMult *= num;

            num = numMult;
        }

        return num;
    }

    // 5 те же гласные
    static String[] sameVowelGroup(String[] args) {
        if (args.length == 1) return args;

        int trueSize = 0;
        String[] rez = new String[args.length];
        char[] Vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        StringBuilder mod = new StringBuilder(args[0]);

        // Удаление согласных
        for (int i = 0; i < mod.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < Vowels.length; j++) {
                if (Vowels[j] == mod.charAt(i)) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                mod.delete(i, i + 1);
                i -= 1;
            }
        }

        // Очистка совпадений
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < mod.length(); i++) {
            set.add(String.valueOf(mod.charAt(i)));
        }

        // Проверка всех слов из входящего массива
        for (String str : args) {
            Iterator value = set.iterator();
            boolean isSame = true;
            while (value.hasNext()) {
                if (!str.contains((String) value.next())) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                rez[trueSize++] = str;
            }
        }

        String[] rez2 = new String[trueSize];
        if (rez2.length >= 0) System.arraycopy(rez, 0, rez2, 0, rez2.length);

        return rez2;
    }

    // 6 Номер кредитной карты
    static boolean validateCard(long card) {
        int len = String.valueOf(card).length();
        if (len < 14 | len > 19) return false;

        // Переворот с удалением
        int[] mcard = new int[len - 1];
        long pseudoCard = card / 10;

        for (int i = 0; i < mcard.length; i++) {
            mcard[i] = (int)(pseudoCard % 10);
            pseudoCard /= 10;
        }

        // Удвоение цифр в нечётных позициях и их приведение от числа к цифре
        for (int i = 0; i < mcard.length; i += 2) {
            mcard[i] *= 2;

            String value = String.valueOf(mcard[i]);
            if (value.length() == 1) continue;

            // Сложение цифр числа до 1 цифры
            while (value.length() > 1) {
                int sum = 0;
                int intValue = mcard[i];
                while(intValue > 0) {
                    sum += intValue % 10;
                    intValue /= 10;
                }
                value = String.valueOf(sum);
            }

            mcard[i] = Integer.parseInt(value);
        }

        // Сложение цифр большого получившеося числа
        long bigSum = 0;
        for (int i = 0; i < mcard.length; i++) bigSum += mcard[i];

        return ((10 - bigSum % 10) == (card % 10));
    }

    // 7 стоковое представление числа
    static String numToEng(int num) {
        String[] ones = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] tens = {
                "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"	};
        String[] fromTenToTwenty = {
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String[] bigNums = { "hundred" };

        String num_str = String.valueOf(num);

        if (num_str.length() == 1) return ones[num];

        if (num_str.length() == 2) {
            if (num / 10 == 1) return fromTenToTwenty[num % 10];
            if (num % 10 == 0) return tens[num / 10];
            return tens[num / 10] + " " + ones[num % 10];
        }
        if (num_str.length() == 3) {
            String additional = ((num / 100) == 6 | (num / 100) == 9) ? "s" : "";
            return ones[num / 100] + " " + bigNums[0]  + additional + " " +numToEng(num % 100);
        }
        return null;
    }

    static String numToRu(int num) {
        String[] units = {
                "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять" };
        String[] fromTenToTwenty = {
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать" };
        String[] tens = {
                "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "весемьдесят",
                "девяносто"	};
        String[] bigNums = {
                "",  "сто",  "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот",
                "девятьсот"
        };

        String num_str = String.valueOf(num);

        if (num_str.length() == 1) return units[num];

        if (num_str.length() == 2) {
            if (num / 10 == 1) return fromTenToTwenty[num % 10];
            if (num % 10 == 0) return tens[num / 10];
            return tens[num / 10] + " " + units[num % 10];
        }
        if (num_str.length() == 3) {
            return bigNums[num / 100] + " " + numToRu(num % 100);
        }

        return null;
    }

    // 8 Безопасный хеш SHA-256
    static String getSha256Hash(String toHash) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(toHash.getBytes(StandardCharsets.UTF_8));

            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 32)
            {
                hexString.insert(0, '0');
            }

            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    // 9 Корректирование заголовков
    static String correctTitle(String line) {
        String[] mine = line.toLowerCase().split(" ");
        StringBuilder build = new StringBuilder();
        for (String word : mine) {
            switch (word) {
                case "and":
                case "or":
                case "of":
                case "in":
                case "above":
                case "under":
                case "the":
                    if (word.equals(mine[0])) {
                        build.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
                        build.append(" ");
                        break;
                    }
                    build.append(word);
                    build.append(" ");
                    break;
                default:
                    build.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
                    build.append(" ");
                    break;
            }
        }
        return build.toString();
    }

    // 10
    static String hexLattice(int amount) {
        if (amount == 1) return "o";

        final int step = 6;
        final int start = 1;

        int count = 1;
        int move = start;
        while ((move += step * count++) < amount);
        if (move != amount) return "Invalid";

        int lenX, lenY;
        lenX = lenY = count + count - 1;

        StringBuilder build = new StringBuilder();
        build.append("\n");
        final int maxLinePointAmount = lenX;
        int linePointAmount = count;

        int operation = 1;
        for (int i = 0; i < lenY; i++) {
            int numOfSpaces = maxLinePointAmount - linePointAmount;
            while (numOfSpaces-- > 0) build.append(" ");

            for (int j = 0; j < linePointAmount; j++) {
                build.append("o ");
            }

            linePointAmount += operation;
            if (linePointAmount == maxLinePointAmount) operation = -1;

            build.replace(build.length() - 1, build.length(), "\n");
        }

        return build.toString();
    }
}
