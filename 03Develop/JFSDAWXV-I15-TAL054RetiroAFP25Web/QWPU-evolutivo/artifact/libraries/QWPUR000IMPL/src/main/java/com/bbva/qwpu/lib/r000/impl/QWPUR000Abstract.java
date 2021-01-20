package com.bbva.qwpu.lib.r000.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.qwpu.lib.r000.QWPUR000;

public abstract class QWPUR000Abstract extends AbstractLibrary implements QWPUR000 {

	protected ApplicationConfigurationService applicationConfigurationService;

	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}