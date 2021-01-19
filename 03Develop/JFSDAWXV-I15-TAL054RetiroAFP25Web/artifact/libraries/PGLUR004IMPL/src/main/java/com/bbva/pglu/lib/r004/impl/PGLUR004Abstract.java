package com.bbva.pglu.lib.r004.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.pglu.lib.r004.PGLUR004;
import com.datiobd.daas.DaasMongoConnector;

public abstract class PGLUR004Abstract extends AbstractLibrary implements PGLUR004 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected DaasMongoConnector daasMongoConnector = new DaasMongoConnector();


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}