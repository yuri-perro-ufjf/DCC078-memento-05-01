public class PlayerStateRun extends PlayerState{
        private PlayerStateRun() {};
        private static PlayerStateRun instance = new PlayerStateRun();
        public static PlayerStateRun getInstance() {
            return instance;
        }

        public String getState() {
            return "Running";
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
