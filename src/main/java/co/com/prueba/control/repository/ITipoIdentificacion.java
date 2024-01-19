package co.com.prueba.control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.prueba.control.model.TipoIdentificacion;

@Repository
public interface ITipoIdentificacion extends JpaRepository<TipoIdentificacion, Integer>{

}
