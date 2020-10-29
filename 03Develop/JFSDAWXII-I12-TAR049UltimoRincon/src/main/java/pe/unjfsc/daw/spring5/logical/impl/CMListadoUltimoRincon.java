package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CIMostrarListado;
import pe.unjfsc.daw.spring5.model.CDLoadData;

public class CMListadoUltimoRincon implements CIMostrarListado{
private static final Logger LOG = LoggerFactory.getLogger("CMListadoUltimoRincon");
	
	private HashSet<CEProducto> moHashSet;
	private ArrayList<CECliente> moArrayList;

	private LinkedHashSet<CECompraEfectuada> moLinkedHashSet;
	private ArrayList<CECompraEfectuada> moArrayListNotOrder;
	private ArrayList<CECompraEfectuada> moArrayListOrder;
	
	private CDLoadData oCDLoadData;

	public void setoCDLoadData(CDLoadData oCDLoadData) {
		this.oCDLoadData = oCDLoadData;
	}
	
	@Override
	public HashSet<CEProducto> listaProducto() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moHashSet = oCDLoadData.loadProducto();
		LOG.info("[EVL] Read data CDLoadData : {}", moHashSet.size());
		return moHashSet;
	}

	@Override
	public ArrayList<CECliente> listaCliente() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moArrayList = oCDLoadData.loadCliente();
		LOG.info("[EVL] Read data CDLoadData : {}", moArrayList.size());
		return moArrayList;
	}


	@Override
	public LinkedHashSet<CECompraEfectuada> listaCompraEfectuada() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moLinkedHashSet = oCDLoadData.loadCompraEfectuadas();
		LOG.info("[EVL] Read data CDLoadData : {}", moLinkedHashSet.size());
		return moLinkedHashSet;
	}
	
	@Override
	public LinkedHashSet<CECompraEfectuada> listaClientProductCompraEfectuada() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moLinkedHashSet = oCDLoadData.loadNameCompraEfectuadas();
		LOG.info("[EVL] Read data CDLoadData : {}", moLinkedHashSet.size());
		return moLinkedHashSet;
	}
	
	@Override
	public ArrayList<CECompraEfectuada> detailBuyNotOrder(String psCodigo) {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moArrayListNotOrder = oCDLoadData.detailBuyNotOrder(psCodigo);
		LOG.info("[EVL] Read data CDLoadData : {}", moArrayListNotOrder.size());
		return moArrayListNotOrder;
	}

	@Override
	public ArrayList<CECompraEfectuada> detailBuyOrder(String psCodigo) {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moArrayListOrder = oCDLoadData.detailBuyOrder(psCodigo);
		LOG.info("[EVL] Read data CDLoadData : {}", moArrayListOrder.size());
		return moArrayListOrder;
	}
	
	@Override
	public ArrayList<CECompraEfectuada> detailAccumulatedBuyOrder(String psCodigo) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        moArrayListOrder = oCDLoadData.detailAccumulatedBuyOrder(psCodigo);
        LOG.info("[EVL] Read data CDLoadData : {}", moArrayListOrder.size());
        return moArrayListOrder;
	}

	@Override
	public ArrayList<CECompraEfectuada> detailNotBuy(String psCodigo) {
	      oCDLoadData = new CDLoadData();
	        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
	        moArrayListOrder = oCDLoadData.detailNotBuy(psCodigo);
	        LOG.info("[EVL] Read data CDLoadData : {}", moArrayListOrder.size());
	        return moArrayListOrder;
	}

	@Override
	public String[][] convertHashSetToMatriz(HashSet<CEProducto> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][7];

        int iRow = 0;
        for (CEProducto oItem : poLista) {
            aDataResponse[iRow][0] = String.valueOf(oItem.getId());
            aDataResponse[iRow][1] = oItem.getCategoria();
            aDataResponse[iRow][2] = oItem.getClase();
            aDataResponse[iRow][3] = oItem.getTipoProducto();
            aDataResponse[iRow][4] = oItem.getMarca();
            aDataResponse[iRow][5] = oItem.getModeloPresentacion();
            aDataResponse[iRow][6] = String.valueOf(oItem.getPrecioVenta());
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}

	@Override
	public String[][] convertArrayListToMatriz(ArrayList<CECliente> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][4];

        int iRow = 0;
        for (CECliente oItem : poLista) {
            aDataResponse[iRow][0] = oItem.getCodigoCliente();
            aDataResponse[iRow][1] = oItem.getNombre();
            aDataResponse[iRow][2] = oItem.getCorreo();
            aDataResponse[iRow][3] = oItem.getNumeroDNI();
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}

	@Override
	public String[][] convertLinkedHashSetToMatriz(LinkedHashSet<CECompraEfectuada> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][6];

        int iRow = 0;
        for (CECompraEfectuada oItem : poLista) {
            aDataResponse[iRow][0] = oItem.getCodigoCliente();
            aDataResponse[iRow][1] = oItem.getFechaCompra();
            aDataResponse[iRow][2] = String.valueOf(oItem.getIdProducto());
            aDataResponse[iRow][3] = String.valueOf(oItem.getCantidad());
            aDataResponse[iRow][4] = String.valueOf(oItem.getPrecioVenta());
            aDataResponse[iRow][5] = String.valueOf(oItem.getTotalVenta());
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}

	@Override
	public String[][] convertLinkedHashSetNameToMatriz(LinkedHashSet<CECompraEfectuada> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][6];

        int iRow = 0;
        for (CECompraEfectuada oItem : poLista) {
            aDataResponse[iRow][0] = oItem.getNameClient();
            aDataResponse[iRow][1] = oItem.getFechaCompra();
            aDataResponse[iRow][2] = oItem.getNameProduct();
            aDataResponse[iRow][3] = String.valueOf(oItem.getCantidad());
            aDataResponse[iRow][4] = String.valueOf(oItem.getPrecioVenta());
            aDataResponse[iRow][5] = String.valueOf(oItem.getTotalVenta());
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}

	@Override
	public String[][] convertBuyArrayListToMatriz(ArrayList<CECompraEfectuada> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][6];

        int iRow = 0;
        for (CECompraEfectuada oItem : poLista) {
            aDataResponse[iRow][0] = oItem.getNameClient();
            aDataResponse[iRow][1] = oItem.getFechaCompra();
            aDataResponse[iRow][2] = oItem.getNameProduct();
            aDataResponse[iRow][3] = String.valueOf(oItem.getCantidad());
            aDataResponse[iRow][4] = String.valueOf(oItem.getPrecioVenta());
            aDataResponse[iRow][5] = String.valueOf(oItem.getTotalVenta());
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}

	@Override
	public String[][] convertNotBuyArrayListToMatriz(ArrayList<CECompraEfectuada> poLista) {
        oCDLoadData = new CDLoadData();
        LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
        LOG.info("[EVL] Convert to Matriz : {}", poLista);
        String[][] aDataResponse = new String[poLista.size()][4];

        int iRow = 0;
        for (CECompraEfectuada oItem : poLista) {
            aDataResponse[iRow][0] = oItem.getNameProduct();
            aDataResponse[iRow][1] = String.valueOf(oItem.getCantidad());
            aDataResponse[iRow][2] = String.valueOf(oItem.getPrecioVenta());
            aDataResponse[iRow][3] = String.valueOf(oItem.getTotalVenta());
            iRow++;
        }
        LOG.info("[EVL] Matriz : {}", aDataResponse.length);
        return aDataResponse;
	}


}
