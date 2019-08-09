package com.stackroute.multimodelservice.service;

import com.stackroute.multimodelservice.domain.Track;
import com.stackroute.multimodelservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.multimodelservice.exceptions.TrackNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Profile("dummyImpl")
@Qualifier("dummy")
public class TrackDummyServiceImpl implements TrackService {
    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        System.out.println("Save track");
        return null;
    }

    @Override
    public Track getTrackById(int id) throws TrackNotFoundException {
        return null;
    }

    @Override
    public List<Track> getAllTracks() {
        return null;
    }

    @Override
    public void deleteTrackById(int id) throws TrackNotFoundException {

    }

    @Override
    public void deleteAllTracks() {

    }

    @Override
    public Track updateTrackById(int id, Track track) throws TrackNotFoundException {
        return null;
    }

    @Override
    public List<Track> getTrackByName(String trackName) throws TrackNotFoundException {
        return null;
    }
}
