package com.api.test.service;

import com.api.test.model.Information;

import java.util.List;

public interface InformationService {

    List<Information> findAllInformation();

    Information findInformationById(Long id);

    Information createInformation(Information information);

    Information updateInformation(Information information);

    Information deleteInformationById(Long id);

    Information deleteAllInformation();

}
