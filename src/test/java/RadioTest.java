import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //увеличение громкости
    @Test
    public void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void next1() {
        Radio vol = new Radio();

        vol.setCurrentVolume(9);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next12() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next9() {
        Radio vol = new Radio();

        vol.setCurrentVolume(1);
        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next10() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        vol.decreaseVolume();
        int expected = 9;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next11() {
        Radio vol = new Radio();

        vol.setCurrentVolume(9);
        vol.decreaseVolume();
        int expected = 8;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next13() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.decreaseVolume();
        int expected = 0;
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

    @Test
    public void reduceNumberStation3() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(12);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next3() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next4() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next5() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next6() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next7() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next8() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


}
