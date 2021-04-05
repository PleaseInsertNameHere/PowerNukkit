package cn.nukkit.inventory;

import cn.nukkit.blockentity.BlockEntityFurnace;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.item.EntityXPOrb;
import cn.nukkit.item.Item;
import cn.nukkit.math.NukkitMath;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class FurnaceInventory extends ContainerInventory {

    public FurnaceInventory(BlockEntityFurnace furnace) {
        super(furnace, InventoryType.FURNACE);
    }

    public FurnaceInventory(BlockEntityFurnace furnace, InventoryType inventoryType) {
        super(furnace, inventoryType);
    }

    @Override
    public BlockEntityFurnace getHolder() {
        return (BlockEntityFurnace) this.holder;
    }

    public Item getResult() {
        return this.getItem(2);
    }

    public Item getFuel() {
        return this.getItem(1);
    }

    public Item getSmelting() {
        return this.getItem(0);
    }

    public boolean setResult(Item item) {
        return this.setItem(2, item);
    }

    public boolean setFuel(Item item) {
        return this.setItem(1, item);
    }

    public boolean setSmelting(Item item) {
        return this.setItem(0, item);
    }

    @Override
    public void onSlotChange(int index, Item before, boolean send) {
        super.onSlotChange(index, before, send);

        if(index == 2 && getItem(2).getId() == 0) {
            int experience = NukkitMath.floorDouble(this.getHolder().getExperience());
            if(experience >= 1) {
                this.getHolder().setExperience(this.getHolder().getExperience() - experience);
                EntityXPOrb orb = new EntityXPOrb(this.getHolder().getChunk(), Entity.getDefaultNBT(this.getHolder()).putShort("Value", experience));
                orb.spawnToAll();
            }
        }

        this.getHolder().scheduleUpdate();
    }
}
