package com.projetosecreto.userdata.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosecreto.userdata.DTO.AddressDTO;
import com.projetosecreto.userdata.controller.MessageResponseDTO;
import com.projetosecreto.userdata.mapper.AddressMapper;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.model.User;
import com.projetosecreto.userdata.repository.AddressRepository;
import com.projetosecreto.userdata.repository.UserRepository;




@Service
public class AddressService {
	
	private final AddressRepository addressRepository;
	
	public AddressMapper addressMapper = AddressMapper.Instance;
	@Autowired
	public  AddressService( AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	

	

	public MessageResponseDTO createdAddress( AddressDTO addressDTO) {
		Address addressToSave = addressMapper.toModel(addressDTO);
		Address savedAddress = addressRepository.save(addressToSave);
		return MessageResponseDTO.builder()
				.message("Address created Sucessfully " +savedAddress.getId())
				.build();
}





	public List<AddressDTO> listAll() {
		List<Address> allAddress = addressRepository.findAll();
		return allAddress.stream()
				.map(addressMapper::toDTO)
				.collect(Collectors.toList());
	}
	
	

		
		
	

}
