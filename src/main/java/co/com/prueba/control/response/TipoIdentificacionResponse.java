package co.com.prueba.control.response;

import java.util.List;

import co.com.prueba.control.model.TipoIdentificacion;
import lombok.Data;

@Data
public class TipoIdentificacionResponse {

	private List<TipoIdentificacion> lstTipoIdentificacion;

	public List<TipoIdentificacion> getLstTipoIdentificacion() {
		return lstTipoIdentificacion;
	}

	public void setLstTipoIdentificacion(List<TipoIdentificacion> lstTipoIdentificacion) {
		this.lstTipoIdentificacion = lstTipoIdentificacion;
	}

}
