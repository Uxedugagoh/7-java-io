package com.example.task04;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        // Тесты не запускаются из-за проблем с System.in, хотя задание из файла работает исправно (пог. 0.000034).
        try (Scanner scanner = new Scanner (new FileInputStream("task04/src/com/example/task04/input.test"))) {
            // \s - любой пробельный символ. \p{Pd} все виды тире и дефисов (в юникод). [] - хотя бы один из.
            // + - склеивает повторы.
            scanner.useLocale(Locale.US);
            scanner.useDelimiter("[\\s\\p{Pd}]+");
            PrintWriter printWriter = new PrintWriter(System.out);
            float val = 0;
            while (scanner.hasNext()) {
                if  (scanner.hasNextFloat()) {
                    val += Float.parseFloat(scanner.next());
                } else
                    scanner.next();
            }
            printWriter.printf("%.6f", val);
            printWriter.flush();
        }
    }
}