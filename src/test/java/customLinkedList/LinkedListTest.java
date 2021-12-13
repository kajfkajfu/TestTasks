package customLinkedList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LinkedListTest {

    private LinkedList<String> list;

    @BeforeMethod
    public void setUp() {
        list = new LinkedList<>();
    }

    @Test
    public void testSize_initialList() {
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testSize_oneElement_sizeIsOne() {
        list.add("a");
        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testGet_oneElement() {
        givenAListContaining("a");
        String result = list.get(0);
        Assert.assertEquals(result, "a");
    }

    private void givenAListContaining(String... elements) {
        for (String s : elements) {
            list.add(s);
        }
    }

    @Test
    public void testSize_addSecondElement() {
        givenAListContaining("a");
        list.add("b");
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testGet_firstElementFromTwoElementList() {
        givenAListContaining("a", "b");
        String result = list.get(0);
        Assert.assertEquals(result, "a");
    }

    @Test
    public void testGet_secondElementFromTwoElementList() {
        givenAListContaining("a", "b");
        String result = list.get(1);
        Assert.assertEquals(result, "b");
    }

    @Test
    public void testRemove_firstElementFromTwoElementList_elementWasTheFirst() {
        givenAListContaining("a", "b");
        String result = list.remove(0);
        Assert.assertEquals(result, "a");
    }

    @Test
    public void testRemove_firstElementFromTwoElementList_sizeIsOne() {
        givenAListContaining("a", "b");
        whenTheFirstElementIsRemoved();
        Assert.assertEquals(list.size(), 1);
    }

    private void whenTheFirstElementIsRemoved() {
        list.remove(0);
    }

    @Test
    public void testRemove_firstElementFromTwoElementList_firstElementIsOldSecondElement() {
        givenAListContaining("a", "b");
        whenTheFirstElementIsRemoved();
        Assert.assertEquals(list.get(0), "b");
    }
}
