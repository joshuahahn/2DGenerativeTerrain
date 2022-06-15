import java.util.HashSet;
import java.util.ArrayList;

public class Ruleset {
    int index;

    ArrayList<HashSet<Integer>> rules;

    public Ruleset(int i) {
        this.index = i;
        rules = new ArrayList<HashSet<Integer>>(4);
        for (int j = 0; j < 4; j++) {
            HashSet<Integer> directionalRuleset = new HashSet<>();
            rules.add(directionalRuleset);
        }
    }

    public void setNorth(Integer i) {
        this.rules.get(0).add(i);
    }
    public void setEast(Integer i) {
        this.rules.get(1).add(i);
    }
    public void setSouth(Integer i) {
        this.rules.get(2).add(i);
    }
    public void setWest(Integer i) {
        this.rules.get(3).add(i);
    }
}
