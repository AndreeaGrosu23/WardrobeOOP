package com.andreeagrosu;

public class Main {

    public static void main (String[] args) {

        Wardrobe wardrobe = new Wardrobe(7);

        Hanger hanger1 = Hanger.createHanger(TypeOfHanger.SHIRT_BLOUSES);
        Hanger hanger2 = Hanger.createHanger(TypeOfHanger.SHIRT_BLOUSES);
        Hanger hanger3 = Hanger.createHanger(TypeOfHanger.SHIRT_BLOUSES);
        Hanger hanger4 = Hanger.createHanger(TypeOfHanger.SHIRT_BLOUSES);
        Hanger hanger5 = Hanger.createHanger(TypeOfHanger.SHIRT_BLOUSES);
        Hanger hanger6 = Hanger.createHanger(TypeOfHanger.ALL);
        Hanger hanger7 = Hanger.createHanger(TypeOfHanger.ALL);
        Hanger hanger8 = Hanger.createHanger(TypeOfHanger.ALL);
        Hanger hanger9 = Hanger.createHanger(TypeOfHanger.ALL);
        Hanger hanger10 = Hanger.createHanger(TypeOfHanger.ALL);

        Clothes skirt1 = new Clothes("Zara", TypeOfClothing.SKIRT);
        Clothes shirt1 = new Clothes("Zara", TypeOfClothing.SHIRT);
        Clothes blouse1 = new Clothes("New Yorker", TypeOfClothing.BLOUSE);
        Clothes trousers1 = new Clothes("Zara", TypeOfClothing.TROUSERS);
        Clothes skirt2 = new Clothes("Pull&Bear", TypeOfClothing.SKIRT);
        Clothes shirt2 = new Clothes("39", TypeOfClothing.SHIRT);

        System.out.println("Created objects");

        hanger1.addClothes(shirt1);
        hanger2.addClothes(shirt2);
        hanger3.addClothes(blouse1);
        hanger6.addClothes(trousers1);
        hanger7.addClothes(skirt1);


        wardrobe.addHanger(hanger1);
        wardrobe.addHanger(hanger2);
        wardrobe.addHanger(hanger3);
        wardrobe.addHanger(hanger6);
        wardrobe.addHanger(hanger7);

        wardrobe.removeHanger(hanger6);
        wardrobe.removeHanger(hanger3);

        wardrobe.addHanger(hanger10);

        if (hanger6.isThereRoomForClothing(TypeOfClothing.SHIRT)) {
            hanger6.addClothes(shirt2);
        }

        if (wardrobe.isThereRoomForClothing(skirt2)) {
            hanger10.addClothes(skirt2);
            wardrobe.addHanger(hanger10);
        }


    }
}
