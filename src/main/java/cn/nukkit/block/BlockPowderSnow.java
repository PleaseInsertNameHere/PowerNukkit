package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.MinecraftItemID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockPowderSnow extends BlockTransparent {

    @Override
    public String getName() {
        return "Powder Snow";
    }

    @Override
    public int getId() {
        return BlockID.POWDER_SNOW;
    }

    @Override
    public double getHardness() {
        return 0.25;
    }

    @Override
    public double getResistance() {
        return 0.1;
    }

    @Override
    public boolean canBeActivated() {
        return true;
    }

    @Override
    public boolean onActivate(@Nonnull Item item, @Nullable Player player) {
        if(player == null) {
            return false;
        }

        if(item.getId() != ItemID.BUCKET || item.getDamage() != 0) {
            return false;
        }

        this.getLevel().setBlock(this, Block.get(BlockID.AIR));
        Item result = MinecraftItemID.POWDER_SNOW_BUCKET.get(1);
        if(player.isCreative()) {
            player.getInventory().addItem(result);
            return true;
        }
        if(item.count > 1) {
            item.count--;
            if (player.getInventory().canAddItem(result)) {
                player.getInventory().addItem(result);
            } else {
                player.dropItem(result);
            }
        } else {
            player.getInventory().setItemInHand(result);
        }
        return true;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[] {Item.get(0)};
    }

    @Override
    public boolean canBeFlowedInto() {
        return true;
    }

    @Override
    public void onEntityCollide(Entity entity) {
        entity.resetFallDistance();
    }

    @Override
    public boolean canPassThrough() {
        return true;
    }
}
