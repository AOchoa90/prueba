package co.com.prueba.control.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tramite")
public class Tramite implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "radicado")
	private String radicado;

	@Column(name = "fecha_radicacion")
	private Date fechaRadicacion;

	@Column(name = "descripion")
	private String descripcion;

	@Column(name = "funcionario")
	private String funcionario;

	@JoinColumn(name = "fk_Id_persona")
	@ManyToOne
	Persona persona;

	@JoinColumn(name = "fk_Id_tipo_tramite")
	@ManyToOne
	TipoTramite tipoTramite;

}
