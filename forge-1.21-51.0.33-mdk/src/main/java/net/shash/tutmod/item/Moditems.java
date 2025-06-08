package net.shash.tutmod.item;

//import com.google.common.eventbus.EventBus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shash.tutmod.TutorialMod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> PATTHAR= ITEMS.register("patthar",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PATTHAR= ITEMS.register("raw_patthar",()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
