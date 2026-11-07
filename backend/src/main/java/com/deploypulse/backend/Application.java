package com.deploypulse.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String environment;
    private String repositoryUrl;
    private String status;

    public Application() {
    }

    public Application(String name, String environment,
                       String repositoryUrl, String status) {
        this.name = name;
        this.environment = environment;
        this.repositoryUrl = repositoryUrl;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public String getStatus() {
        return status;
    }
}


