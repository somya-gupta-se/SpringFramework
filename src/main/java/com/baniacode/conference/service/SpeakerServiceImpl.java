package com.baniacode.conference.service;

import com.baniacode.conference.model.Speaker;
import com.baniacode.conference.repository.HibernateSpeakerRepository;
import com.baniacode.conference.repository.HibernateSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    HibernateSpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
