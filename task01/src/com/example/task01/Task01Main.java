package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int answer = 0;
        int n = 0;

        try {
            while ((n = inputStream.read()) != -1) {
                answer = Integer.rotateLeft(answer, 1) ^ n;
            }
            return answer;
        } catch (IOException e) {
            throw new IOException(e);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }
}
