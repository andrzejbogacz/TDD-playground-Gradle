import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameTest {

    @Test
    fun test_scoreIsInitiallyZero() {
        val game = Game()
        assertEquals(game.score, 0)
    }
}
