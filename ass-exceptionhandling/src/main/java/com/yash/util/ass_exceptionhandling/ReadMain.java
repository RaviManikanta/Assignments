package com.yash.util.ass_exceptionhandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadMain {
    public static void main(String[] args) throws IOException {
        String versionString = readStreamOfLinesUsingFiles();
        System.out.println(versionString);
    }

    public static String readStreamOfLinesUsingFiles() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("App.java", "ListOfNumbers"));
        Optional<String> versionString = lines.filter(s -> s.contains("Bundle-Version:")).map(e-> e.substring(15).trim()).findFirst();

        lines.close();
        if (versionString.isPresent())
        {
            return versionString.get();
        }
        return "";
    }
}