public class PlayerStateIdle extends PlayerState{
    private PlayerStateIdle() {};
    private static PlayerStateIdle instance = new PlayerStateIdle();
    public static PlayerStateIdle getInstance() {
        return instance;
    }

    public String getState() {
        return "Idle";
    }

    public boolean eat(Player player) {
        player.setState(PlayerStateEat.getInstance());
        return true;
    }

    public boolean work(Player player) {
        player.setState(PlayerStateWork.getInstance());
        return true;
    }

    public boolean sleep(Player player) {
        player.setState(PlayerStateSleep.getInstance());
        return true;
    }

    public boolean run(Player player) {
        player.setState(PlayerStateRun.getInstance());
        return true;
    }
}
