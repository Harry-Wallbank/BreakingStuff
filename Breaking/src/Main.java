import edu.digipen.Game;
import edu.digipen.level.GameLevel;

public class Main {

    public static void main(String[] args) {
        Game.initialize(800, 600, 60, new GameLevel()
        {
            @Override public void create()
            {

            }

            @Override public void initialize()
            {

            }

            @Override public void update(float v)
            {

            }

            @Override public void uninitialize()
            {

            }
        });
        if (!Game.getQuit())
        {
            Game.update();
        }
    }
}
