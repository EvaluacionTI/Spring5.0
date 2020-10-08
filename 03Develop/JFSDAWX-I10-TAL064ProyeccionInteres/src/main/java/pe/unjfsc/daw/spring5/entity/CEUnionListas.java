package pe.unjfsc.daw.spring5.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CEUnionListas {
	private HashSet<CEProyeccion> oListHashSet;
	private TreeSet<CEProyeccion> oListTreeSet;
	private LinkedHashSet<CEProyeccion> oListLnkSet;
	
	private ArrayList<CEProyeccion> oListArray;
	private List<CEProyeccion> oList;
	private LinkedList<CEProyeccion> oListLnk;
	
	public HashSet<CEProyeccion> getoListHashSet() {
		return oListHashSet;
	}
	public void setoListHashSet(HashSet<CEProyeccion> oListHashSet) {
		this.oListHashSet = oListHashSet;
	}
	public TreeSet<CEProyeccion> getoListTreeSet() {
		return oListTreeSet;
	}
	public void setoListTreeSet(TreeSet<CEProyeccion> oListTreeSet) {
		this.oListTreeSet = oListTreeSet;
	}
	public LinkedHashSet<CEProyeccion> getoListLnkSet() {
		return oListLnkSet;
	}
	public void setoListLnkSet(LinkedHashSet<CEProyeccion> oListLnkSet) {
		this.oListLnkSet = oListLnkSet;
	}
	public ArrayList<CEProyeccion> getoListArray() {
		return oListArray;
	}
	public void setoListArray(ArrayList<CEProyeccion> oListArray) {
		this.oListArray = oListArray;
	}
	public List<CEProyeccion> getoList() {
		return oList;
	}
	public void setoList(List<CEProyeccion> oList) {
		this.oList = oList;
	}
	public LinkedList<CEProyeccion> getoListLnk() {
		return oListLnk;
	}
	public void setoListLnk(LinkedList<CEProyeccion> oListLnk) {
		this.oListLnk = oListLnk;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEUnionListas [oListHashSet=");
		builder.append(oListHashSet);
		builder.append(", oListTreeSet=");
		builder.append(oListTreeSet);
		builder.append(", oListLnkSet=");
		builder.append(oListLnkSet);
		builder.append(", oListArray=");
		builder.append(oListArray);
		builder.append(", oList=");
		builder.append(oList);
		builder.append(", oListLnk=");
		builder.append(oListLnk);
		builder.append("]");
		return builder.toString();
	}
	
}
