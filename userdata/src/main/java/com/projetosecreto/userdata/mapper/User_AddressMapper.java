package com.projetosecreto.userdata.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.DTO.User_AddressDTO;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.model.User;

@Mapper(
	      componentModel = "spring",
	      uses = {User_AddressMapper.class},
	      injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface User_AddressMapper  {

	
	
	public User_AddressMapper map = Mappers.getMapper(User_AddressMapper.class);

	@Mapping (target = "birthDate", source = "birthDate", dateFormat = "dd-mm-yyyy") 
	User toModel(User_AddressDTO userAddressDTO);
	
	User_AddressDTO toDTO(User user);

	

	
	
}
