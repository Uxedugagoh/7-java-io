package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test


        try (InputStream in = new FileInputStream("task02/src/com/example/task02/input.test")) {
            int read;
            while ((read = in.read()) != -1) {
                if (read == 13) {
                    int prev = read;
                    int next = in.read();
                    if (next == 10) {
                        System.out.write(10);
                    } else {
                        System.out.write(13);
                        if (next != -1) {
                            System.out.write(next);
                        }
                    }
                } else {
                    System.out.write(read);
                }
            }
            System.out.flush();
        }
    }
}
