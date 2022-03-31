package pl.tworek.patryk.runLengthEncoding;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something: ");
        String str = scanner.next();
        System.out.println("Run length encoding of your word is: " + stringChallenge(str));
    }

    static String stringChallenge(String str) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i == (str.length() - 2)) {
                if(str.charAt(i) == str.charAt(i+1)) {
                    counter++;
                    sb.append(counter).append(str.charAt(i));
                    break;
                } else {
                    sb.append(counter).append(str.charAt(i));
                    counter = 1;
                    sb.append(counter).append(str.charAt(i+1));
                    break;
                }
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                    break;
                }
                if (i == (str.length() - 2)) {
                    sb.append(counter).append(str.charAt(i));
                    counter = 1;
                    break;
                }
                sb.append(counter).append(str.charAt(i));
                counter = 1;
                break;

            }
        }
        return sb.toString();
    }
}
