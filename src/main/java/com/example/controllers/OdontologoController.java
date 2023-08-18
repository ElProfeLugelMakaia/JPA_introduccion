package com.example.controllers;

import com.example.models.Odontologo;
import com.example.services.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/odontologo")
public class OdontologoController {
    OdontologoService service;

    @Autowired
    public OdontologoController(OdontologoService service) {
        this.service = service;
    }

    @PostMapping()
    public Odontologo crear(@RequestBody Odontologo odontologo){
        return this.service.crear(odontologo);
    }
}
