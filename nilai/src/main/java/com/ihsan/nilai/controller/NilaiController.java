/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ihsan.nilai.controller;

import com.ihsan.nilai.entity.Nilai;
import com.ihsan.nilai.service.NilaiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
@RequestMapping("api/v1/nilai")
public class NilaiController {
    @Autowired
    private NilaiService nilaiService;
    
    @GetMapping
    public List<Nilai> getAll(){
        return nilaiService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Nilai nilai){
        nilaiService.insert(nilai);
    }
    
}
