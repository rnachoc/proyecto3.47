package model;

public class Apuntes {

	// FK
	private Integer id_TransId;
	private Integer id_ContraAct;
	private Integer id_VatGroup;

	// Variables
	private Integer iDebe;
	private Integer iHaber;

	// Constructores:
	public Apuntes() {

	}

	public Apuntes(Integer id_TransId, Integer id_ContraAct, Integer id_VatGroup) {
		this.id_TransId = id_TransId;
		this.id_ContraAct = id_ContraAct;
		this.id_VatGroup = id_VatGroup;
	}

	public Apuntes(Integer id_TransId, Integer id_ContraAct, Integer id_VatGroup, Integer iDebe, Integer iHaber) {
		this.id_TransId = id_TransId;
		this.id_ContraAct = id_ContraAct;
		this.id_VatGroup = id_VatGroup;
		this.iDebe = iDebe;
		this.iHaber = iHaber;
	}

	public Integer getId_TransId() {
		return id_TransId;
	}

	public void setId_TransId(Integer id_TransId) {
		this.id_TransId = id_TransId;
	}

	public Integer getId_ContraAct() {
		return id_ContraAct;
	}

	public void setId_ContraAct(Integer id_ContraAct) {
		this.id_ContraAct = id_ContraAct;
	}

	public Integer getId_VatGroup() {
		return id_VatGroup;
	}

	public void setId_VatGroup(Integer id_VatGroup) {
		this.id_VatGroup = id_VatGroup;
	}

	public Integer getiDebe() {
		return iDebe;
	}

	public void setiDebe(Integer iDebe) {
		this.iDebe = iDebe;
	}

	public Integer getiHaber() {
		return iHaber;
	}

	public void setiHaber(Integer iHaber) {
		this.iHaber = iHaber;
	}

	// GETTERS y SETTERS

}
