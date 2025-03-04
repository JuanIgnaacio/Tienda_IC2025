package com.parcial_1.service;
import com.parcial_1.dao.LibroDao;
import com.parcial_1.domain.Libro;
import com.parcial_1.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImpl implements LibroService {
    
    @Autowired
    private LibroDao LibroDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<libro> getLibros(boolean activos) {
        var lista = LibroDao.findAll();
        if (activos) {
            losta.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Libro getLibro(Libro libro) {
        return LibroDao.findById(idLibro).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Libro libro) {
        LibroDao.save(libro);
    }

    @Override
    @Transactional
    public void delete(Libro libro) {
        LibroDao.delete(libro);
    }
}

}
