
package net.mcreator.overkill.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShickaxeItem extends PickaxeItem {
	public ShickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 99999;
			}

			public float getSpeed() {
				return 40000f;
			}

			public float getAttackDamageBonus() {
				return 398f;
			}

			public int getLevel() {
				return 19;
			}

			public int getEnchantmentValue() {
				return 200;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.DRAGON_HEAD));
			}
		}, 1, 95f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
		setRegistryName("shickaxe");
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("sword"));
		list.add(new TextComponent("axe"));
		list.add(new TextComponent("shovel"));
		list.add(new TextComponent("pick"));
		list.add(new TextComponent("what more do u need?"));
	}
}
