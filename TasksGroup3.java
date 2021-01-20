package com.company;

public class TasksGroup3 {

    // 1 Число решений: ax^2 + bx +c = 0
    static int solutions(int a, int b, int c) {
        int rez = b * b - 4 * a * c;
        if (rez < 0) {
            return 0;
        } else {
            return rez > 1 ? 2 : 1;
        }
    }

    // 2 Позиция второго вхождения zip в string
    static int findZip(String str) {
        String substr = "zip";
        int n = 2;
        int pos = str.indexOf(substr);
        while (--n >0 && pos != -1) pos = str.indexOf(substr, pos+1);
        return pos;
    }

    // 3 Совершенство или нет
    static boolean checkPerfect(int num) {
        int sum = 0;
        for(int i = 1; i < num; ++i) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    // 4 Перемещение первого с последним
    static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible";
        } else {
            return s.charAt(0) == s.charAt(s.length() - 1) ? "Two is pair" : s.replace(s.charAt(0), s.charAt(s.length() - 1));
        }
    }

    // 5 Шестнадцатеричный код
    static boolean isValidHexCode(String code) {
        if (code.length() != 7) {
            return false;
        } else if (!code.startsWith("#")) {
            return false;
        } else {
            char[] cb = code.substring(1).toCharArray();

            for(int i = 0; i < cb.length; ++i) {
                boolean isValid = false;
                if (cb[i] >= '0' & cb[i] <= '9') {
                    isValid = true;
                }
                if (cb[i] >= 'A' & cb[i] <= 'F') {
                    isValid = true;
                }
                if (cb[i] >= 'a' & cb[i] <= 'f') {
                    isValid = true;
                }
                if (!isValid) {
                    return false;
                }
            }
            return true;
        }
    }

    // 6 Кол-во одинаковых элементов
    static boolean same(int[] arr1, int[] arr2) {
        if (arr1.length >= 1 && arr2.length >= 1) {
            int count1 = 0;
            int count2;
            int i;

            for(count2 = 0; count2 < arr1.length; ++count2) {
                for(i = 0; i < arr1.length && arr1[count2] != arr1[i]; ++i) {
                }
                if (count2 == i) {
                    ++count1;
                }
            }
            count2 = 0;

            for(i = 0; i < arr2.length; ++i) {
                int j;
                for(j = 0; j < arr2.length && arr2[i] != arr2[j]; ++j) {
                }
                if (i == j) {
                    ++count2;
                }
            }
            return (count1 == count2);
        } else {
            return false;
        }
    }

    // 7 Капрекар
    static boolean isKaprekar(int n) {
        if (n != 0 && n != 1) {
            int n2 = n * n;
            int temp = n2;

            int nlen;
            for(nlen = 1; (temp /= 10) > 0; ++nlen) {
            }

            int leftPart = nlen / 2;
            int rightPart = nlen - leftPart;
            int rightNum = (int)((double)n2 % Math.pow(10.0D, (double)rightPart));
            int leftNum = (int)((double)n2 / Math.pow(10.0D, (double)rightPart));
            return n == leftNum + rightNum;
        } else {
            return true;
        }
    }

    // 8 Самая длинная последовательность нулей
    static String longestZero(String arg) {
        char[] argB = arg.toCharArray();
        int maxLen = 1;
        int idxS = 0;
        int idxE = 1;

        for(int i = 0; i < argB.length - 1; ++i) {
            if (argB[i] == '0' && argB[i] == argB[i + 1]) {
                int j = i;

                int len;
                for(len = 1; argB[i] == argB[j++] & j < argB.length; ++len) {
                }

                if (len > maxLen) {
                    maxLen = len;
                    idxS = i;
                    idxE = j;
                }

                i = j - 1;
            }
        }
        if (idxS == 0 & idxE == 0 & arg.endsWith("0")) {
            idxS = arg.length() - 1;
            idxE = arg.length();
        }

        return arg.substring(idxS, idxE - 1);
    }

    // 9 Следующее простое
    static int nextPrime(int num) {
        int enters = 0;
        int i;

        for(i = 1; i < num; ++i) {
            if (num % i == 0) {
                ++enters;
            }
        }

        if (enters == 1) {
            return num;
        } else {
            ++num;
            while(true) {
                enters = 0;
                for(i = 1; i < num; ++i) {
                    if (num % i == 0) {
                        ++enters;
                    }
                }
                if (enters == 1) {
                    return num;
                }
                ++num;
            }
        }
    }

    // 10 Являются ли ребрами прямоугольного треугольника
    static boolean rightTriangle(int x, int y, int z) {
        if (Math.abs(Math.sqrt((double)(x * x + y * y)) - (double)z) < 1.0E-7D) {
            return true;
        } else if (Math.abs(Math.sqrt((double)(y * y + z * z)) - (double)x) < 1.0E-7D) {
            return true;
        } else {
            return Math.abs(Math.sqrt((double)(x * x + z * z)) - (double)y) < 1.0E-7D;
        }
    }
}
