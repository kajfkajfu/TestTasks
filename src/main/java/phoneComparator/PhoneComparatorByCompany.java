package phoneComparator;

import model.Phone;

import java.util.Comparator;

public class PhoneComparatorByCompany implements Comparator<Phone> {

    /**
     * Compares phones by company
     */
    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.getCompany().toUpperCase().compareTo(p2.getCompany().toUpperCase());
    }
}
