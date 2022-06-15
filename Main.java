import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ruleset> Rules = null; // Adjacency rules
        Scanner in = null;
        File file = null;

        try {
            file = new File("rules.txt");
            in = new Scanner(file);
            Rules = readRules(in);
            in.close();
        } 
        catch (Exception e){
            System.out.println("File input error");
            e.printStackTrace();
        }
    }

    public static ArrayList<Ruleset> readRules(Scanner file) {
        int N = file.nextInt(); // Number of modules
        String temp = file.next();
        ArrayList<Ruleset> rules = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            Ruleset ruleset = new Ruleset(i);
            // Data cleanup
            String token = file.nextLine();
            String[] tokens = token.split(",");
            int idx = 0;

            while (tokens[idx] != "*") {
                ruleset.setNorth(Integer.parseInt(tokens[idx]));
                idx++;
            }
            idx++;
            while (tokens[idx] != "*") {
                ruleset.setEast(Integer.parseInt(tokens[idx]));
            }
            idx++;
            while (tokens[idx] != "*") {
                ruleset.setSouth(Integer.parseInt(tokens[idx]));
                idx++;
            }
            idx++;
            while (tokens[idx] != "*") {
                ruleset.setWest(Integer.parseInt(tokens[idx]));
            }
            rules.add(ruleset);
        }
        return rules;
    }
}
