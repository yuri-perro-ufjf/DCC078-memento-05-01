public abstract class PlayerState {
    public abstract String getState();

    public boolean idle(Player player) {
        return false;
    }
    public boolean work(Player player) {
        return false;
    }
    public boolean sleep(Player player) {
        return false;
    }
    public boolean eat(Player player) {
        return false;
    }
    public boolean run(Player player) {
        return false;
    }
}
