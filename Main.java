package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        Scanner in = new Scanner(System.in);
        do {

            do {
                System.out.print("Введите номер группы заданий (1-6): ");
                input = in.nextInt();
                if (input < 0 || input > 6) System.out.println("Ошибка, введите число от 1 до 6 !");
            } while (input < 0 || input > 6);
            System.out.println();

            switch (input) {
                case 1:
                    System.out.println("Задание 1:");
                    System.out.println("mod(1,3) -> " + TasksGroup1.mod(1, 3));
                    System.out.println("mod(-9,45) -> " + TasksGroup1.mod(-9, 45));
                    System.out.println("mod(5,5) -> " + TasksGroup1.mod(5, 5));

                    System.out.println("Задание 2:");
                    System.out.println("triangleArea(3,2) -> " + TasksGroup1.triangleArea(3, 2));
                    System.out.println("triangleArea(7,4) -> " + TasksGroup1.triangleArea(7, 4));
                    System.out.println("triangleArea(10,10) -> " + TasksGroup1.triangleArea(10, 10));

                    System.out.println("Задание 3:");
                    System.out.println("animalLegs(2,3,5) -> " + TasksGroup1.animalLegs(2, 3, 5));
                    System.out.println("animalLegs(1,2,3) -> " + TasksGroup1.animalLegs(1, 2, 3));
                    System.out.println("animalLegs(5,2,8) -> " + TasksGroup1.animalLegs(5, 2, 8));

                    System.out.println("Задание 4:");
                    System.out.println("profitableGambleCheck(0.2,50,9) -> " + TasksGroup1.profitableGambleCheck(0.2, 50, 9));
                    System.out.println("profitableGambleCheck(0.9,1,2) -> " + TasksGroup1.profitableGambleCheck(0.9, 1, 2));
                    System.out.println("profitableGambleCheck(0.9,3,2) -> " + TasksGroup1.profitableGambleCheck(0.9, 3, 2));

                    System.out.println("Задание 5:");
                    System.out.println("operationCheck(24,15,9) -> " + TasksGroup1.operationCheck(24, 15, 9));
                    System.out.println("operationCheck(24,26,2) -> " + TasksGroup1.operationCheck(24, 26, 2));
                    System.out.println("operationCheck(15,11,11) -> " + TasksGroup1.operationCheck(15, 11, 11));

                    System.out.println("Задание 6:");
                    System.out.println("ASCII('A') -> " + TasksGroup1.ASCII('A'));
                    System.out.println("ASCII('m') -> " + TasksGroup1.ASCII('m'));
                    System.out.println("ASCII('[') -> " + TasksGroup1.ASCII('['));
                    System.out.println("ASCII('\\') -> " + TasksGroup1.ASCII('\\'));

                    System.out.println("Задание 7:");
                    System.out.println("addUpTO(3) -> " + TasksGroup1.addUpTo(3));
                    System.out.println("addUpTO(10) -> " + TasksGroup1.addUpTo(10));
                    System.out.println("addUpTO(7) -> " + TasksGroup1.addUpTo(7));

                    System.out.println("Задание 8:");
                    System.out.println("thirdEdge(8,10) -> " + TasksGroup1.thirdEdge(8, 10));
                    System.out.println("thirdEdge(5,7) -> " + TasksGroup1.thirdEdge(5, 7));
                    System.out.println("thirdEdge(9,2) -> " + TasksGroup1.thirdEdge(9, 2));

                    System.out.println("Задание 9:");
                    int[] array191 = {1, 5, 9};
                    int[] array192 = {2};
                    int[] array193 = {};
                    System.out.println("sumOfCubes([1,5,9]) -> " + TasksGroup1.sumOfCubes(array191));
                    System.out.println("sumOfCubes([2]) -> " + TasksGroup1.sumOfCubes(array192));
                    System.out.println("sumOfCubes([]) -> " + TasksGroup1.sumOfCubes(array193));

                    System.out.println("Задание 10:");
                    System.out.println("abcMath(5,2,1) -> " + TasksGroup1.abcMath(5, 2, 1));
                    System.out.println("abcMath(1,2,3) -> " + TasksGroup1.abcMath(1, 2, 3));
                    break;


                case 2:
                    System.out.println("Задание 1:");
                    System.out.println("repeat(\"nice\", 5) -> " + TasksGroup2.repeat("nice", 5));
                    System.out.println("repeat(\"HelloWorld\", 3) -> " + TasksGroup2.repeat("HelloWorld", 3));
                    System.out.println("repeat(\"stop\", 1) -> " + TasksGroup2.repeat("stop", 1));

                    System.out.println("Задание 2:");
                    int[] array221 = {10, 4, 1, 4, -10, -50, 32, 21};
                    System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> " + TasksGroup2.differenceMaxMin(array221));
                    int[] array222 = {44, 32, 86, 19};
                    System.out.println("differenceMaxMin([44, 32, 86, 19]) -> " + TasksGroup2.differenceMaxMin(array222));

                    System.out.println("Задание 3:");
                    int[] array231 = {1, 3};
                    System.out.println("isAvgWhole([1, 3]) -> " + TasksGroup2.isAvgWhole(array231));
                    int[] array232 = {1, 2, 3, 4};
                    System.out.println("isAvgWhole([1, 2, 3, 4]) -> " + TasksGroup2.isAvgWhole(array232));

                    System.out.println("Задание 4:");
                    int[] array241 = {1, 2, 3};
                    array241 = TasksGroup2.cumulativeSum(array241);
                    System.out.println("cumulativeSum([1, 3]) -> " + Arrays.toString(array241));
                    int[] array242 = {3, 3, -2, 408, 3, 3};
                    array242 = TasksGroup2.cumulativeSum(array242);
                    System.out.println("cumulativeSum([3, 3, -2, 408, 3, 3]) -> " + Arrays.toString(array242));

                    System.out.println("Задание 5:");
                    System.out.println("getDecimalPlaces(\"43.20\") -> " + TasksGroup2.getDecimalPlaces("43.20"));
                    System.out.println("getDecimalPlaces(\"400\") -> " + TasksGroup2.getDecimalPlaces("400"));
                    System.out.println("getDecimalPlaces(\"3.1\") -> " + TasksGroup2.getDecimalPlaces("3.1"));

                    System.out.println("Задание 6:");
                    System.out.println("fibonacci(3) -> " + TasksGroup2.fibonacci(3));
                    System.out.println("fibonacci(7) -> " + TasksGroup2.fibonacci(7));
                    System.out.println("fibonacci(12) -> " + TasksGroup2.fibonacci(12));

                    System.out.println("Задание 7:");
                    System.out.println("isValid(\"59001\") -> " + TasksGroup2.isValid("59001"));
                    System.out.println("isValid(\"853a7\") -> " + TasksGroup2.isValid("853a7"));
                    System.out.println("isValid(\"732 32\") -> " + TasksGroup2.isValid("732 32"));
                    System.out.println("isValid(\"393939\") -> " + TasksGroup2.isValid("393939"));

                    System.out.println("Задание 8:");
                    System.out.println("isStrangePair(\"bush\",\"hubris\") -> " + TasksGroup2.isStrangePair("ratio","orator"));
                    System.out.println("isStrangePair(\"bush\",\"hubris\") -> " + TasksGroup2.isStrangePair("bush","hubris"));
                    System.out.println("isStrangePair(\"\",\"\") -> " + TasksGroup2.isStrangePair("",""));

                    System.out.println("Задание 9:");
                    System.out.println("isPrefix(\"automation\",\"auto\") -> " + TasksGroup2.isPrefix("automation","auto"));
                    System.out.println("isPrefix(\"arachnophobia\",\"phobia\") -> " + TasksGroup2.isPrefix("arachnophobia","phobia"));
                    System.out.println("isSuffix(\"arachnophobia\",\"phobia\") -> " + TasksGroup2.isSuffix("arachnophobia","phobia"));
                    System.out.println("isSuffix(\"retrospect\",\"sub\") -> " + TasksGroup2.isSuffix("retrospect","sub"));

                    System.out.println("Задание 10:");
                    System.out.println("boxSeq(0) -> " + TasksGroup2.boxSeq(0));
                    System.out.println("boxSeq(1) -> " + TasksGroup2.boxSeq(1));
                    System.out.println("boxSeq(2) -> " + TasksGroup2.boxSeq(2));
                    break;

                case 3:
                    System.out.println("Задание 1:");
                    System.out.println("solutions(1, 0, -1) -> " + TasksGroup3.solutions(1, 0, -1));
                    System.out.println("solutions(1, 0, 0) -> " + TasksGroup3.solutions(1, 0, 0));
                    System.out.println("solutions(1, 0, 1) -> " + TasksGroup3.solutions(1, 0, 1));

                    System.out.println("Задание 2:");
                    System.out.println("findZip(\"all zip files are zipped\") -> " + TasksGroup3.findZip("all zip files are zipped"));
                    System.out.println("findZip(\"all zip files are compressed\") -> " + TasksGroup3.findZip("all zip files are compressed"));

                    System.out.println("Задание 3:");
                    System.out.println("checkPerfect(6) -> " + TasksGroup3.checkPerfect(6));
                    System.out.println("checkPerfect(28) -> " + TasksGroup3.checkPerfect(28));
                    System.out.println("checkPerfect(496) -> " + TasksGroup3.checkPerfect(496));
                    System.out.println("checkPerfect(12) -> " + TasksGroup3.checkPerfect(12));

                    System.out.println("Задание 4:");
                    System.out.println("flipEndChars(\"ada\") -> " + TasksGroup3.flipEndChars("ada"));
                    System.out.println("flipEndChars(\"Ada\") -> " + TasksGroup3.flipEndChars("Ada"));
                    System.out.println("flipEndChars(\"z\") -> " + TasksGroup3.flipEndChars("z"));

                    System.out.println("Задание 5:");
                    System.out.println("isValidHexCode(\"#CD5C58C\") -> " + TasksGroup3.isValidHexCode("#CD5C58C"));
                    System.out.println("isValidHexCode(\"#EAECEE\") -> " + TasksGroup3.isValidHexCode("#EAECEE"));
                    System.out.println("isValidHexCode(\"CD5C58C\") -> " + TasksGroup3.isValidHexCode("CD5C58C"));

                    System.out.println("Задание 6:");
                    int[] array361 = {1,3,4,4,4};
                    int[] array362 ={2,5,7};
                    System.out.println("same([1,3,4,4,4], [2,5,7]) -> " + TasksGroup3.same(array361,array362));

                    System.out.println("Задание 7:");
                    System.out.println("isKaprekar(3) -> " + TasksGroup3.isKaprekar(3));
                    System.out.println("isKaprekar(5) -> " + TasksGroup3.isKaprekar(5));
                    System.out.println("isKaprekar(297) -> " + TasksGroup3.isKaprekar(297));

                    System.out.println("Задание 8:");
                    System.out.println("longestZero(\"100100100\") -> " + TasksGroup3.longestZero("100100100"));
                    System.out.println("longestZero(\"11111\") -> " + TasksGroup3.longestZero("11111"));

                    System.out.println("Задание 9:");
                    System.out.println("nextPrime(12) -> " + TasksGroup3.nextPrime(12));
                    System.out.println("nextPrime(24) -> " + TasksGroup3.nextPrime(24));
                    System.out.println("nextPrime(11) -> " + TasksGroup3.nextPrime(11));

                    System.out.println("Задание 10:");
                    System.out.println("rightTriangle(3,4,5) -> " + TasksGroup3.rightTriangle(3,4,5));
                    System.out.println("rightTriangle(145,105,100) -> " + TasksGroup3.rightTriangle(145,105,100));
                    System.out.println("rightTriangle(70,30,110) -> " + TasksGroup3.rightTriangle(70,30,110));
                    break;

                case 4:
                    System.out.println("Задание 1:");
                    String Bessie = "hello my name is Bessie and this is my essay";
                    System.out.println("formate(\"hello my name is Bessie and this is my essay\") -> \n" + TasksGroup4.formate(7,Bessie));

                    System.out.println("Задание 2:");
                    System.out.println("split(\"()()()\") -> " + Arrays.toString(TasksGroup4.split("()()()")));
                    System.out.println("split(\"((()))\") -> " + Arrays.toString(TasksGroup4.split("((()))")));

                    System.out.println("Задание 3:");
                    System.out.println("toCamelCase(\"helloEdabit\") -> " + TasksGroup4.toCamelCase("helloEdabit"));
                    System.out.println("toCamelCase(\"hello_edabit\") -> " + TasksGroup4.toCamelCase("hello_edabit"));
                    System.out.println("toSnakeCase(\"is_modal_open\") -> " + TasksGroup4.toSnakeCase("is_modal_open"));
                    System.out.println("toSnakeCase(\"getColor\") -> " + TasksGroup4.toSnakeCase("getColor"));

                    System.out.println("Задание 4:");
                    double[] array441 = {9, 17, 30, 1.5};
                    double[] array442 = {16, 18, 30, 1.8};
                    double[] array443 = {13.25, 15, 30, 1.5};
                    System.out.println("overTime([9, 17, 30, 1.5]) -> " + TasksGroup4.overTime(array441));
                    System.out.println("overTime([16, 18, 30, 1.8]) -> " + TasksGroup4.overTime(array442));
                    System.out.println("overTime([13.25, 15, 30, 1.5]) -> " + TasksGroup4.overTime(array443));

                    System.out.println("Задание 5:");
                    System.out.println("BMI(\"205 pounds\",\"73 inches\") -> " + TasksGroup4.BMI("205 pounds","73 inches"));
                    System.out.println("BMI(\"55 kilos\",\"1.65 meters\") -> " + TasksGroup4.BMI("55 kilos","1.65 meters"));
                    System.out.println("BMI(\"154 pounds\",\"2 meters\") -> " + TasksGroup4.BMI("154 pounds","2 meters"));

                    System.out.println("Задание 6:");
                    System.out.println("bugger(39) -> " + TasksGroup4.bugger(39));
                    System.out.println("bugger(999) -> " + TasksGroup4.bugger(999));
                    System.out.println("bugger(4) -> " + TasksGroup4.bugger(4));

                    System.out.println("Задание 7:");
                    System.out.println("toStarShorthand(\"abbccc\") -> " + TasksGroup4.toStarShorthand("abbccc"));
                    System.out.println("toStarShorthand(\"77777geff\") -> " + TasksGroup4.toStarShorthand("77777geff"));
                    System.out.println("toStarShorthand(\"abc\") -> " + TasksGroup4.toStarShorthand("abc"));

                    System.out.println("Задание 8:");
                    System.out.println("doesRhyme(\"Sam I am!\",\"Green eggs and ham\") -> " + TasksGroup4.doesRhyme("Sam I am!","Green eggs and ham"));
                    System.out.println("doesRhyme(\"You are off to the races!\",\"a splendid day\") -> " + TasksGroup4.doesRhyme("You are off to the races!","a splendid day"));

                    System.out.println("Задание 9:");
                    System.out.println("trouble(1222345, 12345) -> " + TasksGroup4.trouble(1222345, 12345));
                    System.out.println("trouble(666789, 12345667) -> " + TasksGroup4.trouble(666789, 12345667));

                    System.out.println("Задание 10:");
                    System.out.println("countUniqueBooks(\"AZYWABBCATTTA\",'A') -> " + TasksGroup4.countUniqueBooks("AZYWABBCATTTA",'A'));
                    System.out.println("countUniqueBooks(\"ZZABCDEF\",'Z') -> " + TasksGroup4.countUniqueBooks("ZZABCDEF",'Z'));
                    break;

                case 5:
                    System.out.println("Задание 1:");
                    System.out.println("encrypt(\"Hello\") -> " + Arrays.toString(TasksGroup5.encrypt("Hello")));
                    System.out.println("encrypt(\"Sunshine\") -> " + Arrays.toString(TasksGroup5.encrypt("Sunshine")));
                    int[] array511 ={72,33,-73,84,-12,-3,13,-13,-68};
                    System.out.println("decrypt([72, 33, -73, 84, -12, -3, 13, -13, -68]) -> " + TasksGroup5.decrypt(array511));

                    System.out.println("Задание 2:");
                    System.out.println("canMove(\"Rook\",\"A8\",\"H8\") -> " + TasksGroup5.canMove("Rook","A8","H8"));
                    System.out.println("canMove(\"Bishop\",\"A7\",\"G1\") -> " + TasksGroup5.canMove("Bishop","A7","G1"));
                    System.out.println("canMove(\"Queen\",\"C4\",\"D6\") -> " + TasksGroup5.canMove("Queen","C4","D6"));

                    System.out.println("Задание 3:");
                    System.out.println("canComplete(\"butl\",\"beautiful\") -> " + TasksGroup5.canComplete("butl","beautiful"));
                    System.out.println("canComplete(\"butlz\",\"beautiful\") -> " + TasksGroup5.canComplete("butlz","beautiful"));
                    System.out.println("canComplete(\"tulb\",\"beautiful\") -> " + TasksGroup5.canComplete("tulb","beautiful"));
                    System.out.println("canComplete(\"bbutl\",\"beautiful\") -> " + TasksGroup5.canComplete("bbutl","beautiful"));

                    System.out.println("Задание 4:");
                    int[] array541 ={16, 28};
                    System.out.println("sumDigProd(16, 28) -> " + TasksGroup5.sumDigProd(array541));
                    int[] array542 ={0};
                    System.out.println("sumDigProd(0) -> " + TasksGroup5.sumDigProd(array542));
                    int[] array543 ={1,2,3,4,5,6};
                    System.out.println("sumDigProd(1,2,3,4,5,6) -> " + TasksGroup5.sumDigProd(array543));

                    System.out.println("Задание 5:");
                    String[] array551 = {"toe","ocelot", "maniac"};
                    System.out.println("sameVowelGroup([\"toe\",\"ocelot\", \"maniac\"]) -> " + Arrays.toString(TasksGroup5.sameVowelGroup(array551)));
                    String[] array552 = {"many","carriage","emit","apricot","animal"};
                    System.out.println("sameVowelGroup([\"many\",\"carriage\",\"emit\",\"apricot\",\"animal\"]) -> " + Arrays.toString(TasksGroup5.sameVowelGroup(array552)));

                    System.out.println("Задание 6:");
                    System.out.println("validateCard(1234567890123456) -> " + TasksGroup5.validateCard(1234567890123456L));
                    System.out.println("validateCard(1234567890123452) -> " + TasksGroup5.validateCard(1234567890123452L));

                    System.out.println("Задание 7:");
                    System.out.println("numToEng(0) -> " + TasksGroup5.numToEng(0));
                    System.out.println("numToEng(18) -> " + TasksGroup5.numToEng(18));
                    System.out.println("numToEng(126) -> " + TasksGroup5.numToEng(126));
                    System.out.println("numToEng(909) -> " + TasksGroup5.numToEng(909));
                    System.out.println("numToRu(0) -> " + TasksGroup5.numToRu(0));
                    System.out.println("numToRu(18) -> " + TasksGroup5.numToRu(18));
                    System.out.println("numToRu(126) -> " + TasksGroup5.numToRu(126));
                    System.out.println("numToRu(909) -> " + TasksGroup5.numToRu(909));

                    System.out.println("Задание 8:");
                    System.out.println("getSha256Hash(\"password123\") -> " + TasksGroup5.getSha256Hash("password123"));
                    System.out.println("getSha256Hash(\"Fluffy@home\") -> " + TasksGroup5.getSha256Hash("Fluffy@home"));
                    System.out.println("getSha256Hash(\"Hey dude !\") -> " + TasksGroup5.getSha256Hash("Hey dude!"));

                    System.out.println("Задание 9:");
                    System.out.println("correctTitle(\"jOn Show, kINg IN thE noRth.\") -> " + TasksGroup5.correctTitle("jOn Show, kINg IN thE noRth."));
                    System.out.println("correctTitle(\"sansa stark, lady of winterfell.\") -> " + TasksGroup5.correctTitle("sansa stark, lady of winterfell."));
                    System.out.println("correctTitle(\"TYRION LANNISTER, HAND OF THE QUEEN.\") -> " + TasksGroup5.correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));

                    System.out.println("Задание 10:");
                    System.out.println("hexLattice(1) -> " + TasksGroup5.hexLattice(1));
                    System.out.println("hexLattice(7) -> " + TasksGroup5.hexLattice(7));
                    System.out.println("hexLattice(19) -> " + TasksGroup5.hexLattice(19));
                    System.out.println("hexLattice(21) -> " + TasksGroup5.hexLattice(21));


                    break;
            }

            System.out.println();
            System.out.print("Чтобы Продолжить введите 1: ");
            input = in.nextInt();
        } while (input == 1);
    }
}
