package com.example.services;

import com.example.models.Odontologo;
import com.example.repositories.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OdontologoService {
    OdontologoRepository repository;

    @Autowired
    public OdontologoService(OdontologoRepository repository) {
        this.repository = repository;
    }

    public Odontologo crear(Odontologo odontologo){
        // Insert into odontologo values (odongologo.getName()
        return this.repository.save(odontologo);
    }
}
