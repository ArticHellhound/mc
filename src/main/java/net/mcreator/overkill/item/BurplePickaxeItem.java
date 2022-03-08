
package net.mcreator.overkill.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BurplePickaxeItem extends PickaxeItem {
	public BurplePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 10309;
			}

			public float getSpeed() {
				return 10309f;
			}

			public float getAttackDamageBonus() {
				return -1.8f;
			}

			public int getLevel() {
				return 10309;
			}

			public int getEnchantmentValue() {
				return 10309;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverkillModItems.DELETED_MOD_ELEMENT));
			}
		},

				1, 6f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("burple_pickaxe");
	}

}
