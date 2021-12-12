
import customLinkedList.CustomList;
import phoneException.IncorrectArgumentPhoneException;
import service.PhoneService;
import entity.Phones;

public class Main {
    public static void main(String[] args) throws IncorrectArgumentPhoneException {
        CustomList<Integer> customList = new CustomList<>();
        System.out.println(customList.add(10));
    }
}
