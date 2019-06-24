package com.proartz.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {

        BlankDisc cd = new BlankDisc();

        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<>();

        tracks.add("Track 1");
        tracks.add("Track 2");
        tracks.add("Track 3");
        tracks.add("Track 4");
        tracks.add("Track 5");
        tracks.add("Track 6");

        cd.setTracks(tracks);

        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
