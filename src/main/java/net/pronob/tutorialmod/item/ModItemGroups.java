package net.pronob.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pronob.tutorialmod.TutorialMod;
import net.pronob.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup Ruby_Group= Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID,"ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(()-> new ItemStack(ModItem.Ruby)).entries((displayContext, entries) -> {
                        entries.add(ModItem.Ruby);
                        entries.add(ModItem.Raw_Ruby);
                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.Ruby_Block);
                        entries.add(ModBlocks.Cute_Block);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Mod Item Groups"+TutorialMod.MOD_ID);
    }
}
