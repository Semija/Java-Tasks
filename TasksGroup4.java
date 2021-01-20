package com.company;

import java.text.DecimalFormat;
import java.util.HashSet;

public class TasksGroup4 {

    // 1 Бесси
    static String formate(int maxLen, String line) {
        StringBuilder build = new StringBuilder();
        String[] list = line.split(" ");
        int tempLen = 0;

        for(int i = 0; i < list.length; ++i) {
            tempLen += list[i].length();
            if (tempLen <= maxLen) {
                build.append(list[i]);
                build.append(" ");
            } else {
                build.replace(build.length() - 1, build.length(), "\n");
                tempLen = 0;
                --i;
            }
        }
        return build.toString();
    }

    // 2 Кластер скобок
    static String[] split(String line) {
        char[] chars = line.toCharArray();
        StringBuilder build = new StringBuilder();
        int count = 0;

        for(int i = 0; i < chars.length; ++i) {
            switch(chars[i]) {
                case '(':
                    ++count;
                    break;
                case ')':
                    --count;
            }

            build.append(chars[i]);
            if (count < 0) {
                return null;
            }

            if (count == 0) {
                build.append(" ");
            }
        }

        return build.toString().split(" ");
    }

    // 3 Верблюд и змея
    static String toCamelCase(String line) {
        StringBuilder build = new StringBuilder(line);
        int idx;
        while((idx = build.indexOf("_")) != -1) {
            build.delete(idx, idx + 1);
            build.replace(idx, idx + 1, String.valueOf(build.charAt(idx)).toUpperCase());
        }
        return build.toString();
    }

    static String toSnakeCase(String line) {
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < line.length(); ++i) {
            if (line.substring(i, i + 1).toUpperCase().equals(line.substring(i, i + 1))) {
                build.append('_');
                build.append(line.substring(i, i + 1).toLowerCase());
            } else {
                build.append(line.charAt(i));
            }
        }

        return build.toString();
    }

    // 4 Сверхурочка
    static double overTime(double[] array) {
        double clear = (17.0D - array[0]) * array[2];
        if (array[1] < 17.0D) {
            clear -= (17.0D - array[1]) * array[2];
        }

        double over = 0.0D;
        if (array[1] > 17.0D) {
            over = (array[1] - 17.0D) * array[2] * array[3];
        }

        return clear + over;
    }

    // 5 Индекс Массы Тела
    static String BMI(String s1, String s2) {
        String[] sm1 = s1.split(" ");
        String[] sm2 = s2.split(" ");
        double weight = 0.0D;
        double height = 0.0D;
        String var9;
        switch((var9 = sm1[1]).hashCode()) {
            case -1184266632:
                if (var9.equals("inches")) {
                    height = Double.parseDouble(sm1[0]) / 39.37D;
                }
                break;
            case -1077557750:
                if (var9.equals("meters")) {
                    height = Double.parseDouble(sm1[0]);
                }
                break;
            case -982397081:
                if (var9.equals("pounds")) {
                    weight = Double.parseDouble(sm1[0]) / 2.205D;
                }
                break;
            case 102052146:
                if (var9.equals("kilos")) {
                    weight = Double.parseDouble(sm1[0]);
                }
        }

        String var10;
        switch((var10 = sm2[1]).hashCode()) {
            case -1184266632:
                if (var10.equals("inches")) {
                    height = Double.parseDouble(sm2[0]) / 39.37D;
                }
                break;
            case -1077557750:
                if (var10.equals("meters")) {
                    height = Double.parseDouble(sm2[0]);
                }
                break;
            case -982397081:
                if (var10.equals("pounds")) {
                    weight = Double.parseDouble(sm2[0]) / 2.205D;
                }
                break;
            case 102052146:
                if (var10.equals("kilos")) {
                    weight = Double.parseDouble(sm2[0]);
                }
        }
        double bmi = weight / (height * height);
        DecimalFormat df = new DecimalFormat(".#");
        if (bmi < 18.5D) {
            return String.valueOf(df.format(bmi)) + " Underweight";
        } else {
            return bmi >= 25.0D ? String.valueOf(df.format(bmi)) + " Overweight" : String.valueOf(df.format(bmi)) + " Normal weight";
        }
    }

    // 6 Мультипликативное постоянство
    static int bugger(int n) {
        int count = 0;

        for(String number = String.valueOf(n); number.length() > 1; ++count) {
            int newN = 1;

            for(int i = 0; i < number.length(); ++i) {
                newN *= Integer.parseInt(number.substring(i, i + 1));
            }

            number = String.valueOf(newN);
        }

        return count;
    }

    // 7 Звездная стенография
    static String toStarShorthand(String line) {
        if (line.length() == 0) {
            return "";
        } else if (line.length() == 1) {
            return line;
        } else {
            StringBuilder build = new StringBuilder();

            for(int i = 0; i < line.length(); ++i) {
                int j = i + 1;

                int count;
                for(count = 1; j < line.length() && line.charAt(i) == line.charAt(j); ++j) {
                    ++count;
                }

                build.append(line.charAt(i));
                if (count > 1) {
                    build.append("*");
                    build.append(count);
                }

                i = j - 1;
            }

            return build.toString();
        }
    }

    // 8 Рифмуется ли
    static boolean doesRhyme(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String lastW1 = s1.substring(s1.lastIndexOf(32) + 1);
        String lastW2 = s2.substring(s2.lastIndexOf(32) + 1);
        String sublett1 = "";
        String sublett2 = "";
        char[] lettersInEng = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

        int i;
        int j;
        for(i = 0; i < lastW1.length(); ++i) {
            for(j = 0; j < lettersInEng.length; ++j) {
                if (lastW1.charAt(i) == lettersInEng[j]) {
                    sublett1 = sublett1 + lettersInEng[j];
                }
            }
        }

        for(i = 0; i < lastW2.length(); ++i) {
            for(j = 0; j < lettersInEng.length; ++j) {
                if (lastW2.charAt(i) == lettersInEng[j]) {
                    sublett2 = sublett2 + lettersInEng[j];
                }
            }
        }

        return sublett1.equals(sublett2);
    }

    // 9 Повторяется ли число 3 раза подряд
    static boolean trouble(long n1, long n2) {
        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        if (s1.length() < 3) {
            return false;
        } else if (s2.length() < 2) {
            return false;
        } else {
            for(int i = 0; i < s1.length() - 2; i += 3) {
                if (s1.charAt(i) == s1.charAt(i + 1) & s1.charAt(i + 1) == s1.charAt(i + 2)) {
                    char[] cont = new char[]{s1.charAt(i), s1.charAt(i)};
                    if (s2.contains(String.valueOf(cont))) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    // 10
    static int countUniqueBooks(String s1, char subC) {
        String subS = String.valueOf(subC);
        StringBuilder build = new StringBuilder(s1);
        HashSet<String> set = new HashSet();

        int secondIdx;
        for(int lastPoint = -1; build.indexOf(subS, lastPoint + 1) != -1; lastPoint = secondIdx) {
            int firstIdx = build.indexOf(subS, lastPoint + 1);
            secondIdx = build.indexOf(subS, firstIdx + 1);

            for(int j = firstIdx + 1; j < secondIdx; ++j) {
                set.add(String.valueOf(build.charAt(j)));
            }
        }

        return set.size();
    }
}
