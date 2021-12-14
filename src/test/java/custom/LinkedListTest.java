package custom;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LinkedListTest {

    private LinkedList<String> list;

    @BeforeMethod(description = "LinkedList initialization")
    public void setUp() {
        list = new LinkedList<>();
    }

    @Test(description = "check initialize list size 0")
    public void testSize_initialList() {
        Assert.assertEquals(list.size(), 0);
    }

    @Test(description = "check list for one element")
    public void testSize_oneElement_sizeIsOne() {
        list.add("a");
        Assert.assertEquals(list.size(), 1);
    }

    @Test(description = "checking the list for getting one element")
    public void testGet_oneElement() {
        givenAListContaining("a");
        String result = list.get(0);
        Assert.assertEquals(result, "a");
    }

    /**
     * Giving a list containing
     */
    private void givenAListContaining(String... elements) {
        for (String s : elements) {
            list.add(s);
        }
    }

    @Test(description = "check list size with two elements")
    public void testSize_addSecondElement() {
        givenAListContaining("a");
        list.add("b");
        Assert.assertEquals(list.size(), 2);
    }

    @Test(description = "getting first element from list with two elements")
    public void testGet_firstElementFromTwoElementList() {
        givenAListContaining("a", "b");
        String result = list.get(0);
        Assert.assertEquals(result, "a");
    }

    @Test(description = "getting second element from list with two elements")
    public void testGet_secondElementFromTwoElementList() {
        givenAListContaining("a", "b");
        String result = list.get(1);
        Assert.assertEquals(result, "b");
    }

    @Test(description = "removing first element from list with two elements")
    public void testRemove_firstElementFromTwoElementList_elementWasTheFirst() {
        givenAListContaining("a", "b");
        String result = list.remove(0);
        Assert.assertEquals(result, "a");
    }

    @Test(description = "removing first element from list with two elements and " +
            "checking list for size one")
    public void testRemove_firstElementFromTwoElementList_sizeIsOne() {
        givenAListContaining("a", "b");
        whenTheFirstElementIsRemoved();
        Assert.assertEquals(list.size(), 1);
    }

    /**
     * Removing the element at index 0 from the list
     */
    private void whenTheFirstElementIsRemoved() {
        list.remove(0);
    }

    @Test(description = "remove first element from two element list add getting " +
            "second element from index zero")
    public void testRemove_firstElementFromTwoElementList_firstElementIsOldSecondElement() {
        givenAListContaining("a", "b");
        whenTheFirstElementIsRemoved();
        Assert.assertEquals(list.get(0), "b");
    }
}
