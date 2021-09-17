package com.projetosecreto.userdata.DTO;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.projetosecreto.userdata.enumerate.AddressType;
import com.projetosecreto.userdata.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
	
	
	private Long id;
	@Enumerated(EnumType.STRING)
	private AddressType type;
	@NotEmpty
	private String logradouro;
	@NotEmpty
	private String numero;

	private String complemento;
	@NotEmpty
	private String bairro;
	@NotEmpty
	private String cidade;
	@NotEmpty
	private String estado;
	@NotEmpty
	private String cep;
	
		

}
