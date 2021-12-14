package util;

import model.Phone;

import java.util.ArrayList;
import java.util.List;

public class TestDataUtil {
    public static final long COST_OF_ALL_PHONES = 230000;

    private static final int PRICE_APPLE_6S = 33000;
    private static final int PRICE_APPLE_11 = 72000;
    private static final int PRICE_SAMSUNG_GALAXY_S6 = 28000;
    private static final int PRICE_SAMSUNG_GALAXY_S7 = 39000;
    private static final int PRICE_HUAWEI_P6 = 19000;
    private static final int PRICE_HUAWEI_P7 = 27000;
    private static final int PRICE_LG_XR = 12000;

    private static final String APPLE = "Apple";
    private static final String SAMSUNG = "Samsung";
    private static final String HUAWEI = "Huawei";
    private static final String LG = "lg";

    private static final String MODEL_6S = "6s";
    private static final String MODEL_11 = "11";
    private static final String MODEL_GALAXY_S6 = "GalaxyS6";
    private static final String MODEL_GALAXY_S7 = "GalaxyS7";
    private static final String MODEL_P6 = "P6";
    private static final String MODEL_P7 = "P7";
    private static final String XR = "Xr";

    public static final List<Phone> DEFAULT_LIST = new ArrayList<>(
            List.of(new Phone(APPLE, MODEL_6S, PRICE_APPLE_6S),
                    new Phone(SAMSUNG, MODEL_GALAXY_S6, PRICE_SAMSUNG_GALAXY_S6),
                    new Phone(APPLE, MODEL_11, PRICE_APPLE_11),
                    new Phone(SAMSUNG, MODEL_GALAXY_S7, PRICE_SAMSUNG_GALAXY_S7),
                    new Phone(HUAWEI, MODEL_P6, PRICE_HUAWEI_P6),
                    new Phone(HUAWEI, MODEL_P7, PRICE_HUAWEI_P7),
                    new Phone(LG, XR, PRICE_LG_XR)));

    public static final List<Phone> SORTED_LIST_BY_PRICE = new ArrayList<>(
            List.of(new Phone(LG, XR, PRICE_LG_XR),
                    new Phone(HUAWEI, MODEL_P6, PRICE_HUAWEI_P6),
                    new Phone(HUAWEI, MODEL_P7, PRICE_HUAWEI_P7),
                    new Phone(SAMSUNG, MODEL_GALAXY_S6, PRICE_SAMSUNG_GALAXY_S6),
                    new Phone(APPLE, MODEL_6S, PRICE_APPLE_6S),
                    new Phone(SAMSUNG, MODEL_GALAXY_S7, PRICE_SAMSUNG_GALAXY_S7),
                    new Phone(APPLE, MODEL_11, PRICE_APPLE_11)));

    public static final List<Phone> SORTED_LIST_BY_COMPANY = new ArrayList<>(
            List.of(new Phone(APPLE, MODEL_6S, PRICE_APPLE_6S),
                    new Phone(APPLE, MODEL_11, PRICE_APPLE_11),
                    new Phone(HUAWEI, MODEL_P6, PRICE_HUAWEI_P6),
                    new Phone(HUAWEI, MODEL_P7, PRICE_HUAWEI_P7),
                    new Phone(LG, XR, PRICE_LG_XR),
                    new Phone(SAMSUNG, MODEL_GALAXY_S6, PRICE_SAMSUNG_GALAXY_S6),
                    new Phone(SAMSUNG, MODEL_GALAXY_S7, PRICE_SAMSUNG_GALAXY_S7)));

    public static final List<Phone> LIMITED_LIST = new ArrayList<>(
            List.of(new Phone(APPLE, MODEL_6S, PRICE_APPLE_6S),
                    new Phone(SAMSUNG, MODEL_GALAXY_S6, PRICE_SAMSUNG_GALAXY_S6)));

    public static final List<Phone> SKIPPED_PHONES_LIST = new ArrayList<>(
            List.of(new Phone(APPLE, MODEL_11, PRICE_APPLE_11),
                    new Phone(SAMSUNG, MODEL_GALAXY_S7, PRICE_SAMSUNG_GALAXY_S7),
                    new Phone(HUAWEI, MODEL_P6, PRICE_HUAWEI_P6),
                    new Phone(HUAWEI, MODEL_P7, PRICE_HUAWEI_P7),
                    new Phone(LG, XR, PRICE_LG_XR)));

    public static final List<Phone> LIST_OF_PHONE_BY_COMPANY = new ArrayList<>(
            List.of(new Phone(APPLE, MODEL_6S, PRICE_APPLE_6S),
                    new Phone(APPLE, MODEL_11, PRICE_APPLE_11)));

}
