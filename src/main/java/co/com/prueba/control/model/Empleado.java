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
@Table(name = "empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@JoinColumn(name = "fk_Id_dependencia")
	@ManyToOne
	private Dependencia dependencia;

	@JoinColumn(name = "fk_Id_persona")
	@ManyToOne
	private Persona persona;

	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
}
