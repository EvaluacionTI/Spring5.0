package pe.unjfsc.daw.spring5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.entity.CEProducto;

public class CDLoadData {
	private static final Logger LOG = LoggerFactory.getLogger("CDLoadData");
	
	private HashSet<CEProducto> oListProduct;
	private ArrayList<CECliente> oListClient;
	private LinkedHashSet<CECompraEfectuada> oListCompraEfectuadas;
	private LinkedHashSet<CECompraEfectuada> oListCompraEfectuadasRpta;
    private ArrayList<CECompraEfectuada> oListBuyFinal;
    private CECompraEfectuada oCECompraRpta;

	public CDLoadData() {
		loadProducto();
		loadCliente();
		loadCompraEfectuadas();
	}
	
	public HashSet<CEProducto> loadProducto(){
		oListProduct = new HashSet<>();
		oListProduct.add(new CEProducto(10, "Bebidas", "Gasesosa", "Retornable", "Coca cola", "1.5 lt", 6.00));
		oListProduct.add(new CEProducto(15, "Bebidas", "Gasesosa", "Retornable", "Coca cola", "1.0 lt", 3.50));
		oListProduct.add(new CEProducto(20, "Bebidas", "Gasesosa", "No retornable", "Coca cola", "500 ml", 2.50));
		oListProduct.add(new CEProducto(25, "Bebidas", "Gasesosa", "Retornable", "Inka kola", "500 ml", 2.50));
		oListProduct.add(new CEProducto(30, "Bebidas", "Gasesosa", "No retornable", "Inka kola", "2 lt", 6.50));
		oListProduct.add(new CEProducto(35, "Licores", "Cervezas", "Botella", "Pilsen", "650 ml", 6.50));
		oListProduct.add(new CEProducto(40, "Licores", "Cervezas", "Botella", "Cristal", "650 ml", 6.50));
		oListProduct.add(new CEProducto(45, "Lacteos", "Formula de crecimiento", "Nan3", "Nestle", "Liquida", 3.70));
		oListProduct.add(new CEProducto(50, "Lacteos", "Formula lactea", "Nan2", "Nestle", "Liquida", 4.30));
		LOG.info("[EVL] Load List Product : {}", oListProduct.size() );

		return oListProduct;
	}

	public ArrayList<CECliente> loadCliente(){
		oListClient = new ArrayList<>();
		oListClient.add(new CECliente ("0333132031", null, "0333132031@unjfsc.edu.pe", "PÉREZ RIVERA GIANELA ESTHER"));
		oListClient.add(new CECliente ("0333092018", null, "0333092018@unjfsc.edu.pe", "ALCÁNTARA MIRANDA CARLOS ENRIQU"));
		oListClient.add(new CECliente ("0333141002", null, "0333141002@unjfsc.edu.pe", "ARAMBULO AQUIJES GEAN PAUL ALEX"));
		oListClient.add(new CECliente ("0333161007", null, "0333161007@unjfsc.edu.pe", "BORDA NONATO CARLOS ALONSO"));
		oListClient.add(new CECliente ("0333161010", null, "0333161010@unjfsc.edu.pe", "CHÁVEZ OBREGÓN LEONEL GUILLERMO"));
		oListClient.add(new CECliente ("0333161014", null, "0333161014@unjfsc.edu.pe", "FELIX ESCALANTE ANGEL GABINO"));
		oListClient.add(new CECliente ("0333152007", null, "0333152007@unjfsc.edu.pe", "FLORES BRONCANO PEDRO CESAR"));
		oListClient.add(new CECliente ("0333111040", null, "0333111040@unjfsc.edu.pe", "FLORES ROMERO EBLÉ CHRISTIAN"));
		oListClient.add(new CECliente ("0333132017", null, "0333132017@unjfsc.edu.pe", "GARGATE TARAZONA JHIMI RUSVEL"));
		oListClient.add(new CECliente ("0333152034", null, "0333152034@unjfsc.edu.pe", "LA ROSA FERNÁNDEZ ANGELA ELIZAB"));
		oListClient.add(new CECliente ("0333142015", null, "0333142015@unjfsc.edu.pe", "LANDA SOLIS JUNIOR IVAN"));
		oListClient.add(new CECliente ("0333151023", null, "0333151023@unjfsc.edu.pe", "MENDOZA SAMAN LEIDY VANESSA"));
		oListClient.add(new CECliente ("0333161030", null, "0333161030@unjfsc.edu.pe", "MUNAYCO PERALTA JERCY BRYAN"));
		oListClient.add(new CECliente ("0333142025", null, "0333142025@unjfsc.edu.pe", "NARVASTA VELAZCO ANTHONY JHONAT"));
		oListClient.add(new CECliente ("0333161033", null, "0333161033@unjfsc.edu.pe", "OLORTIGUE JIMENEZ KENT NAY"));
		oListClient.add(new CECliente ("0333161034", null, "0333161034@unjfsc.edu.pe", "ORTIZ GARCÍA ALISON GERALDINE"));
		oListClient.add(new CECliente ("0333161045", null, "0333161045@unjfsc.edu.pe", "SANCHEZ CASTRO ROBERTO FREDI"));
		oListClient.add(new CECliente ("0333161046", null, "0333161046@unjfsc.edu.pe", "URBANO LINO JHEYSSON JESÚS"));
		oListClient.add(new CECliente ("0333161048", null, "0333161048@unjfsc.edu.pe", "VARGAS LEÓN BEATRIZ MILAGRITOS"));
		oListClient.add(new CECliente ("0333141049", null, "0333141049@unjfsc.edu.pe", "ZELAYA HUERTA CLAUDIA JULISA"));
		oListClient.add(new CECliente ("0333142040", null, "0333142040@unjfsc.edu.pe", "ZEVALLOS SALAS DELMER FRANCISCO"));

		LOG.info("[EVL] Load List Cliente : {}", oListClient.size() );
		return oListClient;
	}

	public LinkedHashSet<CECompraEfectuada> loadCompraEfectuadas(){
		oListCompraEfectuadas = new LinkedHashSet<CECompraEfectuada>();
		
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333132031", "17/10/2020", 10,  2,6.00));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333152034", "16/10/2020", 15,  4,3.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333152034", "16/10/2020", 20,  6,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333151023", "15/10/2020", 25,  8,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333151023", "15/10/2020", 30, 11,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333151023", "15/10/2020", 35, 15,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161034", "14/10/2020", 40, 13,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161034", "14/10/2020", 45, 24,3.70));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161034", "14/10/2020", 50, 24,4.30));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161034", "14/10/2020", 10, 12,6.00));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161048", "14/10/2020", 15, 14,3.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333141049", "15/10/2020", 20, 16,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161033", "16/10/2020", 25, 18,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161033", "16/10/2020", 30, 21,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161033", "16/10/2020", 35, 25,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161046", "17/10/2020", 40, 26,6.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333161046", "17/10/2020", 45, 48,3.70));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333142040", "08/10/2020", 50, 12,4.30));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333132031", "07/10/2020", 10,  3,6.00));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333152034", "06/10/2020", 15,  5,3.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333152034", "06/10/2020", 20,  7,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333151023", "05/10/2020", 25,  9,2.50));
		oListCompraEfectuadas.add(new CECompraEfectuada( "0333151023", "05/10/2020", 30, 12,6.50));
		
		LOG.info("[EVL] Load List Compra Efectuadas : {}", oListCompraEfectuadas.size() );

		return oListCompraEfectuadas;
	}

	public LinkedHashSet<CECompraEfectuada> loadNameCompraEfectuadas(){
		oListCompraEfectuadasRpta = new LinkedHashSet<CECompraEfectuada>();
		
		oListCompraEfectuadasRpta = getNameClientProduct(oListCompraEfectuadas);
		LOG.info("[EVL] Load List Compra Efectuadas Rpta : {}", oListCompraEfectuadasRpta.size() );
		return oListCompraEfectuadasRpta;
	}
	
	protected LinkedHashSet<CECompraEfectuada> getNameClientProduct(LinkedHashSet<CECompraEfectuada> poLista){
		LinkedHashSet<CECompraEfectuada> oListaRpta = new LinkedHashSet<CECompraEfectuada>();
		oCECompraRpta = new CECompraEfectuada();
		
		for (CECompraEfectuada oItem : poLista) {
			LOG.info("[EVL] Read CECompraEfectuada : {}", oItem );
			oCECompraRpta = foundClientProduc(oItem);
			LOG.info("[EVL] Read New CECompraEfectuada : {}", oCECompraRpta );
			oListaRpta.add(oCECompraRpta);
			oCECompraRpta = new CECompraEfectuada();
		}
		return oListaRpta;
	}
	
	protected CECompraEfectuada foundClientProduc(CECompraEfectuada poCECompra) {
		oCECompraRpta = new CECompraEfectuada();
		oCECompraRpta = poCECompra;
		for (CECliente oCEItem : oListClient) {
			if (poCECompra.getCodigoCliente().equals(oCEItem.getCodigoCliente())){
				oCECompraRpta.setNameClient(oCEItem.getNombre());
				break;
			}
		}
		
		for (CEProducto oCEItem : oListProduct) {
			if (poCECompra.getIdProducto()==oCEItem.getId()) {
				oCECompraRpta.setNameProduct(oCEItem.getCategoria()+"/"+oCEItem.getClase()+"/"+oCEItem.getTipoProducto()+"/"+oCEItem.getMarca()+"/"+oCEItem.getModeloPresentacion());
				break;
			}
		}
		
		return oCECompraRpta;
	}
	
	public ArrayList<CECompraEfectuada> detailBuyNotOrder(String psCodigo){
		LinkedHashSet<CECompraEfectuada> oListaRpta = new LinkedHashSet<CECompraEfectuada>();
		ArrayList<CECompraEfectuada> oListNotOrder = new ArrayList<CECompraEfectuada>();
		
		oListaRpta = getNameClientProduct(oListCompraEfectuadas);
		for (CECompraEfectuada oCEItem : oListaRpta) {
			if(oCEItem.getCodigoCliente().equals(psCodigo)) {
				oListNotOrder.add(oCEItem);
			}
		}
		LOG.info("[EVL] Lista sin ordenar : {}", oListNotOrder );
		return oListNotOrder;
	}
	
	public ArrayList<CECompraEfectuada> detailBuyOrder(String psCodigo){
		LinkedHashSet<CECompraEfectuada> oListaRpta = new LinkedHashSet<CECompraEfectuada>();
		ArrayList<CECompraEfectuada> oListOrder = new ArrayList<CECompraEfectuada>();
		
		oListaRpta = getNameClientProduct(oListCompraEfectuadas);
		for (CECompraEfectuada oCEItem : oListaRpta) {
			if(oCEItem.getCodigoCliente().equals(psCodigo)) {
				oListOrder.add(oCEItem);
			}
		}

		Collections.sort(oListOrder, new Comparator<CECompraEfectuada>() {

			@Override
			public int compare(CECompraEfectuada o1, CECompraEfectuada o2) {
				if (o1.getCantidad() < o2.getCantidad()) {
					return 1;
				}
				if (o1.getCantidad() > o2.getCantidad()) {
					return -1;
				}
				return 0;
			}
			
		});
		LOG.info("[EVL] Lista ordenada : {}", oListOrder );
		return oListOrder;
	}	

    public ArrayList<CECompraEfectuada> detailAccumulatedBuyOrder(String psCodigo) {
        LinkedHashSet<CECompraEfectuada> oListaRpta = new LinkedHashSet<>();
        ArrayList<CECompraEfectuada> oListOrder = new ArrayList<>();

        oListaRpta = getNameClientProduct(oListCompraEfectuadas);
        for (CECompraEfectuada oCEItem : oListaRpta) {
            if (oCEItem.getCodigoCliente().equals(psCodigo)) {
                oListOrder.add(oCEItem);
            }
        }
        LOG.info("[EVL] Lista seleccionada : {}", oListOrder.size());

        short iFlagPrimero = 0;
        for (CECompraEfectuada oCEItem : oListOrder) {
            if (iFlagPrimero == 0) {
                oListBuyFinal.add(oCEItem);
                LOG.info("[EVL] Lista 1er vez Buy final : {}", oListBuyFinal);
                iFlagPrimero = 1;
            } else {
                acumulaBuy(oCEItem);
            }
        }

        Collections.sort(oListBuyFinal, (CECompraEfectuada o1, CECompraEfectuada o2) -> {
            if (o1.getCantidad() < o2.getCantidad()) {
                return 1;
            }
            if (o1.getCantidad() > o2.getCantidad()) {
                return -1;
            }
            return 0;
        });
        LOG.info("[EVL] Lista ordenada : {}", oListOrder);
        return oListBuyFinal;
    }

    protected void acumulaBuy(CECompraEfectuada poCECompra) {
        CECompraEfectuada oCEAcumula = new CECompraEfectuada();
        int iAcumulaCantidad, iTotalAcumulaCantidad;
        LOG.info("[EVL] Buy que viene : {}", poCECompra);
        for (CECompraEfectuada oCEItem : oListBuyFinal) {
            if (oCEItem.getIdProducto() == poCECompra.getIdProducto()) {
                iAcumulaCantidad = oCEItem.getCantidad();
                iTotalAcumulaCantidad = iAcumulaCantidad + poCECompra.getCantidad();
                oCEAcumula = oCEItem;
                oCEAcumula.setCantidad(iTotalAcumulaCantidad);
                oListBuyFinal.remove(oCEItem);
                oListBuyFinal.add(oCEAcumula);
                LOG.info("[EVL] Lista buy acumula final : {}", oListBuyFinal);
                break; // Como es dinamico la lista debe salir
            } else {
                oListBuyFinal.add(poCECompra);
                LOG.info("[EVL] Lista new buy final : {}", oListBuyFinal);
                break; // Como es dinamico la lista debe salir
            }
        }
    }

    public ArrayList<CECompraEfectuada> detailNotBuy(String psCodigo) {
        LinkedHashSet<CECompraEfectuada> oListaRpta = new LinkedHashSet<CECompraEfectuada>();
        ArrayList<CECompraEfectuada> oListNotOrder = new ArrayList<CECompraEfectuada>();

        oListaRpta = getNameClientProduct(oListCompraEfectuadas);
        short iNoExiste = 0;
        for (CECompraEfectuada oCEItem : oListaRpta) {
            if (oCEItem.getCodigoCliente().equals(psCodigo)) {
                iNoExiste = 1;
                break;
            }
        }

        if (iNoExiste == 0) {
            oCECompraRpta = new CECompraEfectuada();
            for (CEProducto oCEItem : oListProduct) {
                oCECompraRpta.setCodigoCliente(psCodigo);
                oCECompraRpta.setIdProducto(oCEItem.getId());
                oCECompraRpta.setNameProduct(oCEItem.getCategoria() + "/" + oCEItem.getClase() + "/" + oCEItem.getTipoProducto() + "/" + oCEItem.getMarca() + "/" + oCEItem.getModeloPresentacion());
                oCECompraRpta.setPrecioVenta(oCEItem.getPrecioVenta());
                oListNotOrder.add(oCECompraRpta);
                oCECompraRpta = new CECompraEfectuada();
            }
        }

        LOG.info("[EVL] Lista sin ordenar : {}", oListNotOrder);
        return oListNotOrder;
    }	
}
