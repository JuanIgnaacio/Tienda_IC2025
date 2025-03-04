package com.parcial_1.dao;
import com.parcial_1.domain.libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository <Libro,Long> {

}
