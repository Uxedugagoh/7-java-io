package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        try (Scanner scanner = new Scanner(new FileInputStream("task03/src/com/example/task03/input.test"), StandardCharsets.US_ASCII)) {
            scanner.useDelimiter("\\A");
            System.out.println(scanner.next());
        }
        // Почему то инпут из файла не работает. Тесты работают.
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        try (Scanner scanner = new Scanner(inputStream, charset)) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        } catch (
                RuntimeException e) { // Думал про nullPointException, взял этот потому что все NPE будут Runtime. вроде.
            throw new IllegalArgumentException("cannot be null", e);
        }
    }
}
