package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;

public class HangerShirtBlouses extends Hanger {

    Clothes itemUp = null;

    public HangerShirtBlouses() {
        super(TypeOfHanger.SHIRT_BLOUSES);
    }

    @Override
    public Clothes takeOne(int id) {
        if (itemUp!=null && itemUp.getId()==id) {
            Clothes toReturn = itemUp;
            itemUp=null;
            System.out.println("Removed from the hanger clothing" + itemUp.getId());
            return toReturn;
        }
        return null;
    }

    @Override
    public List<Clothes> takeAll() {
        Clothes toReturn = takeOne(itemUp.getId());
        if (toReturn!=null) {
            List<Clothes> listToReturn = new ArrayList<Clothes>();
            listToReturn.add(toReturn);
            return listToReturn;
        }
        return null;
    }

    @Override
    public boolean addClothes(Clothes clothes) {
        if (itemUp==null) {
            itemUp=clothes;
            System.out.println("Added clothes"+itemUp.getId());
            return true;
        }
        System.out.println("Hanger full");
        return false;
    }

    @Override
    public boolean isThereRoomForClothing(TypeOfClothing typeOfClothing) {
        if (itemUp==null) {
            System.out.println("Hanger empty");
            return true;
        }
        System.out.println("Hanger full");
        return false;
    }
}
