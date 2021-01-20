package com.bbva.pglu.lib.r004.impl;

import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.dto.customer.ParameterException;
import com.bbva.pglu.lib.r004.impl.mapper.CustomerMapper;
import com.datiobd.daas.Parameters;
import com.datiobd.daas.conf.EnumOperation;
import com.datiobd.daas.conf.MongoConnectorException;
import com.datiobd.daas.model.*;
import com.datiobd.daas.model.json.FiltersWrapper;
import org.apache.commons.lang3.StringUtils;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class PGLUR004Impl extends PGLUR004Abstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(PGLUR004Impl.class);
    private static final String C_PGLU_CUSTOMER = "PGLUCUS";
    private static final String LASTNAME_ATRIBUTE = "firstName";

    @Override
    public void execute() {
        // TODO - Implementation of business logic
    }

    @Override
    public String executeSaveCustomer(CustomerDTO oRequest) {
        LOGGER.info("[APX-R1] executeSaveCustomer ...");
        LOGGER.info("[APX-R2] CustomerDTO            	: {}", oRequest.toString());

        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);
        LOGGER.info("[APX-R3] Conexion Configuration 	: {}", connectorConfiguration.size());

        DocumentWrapper oDoc = new DocumentWrapper();
        LOGGER.info("[APX-R4] Before DocumentWrapper        : {}", oDoc);

        oDoc.put("customerId", oRequest.getCustomerId());
        oDoc.put("firstName", oRequest.getFirstName());
        oDoc.put("lastName", oRequest.getLastName());

        LOGGER.info("[APX-R5] After DocumentWrapper    : ");

        connectorConfiguration.put(Parameters.DOCUMENT, oDoc);
        LOGGER.info("[APX-R6] After DocumentWrapper    : {}", oDoc.size());
        LOGGER.info("[APX-R7] After connectorConfiguration    : {}", connectorConfiguration.size());
        LOGGER.info("[APX-R8] Parameters.DOCUMENT    	: {}", Parameters.DOCUMENT.length());
        LOGGER.info("[APX-R9] EnumOperation.INSERT_ONE : {}", EnumOperation.INSERT_ONE);

        try {
            LOGGER.info("[APX-R10] to Mongo :");
            this.daasMongoConnector.executeWithNoReturn(EnumOperation.INSERT_ONE, connectorConfiguration);
            return oRequest.getCustomerId();
        } catch (MongoConnectorException ex) {
            LOGGER.info("[APX-R11] Error en Mongo : {}", ex.getMessage());
        } catch (Exception ex) {
            LOGGER.info("[APX-R12] Error en Mongo : {}", ex.getMessage());
        }
        LOGGER.info("[APX-R13] End INSERT_ONE : {}", oRequest.getCustomerId());

        return null;

    }

    @Override
    public Long executeUpdateCustomer(String idCustomer, CustomerDTO oRequest) {
        LOGGER.info("[APX] executeUpdateCustomer ...");
        Long lRpta = 0L;
        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);
        Bson filter = FiltersWrapper.eq("customerId", idCustomer);
        connectorConfiguration.put(Parameters.FILTER, filter);

        DocumentWrapper oDocParent = new DocumentWrapper();
        DocumentWrapper oDoc = new DocumentWrapper();

        oDoc.put("firstName", oRequest.getFirstName());
        oDoc.put("lastName", oRequest.getLastName());
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
            lRpta = Long.parseLong(oRequest.getCustomerId());
        }
        return lRpta;
    }

    @Override
    public Long executeDeleteCustomer(String idCustomer) {
        LOGGER.info("[APX] executeDeleteCustomer ...");
        Long lRpta = 0L;
        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);
        Bson filter = FiltersWrapper.eq("customerId", idCustomer);
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
        return lRpta;
    }

    @Override
    public List<CustomerDTO> executeGetAllCustomer() {
        LOGGER.info("[APX-R1] executeGetAllCustomer ...");
        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);
        List<CustomerDTO> oListCustomer = new ArrayList<>();
        CustomerDTO customer = new CustomerDTO();

        Bson filter = null;
        connectorConfiguration.put(Parameters.FILTER, filter);

        // LOGGER.info("[APX] Identificador : {}", id);
        LOGGER.info("[APX-R2] Filter        	: {}", filter);
        LOGGER.info("[APX-R3] Configuration 	: {}", connectorConfiguration.size());
        LOGGER.info("[APX-R4] FIND		    	: {}", EnumOperation.FIND);
        try {
            LOGGER.info("[APX-R5] to Mongo :");

            FindIterableWrapper<DocumentWrapper> interable = this.daasMongoConnector.executeWithReturn(EnumOperation.FIND,
                    connectorConfiguration);
            LOGGER.info("[APX-R6] DocumentWrapper	: {}", interable);

            for (DocumentWrapper oDw : interable) {
                customer = CustomerMapper.mapperCustomer(oDw);
                LOGGER.info("[APX-7] CustomerDTO	: {}", customer.toString());

                oListCustomer.add(customer);
                customer = new CustomerDTO();
            }

        } catch (MongoConnectorException ex) {
            LOGGER.info("[APX-R8] Error en Mongo : {}", ex.getMessage());
        } catch (Exception ex) {
            LOGGER.info("[APX-R9] Error en Mongo : {}", ex.getMessage());
        }
        LOGGER.info("[APX-R10] List Wrapper : {}", oListCustomer.size());
        return oListCustomer;
    }

    @Override
    public List<CustomerDTO> executeFindCustomerByName(String psName) {
        LOGGER.info("[APX] executeFindCustomerByName ... [{}]", psName);

        if (!StringUtils.isAlpha(psName)) {
            throw new ParameterException("PGLU10000000", "FIRST_NAME");
        }

        List<CustomerDTO> customers = new ArrayList<>();

        Map<String, Object> conectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);

        conectorConfiguration.put(Parameters.FILTER, FiltersWrapper.eq(LASTNAME_ATRIBUTE, psName));

        // Ejecutamos la consulta con retorno
        FindIterableWrapper<DocumentWrapper> oIterableWrapper = daasMongoConnector.executeWithReturn(EnumOperation.FIND, conectorConfiguration);

        if (oIterableWrapper.iterator().hasNext()) {
            for (DocumentWrapper oDw : oIterableWrapper) {
                // Mapeamos cada resultado al objeto ClienteDTO
                customers.add(CustomerMapper.mapperCustomer(oDw));
            }
        }

        LOGGER.info("[APX] executeFindCustomerName [resultados = {}]", customers.size());

        return customers;
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
        LOGGER.info("[APX] Parámetros Mongo ...", params);
        return params;
    }

    private List<CustomerDTO> listPaginationCustomer(Integer skipRows, Integer limitRows) {
        LOGGER.info("[APX] listPaginationCustomer ...");
        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);

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
            oResultCustomer.add(CustomerMapper.mapperCustomer(oDw));
        }
        LOGGER.info("[APX] Count List Customer : {}", oResultCustomer.size());

        return oResultCustomer;
    }

    private long countTotalCustomer() {
        LOGGER.info("[APX] countTotalCustomer ...");
        final Map<String, Object> connectorConfiguration = getConexionMongo(C_PGLU_CUSTOMER);
        LOGGER.info("[APX] Configuration total : {}", connectorConfiguration);

        long total = 0;

        total = this.daasMongoConnector.executeWithReturn(EnumOperation.COUNT, connectorConfiguration);
        LOGGER.info("[APX] COUNT 			 : {}", EnumOperation.COUNT);
        LOGGER.info("[APX] executeWithReturn : {}", total);

        return total;
    }
}
