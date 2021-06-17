package com.baniacode.conference.repository;

import com.baniacode.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements HibernateSpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Somi");
        speaker.setLastName("Gupta");
        speakers.add(speaker);
        return speakers;
    }
}
