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
        ArrayList<Ruleset> rules = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            Ruleset ruleset = new Ruleset(i);
            String token = file.next();
            while (token != "*") {
                ruleset.North.add(Integer.parseInt(token));
                token = file.next();
            }
            token = file.next();
            while (token != "*") {
                ruleset.East.add(Integer.parseInt(token));
                token = file.next();
            }
            token = file.next();
            while (token != "*") {
                ruleset.South.add(Integer.parseInt(token));
                token = file.next();
            }
            token = file.next();
            while (token != "*") {
                ruleset.West.add(Integer.parseInt(token));
                token = file.next();
            }
            rules.add(ruleset);
        }
        return rules;
    }
}
