package com.projetosecreto.userdata.DTO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.projetosecreto.userdata.model.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User_AddressDTO {
	
	private Long id;

	@NotEmpty 
	@Size (min = 2, max =100) 
	private String name;
	@NotEmpty 
	  
	private String email;
	@NotEmpty 
	@CPF
	private String cpf;
	
	private LocalDate  birthDate;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinTable(name = "user_address",
	joinColumns =@JoinColumn(name ="user_id"),
	inverseJoinColumns = @JoinColumn(name="address_id"))
	private List <Address> address;
}