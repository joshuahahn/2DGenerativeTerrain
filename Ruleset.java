import java.util.HashSet;

public class Ruleset {
    int index;
    HashSet<Integer> North;
    HashSet<Integer> East;
    HashSet<Integer> South;
    HashSet<Integer> West;

    public Ruleset(int i) {
        this.index = i;
    }
}
