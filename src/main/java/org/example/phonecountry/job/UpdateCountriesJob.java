package org.example.phonecountry.job;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class UpdateCountriesJob {

    @PostConstruct
    public void updateCountryCodes() {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_country_calling_codes").get();
            Elements trs = doc.select("table.wikitable").get(1).select("tr");
        } catch (IOException e) {
            log.error("Unable to upload codes", e);
        }
    }

}
