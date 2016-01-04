/**
 * 
 */
package com.raidentrance.builder.factory;

import com.raidentrance.model.stripes.Sprite;

/**
 * @author alejandrobautista
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sprite sprite = SpritesFactory.createStripe(SpritesFactory.SpriteType.HERO);
		sprite.draw(null);
		Sprite sprite2 = SpritesFactory.createStripe(SpritesFactory.SpriteType.BAD_BOY);
		sprite2.draw(null);
	}

}
