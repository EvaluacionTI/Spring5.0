package com.bbva.qwpu.lib.r100.factory;

import java.io.IOException;

import org.mockito.Mockito;
import org.osgi.framework.BundleContext;

import com.bbva.elara.utility.jdbc.JdbcUtils;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;

public class JdbcUtilsFactory implements
		com.bbva.elara.utility.jdbc.connector.factory.JdbcUtilsFactory {

	@Override
	public JdbcUtils getJdbcUtils(final BundleContext arg0) throws IOException {
		ThreadContext.set(new Context());		
		return Mockito.mock(JdbcUtils.class);
	}
}
