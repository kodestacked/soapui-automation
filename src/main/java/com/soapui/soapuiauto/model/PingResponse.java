package com.soapui.soapuiauto.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PingResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4133228492657944274L;
	private String result;
}
