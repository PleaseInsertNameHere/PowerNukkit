package cn.nukkit.block;

import cn.nukkit.item.ItemTool;

public class BlockCopperWeathered extends BlockSolid {

    public BlockCopperWeathered() {
    }

    @Override
    public int getId() {
        return WEATHERED_COPPER_BLOCK;
    }

    @Override
    public String getName() {
        return "Weathered Copper Block";
    }

    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_STONE;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
