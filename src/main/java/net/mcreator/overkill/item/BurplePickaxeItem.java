
package net.mcreator.overkill.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.overkill.init.OverkillModItems;

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
				return Ingredient.of(new ItemStack(OverkillModItems.BURPLE_INGOT));
			}
		}, 1, 6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("burple_pickaxe");
	}
}
