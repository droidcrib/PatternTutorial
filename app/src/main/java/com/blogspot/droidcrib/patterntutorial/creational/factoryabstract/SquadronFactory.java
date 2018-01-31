package com.blogspot.droidcrib.patterntutorial.creational.factoryabstract;

/**
 * Created  on 31.01.2018.
 */

public abstract class SquadronFactory {

    public abstract Mag createMag();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
