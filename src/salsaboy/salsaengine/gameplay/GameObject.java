package salsaboy.salsaengine.gameplay;

public class GameObject {

	protected int x, y, z; // Z can be render order for now

	public GameObject(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
