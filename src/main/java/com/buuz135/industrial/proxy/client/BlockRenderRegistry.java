package com.buuz135.industrial.proxy.client;

import com.buuz135.industrial.tile.block.CustomOrientedBlock;


public class BlockRenderRegistry {

    public static void registerRender() {
        CustomOrientedBlock.blockList.forEach(CustomOrientedBlock::registerRenderer);
    }
}
