package net.pronob.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pronob.tutorialmod.TutorialMod;

public class ModItem {

    public static final Item Ruby = registerItem("ruby",new Item(new Item.Settings()));
    public static final Item Raw_Ruby=registerItem("rawruby",new Item(new Item.Settings()));

    private static void aadItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(Ruby);
        entries.add(Raw_Ruby);
    }

   private static Item registerItem(String name,Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
   }


    public static void registerModItem() {
        TutorialMod.LOGGER.info("Registering Mod Item"+TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItem::aadItemsToIngredientItemGroup);
    }
}
