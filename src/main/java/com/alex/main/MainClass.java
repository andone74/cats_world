package com.alex.main;


import com.alex.pets.Cat;
import com.alex.pets.Fish;
import com.alex.pets.Raccoon;
import com.alex.pets.Shark;
import com.alex.pets.*;
import com.alex.plants.Clover;
import com.alex.plants.Grass;

import java.util.concurrent.atomic.AtomicReference;

public class MainClass {

    public static void main(String[] args) {
        Cat pushok = new Cat("Pushok", "Pers");
        Fish ocun = new Fish("ocun");

        Raccoon froska = new Raccoon("Froska", "Barbados");
        pushok.eat(ocun);
        froska.play();
        froska.rinsing();
        froska.steal();

        Pig hryusha = new Pig("hryusha", "kaban");
        Cow aurora = new Cow("Aurora", "Alpine");
        Pantera pantera = new Pantera ("Terapan", "Black", "Black");
        pushok.eat(ocun);

        Dragon paarthurnax = new Dragon("Paarthurnax", "Fire");
        Sheep dolly = new Sheep("Dolly");

        paarthurnax.eat(dolly);
        paarthurnax.fly();

        Fish karas = new Fish("karas");

        pushok.eat(karas);
        hryusha.swimming();
        hryusha.zhratb();
        hryusha.hryukat();
        Shark shark = new Shark();
        shark.eat(pushok);
        shark.eat(froska);
        froska.play();
        pushok.sleep();

        pushok.play();

        Grass grass = new Grass("grass");
        aurora.pasture();
        aurora.eat(grass);
        pantera.eat(aurora);
        aurora.moo();
    }
}
