package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;

public class HangerAll extends Hanger{
    Clothes itemUp = null;
    Clothes itemDown = null;

    public HangerAll() {
        super(TypeOfHanger.ALL);
    }

    @Override
    public Clothes takeOne(int id) {
        if (itemUp!=null && itemUp.getId()==id) {
            Clothes toReturn = itemUp;
            itemUp=null;
            System.out.println("Removed from the hanger clothing" + itemUp.getId());
            return toReturn;
        } else if (itemDown!=null && itemDown.getId()==id) {
            Clothes toReturn = itemDown;
            itemDown=null;
            System.out.println("Removed from the hanger clothing" + itemDown.getId());
            return toReturn;
        }
        return null;
    }

    @Override
    public List<Clothes> takeAll() {
        Clothes toReturnUp = takeOne(itemUp.getId());
        Clothes toReturnDown = takeOne(itemDown.getId());
        if (toReturnUp!=null || toReturnDown!=null ) {
            List<Clothes> listToReturn = new ArrayList<Clothes>();
            listToReturn.add(toReturnUp);
            listToReturn.add(toReturnDown);
            return listToReturn;
        }
        return null;
    }

    @Override
    public boolean addClothes(Clothes clothes) {
        if (clothes.getType()==TypeOfClothing.SHIRT || clothes.getType()==TypeOfClothing.BLOUSE) {
            if (itemUp==null) {
                itemUp = clothes;
                System.out.println("Added clothes" + itemUp.getId());
                return true;
            }
        } else if (clothes.getType() == TypeOfClothing.TROUSERS || clothes.getType() == TypeOfClothing.SKIRT) {
            if (itemDown==null) {
                itemDown = clothes;
                System.out.println("Added clothes" + itemDown.getId());
                return true;
            }
        }
        System.out.println("Hanger full");
        return false;
    }

    @Override
    public boolean isThereRoomForClothing(TypeOfClothing typeOfClothing) {
        if (typeOfClothing==TypeOfClothing.SHIRT || typeOfClothing==TypeOfClothing.BLOUSE) {
            if (itemUp==null) {
                System.out.println("Hanger empty up");
                return true;
            }
            System.out.println("Hanger full up");
        } else if (typeOfClothing== TypeOfClothing.TROUSERS || typeOfClothing == TypeOfClothing.SKIRT) {
            if (itemDown==null) {
                System.out.println("Hanger empty down");
                return true;
            }
            System.out.println("Hanger full down");
        }
        System.out.println("Hanger full");
        return false;
    }
}
