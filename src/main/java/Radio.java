public class Radio {
    private int currentVolume;
    private int currentNumberStation;
    private int maxStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }
    public Radio() {
this.maxStation = 9;
    }
    public Radio(int stationsCount) {
this.maxStation = stationsCount -1;
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
    public void setCurrentNumberStation(int CurrentNumberStation) {
        if (CurrentNumberStation < 0) {
            return;
        }
        if (CurrentNumberStation > maxStation) {
            return;
        }
        this.currentNumberStation = CurrentNumberStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }




    public void next() {
        if (currentNumberStation != maxStation) {
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
            currentNumberStation = maxStation;
        }

    }
}



