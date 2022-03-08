
package net.mcreator.overkill.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BurpleAxeItem extends AxeItem {
	public BurpleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 10309;
			}

			public float getSpeed() {
				return 10309f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 10309;
			}

			public int getEnchantmentValue() {
				return 10309;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverkillModItems.BURPLE_INGOT));
			}
		},

				1, -3.999f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("burple_axe");
	}

}
