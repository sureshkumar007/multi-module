package com.stackroute.multimodelservice.seedData;

import com.stackroute.multimodelservice.domain.Track;
import com.stackroute.multimodelservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.multimodelservice.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
/**Command Line Runner is used to execute the code after the Spring Boot application started*/
public class CommandLineStartUpRunner implements CommandLineRunner {
    private TrackService trackService;

    /**
     * Use constructor based DI to inject TrackRepository here
     */

    /**
     * @Qualifier annotation is used to resolve the auto wiring conflict, when there are multiple beans of same type
     */
    @Autowired
    private CommandLineStartUpRunner(TrackService trackService) {
        this.trackService = trackService;
    }

    @Override
    public void run(String... args) throws Exception {
        /**Pre-fill the database whenever application starts*/
        try {
            Track track10 = new Track(10, "track10", "comment10");
            trackService.saveTrack(track10);
        } catch (TrackAlreadyExistsException exception) {
            exception.printStackTrace();
        }
    }
}
