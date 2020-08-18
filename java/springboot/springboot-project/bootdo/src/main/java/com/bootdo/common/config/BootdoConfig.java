package com.bootdo.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="bootdo")
public class BootdoConfig {
	//上传路径
	private String uploadPath;
	
	private String grosssalespath;

	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getGrosssalespath() {
		return grosssalespath;
	}

	public void setGrosssalespath(String grosssalespath) {
		this.grosssalespath = grosssalespath;
	}
	
	
}
