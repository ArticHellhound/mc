
package net.mcreator.overkill.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ThaumiteSwordItem extends SwordItem {
	public ThaumiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4595;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 46f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 112;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack());
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		setRegistryName("thaumite_sword");
	}
}
