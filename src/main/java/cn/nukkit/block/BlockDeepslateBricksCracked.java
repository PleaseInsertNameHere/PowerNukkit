package cn.nukkit.block;

import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

public class BlockDeepslateBricksCracked extends BlockSolid {
    public BlockDeepslateBricksCracked() {

    }

    @Override
    public int getId() {
        return CRACKED_DEEPSLATE_BRICKS;
    }

    @Override
    public String getName() {
        return "Cracked Deepslate Bricks";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.BLACK_BLOCK_COLOR;
    }

    @Override
    public double getHardness() {
        return 1.5;
    }

    @Override
    public double getResistance() {
        return 6;
    }
}
