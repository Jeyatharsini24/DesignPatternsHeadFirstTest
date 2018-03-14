package com.jeya.prototype;

public interface Monster extends Cloneable{
	void drawMonster();

	Monster clone() throws CloneNotSupportedException ;
}