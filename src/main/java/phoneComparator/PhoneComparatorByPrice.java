package phoneComparator;

import entity.Phone;

import java.util.Comparator;

public class PhoneComparatorByPrice implements Comparator<Phone> {

    /**
     * Compares phones by company
     */
    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.getPrice() - p2.getPrice();
    }
}
