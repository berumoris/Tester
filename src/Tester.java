import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("ИСТРУКЦИЯ");
        System.out.println("_____________");
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.");
        System.out.println("Калькулятор понимает только римские и целые арабские числа от 1 до 10 (от I до X)");
        System.out.println("Запрещено склаывать римские числа с арабскими. Отделяйте пробелами числа от арифметического символа");
        System.out.println("______________________________________________");

        System.out.print("Введите выражение для вычислений:");
        String line = in.nextLine();
        // System.out.println(line);
        String[] arr = line.split(" ");

        boolean arabMatches = Pattern.matches("\\d{1,2}\\s\\W\\s\\d{1,2}", line);
        if (arabMatches == true) {

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

                    if(a>0 & a<11 & b>0 & b<11){
                        if (arr[1].equals("+") | arr[1].equals("-") | arr[1].equals("*") | arr[1].equals("/")){
                            int answerArab = Arithmetic.getArabAnswer(arr[1], a, b);
                            System.out.println(answerArab);
                        }

        }
                    else{
                        System.err.println("Одно или два введенных числа меньше 1 или больше 10");
                    }
        }

        else {

            Pattern pattern = Pattern.compile("[vix]{1,3}\\s\\W\\s[vix]{1,3}",Pattern.CASE_INSENSITIVE);
            Matcher romanMatches = pattern.matcher(line);
            boolean rome = romanMatches.matches();

            if (rome == true) {
                String firsRomanNum = arr[0].toUpperCase();
                String secondRomanNum = arr[2].toUpperCase();

                if (firsRomanNum.contains("I") | firsRomanNum.contains("II") | firsRomanNum.contains("III") | firsRomanNum.contains("IV") | firsRomanNum.contains("V") | firsRomanNum.contains("VI") | firsRomanNum.contains("VII") | firsRomanNum.contains("VIII") | firsRomanNum.contains("IX") | firsRomanNum.contains("X"))
                {
                    if (secondRomanNum.contains("I") | secondRomanNum.contains("II") | secondRomanNum.contains("III") | secondRomanNum.contains("IV") | secondRomanNum.contains("V") | secondRomanNum.contains("VI") | secondRomanNum.contains("VII") | secondRomanNum.contains("VIII") | secondRomanNum.contains("IX") | secondRomanNum.contains("X"))
                        {

                                int firstArabNum = RomanCalc.getNumInArab(firsRomanNum);
                                int secondArabNum = RomanCalc.getNumInArab(secondRomanNum);
                                    if(firstArabNum!=0) {
                                        int answerArab = Arithmetic.getArabAnswer(arr[1], firstArabNum, secondArabNum);
                                        String romanAnswer = RomanCalc.getRomanConvertor(answerArab);
                                        System.out.println(romanAnswer);
                                    }
                                    else{
                                        System.err.println("Одно или два введенных числа меньше I или больше X");
                                    }
                        }
                    }
            }
            else {
                System.err.println("Вы ввели некорректное выражение. Ознакомьтесь с инструкцией к калькулятору");
            }
        }
    }
}















            /*public class Tester {
    enum Rome {I, II, III, IV, V, VI, VII, VIII, IX, X}
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение для вычисления:");


        String line = in.nextLine();
        int a, b;
        String c, d;

    String[] arr = line.split(" ");

    if (arr[0]==null | arr[1]==null | arr[2]==null)
    {
        System.out.println("Выражение записано неверно");
    }
        if (arr[0].contains(".") | arr[2].contains(".")){
            System.out.println("Калькулятор умеет работать только с целыми числами");
            System.exit(0);
        }


        try {
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[2]);

                if (a < 1 | a > 10 | b < 1 | b > 10){
                    System.out.println("Введенные числа больше 10 или меньше 1");
                }

        } catch (NumberFormatException e) {

            System.out.println("aSDV");
            }

        }



            }*/




