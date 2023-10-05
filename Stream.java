import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StreamComparator> {

    private int streamNum;
    private List<StreamComparator> groups;

    public Stream(int streamNum) {
        this.streamNum = streamNum;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StreamComparator group) {
        this.groups.add(group);
    }

    public int getStreamNum() {
        return streamNum;
    }

    public List<StreamComparator> getGroups() {
        return groups;
    }

    public Iterator<StreamComparator> iterator() {
        return groups.iterator();
    }
}