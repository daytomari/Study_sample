package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Sample04 {
    public static void main(String[] args) throws IOException {
        try {
//            Path path = Path.of(first:"JavaCourse.txt");
//            Files.writeString(path, "Javaコース楽しい！", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("例外が発生しました。");
        } finally {
            System.out.println("無事に処理が終了しました。");
        }
    }
}
