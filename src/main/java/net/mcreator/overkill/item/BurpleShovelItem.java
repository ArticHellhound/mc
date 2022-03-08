
package net.mcreator.overkill.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BurpleShovelItem extends ShovelItem {
	public BurpleShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 10309f;
			}

			public float getAttackDamageBonus() {
				return -2f;
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

				1, 6f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("burple_shovel");
	}

}
