public class PlayerStateEat extends PlayerState{
    private PlayerStateEat() {};
    private static PlayerStateEat instance = new PlayerStateEat();
    public static PlayerStateEat getInstance() {
        return instance;
    }

    public String getState() {
        return "Eating";
    }

    public boolean idle(Player player) {
        player.setState(PlayerStateIdle.getInstance());
        return true;
    }

    public boolean work(Player player) {
        player.setState(PlayerStateWork.getInstance());
        return true;
    }

    public boolean run(Player player) {
        player.setState(PlayerStateRun.getInstance());
        return true;
    }
}
