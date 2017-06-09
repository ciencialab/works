package org.ciencialabart.journeyplanner.journeyplan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JourneyPlan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    
    private String name;

    public JourneyPlan() {}

    public JourneyPlan(String name) {
        this.name = name;
    }

    public JourneyPlan(long id, String name) {
        this(name);
        
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}