package com.projetosecreto.userdata.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projetosecreto.userdata.DTO.AddressDTO;
import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.DTO.User_AddressDTO;
import com.projetosecreto.userdata.controller.MessageResponseDTO;
import com.projetosecreto.userdata.mapper.UserMapper;
import com.projetosecreto.userdata.mapper.User_AddressMapper;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.model.User;
import com.projetosecreto.userdata.repository.UserRepository;

import lombok.AllArgsConstructor;



@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class User_AddressService {
	private final UserRepository userRepository;
	
	public User_AddressMapper userAddressMapper= User_AddressMapper.map;
	
//	@Autowired
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
public MessageResponseDTO createdPersonAddress(User_AddressDTO userAddressDTO) {
		
		User userToSave = userAddressMapper.toModel(userAddressDTO);
		User savedUser = userRepository.save(userToSave);
		return MessageResponseDTO.builder()
				.message("User  created Sucessfully " +savedUser.getCpf()+ 
						"Address created Sucessfully" +savedUser.getAddress()
						)
				.build();
}

public List<User_AddressDTO> listAll() {
	List<User> allUser = userRepository.findAll();
	return allUser.stream()
			.map(userAddressMapper::toDTO)
			.collect(Collectors.toList());
}

public User_AddressDTO findById(long id) throws PersonNotFoundException {
	User address = userRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
	return userAddressMapper.toDTO(address); 
}

}




	



