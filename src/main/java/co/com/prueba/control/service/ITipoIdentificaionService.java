package co.com.prueba.control.service;

import org.springframework.http.ResponseEntity;

import co.com.prueba.control.response.TipoIdentificacionResponseRest;

public interface ITipoIdentificaionService {
	
	public ResponseEntity<TipoIdentificacionResponseRest> listadoTipoIdentificacion();

}
