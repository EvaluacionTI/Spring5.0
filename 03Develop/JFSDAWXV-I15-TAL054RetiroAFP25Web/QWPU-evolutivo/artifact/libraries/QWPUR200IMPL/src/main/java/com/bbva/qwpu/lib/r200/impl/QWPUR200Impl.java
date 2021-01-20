package com.bbva.qwpu.lib.r200.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;
import com.bbva.qwpu.lib.r200.impl.mapper.ClientMapper;
import com.datiobd.daas.Parameters;
import com.datiobd.daas.conf.EnumOperation;
import com.datiobd.daas.model.AggregateIterableWrapper;
import com.datiobd.daas.model.AggregatesWrapper;
import com.datiobd.daas.model.DeleteResultWrapper;
import com.datiobd.daas.model.DocumentWrapper;
import com.datiobd.daas.model.FindIterableWrapper;
import com.datiobd.daas.model.UpdateResultWrapper;
import com.datiobd.daas.model.json.FiltersWrapper;

public class QWPUR200Impl extends QWPUR200Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUR200.class);
	private static final String C_QWAI_CUSTOMER = "QWAIEVOL";
	private static final String C_QWAI_TRANSFER = "QWAITRAN";

	@Override
	public String executeSaveCustomer(CustomerDTO oRequest) {
		LOGGER.info("[APX] executeSaveCustomer ...");
		if (oRequest.getId().equals("55555")) {
			CustomerDTO oCliente = new CustomerDTO();
			oCliente.setId(oRequest.getId());
			oCliente.setFirstName(oRequest.getFirstName());
			oCliente.setLastName(oRequest.getLastName());
			oCliente.setEmail(oRequest.getEmail());
			LOGGER.info("[APX] CustomerDTO            : {}", oRequest.toString());
		} else {
			final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);

			DocumentWrapper oDoc = new DocumentWrapper();
			oDoc.put("id", oRequest.getId());
			oDoc.put("firstName", oRequest.getFirstName());
			oDoc.put("lastName", oRequest.getLastName());
			oDoc.put("email", oRequest.getEmail());

			connectorConfiguration.put(Parameters.DOCUMENT, oDoc);

			LOGGER.info("[APX] CustomerDTO            : {}", oRequest.toString());
			LOGGER.info("[APX] Conexion Configuration : {}", connectorConfiguration);
			LOGGER.info("[APX] DocumentWrapper        : {}", oDoc);
			LOGGER.info("[APX] Parameters.DOCUMENT    : {}", Parameters.DOCUMENT);
			LOGGER.info("[APX] Parameters.DOCUMENT    : {}", EnumOperation.INSERT_ONE);

			this.daasMongoConnector.executeWithNoReturn(EnumOperation.INSERT_ONE, connectorConfiguration);
		}
		return oRequest.getId();
	}

	@Override
	public Long executeUpdateCustomer(String idCustomer, CustomerDTO oRequest) {
		LOGGER.info("[APX] executeUpdateCustomer ...");
		Long lRpta = 0L;
		if (oRequest.getId().equals("22222")) {
			CustomerDTO oCliente = new CustomerDTO();

			oCliente.setId(oRequest.getId());
			oCliente.setFirstName(oRequest.getFirstName());
			oCliente.setLastName(oRequest.getLastName());
			oCliente.setEmail(oRequest.getEmail());
			LOGGER.info("[APX] Identificador 	: {}", idCustomer);
			LOGGER.info("[APX] CustomerDTO      : {}", oRequest.toString());
		} else {
			final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);
			Bson filter = FiltersWrapper.eq("id", idCustomer);
			connectorConfiguration.put(Parameters.FILTER, filter);

			DocumentWrapper oDocParent = new DocumentWrapper();
			DocumentWrapper oDoc = new DocumentWrapper();
			// oDoc.put("id", oRequest.getId());
			oDoc.put("firstName", oRequest.getFirstName());
			oDoc.put("lastName", oRequest.getLastName());
			oDoc.put("email", oRequest.getEmail());

			oDocParent.put("$set", oDoc);
			connectorConfiguration.put(Parameters.UPDATE_ONE, oDocParent);

			LOGGER.info("[APX] Identificador 	: {}", idCustomer);
			LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
			LOGGER.info("[APX] Filter        	: {}", filter);
			LOGGER.info("[APX] DocParentWrapper	: {}", oDoc);
			LOGGER.info("[APX] DocWrapper		: {}", oDoc);
			LOGGER.info("[APX] UPDATE_ONE    	: {}", Parameters.UPDATE_ONE);
			LOGGER.info("[APX] UPDATE_ONE    	: {}", EnumOperation.UPDATE_ONE);

			UpdateResultWrapper oWrprResult = this.daasMongoConnector.executeWithReturn(EnumOperation.UPDATE_ONE,
					connectorConfiguration);
			LOGGER.info("[APX] Documents founded:{}", oWrprResult.getMatchedCount());
			LOGGER.info("[APX] Documents updated:{}", oWrprResult.getModifiedCount());
			if (oWrprResult.getModifiedCount() != 0) {
				lRpta = Long.parseLong(oRequest.getId());
			}
		}
		return lRpta;
	}

	@Override
	public Long executeDeleteCustomer(String idCustomer) {
		LOGGER.info("[APX] executeDeleteCustomer ...");
		Long lRpta = 0L;
		if (idCustomer.equals("33333")) {
			CustomerDTO oCliente = new CustomerDTO();

			oCliente.setId(idCustomer);
			LOGGER.info("[APX] Identificador 	: {}", idCustomer);
			LOGGER.info("[APX] CustomerDTO      : {}", oCliente.toString());
		} else {
			final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);
			Bson filter = FiltersWrapper.eq("id", idCustomer);
			connectorConfiguration.put(Parameters.FILTER, filter);

			LOGGER.info("[APX] Identificador 	: {}", idCustomer);
			LOGGER.info("[APX] Filter        	: {}", filter);
			LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
			LOGGER.info("[APX] DELETE_ONE    	: {}", EnumOperation.DELETE_ONE);

			DeleteResultWrapper oWrprResult = this.daasMongoConnector.executeWithReturn(EnumOperation.DELETE_ONE,
					connectorConfiguration);
			LOGGER.info("[APX] Documents founded:{}", oWrprResult.getDeletedCount());
			if (oWrprResult.getDeletedCount() != 0) {
				lRpta = Long.parseLong(idCustomer);
			}
		}
		return lRpta;
	}

	@Override
	public CustomerDTO executeGetCustomer(String id) {
		LOGGER.info("[APX] executeGetCustomer ...");
		CustomerDTO customer = new CustomerDTO();
		if (id.equals("99999")) {
			customer.setId(id);
			customer.setFirstName("Alex Luis");
			customer.setLastName("Díaz Vásquez");
			customer.setEmail("alex.diaz.vazquez@gmail.com");

		} else {
			final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);

			Bson filter = FiltersWrapper.eq("id", id);
			connectorConfiguration.put(Parameters.FILTER, filter);

			LOGGER.info("[APX] Identificador 	: {}", id);
			LOGGER.info("[APX] Filter        	: {}", filter);
			LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
			LOGGER.info("[APX] FIND		    	: {}", EnumOperation.FIND);

			FindIterableWrapper<DocumentWrapper> oIterable = this.daasMongoConnector
					.executeWithReturn(EnumOperation.FIND, connectorConfiguration);
			LOGGER.info("[APX] DocumentWrapper	: {}", oIterable);

			if (!oIterable.equals(null)) {
				if (oIterable.iterator().hasNext()) {
					customer = ClientMapper.mapperCliente(oIterable.iterator().next());
					LOGGER.info("[APX] CustomerDTO	: {}", customer.toString());
				}
			}
		}
		return customer;
	}

	@Override
	public List<CustomerDTO> executeGetAllCustomer() {
		LOGGER.info("[APX] executeGetAllCustomer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);
		List<CustomerDTO> oListCustomer = new ArrayList<>();
		CustomerDTO customer = new CustomerDTO();

		Bson filter = null;
		connectorConfiguration.put(Parameters.FILTER, filter);

		// LOGGER.info("[APX] Identificador : {}", id);
		LOGGER.info("[APX] Filter        	: {}", filter);
		LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
		LOGGER.info("[APX] FIND		    	: {}", EnumOperation.FIND);

		FindIterableWrapper<DocumentWrapper> interable = this.daasMongoConnector.executeWithReturn(EnumOperation.FIND,
				connectorConfiguration);
		LOGGER.info("[APX] DocumentWrapper	: {}", interable);

		for (DocumentWrapper oDw : interable) {
			customer = ClientMapper.mapperCliente(oDw);
			LOGGER.info("[APX] CustomerDTO	: {}", customer.toString());

			oListCustomer.add(customer);
			customer = new CustomerDTO();
		}
		/*
		 * if (interable.iterator().hasNext()) { customer =
		 * ClientMapper.mapperCliente(interable.iterator().next()); LOGGER.info(
		 * "[APX] CustomerDTO	: {}", customer.toString());
		 * 
		 * oListCustomer.add(customer); customer = new CustomerDTO(); }
		 */
		LOGGER.info("[APX] List Wrapper : {}", oListCustomer.size());
		return oListCustomer;
	}

	@Override
	public Map<String, Object> executeGetListCustomerPagination(Integer pageSize, Integer paginationKey) {
		LOGGER.info("[APX] executeGetListCustomerPagination ...");

		Integer skipRows = pageSize * paginationKey;
		Integer limitRows = pageSize;

		LOGGER.info("[APX] pageSize 	 : {}", pageSize);
		LOGGER.info("[APX] paginationKey : {}", paginationKey);
		LOGGER.info("[APX] skipRows 	 : {}", skipRows);
		LOGGER.info("[APX] limitRows 	 : {}", limitRows);

		// Busqueda y el agrupamiento
		List<CustomerDTO> oCustomerList = listPaginationCustomer(skipRows, limitRows);
		// Conexion que traiga el total registros
		long total = countTotalCustomer();
		LOGGER.info("[APX] Total Registros... : {}", total);

		Map<String, Object> oResulMap = new HashMap<>();
		oResulMap.put("listCustomer", oCustomerList);
		oResulMap.put("total", total);

		return oResulMap;
	}

	protected Map<String, Object> getConexionMongo(String psPrefixDB) {
		LOGGER.info("[APX] getConexionMongo ...");
		Map<String, Object> params = new HashMap<>();

		params.put(Parameters.DATABASE_PROPERTY_NAME, psPrefixDB);
		params.put(Parameters.API_OR_REST, Parameters.API);
		
		return params;
	}

	private List<CustomerDTO> listPaginationCustomer(Integer skipRows, Integer limitRows) {
		LOGGER.info("[APX] listPaginationCustomer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);

		List<CustomerDTO> oResultCustomer = new ArrayList<>();
		BsonDocument oFilter = new BsonDocument();

		LOGGER.info("[APX] Configuration Pagination: {}", connectorConfiguration);

		// Generando una tubería de paginación y filtros en mongo
		connectorConfiguration.put(Parameters.PIPELINE, Arrays.asList(AggregatesWrapper.match(oFilter),
				AggregatesWrapper.skip(skipRows), AggregatesWrapper.limit(limitRows)));
		AggregateIterableWrapper oIterableWrapper = this.daasMongoConnector.executeWithReturn(EnumOperation.AGREGGATES,
				connectorConfiguration);

		LOGGER.info("[APX] PIPELINE 				: {}", Parameters.PIPELINE);
		LOGGER.info("[APX] AGREGGATES 				: {}", EnumOperation.AGREGGATES);
		LOGGER.info("[APX] AggregateIterableWrapper : {}", oIterableWrapper);

		LOGGER.info("[APX] Convert wrapper to list .....!}");

		for (DocumentWrapper oDw : oIterableWrapper) {
			oResultCustomer.add(ClientMapper.mapperCliente(oDw));
		}
		LOGGER.info("[APX] Count List Customer : {}", oResultCustomer.size());

		return oResultCustomer;
	}

	private long countTotalCustomer() {
		LOGGER.info("[APX] countTotalCustomer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_CUSTOMER);
		LOGGER.info("[APX] Configuration total : {}", connectorConfiguration);

		long total = 0;

		total = this.daasMongoConnector.executeWithReturn(EnumOperation.COUNT, connectorConfiguration);
		LOGGER.info("[APX] COUNT 			 : {}", EnumOperation.COUNT);
		LOGGER.info("[APX] executeWithReturn : {}", total);

		return total;
	}

	@Override
	public Long executeSaveTransfer(DTOTransferencia oRequest) {
		LOGGER.info("[APX] executeSaveTransfer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);

		DocumentWrapper oDoc = new DocumentWrapper();
		oDoc.put("idTransfer", oRequest.getIdTransfer());
		oDoc.put("fechaMovimiento", oRequest.getFechaMovimiento());
		oDoc.put("ordenante", oRequest.getOrdenante());
		oDoc.put("monedaOrigen", oRequest.getMonedaOrigen());
		oDoc.put("numeroCuentaOrigen", oRequest.getNumeroCuentaOrigen());
		oDoc.put("importeOrigen", oRequest.getImporteOrigen());
		oDoc.put("monedaDestino", oRequest.getMonedaDestino());
		oDoc.put("numeroCuentaDestino", oRequest.getNumeroCuentaDestino());
		oDoc.put("importeDestino", oRequest.getImporteDestino().doubleValue());
		oDoc.put("beneficiario", oRequest.getBeneficiario());

		connectorConfiguration.put(Parameters.DOCUMENT, oDoc);

		LOGGER.info("[APX] Transfer DTO           : {}", oRequest.toString());
		LOGGER.info("[APX] Conexion Configuration : {}", connectorConfiguration.toString());
		LOGGER.info("[APX] DocumentWrapper        : {}", oDoc.toString());
		LOGGER.info("[APX] Parameters.DOCUMENT    : {}", Parameters.DOCUMENT);
		LOGGER.info("[APX] Parameters.INSERT_ONE  : {}", EnumOperation.INSERT_ONE);

		this.daasMongoConnector.executeWithNoReturn(EnumOperation.INSERT_ONE, connectorConfiguration);

		return oRequest.getIdTransfer();
	}

	@Override
	public Long executeUpdateTransfer(Long idCustomer, DTOTransferencia oRequest) {
		LOGGER.info("[APX] executeUpdateTransfer ...");
		Long lRpta = 0L;
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);
		Bson filter = FiltersWrapper.eq("id", idCustomer);
		connectorConfiguration.put(Parameters.FILTER, filter);

		DocumentWrapper oDocParent = new DocumentWrapper();
		DocumentWrapper oDoc = new DocumentWrapper();
		oDoc.put("idTransfer", oRequest.getIdTransfer());
		oDoc.put("fechaMovimiento", oRequest.getFechaMovimiento());
		oDoc.put("ordenante", oRequest.getOrdenante());
		oDoc.put("monedaOrigen", oRequest.getMonedaOrigen());
		oDoc.put("numeroCuentaOrigen", oRequest.getNumeroCuentaOrigen());
		oDoc.put("importeOrigen", oRequest.getImporteOrigen());
		oDoc.put("monedaDestino", oRequest.getMonedaDestino());
		oDoc.put("numeroCuentaDestino", oRequest.getNumeroCuentaDestino());
		oDoc.put("importeDestino", oRequest.getImporteDestino());
		oDoc.put("beneficiario", oRequest.getBeneficiario());

		oDocParent.put("$set", oDoc);
		connectorConfiguration.put(Parameters.UPDATE_ONE, oDocParent);

		LOGGER.info("[APX] Identificador 	: {}", idCustomer);
		LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
		LOGGER.info("[APX] Filter        	: {}", filter);
		LOGGER.info("[APX] DocParentWrapper	: {}", oDoc);
		LOGGER.info("[APX] DocWrapper		: {}", oDoc);
		LOGGER.info("[APX] UPDATE_ONE    	: {}", Parameters.UPDATE_ONE);
		LOGGER.info("[APX] UPDATE_ONE    	: {}", EnumOperation.UPDATE_ONE);

		UpdateResultWrapper oWrprResult = this.daasMongoConnector.executeWithReturn(EnumOperation.UPDATE_ONE,
				connectorConfiguration);
		LOGGER.info("[APX] Documents founded:{}", oWrprResult.getMatchedCount());
		LOGGER.info("[APX] Documents updated:{}", oWrprResult.getModifiedCount());
		if (oWrprResult.getModifiedCount() != 0) {
			lRpta = oRequest.getIdTransfer();
		}
		return lRpta;

	}

	@Override
	public Long executeDeleteTransfer(Long psId) {
		LOGGER.info("[APX] executeDeleteTransfer ...");
		Long lRpta = 0L;
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);
		Bson filter = FiltersWrapper.eq("idTransfer", psId);
		connectorConfiguration.put(Parameters.FILTER, filter);

		LOGGER.info("[APX] Identificador 	: {}", psId);
		LOGGER.info("[APX] Filter        	: {}", filter);
		LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
		LOGGER.info("[APX] DELETE_ONE    	: {}", EnumOperation.DELETE_ONE);

		DeleteResultWrapper oWrprResult = this.daasMongoConnector.executeWithReturn(EnumOperation.DELETE_ONE,
				connectorConfiguration);
		LOGGER.info("[APX] Documents founded:{}", oWrprResult.getDeletedCount());
		if (oWrprResult.getDeletedCount() != 0) {
			// lRpta = Long.parseLong(psId);
			lRpta = psId;
		}
		return lRpta;
	}

	@Override
	public List<DTOTransferencia> executeGetAllTransfer() {
		LOGGER.info("[APX] executeGetAllTransfer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);
		List<DTOTransferencia> oListTransfer = new ArrayList<>();
		DTOTransferencia oTransfer = new DTOTransferencia();

		Bson filter = null;
		connectorConfiguration.put(Parameters.FILTER, filter);

		// LOGGER.info("[APX] Identificador : {}", id);
		LOGGER.info("[APX] Filter        	: {}", filter);
		LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
		LOGGER.info("[APX] FIND		    	: {}", EnumOperation.FIND);

		FindIterableWrapper<DocumentWrapper> interable = this.daasMongoConnector.executeWithReturn(EnumOperation.FIND,
				connectorConfiguration);
		LOGGER.info("[APX] DocumentWrapper	: {}", interable);

		for (DocumentWrapper oDw : interable) {
			oTransfer = ClientMapper.mapperTransfer(oDw);
			LOGGER.info("[APX] DTOTransfer	: {}", oTransfer.toString());

			oListTransfer.add(oTransfer);
			oTransfer = new DTOTransferencia();
		}

		LOGGER.info("[APX] List Wrapper : {}", oListTransfer.size());
		return oListTransfer;
	}

	@Override
	public DTOTransferencia executeGetTransfer(Long psId) {
		LOGGER.info("[APX] executeGetTransfer ...");
		DTOTransferencia oTransfer = new DTOTransferencia();
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);

		Bson filter = FiltersWrapper.eq("idTransfer", psId);
		connectorConfiguration.put(Parameters.FILTER, filter);

		LOGGER.info("[APX] Identificador 	: {}", psId);
		LOGGER.info("[APX] Filter        	: {}", filter);
		LOGGER.info("[APX] Configuration 	: {}", connectorConfiguration);
		LOGGER.info("[APX] FIND		    	: {}", EnumOperation.FIND);

		FindIterableWrapper<DocumentWrapper> oIterable = this.daasMongoConnector.executeWithReturn(EnumOperation.FIND,
				connectorConfiguration);
		LOGGER.info("[APX] DocumentWrapper	: {}", oIterable);

		if (!oIterable.equals(null)) {
			if (oIterable.iterator().hasNext()) {
				oTransfer = ClientMapper.mapperTransfer(oIterable.iterator().next());
				LOGGER.info("[APX] CustomerDTO	: {}", oTransfer.toString());
			}
		}
		return oTransfer;
	}

	@Override
	public Map<String, Object> executeGetListTransferPagination(Long pageSize, Long paginationKey) {
		LOGGER.info("[APX] executeGetListTransferPagination ...");

		Long skipRows = pageSize * paginationKey;
		Long limitRows = pageSize;

		LOGGER.info("[APX] pageSize 	 : {}", pageSize);
		LOGGER.info("[APX] paginationKey : {}", paginationKey);
		LOGGER.info("[APX] skipRows 	 : {}", skipRows);
		LOGGER.info("[APX] limitRows 	 : {}", limitRows);

		// Busqueda y el agrupamiento
		List<DTOTransferencia> oListTransfer = listPaginationTransfer(skipRows, limitRows);
		LOGGER.info("[APX] List<DTOTransferencia> ... : {}", oListTransfer.size());

		// Conexion que traiga el total registros
		Long total = countTotalTransfer();
		LOGGER.info("[APX] Total Registros... : {}", total);

		Map<String, Object> oResulMap = new HashMap<>();
		oResulMap.put("listTransfer", oListTransfer);
		oResulMap.put("total", total);
		LOGGER.info("[APX] Map<String, Object> ... : {}", oResulMap.values());

		return oResulMap;
	}

	private Long countTotalTransfer() {
		LOGGER.info("[APX] countTotalTransfer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);
		LOGGER.info("[APX] Conexion Configuration : {}", connectorConfiguration);

		Long total = 0L;

		total = this.daasMongoConnector.executeWithReturn(EnumOperation.COUNT, connectorConfiguration);
		LOGGER.info("[APX] COUNT 			 : {}", EnumOperation.COUNT);
		LOGGER.info("[APX] executeWithReturn : {}", total);

		return total;
	}

	private List<DTOTransferencia> listPaginationTransfer(Long skipRows, Long limitRows) {
		LOGGER.info("[APX] listPaginationTransfer ...");
		final Map<String, Object> connectorConfiguration = getConexionMongo(C_QWAI_TRANSFER);

		List<DTOTransferencia> oListResult = new ArrayList<>();
		BsonDocument oFilter = new BsonDocument();

		// Generando una tubería de paginación y filtros en mongo
		connectorConfiguration.put(Parameters.PIPELINE,
				Arrays.asList(AggregatesWrapper.match(oFilter), AggregatesWrapper.skip(Math.toIntExact(skipRows)),
						AggregatesWrapper.limit(Math.toIntExact(limitRows))));
		AggregateIterableWrapper oIterableWrapper = this.daasMongoConnector.executeWithReturn(EnumOperation.AGREGGATES,
				connectorConfiguration);

		LOGGER.info("[APX] PIPELINE 				: {}", Parameters.PIPELINE);
		LOGGER.info("[APX] AGREGGATES 				: {}", EnumOperation.AGREGGATES);
		LOGGER.info("[APX] AggregateIterableWrapper : {}", oIterableWrapper);

		LOGGER.info("[APX] Convert wrapper to list .....!}");

		for (DocumentWrapper oDw : oIterableWrapper) {
			oListResult.add(ClientMapper.mapperTransfer(oDw));
		}
		LOGGER.info("[APX] Count List Transfer : {}", oListResult.size());

		return oListResult;
	}
}
