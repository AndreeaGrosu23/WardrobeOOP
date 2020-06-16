package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;

public abstract class Hanger {

    TypeOfHanger typeOfHanger;

    public Hanger(TypeOfHanger typeOfHanger) {
        this.typeOfHanger = typeOfHanger;
    }

    public static Hanger createHanger(TypeOfHanger typeOfHanger) {
        if (typeOfHanger==typeOfHanger.ALL) {
            return new HangerAll();
        } else if (typeOfHanger==typeOfHanger.SHIRT_BLOUSES) {
            return new HangerShirtBlouses();
        }
        return null;
    }

    public abstract Clothes takeOne(int id);

    public abstract List<Clothes> takeAll();

    public abstract boolean addClothes(Clothes clothes);

    public abstract boolean isThereRoomForClothing(TypeOfClothing typeOfClothing);

}
