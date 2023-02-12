import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioNewTest {
    @Test
    public void NewTest() {
        Radio radio = new Radio(20);

        radio.setCurrentNumberStation(19);
        int expected = 19;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewTest2() {
        Radio radio = new Radio(20);

        radio.setCurrentNumberStation(20);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewTest3() {
        Radio radio = new Radio(20);

        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewTest4() {
        Radio radio = new Radio(20);

        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewTest5() {
        Radio radio = new Radio(20);

        radio.setCurrentNumberStation(12);
        int expected = 12;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
}

