package pe.bbva.evalua.spring5.model.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.model.CIRetiroAFP25;

public class CDRetiroAFP25Matrices implements CIRetiroAFP25{
	private static final Logger LOG = LoggerFactory.getLogger("CDRetiroAFP25Matrices");
	
	private Object[][] oData;
	private int miRowData=0, miColData=0;
	
	public CDRetiroAFP25Matrices() {
		oData = new Object[100][3];
		
		//Columna : 0 = Identificador, 1=Codigo Afiliado, 2=Saldo CIC
		
		oData[0][0] = 1;
		oData[1][0] = 2;
		oData[2][0] = 3;
		oData[3][0] = 4;
		oData[4][0] = 5;
		oData[5][0] = 6;
		oData[6][0] = 7;
		oData[7][0] = 8;
		oData[8][0] = 9;
		oData[9][0] = 10;
		oData[10][0] = 11;
		oData[11][0] = 12;
		oData[12][0] = 13;
		oData[13][0] = 14;
		oData[14][0] = 15;
		oData[15][0] = 16;
		oData[16][0] = 17;
		oData[17][0] = 18;
		oData[18][0] = 19;
		oData[19][0] = 20;
		oData[20][0] = 21;		
		
		oData[0][1] = "2000";
		oData[1][1] = "2001";
		oData[2][1] = "2002";
		oData[3][1] = "2003";
		oData[4][1] = "2004";
		oData[5][1] = "2005";
		oData[6][1] = "2006";
		oData[7][1] = "2007";
		oData[8][1] = "2008";
		oData[9][1] = "2009";
		oData[10][1] = "2010";
		oData[11][1] = "2011";
		oData[12][1] = "2012";
		oData[13][1] = "2013";
		oData[14][1] = "2014";
		oData[15][1] = "2015";
		oData[16][1] = "2016";
		oData[17][1] = "2017";
		oData[18][1] = "2018";
		oData[19][1] = "2019";
		oData[20][1] = "2020";
		
		oData[0][2] = 3500.00;
		oData[1][2] = 4500.00;
		oData[2][2] = 5500.00;
		oData[3][2] = 0.00;
		oData[4][2] = 7800.00;
		oData[5][2] = 8500.00;
		oData[6][2] = 9500.00;
		oData[7][2] = 10500.00;
		oData[8][2] = 0.00;
		oData[9][2] = 13500.00;
		oData[10][2] = 14500.00;
		oData[11][2] = 16500.00;
		oData[12][2] = 17500.00;
		oData[13][2] = 0.00;
		oData[14][2] = 19500.00;
		oData[15][2] = 23500.00;
		oData[16][2] = 33500.00;
		oData[17][2] = 0.00;
		oData[18][2] = 53500.00;
		oData[19][2] = 55500.00;
		oData[20][2] = 21700.00;
	}
	
	
	@Override
	public void saveRetiroDimensional(Object[][] poData) {
		
		int lId = (int) poData[0][0];
		String lCodigo = (String) poData[0][1];
		double lSaldoCIC = (double) poData[0][2];
		
		for (int x=0;x<oData.length;x++) {
			LOG.info("[EVL] data : {}", oData[x]);
			LOG.info("[EVL] data 3 column : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
			if (oData[x][0]==null && oData[x][1]==null && oData[x][2]==null){
				LOG.info("[EVL] Before :  {}", oData);
				oData[x][0] = lId;
				oData[x][1] = lCodigo;
				oData[x][2] = lSaldoCIC;
				LOG.info("[EVL] After :  {}", oData);
				x=oData.length+1;
			}
		}
		
	}

	@Override
	public void updateRetiroDimensional(Object[][] poData) {
		
		int lId = (int) poData[0][0];
		String lCodigo = (String) poData[0][1];
		double lSaldoCIC = (double) poData[0][2];
		
		for (int x=0;x<oData.length;x++) {
			LOG.info("[EVL] data : {}", oData[x]);
			LOG.info("[EVL] data 3 column : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
			if (oData[x][0]==null && oData[x][1]==null && oData[x][2]==null){
				continue;
			}else {
				if(oData[x][0].equals(lId)) {
					LOG.info("[EVL] Id :  {}", lId);
					LOG.info("[EVL] Id :  {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
					LOG.info("[EVL] Before :  {}", oData);
					oData[x][1] = lCodigo;
					oData[x][2] = lSaldoCIC;
					LOG.info("[EVL] After :  {}", oData);
					x=oData.length+1;
				}
			}
		}
	}

	@Override
	public void deleteRetiroDimensional(int pId) {
		
		for (int x=0;x<oData.length;x++) {
			LOG.info("[EVL] data : {}", oData[x]);
			LOG.info("[EVL] data 3 column : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
			if (oData[x][0]==null && oData[x][1]==null && oData[x][2]==null){
				continue;
			}else {
				if(oData[x][0].equals(pId)) {
					LOG.info("[EVL] Id :  {}", pId);
					LOG.info("[EVL] Id :  {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
					LOG.info("[EVL] Before :  {}", oData);
					oData[x][0] = null;
					oData[x][1] = null;
					oData[x][2] = null;
					LOG.info("[EVL] After :  {}", oData);
					x=oData.length+1;
				}
			}
		}
	}

	@Override
	public Object[][] consultaAllRetiroDimensional() {
		Object[][] oDataResult;
		
		LOG.info("[EVL] Size oData :  {}", oData.length);
		for (int x=0;x<oData.length;x++) {
			LOG.info("[EVL] data : {}", oData[x]);
			LOG.info("[EVL] data 3 column : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
			if (oData[x][0]==null && oData[x][1]==null && oData[x][2]==null){
				x=101;
			}else {
				miRowData++;
			}
		}
		LOG.info("[EVL] Filas con data : {}", miRowData);
		
		oDataResult = new Object[miRowData][3];
		for (int x=0;x<miRowData;x++) {
			oDataResult[x][0]= oData[x][0];
			oDataResult[x][1] = oData[x][1];
			oDataResult[x][2] = oData[x][2];
		}

		return oDataResult;
	}

	@Override
	public Object[][] consultaByIdRetiroDimensional(int pId) {
		Object[][] oDataResult = new Object[1][3];
		
		for (int x=0;x<oData.length;x++) {
			LOG.info("[EVL] data : {}", oData[x]);
			LOG.info("[EVL] data 3 column : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
			if (oData[x][0]==null && oData[x][1]==null && oData[x][2]==null){
				x=oData.length+1;
			}else {
				if(oData[x][0].equals(pId)) {
					oDataResult[0][0] = oData[x][0];
					oDataResult[0][1] = oData[x][1];
					oDataResult[0][2] = oData[x][2];
					LOG.info("[EVL] Id :  {}", pId);
					LOG.info("[EVL] Id :  {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
					LOG.info("[EVL] Id :  {}", oDataResult);
					x=oData.length+1;
				}
			}
		}
		return oDataResult;
	}
}
