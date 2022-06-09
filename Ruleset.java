import java.util.HashSet;

public class Ruleset {
    private int index;
    private HashSet<Integer> North;
    private HashSet<Integer> East;
    private HashSet<Integer> South;
    private HashSet<Integer> West;

    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
    public void setNorth(Integer index) {
        North.add(index);
    }
    public void setEast(Integer index) {
        East.add(index);
    }
    public void setSouth(Integer index) {
        South.add(index);
    }
    public void setWest(Integer index) {
        West.add(index);
    }
    public HashSet<Integer> getNorth() {
        return North;
    }
    public HashSet<Integer> getEast() {
        return East;
    }
    public HashSet<Integer> getSouth() {
        return South;
    }
    public HashSet<Integer> getWest() {
        return West;
    }
}
