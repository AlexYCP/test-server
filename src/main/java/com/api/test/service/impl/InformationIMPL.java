package com.api.test.service.impl;

import com.api.test.model.Information;
import com.api.test.repository.InformationRepository;
import com.api.test.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationIMPL implements InformationService {

    @Autowired
    private InformationRepository informationRepository;

    @Override
    public List<Information> findAllInformation() {
        return informationRepository.findAll();
    }

    @Override
    public Information findInformationById(Long id) {
        Optional<Information> optionalInformation = informationRepository.findById(id);

        if (optionalInformation.isPresent()) {
            return optionalInformation.get();
        } else {
            return null;
        }
    }

    @Override
    public Information createInformation(Information information) {
        return informationRepository.save(information);
    }

    @Override
    public Information updateInformation(Information information) {
        if (information.getId() != null) {
            return informationRepository.save(information);
        } else {
            return null;
        }
    }

    @Override
    public Information deleteInformationById(Long id) {
        informationRepository.deleteById(id);

        return null;
    }

    @Override
    public Information deleteAllInformation() {
        informationRepository.deleteAll();

        return null;
    }

}
