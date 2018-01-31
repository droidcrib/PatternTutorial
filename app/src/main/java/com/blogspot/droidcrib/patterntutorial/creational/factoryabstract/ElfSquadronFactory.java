package com.blogspot.droidcrib.patterntutorial.creational.factoryabstract;

/**
 * Created  on 31.01.2018.
 */

public class ElfSquadronFactory extends SquadronFactory {
    @Override
    public Mag createMag() {
        return new ElfMag();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
