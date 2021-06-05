package cn.nukkit.block;

import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.item.ItemTool;

import javax.annotation.Nonnull;

public class BlockSlabCopperCutExposedWaxed extends BlockSlab {
    public BlockSlabCopperCutExposedWaxed() {
        this(0);
    }

    public BlockSlabCopperCutExposedWaxed(int meta) {
        super(meta, WAXED_EXPOSED_CUT_COPPER_SLAB);
    }

    @Override
    public int getId() {
        return WAXED_EXPOSED_CUT_COPPER_SLAB;
    }

    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return SIMPLE_SLAB_PROPERTIES;
    }

    @Override
    public String getSlabName() {
        return "Waxed Exposed Cut Copper Slab";
    }

    @Override
    public boolean isSameType(BlockSlab slab) {
        return slab.getId() == getId();
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
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
