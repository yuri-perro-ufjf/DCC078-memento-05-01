public class PlayerStateSleep extends PlayerState{
    private PlayerStateSleep() {};
    private static PlayerStateSleep instance = new PlayerStateSleep();
    public static PlayerStateSleep getInstance() {
        return instance;
    }

    public String getState() {
        return "Sleeping";
    }

    public boolean idle(Player player) {
        player.setState(PlayerStateIdle.getInstance());
        return true;
    }
}
