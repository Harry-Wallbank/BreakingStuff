import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

public class World extends GameLevel
{
	@Override public void create()
	{
		GameObject Player = new Player();
		ObjectManager.addGameObject(Player);
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
}
