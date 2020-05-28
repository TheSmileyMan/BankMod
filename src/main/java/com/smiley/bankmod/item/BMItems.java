package com.smiley.bankmod.item;

import com.smiley.bankmod.BankMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BMItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BankMod.MODID);

    public static final RegistryObject<Item> COIN = ITEMS.register("coin", () -> new ItemCoin());

    public static final RegistryObject<Item> SilverCoin = ITEMS.register("silver_coin", () -> new ItemCoin());

    public static final RegistryObject<Item> BronzeCoin = ITEMS.register("bronze_coin", () -> new ItemCoin());
}
