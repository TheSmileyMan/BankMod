package com.smiley.bankmod.block;

import com.smiley.bankmod.BankMod;
import com.smiley.bankmod.item.BMItems;
import com.smiley.bankmod.item.ItemCoin;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BMBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BankMod.MODID);

    public static final RegistryObject<Block> ATM = register("atm", () -> new BlockATM(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(5.0F, 6.0F)), BankMod.BM_TAB);

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, ItemGroup itemGroup)
    {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        BMItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), new Item.Properties().group(itemGroup)));
        return registryObject;
    }
    public static final RegistryObject<Block> BANK_MAKER = register("bank_maker", () -> new BlockBankMaker(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(5.0F, 6.0F)), BankMod.BM_TAB);


}
