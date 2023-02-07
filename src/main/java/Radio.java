public class Radio {
    private int currentVolume;

    //увеличение громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    // уменьшение громкости

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //переключение станций вперед
    public int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0) {
            return;
        }
        if (newCurrentNumberStation > 9) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void increaseNumberStation() {
        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation + 1;
        }
        //ниже под вопросом
        if (currentNumberStation > 9) {
            currentNumberStation = 0;
        }
    }

    //переключение станций назад

    public void reduceNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        }
        //ниже под вопросом
        if (currentNumberStation < 0) {
            currentNumberStation = 9;
        }
    }
}



