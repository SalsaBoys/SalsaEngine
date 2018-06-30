package salsaboy.salsaengine;

import salsaboy.salsaengine.gameplay.GameType;

public interface Initializer {
    /**
     * This is so that you can change the type through the game
     * @return the type
     */
    GameType gameType();
}
