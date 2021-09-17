package com.projetosecreto.userdata.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {
	
	HOME("Home"),
	COMMERCIAL("Commercial");
	
	
		private final String description;
		
}
