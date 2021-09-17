package com.projetosecreto.userdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.DTO.User_AddressDTO;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.model.User;
import com.projetosecreto.userdata.repository.UserRepository;
import com.projetosecreto.userdata.service.PersonNotFoundException;
import com.projetosecreto.userdata.service.UserService;
import com.projetosecreto.userdata.service.User_AddressService;

import lombok.AllArgsConstructor;


@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/listAll") // localhost:8090/listAll
public class User_AddressController {
	
	private final User_AddressService userAddressService;
	
//	@Autowired
//	public UserController(UserService userService) {
//		
//		this.userService = userService;
//	}
	
	//Método Create:
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO createdPersonAddress(@RequestBody @Valid User_AddressDTO userAddresDTO) {
		
		return userAddressService.createdPersonAddress(userAddresDTO);
		
		
	}
	
	//Método Getall
	@GetMapping
	public List<User_AddressDTO> listAll(){
		return userAddressService.listAll();
		
	}
	//Método getById
			@GetMapping("/{id}")
			public User_AddressDTO findById(@PathVariable long id) throws PersonNotFoundException {
				return userAddressService.findById(id);
			}
}
