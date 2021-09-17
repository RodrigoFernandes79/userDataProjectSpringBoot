package com.projetosecreto.userdata.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.projetosecreto.userdata.DTO.AddressDTO;

import com.projetosecreto.userdata.model.Address;


@Mapper(
	      componentModel = "spring",
	      uses = {AddressMapper.class},
	      injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface AddressMapper {
 public AddressMapper Instance = Mappers.getMapper(AddressMapper.class);
 
	

	Address toModel(AddressDTO addressDTO);
	
	AddressDTO toDTO(Address address);
}
