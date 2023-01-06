import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayerState state;
    private List<PlayerState> memento = new ArrayList<PlayerState>();

    public Player() {
        this.state = PlayerStateIdle.getInstance();
    }

    public void setState(PlayerState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public List<PlayerState> getStates() {
        return this.memento;
    }

    public void redoState(int index){
        if(index < 0 || index > this.memento.size() - 1){
            throw new IllegalArgumentException("Invalid Index");
        }
        this.state = this.memento.get(index);
    }

    public PlayerState getState() {
        return this.state;
    }
}
