package service;

import model.Phone;
import phoneComparator.PhoneComparatorByCompany;
import phoneComparator.PhoneComparatorByPrice;
import phoneException.IncorrectArgumentPhoneException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneService {

    /**
     * Sorts phones by price using Stream API
     */
    public List<Phone> sortByPrice(List<Phone> phones) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List is empty");
        }
        phones = phones.stream()
                .sorted(new PhoneComparatorByPrice())
                .collect(Collectors.toList());
        return phones;
    }

    /**
     * Sorts phones by company using Stream API
     */
    public List<Phone> sortByCompany(List<Phone> phones) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List is empty");
        }
        phones = phones.stream()
                .sorted(new PhoneComparatorByCompany())
                .collect(Collectors.toList());
        return phones;
    }

    /**
     * Returns limited list of phones by using Stream API
     */
    public List<Phone> limitPhone(List<Phone> phones, int limit) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List is empty");
        }
        if (limit > phones.size() - 1 || limit <= 0) {
            throw new IncorrectArgumentPhoneException("Incorrect argument limit exception");
        }
        phones = phones.stream()
                .limit(limit)
                .collect(Collectors.toList());
        return phones;
    }

    /**
     * Returns list of phones without first skipped elements by using Stream API
     */
    public List<Phone> skipPhones(List<Phone> phones, int skip) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List is empty");
        }
        if (skip >= phones.size() || skip <= 0) {
            throw new IncorrectArgumentPhoneException("Incorrect argument skip exception");
        }
        phones = phones.stream()
                .skip(skip)
                .collect(Collectors.toList());
        return phones;
    }

    /**
     * Returns total price of all phones in list by using Stream API
     */
    public long costOfAllPhones(List<Phone> phones) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List of phones zero or below");
        }
        Optional<Integer> sumOfPhones = phones.stream()
                .map(Phone::getPrice)
                .reduce(Integer::sum);
        return sumOfPhones.get();
    }

    /**
     * Returns list of phones with specified company by using Stream API
     */
    public List<Phone> phonesByCompany(List<Phone> phones, String companyName) throws IncorrectArgumentPhoneException {
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("List is empty");
        }
        phones = phones.stream()
                .filter(p -> p.getCompany().toUpperCase().equals(companyName.toUpperCase()))
                .collect(Collectors.toList());
        if (phones.size() <= 0) {
            throw new IncorrectArgumentPhoneException("Incorrect company name");
        }
        return phones;
    }
}
