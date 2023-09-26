package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Stars", 2001);
        MusicBand band2 = new MusicBand("Old Boys", 1970);
        MusicBand band3 = new MusicBand("New Faces", 1990);
        MusicBand band4 = new MusicBand("Prodigy", 1991);
        MusicBand band5 = new MusicBand("KandS", 1996);
        MusicBand band6 = new MusicBand("Smokies", 1987);
        MusicBand band7 = new MusicBand("Star boys", 1999);
        MusicBand band8 = new MusicBand("Tokyo hotel", 2007);
        MusicBand band9 = new MusicBand("Wilder", 2012);
        MusicBand band10 = new MusicBand("Qestions", 2020);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        List<MusicBand> musicBands2000Plus = new ArrayList<>();

        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                musicBands2000Plus.add(band);
            }
        }
        System.out.println(musicBands2000Plus);
    }
}
