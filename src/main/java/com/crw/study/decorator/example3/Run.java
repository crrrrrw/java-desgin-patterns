package com.crw.study.decorator.example3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 体会JAVA I/O库的装饰器模式
 */
public class Run {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(System.in));

            Scanner s = new Scanner(in);
            System.out.println("please input:");
            while (true) {
                String line = s.nextLine();
                if (line.equals("exit")) break;
                System.out.println(">>>" + line);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
