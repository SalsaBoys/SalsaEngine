package salsaboy.salsaengine.gameplay;

import salsaboy.salsaengine.Engine;

public class GameObject {
	int x, y, z; //Z can be render order for now
	/**
	 * So we can tell which physics system to use
	 */
	GameType type;

	public GameObject(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.type = Engine.requirements.gameType();
	}
}
