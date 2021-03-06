package com.astralprojection.Interface;

import java.text.MessageFormat;
import java.util.Scanner;

public class CommandLineInterface {
    final static Scanner scanner = new Scanner(System.in);

    public static float numberFloatQuestion(String question, int min, int max) {
        float inputValue = 0;

        try {
            while (true) {
                System.out.print(question);
                inputValue = scanner.nextFloat();
                if (inputValue >= min && inputValue <= max) {
                    break;
                }
                System.out.print(MessageFormat.format("\nWARNING\nYou did not enter a number in the range of {0} to {1}\n\n", min, max));
            }
            return inputValue;
        } catch (Exception e) {
            System.out.println("\nYou must correct data types");
            return numberFloatQuestion(question, min, max);
        }
    };

    public static float numberFloatQuestion(String question) {
        float inputValue = 0;

        try {
            System.out.print(question);
            inputValue = scanner.nextFloat();

            return inputValue;
        } catch (Exception e) {
            System.out.println("\nYou must correct data types");
            return numberFloatQuestion(question);
        }
    };

    public static byte numberByteQuestion(String question, int min, int max) {
        byte inputValue = 0;

        try {
            while (true) {
                System.out.print(question);
                inputValue = scanner.nextByte();
                if (inputValue >= min && inputValue <= max) {
                    break;
                }
                System.out.print(MessageFormat.format("\nWARNING\nYou did not enter a number in the range of {0} to {1}\n\n", min, max));
            }
            return inputValue;
        } catch (Exception e) {
            System.out.println("\nYou must correct data types");
            return numberByteQuestion(question, min, max);
        }
    };

    public static byte numberByteQuestion(String question) {
        byte inputValue = 0;

        try {
            System.out.print(question);
            inputValue = scanner.nextByte();

            return inputValue;
        } catch (Exception e) {
            System.out.println("\nYou must correct data types");
            return numberByteQuestion(question);
        }
    };

    public static String stringQuestion(String question) {
        String inputValue = "";

        try {
            while (true) {
                System.out.print(question);
                inputValue = scanner.nextLine();
                if (inputValue.trim() != "") {
                    break;
                }
                System.out.print("\nWARNING\nYou Can Not Enter An Empty String");
            }
            return inputValue;
        } catch (Exception e) {
            System.out.println("\nYou must correct data types");
            return stringQuestion(question);
        }
    };

}
