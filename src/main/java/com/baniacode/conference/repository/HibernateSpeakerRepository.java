package com.baniacode.conference.repository;

import com.baniacode.conference.model.Speaker;

import java.util.List;

public interface HibernateSpeakerRepository {
    List<Speaker> findAll();
}
