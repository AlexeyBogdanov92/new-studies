package day12.task5;

import day12.task5.MusicArtist;
import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersOne = new ArrayList<>();
        membersOne.add(new MusicArtist( "Bob Marley", 34));
        membersOne.add(new MusicArtist("Cab Swonson", 44));
        membersOne.add(new MusicArtist("Tom Farr", 24));
        membersOne.add(new MusicArtist("Eddy Frost", 54));
        membersOne.add(new MusicArtist("MelL Gibson", 22));

        MusicBand band1 = new MusicBand("Bad boys", 2000, membersOne);


        List<MusicArtist> membersTwo = new ArrayList<>();
        membersTwo.add(new MusicArtist("Mick J", 45));
        membersTwo.add(new MusicArtist("Salamon T", 37));
        membersTwo.add(new MusicArtist("Klint I", 32));
        membersTwo.add(new MusicArtist("Dana W", 50));
        membersTwo.add(new MusicArtist("Jeff F", 44));

        MusicBand band2 = new MusicBand("Old Band", 1997, membersTwo);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
