public class Radio {
    private int currentVolume;

    //увеличение громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    // уменьшение громкости

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //переключение станций вперед
    private int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int CurrentNumberStation) {
        if (CurrentNumberStation < 0) {
            return;
        }
        if (CurrentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = CurrentNumberStation;
    }

    public void next() {
        if (currentNumberStation != 9) {
            currentNumberStation++;
        } else {
            currentNumberStation = 0;
        }
    }

        //переключение станций назад

        public void prev() {
            if (currentNumberStation != 0) {
                currentNumberStation--;
            } else {
                currentNumberStation = 9;
            }

        }
    }



