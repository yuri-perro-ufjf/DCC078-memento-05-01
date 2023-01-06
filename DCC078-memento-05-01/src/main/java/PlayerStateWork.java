public class PlayerStateWork extends PlayerState {
    private PlayerStateWork() {};
    private static PlayerStateWork instance = new PlayerStateWork();
    public static PlayerStateWork getInstance() {
        return instance;
    }

    public String getState() {
        return "Working";
    }

    public boolean eat(Player player) {
        player.setState(PlayerStateEat.getInstance());
        return true;
    }

    public boolean idle(Player player) {
        player.setState(PlayerStateIdle.getInstance());
        return true;
    }
}
