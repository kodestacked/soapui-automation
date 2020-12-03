package com.soapui.soapuiauto.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class PingRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 582828803679772906L;

	private String name;
	private long age;
}
