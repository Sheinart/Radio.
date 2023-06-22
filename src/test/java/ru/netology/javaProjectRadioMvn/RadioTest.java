package ru.netology.javaProjectRadioMvn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void testStation() {
        Radio station = new Radio();

        station.setCurrentStation(-10);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingTestStation() {
        Radio station = new Radio();
        station.setCurrentStation(6);

        station.next();

        int expected = 7;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-10);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(4);

        volume.increaseVolume();

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void hushTheSoundTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.hushTheSound();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

