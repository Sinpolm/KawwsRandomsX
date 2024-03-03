package kawws.kawwsrandoms.block;

import kawws.kawwsrandoms.KawwsRandoms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block.json",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(5.5f)));

    public static final Block STEEL_ORE = registerBlock("steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

   private static Block registerBlock(String name,Block block) {
       registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KawwsRandoms.MOD_ID, name), block);
   }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(KawwsRandoms.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlock() {
        KawwsRandoms.LOGGER.info("Registering ModBlock for " + KawwsRandoms.MOD_ID);
    }
}
