package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 255)
    private String location;

    public Employer(String aLocation) {
        location = aLocation;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String aLocation) {
        location = aLocation;
    }

}
