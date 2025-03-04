
package com.Proyecto.domainSA;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = )
public class ServiciosAdicionales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = )
    private Long id;
    private String nombre;
    private String Descripcion;
    private double precio;
    private String rutaImagen;
    
    
            
            

}
