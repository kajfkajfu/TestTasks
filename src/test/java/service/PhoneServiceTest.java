package service;

import model.Phone;
import util.TestDataUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import phoneException.IncorrectArgumentPhoneException;

import java.util.ArrayList;
import java.util.List;


public class PhoneServiceTest {
    PhoneService phoneService = new PhoneService();

    @Test(description = "Testing correctness of sorting by price")
    public void sortedByPriceTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.SORTEDLISTBYPRICE;
        List<Phone> actual = phoneService.sortByPrice(TestDataUtil.DEFAULTLIST);
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
        List<Phone> expected = TestDataUtil.SORTEDLISTBYCOMPANY;
        List<Phone> actual = phoneService.sortByCompany(TestDataUtil.DEFAULTLIST);
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
        List<Phone> expected = TestDataUtil.LIMITEDLIST;
        List<Phone> actual = phoneService.limitPhone(TestDataUtil.DEFAULTLIST, 2);
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
        List<Phone> expected = TestDataUtil.SKIPPEDPHONESLIST;
        List<Phone> actual = phoneService.skipPhones(TestDataUtil.DEFAULTLIST, 2);
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
        long expected = TestDataUtil.COSTOFALLPHONES;
        long actual = phoneService.costOfAllPhones(TestDataUtil.DEFAULTLIST);
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
        List<Phone> expected = TestDataUtil.LISTOFPHONEBYCOMPANY;
        List<Phone> actual = phoneService.phonesByCompany(TestDataUtil.DEFAULTLIST, TestDataUtil.NAMEOFCOMPANY);
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
