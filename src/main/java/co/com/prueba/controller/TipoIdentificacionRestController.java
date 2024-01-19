package co.com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.control.service.ITipoIdentificaionService;

@RestController
@RequestMapping("/api/v1")
public class TipoIdentificacionRestController {

	@Autowired
	ITipoIdentificaionService iTipoIdentificaionService;
	
	

	@GetMapping
	public String data() {
		return "Hola";
	}

}
