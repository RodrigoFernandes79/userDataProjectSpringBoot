package com.projetosecreto.userdata.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.projetosecreto.userdata.DTO.AddressDTO;
import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.DTO.User_AddressDTO;
import com.projetosecreto.userdata.controller.MessageResponseDTO;
import com.projetosecreto.userdata.mapper.AddressMapper;
import com.projetosecreto.userdata.mapper.UserMapper;
import com.projetosecreto.userdata.mapper.User_AddressMapper;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.model.User;
import com.projetosecreto.userdata.repository.AddressRepository;
import com.projetosecreto.userdata.repository.UserRepository;

import lombok.AllArgsConstructor;



@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class UserService {
	
	
	private final  UserRepository userRepository;
	
	public UserMapper userMapper= UserMapper.mapper;
	public User_AddressMapper userAddressMapper = User_AddressMapper.map;
//	@Autowired
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
public MessageResponseDTO createdPerson(UserDTO userDTO) {
		User userToSave = userMapper.toModel(userDTO);
		User savedUser = userRepository.save(userToSave);
		return MessageResponseDTO.builder()
				.message("User created Sucessfully " +savedUser.getCpf())
				.build();
}

public List<UserDTO> listAll() {
	List<User> allUser = userRepository.findAll();
	return allUser.stream()
			.map(userMapper::toDTO)
			.collect(Collectors.toList());
}





}





	



