package cn.nukkit.level.biome.impl.nether;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.level.biome.Biome;

public class CrimsonForest extends Biome {
    @Override
    public String getName() {
        return "Crimson Forest";
    }

    @Override
    public boolean canRain() {
        return false;
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Override
    public boolean isDry() {
        return true;
    }
}
