package co.com.prueba.control.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoIdentificacionResponseRest extends ResponseRest{
	
	private TipoIdentificacionResponse tipoIdentificacionResponse = new TipoIdentificacionResponse();

	public TipoIdentificacionResponse getTipoIdentificacionResponse() {
		return tipoIdentificacionResponse;
	}

	public void setTipoIdentificacionResponse(TipoIdentificacionResponse tipoIdentificacionResponse) {
		this.tipoIdentificacionResponse = tipoIdentificacionResponse;
	}
}
