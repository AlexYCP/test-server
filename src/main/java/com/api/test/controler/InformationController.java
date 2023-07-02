package com.api.test.controler;

import com.api.test.model.Information;
import com.api.test.repository.InformationRepository;
import com.api.test.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/information")
public class InformationController {

    @Autowired
    private InformationService informationService;
    @Autowired
    private InformationRepository informationRepository;

    @GetMapping
    public ResponseEntity<List<Information>> getAllInformation() {
        return new ResponseEntity<>(informationService.findAllInformation(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Information> getInformationById(@PathVariable Long id) {
        return new ResponseEntity<>(informationService.findInformationById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Information> createInformation(@RequestBody Information information) {
        return new ResponseEntity<>(informationService.createInformation(information), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Information> updateInformation(@RequestBody Information information) {
        return new ResponseEntity<>(informationService.updateInformation(information), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Information> deleteInformationById(@PathVariable Long id) {
        return new ResponseEntity<>(informationService.deleteInformationById(id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<Information> deleteAllInformation() {
        return new ResponseEntity<>(informationService.deleteAllInformation(), HttpStatus.NO_CONTENT);
    }

}
