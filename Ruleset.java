import java.util.HashSet;
import java.util.ArrayList;
import java.lang.StringBuilder;

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("North: ");
        for (Integer i : rules.get(0)) {
            sb.append(i);
            sb.append(", ");
        }
        sb.append("East: ");
        for (Integer i : rules.get(1)) {
            sb.append(i);
            sb.append(", ");
        }
        sb.append("South: ");
        for (Integer i : rules.get(2)) {
            sb.append(i);
            sb.append(", ");
        }
        sb.append("West: ");
        for (Integer i : rules.get(3)) {
            sb.append(i);
            sb.append(", ");
        }
        return sb.toString();
    }
}
