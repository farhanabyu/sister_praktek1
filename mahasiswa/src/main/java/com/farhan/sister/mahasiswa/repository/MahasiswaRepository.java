/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farhan.sister.mahasiswa.repository;

import com.farhan.sister.mahasiswa.entity.Mahasiswa;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author ihsan
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{

    public Optional<Mahasiswa> findMahasiswaByEmail(String email);
    
}
