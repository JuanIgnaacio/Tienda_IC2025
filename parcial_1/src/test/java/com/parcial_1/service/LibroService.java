package com.parcial_1.service;
import com.parcial_1.domain.Libro;
import java.util.List;

public interface LibroService {
    
public List<Libro> getLibros(boolean activos);

public Libro getLibro(Libro libro);

public void save(Libro libro);

public void delete(Libro libro);
}
