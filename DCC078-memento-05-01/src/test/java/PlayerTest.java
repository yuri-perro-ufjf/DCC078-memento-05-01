import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldBeStoreStates() {
        Player player = new Player();
        player.setState(PlayerStateIdle.getInstance());
        player.setState(PlayerStateWork.getInstance());
        assertEquals(2, player.getStates().size());
    }

    @Test
    void shouldBeReturnInitialState() {
        Player player = new Player();
        player.setState(PlayerStateIdle.getInstance());
        player.setState(PlayerStateEat.getInstance());
        player.redoState(0);
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Player player = new Player();
        player.setState(PlayerStateIdle.getInstance());
        player.setState(PlayerStateEat.getInstance());
        player.setState(PlayerStateIdle.getInstance());
        player.setState(PlayerStateWork.getInstance());
        player.redoState(2);
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Player player = new Player();
            player.redoState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid Index", e.getMessage());
        }
    }

}