package positionHierarchy;

import java.util.List;

public class Position {
    private String title;
    private boolean isManager;

    private Position manager;
    private List<Position> subordinates;

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", isManager=" + isManager +
                '}';
    }

    public Position(String title, boolean isManager) {
        this.title = title;
        this.isManager = isManager;
    }
}
