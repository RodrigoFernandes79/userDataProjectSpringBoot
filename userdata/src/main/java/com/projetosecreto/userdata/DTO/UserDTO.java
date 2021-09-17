package com.projetosecreto.userdata.DTO;



import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;
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
public class UserDTO {
	
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
	
		

}

