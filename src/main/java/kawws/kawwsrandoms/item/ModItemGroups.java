package kawws.kawwsrandoms.item;

import kawws.kawwsrandoms.KawwsRandoms;
import kawws.kawwsrandoms.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup STEEL_GROUP = Registry.register
            (Registries.ITEM_GROUP, new Identifier(KawwsRandoms.MOD_ID, "steel"),
                    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.steel"))
                            .icon(() -> new ItemStack(ModItems.STEEL)).entries((displayContext, entries) -> {
                              entries.add(ModItems.STEEL);
                              entries.add(ModItems.RAW_STEEL);
                              entries.add(ModBlocks.STEEL_BLOCK);
                              entries.add(ModBlocks.STEEL_ORE);
                            }).build());
    public static void registerItemGroups() {
        KawwsRandoms.LOGGER.info("Registering Item Groups for " + KawwsRandoms.MOD_ID);
    }
}
