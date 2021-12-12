package customLinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.mockito.BDDMockito.given;

public class CustomListTest {
    CustomList<Integer> customList = new CustomList<>();

    @Test
    public void testAdd() throws InvocationTargetException, IllegalAccessException {
//        try {
//            Method method = CustomList.class.getDeclaredMethod("getNode", int.class);
//            Class classM = CustomList.class.getDeclaringClass();

//            method.setAccessible(true);
//            Assert.assertEquals(method.invoke(customList, 10), 10);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

    }

    @Test
    public void testTestAdd() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testTestDelete() {
    }

    @Test
    public void testFind() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testIsEmpty() {
    }
}