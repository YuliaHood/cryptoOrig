package org.example;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidPath = false;

        System.out.println("Добрий день! Введіть будь ласка шлях до вашохо файлу");
        String path = scanner.nextLine();

        while(!isValidPath) {
            if (isValidFilePath(path)) {
                isValidPath = true;
            }else {
                System.out.println("Путь до файлу не вірний( спробуйте будь ласка ще раз!");
            }
        }

        System.out.println("Тепер введіть ключ " + "(Обовязково число!)");
        char userInput = scanner.next().charAt(0);

        if (!Character.isDigit(userInput)) {
            System.out.println("Введіть будь ласка саме число!");
        }
        int key = (int) userInput;

        System.out.println("Оберіть що саме ви хочете зробити з данними файлу :" +
                "Якщо ви хочете зашифрувати данні шифром Цезаря , введіть " + "+" +
                "Якщо ви хочете розшифрувати данні шифром Цезаря , введіть " + "-");

        String userSign = scanner.nextLine();
        if(userSign.equals("+")){

        } else if (userSign.equals("-")) {

        }else {
            System.out.println("Введіть вірний символ!");
        }
    }
    public static boolean isValidFilePath(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.exists(path) && Files.isRegularFile(path) && Files.isReadable(path);
        } catch (InvalidPathException e) {
            return false;
        }
    }

}