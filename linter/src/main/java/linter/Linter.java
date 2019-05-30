/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Linter {

    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("src/main/resources", "gates.js");
        jsLinter(path);

    }

    public static void jsLinter(Path path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        String result = "";
        String line = "";
        int lineNumber = 1;
        while ((line = reader.readLine()) != null) {
            //System.out.println(line);

            result += line;

            if(!line.contains(";") && (!line.contains("if") || !line.contains("else"))
                    && !line.isEmpty() && !line.contains("{") && !line.endsWith("}") && !line.startsWith("//")){
                System.err.println(String.format("Line %d: Missing semicolon.",lineNumber));
            }

            lineNumber++;
        }
    }
}