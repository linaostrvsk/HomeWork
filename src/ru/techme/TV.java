package ru.techme;

public class TV {
    int channels;
    int maxVolume;
    int channel;
    int volume;

    public TV(int channels, int maxVolume, int channel, int volume) {
        this.channels = channels;
        this.maxVolume = maxVolume;
        this.channel = channel;
        this.volume = volume;
    }

    public void switc(int switching) {
        if (channels >= switching) {
            channel = switching;
            System.out.println("Номер канала " + channel);
        }
    }

    public void volum (boolean vol){
        if (vol) {
            if (volume < 100)
            volume++;
        } else {
            if (volume > 0)
            volume--;
        }
    }
}
