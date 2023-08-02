package org.example.phonecountry.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.phonecountry.dto.CountryResponseDTO;
import org.example.phonecountry.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(
    name = "Country controller",
    description = "Handle country related operations"
)
@Slf4j
@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;
    
    @Operation(
        summary = "Fetch country by provided phone number",
        tags = "Country controller"
    )
    @GetMapping
    public CountryResponseDTO getKycRequirements(@RequestParam String phone) {
        
        return countryService.findCountryByPhone(phone);
    }
}
