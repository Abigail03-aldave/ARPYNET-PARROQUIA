package com.parroquia.entidad;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="tb_usuario")
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellidos;
	
	/*
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fechaNacimiento;
	*/
	
	private String dni;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtb_rol")
	private Rol rol;
	

}
