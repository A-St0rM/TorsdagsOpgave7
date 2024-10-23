package Task1;

public class Letters {

    public void firstSentence(String input){
        if(input.equals("J")) {
            System.out.println("J");
        }
        lastletter();
        System.out.println("a");

    }

    public static void lastletter(){
        System.out.println("a");
        System.out.println("v");
    }

    public void thirdSentence(int number){
        if(number > 1) {
            System.out.println("E");
            System.out.println("r");
        }
    }

    public void fourthSentence(String input, int number) {
        if (input.length() > 2) {
            System.out.println("S");
            if (number > 2) {
                System.out.println("j");
            }
        }
        System.out.println("o");
        System.out.println("v");
        System.out.println("t");
    }

}
