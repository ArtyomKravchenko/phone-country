package org.example.phonecountry.service;

import org.example.phonecountry.dto.CountryResponseDTO;

public interface CountryService {
    
    CountryResponseDTO findCountryByPhone(String phone);
}
