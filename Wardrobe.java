package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {

    int maxSize;
    Hanger hanger = null;
    List<Hanger> hangerList = null;
    static int counter=0;

    public Wardrobe(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Hanger> addHanger(Hanger hanger) {
        if (isThereRoomForHanger()) {
            hangerList = new ArrayList<Hanger>();
            hangerList.add(hanger);
            counter++;
        }
        System.out.println("Hanger added");
        System.out.println(counter);
        return hangerList;
    }

    public List<Hanger> removeHanger(Hanger hanger) {
        hangerList.remove(hanger);
        System.out.println("Hanger removed from wardrobe");
        counter--;
        System.out.println(counter);
        return hangerList;
    }

    public boolean isThereRoomForHanger() {
        if (counter<maxSize) {
            return true;
        }
        return false;
    }

    public boolean isThereRoomForClothing(Clothes clothes) {
        if (isThereRoomForHanger()) {
            return true;
        } else {
            for (Hanger hanger: hangerList) {
                if (hanger.isThereRoomForClothing(clothes.getType())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
