package com.bbva.qwpu.lib.r200.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.datiobd.daas.DaasMongoConnector;
import com.bbva.qwpu.lib.r200.QWPUR200;

public abstract class QWPUR200Abstract extends AbstractLibrary implements QWPUR200 {

	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUR200.class);
	
	protected ApplicationConfigurationService applicationConfigurationService;
	protected DaasMongoConnector daasMongoConnector = new DaasMongoConnector();
	
	/**
	 * @param applicationConfigurationService the applicationConfigurationService to set
	 */
	public void setApplicationConfigurationService(
			ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}
	
}
