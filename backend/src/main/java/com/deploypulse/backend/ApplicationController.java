
package com.deploypulse.backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @PostMapping
    public Application registerApplication(
            @RequestBody Application request) {

        Application application = new Application(
                request.getName(),
                request.getEnvironment(),
                request.getRepositoryUrl(),
                "REGISTERED"
        );

        return applicationRepository.save(application);
    }

    @GetMapping
    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }
}
