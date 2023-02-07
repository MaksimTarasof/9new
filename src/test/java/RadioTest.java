import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //увеличение громкости
    @Test
    public void IncreaseVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(9);
        int expected = 9;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume1() {
        Radio vol = new Radio();

        vol.setCurrentVolume(1);
        int expected = 1;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume2() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости
    @Test
    public void DecreaseVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume1() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    //переключение станций вперед

    @Test
    public void IncreaseStation() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(3);
        int expected = 3;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation1() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(11);
        int expected = 0;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation2() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(-5);
        int expected = 0;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation3() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(1);
        int expected = 1;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    //переключение станций назад
    @Test
    public void reduceNumberStation() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(8);
        int expected = 8;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceNumberStation1() {
        Radio sta = new Radio();

        sta.setCurrentNumberStation(1);
        int expected = 1;
        int actual = sta.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
}
