package phoneComparator;

import model.Phone;

import java.util.Comparator;

public class PhoneByPriceComparator implements Comparator<Phone> {

    /**
     * Compares phones by price
     *
     * @param p1 the first phone to be compared.
     * @param p2 the second phone to be compared.
     * @return a negative integer, zero, or a positive integer
     * as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.getPrice() - p2.getPrice();
    }
}
