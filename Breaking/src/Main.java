import edu.digipen.Game;

public class Main {

    public static void main(String[] args) {
        Game.initialize(800, 600, 60, new World());
        while (!Game.getQuit())
        {
            Game.update();
        }
        Game.destroy();
    }
}
