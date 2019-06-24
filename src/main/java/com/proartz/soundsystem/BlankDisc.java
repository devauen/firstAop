package com.proartz.soundsystem;

import java.util.ArrayList;
import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    List<String> tracks = new ArrayList<>();

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing: " + tracks.get(trackNumber) + "...");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
