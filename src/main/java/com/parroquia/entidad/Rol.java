package com.parroquia.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="tb_rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;
	private String descripcion;
	

}
