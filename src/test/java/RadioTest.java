import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //увеличение громкости
    @Test
    public void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next1() {
        Radio vol = new Radio();

        vol.setCurrentVolume(1);
        int expected = 1;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next2() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости
    @Test
    public void prev() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev1() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    //переключение станций вперед

    @Test
    public void IncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation1() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(-1);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation8() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation3() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(6);
        int expected = 6;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation4() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    //переключение станций назад
    @Test
    public void reduceNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);
        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceNumberStation2() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


}
