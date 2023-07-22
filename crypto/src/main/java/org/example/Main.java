package org.example;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрий день! Введіть будь ласка шлях до вашохо файлу");
        String path = scanner.nextLine();
        if (isValidFilePath(path)) {
            System.out.println("Путь к файлу верный.");
        } else {
            System.out.println("Путь к файлу неверный.");
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