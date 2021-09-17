package com.projetosecreto.userdata.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.model.User;

@Mapper(
	      componentModel = "spring",
	      uses = {UserMapper.class},
	      injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface UserMapper  {

	
	
	public UserMapper mapper = Mappers.getMapper(UserMapper.class);

	@Mapping (target = "birthDate", source = "birthDate", dateFormat = "dd-mm-yyyy") 
	User toModel(UserDTO userDTO);
	
	UserDTO toDTO(User user);

	
	
}
