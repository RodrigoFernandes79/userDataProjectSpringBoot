package com.projetosecreto.userdata.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.mapstruct.Mapping;

import com.projetosecreto.userdata.DTO.AddressDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length =250, nullable = false)
	private String name;
	@Column(length =250, nullable = false, unique = true)
	private String email;

	@Column(length =250, nullable = false, unique = true)
	private String cpf;
	
	private LocalDate birthDate;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinTable(name = "user_address",
	joinColumns =@JoinColumn(name ="user_id"),
	inverseJoinColumns = @JoinColumn(name="address_id"))
	private List<Address> address;
	
	
	

}
