public class Arithmetic {

    public static int getArabAnswer(String action, int firstElement, int secondElement) {

            int result = 0;
            switch (action) {
                case "+":
                    result = firstElement + secondElement;
                    //System.out.println(result);
                    break;
                case "-":
                    result = firstElement - secondElement;
                    //System.out.println(result);
                    break;
                case "*":
                    result = firstElement * secondElement;
                    //System.out.println(result);
                    break;
                case "/":
                    result = firstElement / secondElement;
                    //System.out.println(result);
                    break;

            }


            return result;




    }



}
