package com.parcial_1.domain;
import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "libro")
public class libro implements Serializable {
private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private int idlibro;

    private String titulo;
    private int edicion;
    @Column(name = "precio_libro")
    private double precioLibro;
    private String imagen;
            

    public libro() {
    }

    public Categoria(String titulo, int edicion, double precioLibro, String imagen) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.precioLibro = precioLibro;
        this.imagen = imagen;
    }
    
    

}
