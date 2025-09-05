package week2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFileExample {
    public static ArrayList<String> readFile(String filename){
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e){
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lines=readFile("src/week2/file.txt");
        System.out.println(lines);
        for (String line : lines){
            System.out.println(line);
        }


        lines=readFile("src/week2/data.csv");
        System.out.println(lines);
        ArrayList<String> why=new ArrayList<>();
        for (String line : lines){
            why= new ArrayList(Arrays.asList( line.split(",")));
        }
        int anInt=Integer.parseInt(why.get(1));
        System.out.println(anInt);
    }
}
