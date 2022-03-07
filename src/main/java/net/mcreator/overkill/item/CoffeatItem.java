
package net.mcreator.overkill.item;

public class CoffeatItem extends Item {

	public CoffeatItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("coffeat");
	}

}
