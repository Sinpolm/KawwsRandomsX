package kawws.kawwsrandoms.item;

import kawws.kawwsrandoms.KawwsRandoms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL = registerItem("steel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STEEL);
    }
    private static Item registerItem(String name, Item item) {
         return Registry.register(Registries.ITEM, new Identifier(KawwsRandoms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KawwsRandoms.LOGGER.info("Registering Mod Items for " + KawwsRandoms.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
