import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<HashSet<Integer>> Rules = null; // Adjacency rules
        FileReader in = null; 

        try {
            in = new FileReader("rules.txt");
            Rules = readRules(in);
        } 
        catch (FileNotFoundException e){
            System.out.println("Rule file not found. Please name file 'rules.txt'.");
            e.printStackTrace();
        }
        

        int Entropy = 0;


        while (Entropy != 0) {

        }
    }

    public static ArrayList<HashSet<Integer>> readRules(FileReader file) {
        
    }
}
