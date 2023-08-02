package org.example.phonecountry.service.impl;

import org.example.phonecountry.dto.CountryResponseDTO;
import org.example.phonecountry.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    
    @Override
    public CountryResponseDTO findCountryByPhone(String phone) {
        return null;
    }
}
