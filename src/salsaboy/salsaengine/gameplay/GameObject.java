package salsaboy.salsaengine.gameplay;

import salsaboy.salsaengine.Engine;

public class GameObject {
	/**
	 * So we can tell which physics system to use
	 */
	static GameType type;
	int x, y, z; //Z can be render order for now

	public GameObject(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		type = Engine.requirements.gameType();
	}
}
