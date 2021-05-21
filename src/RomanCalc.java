public class RomanCalc {


    public static int getNumInArab(String romanNum){


        int arabNum = 0;
        switch (romanNum) {
            case "I":
                arabNum = 1;
                break;
            case "II":
                arabNum = 2;
                break;
            case "III":
                arabNum = 3;
                break;
            case "IV":
                arabNum = 4;
                break;
            case "V":
                arabNum = 5;
                break;
            case "VI":
                arabNum = 6;
                break;
            case "VII":
                arabNum = 7;
                break;
            case "VIII":
                arabNum = 8;
                break;
            case "IX":
                arabNum = 9;
                break;
            case "X":
                arabNum = 10;
                break;

            default: arabNum = 0;


        }
        return arabNum;
    }

    public static String getRomanConvertor(int arabNum){
        String romanNum = "";
        while (arabNum>=100){
            romanNum = "C";
            arabNum = arabNum - 100;
        }
        while (arabNum>=90){
            romanNum = (romanNum + "XC");
            arabNum = arabNum - 90;
        }
        while (arabNum>=50){
            romanNum = (romanNum + "L");
            arabNum = arabNum - 50;
        }
        while (arabNum>=40){
            romanNum = (romanNum + "X");
            arabNum = arabNum - 40;
        }
        while (arabNum>=40){
            romanNum = (romanNum + "XL");
            arabNum = arabNum - 40;
        }
        while (arabNum>=10){
            romanNum = (romanNum + "X");
            arabNum = arabNum - 10;
        }
        while (arabNum>=5){
            romanNum = (romanNum + "V");
            arabNum = arabNum - 5;
        }
        while (arabNum==4){
            romanNum = (romanNum + "IV");
            arabNum = arabNum - 4;
        }
        while (arabNum>0){
            romanNum = (romanNum + "I");
            arabNum = arabNum - 1;
        }

        return romanNum;

    }
}
