package com.keralty.aereportes.reports;

import com.keralty.aereportes.viewmodel.Response;

public class ConfigResponse extends Response {
	
	private String configXMLData;
	
	public ConfigResponse() {
		super("000", "OK", 0L);
	}

	public String getConfigXMLData() {
		return configXMLData;
	}

	public void setConfigXMLData(String configXMLData) {
		this.configXMLData = configXMLData;
	}
}
