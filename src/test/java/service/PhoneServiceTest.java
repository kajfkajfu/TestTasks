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
    public void sortedBy_PriceTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.SORTED_LIST_BY_PRICE;
        List<Phone> actual = phoneService.sortByPrice(TestDataUtil.DEFAULT_LIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is Empty")
    public void sortedByPrice_ExceptionTest() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.sortByPrice(emptyList);
    }

    @Test(description = "Testing correctness of sorting by company")
    public void sortedBy_CompanyTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.SORTED_LIST_BY_COMPANY;
        List<Phone> actual = phoneService.sortByCompany(TestDataUtil.DEFAULT_LIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void sortedByCompany_ExceptionTest() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.sortByCompany(emptyList);
    }

    @Test(description = "Testing correctness of limiting phones in the list")
    public void limit_PhoneTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.LIMITED_LIST;
        List<Phone> actual = phoneService.limitPhone(TestDataUtil.DEFAULT_LIST, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void limitPhone_ExceptionTest() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.limitPhone(emptyList, 2);
    }

    @Test(description = "Testing correctness of skipping phones in the list")
    public void skip_PhonesTest() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.SKIPPED_PHONES_LIST;
        List<Phone> actual = phoneService.skipPhones(TestDataUtil.DEFAULT_LIST, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void skipPhone_ExceptionTest() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.skipPhones(emptyList, 2);
    }

    @Test(description = "Testing correctness of the total cost of all" +
            "phones in the list")
    public void costOfAllPhones_Test() throws IncorrectArgumentPhoneException {
        long expected = TestDataUtil.COST_OF_ALL_PHONES;
        long actual = phoneService.costOfAllPhones(TestDataUtil.DEFAULT_LIST);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void cost_OfAllPhones_ExceptionTest() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.costOfAllPhones(emptyList);
    }

    @Test(description = "Testing correctness of the total cost of all" +
            "phones in the list")
    public void phonesByCompany_Test() throws IncorrectArgumentPhoneException {
        List<Phone> expected = TestDataUtil.LIST_OF_PHONE_BY_COMPANY;
        List<Phone> actual = phoneService.phonesByCompany(TestDataUtil.DEFAULT_LIST, "Apple");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if list is empty")
    public void phonesByCompanyExceptionIfList_IsEmptyException() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.phonesByCompany(emptyList, "Apple");
    }

    @Test(expectedExceptions = {IncorrectArgumentPhoneException.class},
            description = "Throw Exception if Company name not exist")
    public void phonesByCompany_Exception_IfCompanyName_NotExist() throws IncorrectArgumentPhoneException {
        List<Phone> emptyList = new ArrayList<>();
        phoneService.phonesByCompany(emptyList, "ABCD");
    }
}
