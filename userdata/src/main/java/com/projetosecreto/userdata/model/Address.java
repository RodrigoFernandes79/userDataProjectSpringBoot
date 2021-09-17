package com.projetosecreto.userdata.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.projetosecreto.userdata.enumerate.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name= "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(length =250, nullable = false)
	private AddressType type;
	@Column(length =250, nullable = false)
	private String logradouro;
	@Column(length =250, nullable = false)
	private String numero;
	@Column(length =250)
	private String complemento;
	@Column(length =250, nullable = false)
	private String bairro;
	@Column(length =250, nullable = false)
	private String cidade;
	@Column(length =250, nullable = false)
	private String estado;
	@Column(length =250, nullable = false, unique=true)
	private String cep;
	
	
	
	

}
