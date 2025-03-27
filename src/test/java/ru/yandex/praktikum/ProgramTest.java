package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class ProgramTest {

    private final int age;
    private final boolean result;

    public ProgramTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {17, false},
                {18, true},
                {20, true},
                {21, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Метод checkIsAdult() вернул не правильное значение для определения совершеннолетия", result, isAdult);
    }
}
