package mcjty.rftoolscontrol.blocks;

import mcjty.lib.container.ContainerFactory;
import mcjty.lib.container.GenericContainer;
import mcjty.lib.container.SlotDefinition;
import mcjty.lib.container.SlotType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;

public class ProgrammerContainer extends GenericContainer {
    public static final String CONTAINER_INVENTORY = "container";
    public static final int SLOT_CARD = 0;

    public static final ContainerFactory factory = new ContainerFactory() {
        @Override
        protected void setup() {
            addSlotBox(new SlotDefinition(SlotType.SLOT_CONTAINER),
                    CONTAINER_INVENTORY, SLOT_CARD, 5, 157, 1, 18, 1, 18);
            layoutPlayerInventorySlots(91, 157);
        }
    };


    public ProgrammerContainer(EntityPlayer player, IInventory containerInventory) {
        super(factory);
        addInventory(CONTAINER_INVENTORY, containerInventory);
        addInventory(ContainerFactory.CONTAINER_PLAYER, player.inventory);
        generateSlots();
    }
}
