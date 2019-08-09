package com.stackroute.multimodelservice.service;

import com.stackroute.multimodelservice.domain.Track;
import com.stackroute.multimodelservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.multimodelservice.exceptions.TrackNotFoundException;

import java.util.List;

public interface TrackService {

    /**
     * AbstractMethod to save a track
     */
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    /**
     * AbstractMethod to get a track by Id
     */
    public Track getTrackById(int id) throws TrackNotFoundException;

    /**
     * AbstractMethod to get all tracks
     */
    public List<Track> getAllTracks();

    /**
     * AbstractMethod to delete track by Id
     */
    public void deleteTrackById(int id) throws TrackNotFoundException;

    /**
     * AbstractMethod to delete all tracks
     */
    public void deleteAllTracks();

    /**
     * AbstractMethod to update comments of a track by its id
     */
    public Track updateTrackById(int id, Track track) throws TrackNotFoundException;

    /**
     * AbstractMethod to get track by Name
     */
    public List<Track> getTrackByName(String trackName) throws TrackNotFoundException;

}
