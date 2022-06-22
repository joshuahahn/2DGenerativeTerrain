import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        // Initial states
        final int N = 4;
        final int M = 3;
        List<Integer> AllStates = new ArrayList<>(List.of(0,1,2,3,4));
        

        ArrayList<Ruleset> Rules = null; // Adjacency rules
        Scanner in = null;
        File file = null;

        try {
            file = new File("rules.txt");
            in = new Scanner(file);
            Rules = readRules(in);
            in.close();
            System.out.println("Ruleset Input Complete");
        } 
        catch (Exception e){
            System.out.println("File input error");
            e.printStackTrace();
        }

        // Create NxM array that stores possible states of each tile
        // Also store entropy of ecah tile
        List<List<Set<Integer>>> States = new ArrayList<List<Set<Integer>>>(N);

        // Initialize all cells in States with all possible states.
        for (int i = 0; i < N; i++) {
            List<Set<Integer>> columns = new ArrayList<>(M);
            for (int j = 0; j < M; j++) {
                columns.add(new HashSet<>(AllStates));
            }
            States.add(columns);
        }

        // TODO: Initial state modification

        // Entropy = total number of possible states
        int Entropy = findEntropy(States);
        System.out.println(Entropy);
        
    }

    public static ArrayList<Ruleset> readRules(Scanner file) {
        int N = file.nextInt(); // Number of modules
        ArrayList<Ruleset> rules = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            Ruleset ruleset = new Ruleset(i);
            // Data cleanup
            String token = file.next();
            String[] tokens = token.split(",");
            int idx = 0;

            while (!tokens[idx].equals("*")) {
                ruleset.setNorth(Integer.parseInt(tokens[idx]));
                idx++;
            }
            idx++;
            while (!tokens[idx].equals("*")) {
                ruleset.setEast(Integer.parseInt(tokens[idx]));
                idx++;
            }
            idx++;
            while (!tokens[idx].equals("*")) {
                ruleset.setSouth(Integer.parseInt(tokens[idx]));
                idx++;
            }
            idx++;
            while (!tokens[idx].equals("*")) {
                ruleset.setWest(Integer.parseInt(tokens[idx]));
                idx++;
            }
            rules.add(ruleset);
        }
        return rules;
    }

    public static int findEntropy(List<List<Set<Integer>>> tiles) {
        int res = 0;
        for (List<Set<Integer>> col : tiles) {
            for (Set<Integer> cell : col) {
                res += cell.size();
            }
        }
        return res;
    }
}
