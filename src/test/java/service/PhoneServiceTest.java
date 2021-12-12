package service;

import entity.Phone;
import entity.Phones;
import org.testng.Assert;
import org.testng.annotations.Test;
import phoneException.IncorrectArgumentPhoneException;

import java.util.ArrayList;
import java.util.List;


public class PhoneServiceTest {
    PhoneService phoneService = new PhoneService();

    @Test(description = "Testing correctness of sorting by price")
    public void sortedByPriceTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = Phones.SORTEDLISTBYPRICE;
        List<Phone> actual = phoneService.sortByPrice(Phones.DEFAULTLIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is Empty")
    public void sortedByPriceException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.sortByPrice(emptyList);
    }

    @Test(description = "Testing correctness of sorting by company")
    public void sortedByCompanyTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = Phones.SORTEDLISTBYCOMPANY;
        List<Phone> actual = phoneService.sortByCompany(Phones.DEFAULTLIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void sortedByCompanyException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.sortByCompany(emptyList);
    }

    @Test(description = "Testing correctness of limiting phones in the list")
    public void limitPhoneTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = Phones.LIMITEDLIST;
        List<Phone> actual = phoneService.limitPhone(Phones.DEFAULTLIST, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void limitPhoneException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.limitPhone(emptyList, 2);
    }

    @Test(description = "Testing correctness of skipping phones in the list")
    public void skipPhonesTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = Phones.SKIPPEDPHONESLIST;
        List<Phone> actual = phoneService.skipPhones(Phones.DEFAULTLIST, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void skipPhoneException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.skipPhones(emptyList, 2);
    }

    @Test(description = "Testing correctness of the total cost of all" +
            "phones in the list")
    public void costOfAllPhonesTest() throws IncorrectArgumentPhoneException {
        long expected = Phones.COSTOFALLPHONES;
        long actual = phoneService.costOfAllPhones(Phones.DEFAULTLIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void costOfAllPhonesException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.costOfAllPhones(emptyList);
    }

    @Test(description = "Testing correctness of the total cost of all" +
            "phones in the list")
    public void phonesByCompanyTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = Phones.LISTOFPHONEBYCOMPANY;
        List<Phone> actual = phoneService.phonesByCompany(Phones.DEFAULTLIST, Phones.NAMEOFCOMPANY);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void phonesByCompanyExceptionIfListIsEmpty() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.phonesByCompany(emptyList, "Apple");
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if Company name not exist")
    public void phonesByCompanyExceptionIfCompanyNameNotExist() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.phonesByCompany(emptyList, "ABCD");
    }
}
