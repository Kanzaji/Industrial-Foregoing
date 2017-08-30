package com.buuz135.industrial.api;


import com.buuz135.industrial.api.recipe.BioReactorEntry;
import com.buuz135.industrial.api.recipe.LaserDrillEntry;
import net.minecraft.item.ItemStack;

import java.util.stream.Collectors;

public class IndustrialForegoingHelper {

    public static boolean addBioReactorEntry(BioReactorEntry entry) {
        if (BioReactorEntry.BIO_REACTOR_ENTRIES.stream().noneMatch(entry1 -> entry.doesStackMatch(entry1.getStack()))) {
            BioReactorEntry.BIO_REACTOR_ENTRIES.add(entry);
            return true;
        }
        return false;
    }

    public static boolean removeBioReactorEntry(ItemStack stack) {
        if (BioReactorEntry.BIO_REACTOR_ENTRIES.stream().anyMatch(entry -> entry.doesStackMatch(stack))) {
            BioReactorEntry.BIO_REACTOR_ENTRIES = BioReactorEntry.BIO_REACTOR_ENTRIES.stream().filter(entry -> !entry.doesStackMatch(stack)).collect(Collectors.toList());
            return true;
        }
        return false;
    }

    public static boolean addLaserDrillEntry(LaserDrillEntry entry) {
        if (LaserDrillEntry.LASER_DRILL_ENTRIES.stream().noneMatch(entry1 -> entry1.getStack().isItemEqual(entry.getStack()))) {
            LaserDrillEntry.LASER_DRILL_ENTRIES.add(entry);
            return true;
        }
        return false;
    }

    public static boolean removeLaserDrillEntry(ItemStack stack) {
        if (LaserDrillEntry.LASER_DRILL_ENTRIES.stream().anyMatch(entry -> stack.isItemEqual(entry.getStack()))) {
            LaserDrillEntry.LASER_DRILL_ENTRIES = LaserDrillEntry.LASER_DRILL_ENTRIES.stream().filter(entry -> !entry.getStack().isItemEqual(stack)).collect(Collectors.toList());
        }
        return false;
    }
}
