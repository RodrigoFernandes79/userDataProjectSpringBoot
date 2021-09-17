package com.projetosecreto.userdata.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetosecreto.userdata.DTO.AddressDTO;
import com.projetosecreto.userdata.DTO.UserDTO;
import com.projetosecreto.userdata.model.Address;
import com.projetosecreto.userdata.service.AddressService;
import com.projetosecreto.userdata.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/listAddress")  // localhost:8090/listAddress
public class AddressController {
	
	private  AddressService addressService;
	
	
	//metodo CreateAdress
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO createdAddress(@RequestBody  AddressDTO addressDTO) {
		
		return addressService.createdAddress(addressDTO);
	}
		//Método Getall
		@GetMapping
		public List<AddressDTO> listAddress(){
			return  addressService.listAll();
			
		}
	}
	
	


