package com.blukzen.createlab;

import com.blukzen.createlab.block.LabBlocks;
import com.blukzen.createlab.item.LabItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod("createlab")
public class CreateLab {
    public static final String MODID = "createlab";
    public static Logger LOGGER = LogManager.getLogger("CreateLab");

    public CreateLab() {
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        LabBlocks.BLOCKS.register(modbus);
        LabItems.ITEMS.register(modbus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(CreateLabRegistry::init);
    }
}
