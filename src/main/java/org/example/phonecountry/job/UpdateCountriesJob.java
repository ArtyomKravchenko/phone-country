package org.example.phonecountry.job;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class UpdateCountriesJob {

    @PostConstruct
    public void updateCountryCodes() {
        
    }
}
