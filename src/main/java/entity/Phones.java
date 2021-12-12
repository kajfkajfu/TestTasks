package entity;

import entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class Phones {
    public static final long COSTOFALLPHONES = 230000;
    public static final String NAMEOFCOMPANY = "Apple";

    public static final List<Phone> DEFAULTLIST = new ArrayList<>(
            List.of(new Phone("Apple", "6S", 33000),
                    new Phone("Samsung", "GalaxyS6", 28000),
                    new Phone("Apple", "11", 72000),
                    new Phone("Samsung", "GalaxyS7", 39000),
                    new Phone("Huawei", "P6", 19000),
                    new Phone("Huawei", "P7", 27000),
                    new Phone("LG", "Xr", 12000)));

    public static final List<Phone> SORTEDLISTBYPRICE = new ArrayList<>(
            List.of(new Phone("LG", "Xr", 12000),
                    new Phone("Huawei", "P6", 19000),
                    new Phone("Huawei", "P7", 27000),
                    new Phone("Samsung", "GalaxyS6", 28000),
                    new Phone("Apple", "6S", 33000),
                    new Phone("Samsung", "GalaxyS7", 39000),
                    new Phone("Apple", "11", 72000)));

    public static final List<Phone> SORTEDLISTBYCOMPANY = new ArrayList<>(
            List.of(new Phone("Apple", "6S", 33000),
                    new Phone("Apple", "11", 72000),
                    new Phone("Huawei", "P6", 19000),
                    new Phone("Huawei", "P7", 27000),
                    new Phone("LG", "Xr", 12000),
                    new Phone("Samsung", "GalaxyS6", 28000),
                    new Phone("Samsung", "GalaxyS7", 39000)));

    public static final List<Phone> LIMITEDLIST = new ArrayList<>(
            List.of(new Phone("Apple", "6S", 33000),
                    new Phone("Samsung", "GalaxyS6", 28000)));

    public static final List<Phone> SKIPPEDPHONESLIST = new ArrayList<>(
            List.of(new Phone("Apple", "11", 72000),
                    new Phone("Samsung", "GalaxyS7", 39000),
                    new Phone("Huawei", "P6", 19000),
                    new Phone("Huawei", "P7", 27000),
                    new Phone("LG", "Xr", 12000)));

    public static final List<Phone> LISTOFPHONEBYCOMPANY = new ArrayList<>(
            List.of(new Phone("Apple", "6S", 33000),
                    new Phone("Apple", "11", 72000)));
}
