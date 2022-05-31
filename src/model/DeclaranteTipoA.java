package model;

public class DeclaranteTipoA {
	private String sNombre;
	private String sPrimerApellido;
	private String sSegundoApellido;
	private Integer iTelefono;
	private Integer iIdentificativo;
	private String sAlfabetico;
	private Integer iTotalPersonasEntidades;
	private String sSignoImporteAnual;
	private Float fImporteAnual;
	private Integer iNumTotalMuebles;
	
	public final Integer TIPOREGISTRO1 = 1;
	public final Integer IDENTIFICATIVO = 347;

	// Constructor
	public DeclaranteTipoA() {
		
	}

	public DeclaranteTipoA(String sNombre, String sPrimerApellido, String sSegundoApellido, Integer iTelefono,
			Integer iIdentificativo, String sAlfabetico, Integer iTotalPersonasEntidades, String sSignoImporteAnual,
			Float fImporteAnual, Integer iNumTotalMuebles) {
		
		this.sNombre = sNombre;
		this.sPrimerApellido = sPrimerApellido;
		this.sSegundoApellido = sSegundoApellido;
		this.iTelefono = iTelefono;
		this.iIdentificativo = iIdentificativo;
		this.sAlfabetico = sAlfabetico;
		this.iTotalPersonasEntidades = iTotalPersonasEntidades;
		this.sSignoImporteAnual = sSignoImporteAnual;
		this.fImporteAnual = fImporteAnual;
		this.iNumTotalMuebles = iNumTotalMuebles;
	}
	
	// Getters y Setters
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		if (sNombre != null && sNombre.length() > 3 && sNombre.length() < 15) {
			this.sNombre = sNombre;
		}
	}

	public String getsPrimerApellido() {
			return sPrimerApellido;
	}

	public void setsPrimerApellido(String sPrimerApellido) {
		if (sPrimerApellido != null && sPrimerApellido.length() > 3 && sPrimerApellido.length() < 15) {
			this.sPrimerApellido = sPrimerApellido;
		}
	}

	public String getsSegundoApellido() {
		return sSegundoApellido;
	}

	public void setsSegundoApellido(String sSegundoApellido) {
		if (sSegundoApellido != null && sSegundoApellido.length() > 3 && sSegundoApellido.length() < 15) {
			this.sSegundoApellido = sSegundoApellido;
		}
	}

	public Integer getiTelefono() {
		return iTelefono;
	}

	public void setiTelefono(Integer iTelefono) {
		if (iTelefono.longValue() == 9) {
			this.iTelefono = iTelefono;
		}
	}

	public Integer getiIdentificativo() {
		return iIdentificativo;
	}

	public void setiIdentificativo(Integer iIdentificativo) {
		if (iIdentificativo.longValue() == 10) {
			this.iIdentificativo = iIdentificativo;
		}
	}

	public String getsAlfabetico() {
		return sAlfabetico;
	}

	public void setsAlfabetico(String sAlfabetico) {
		this.sAlfabetico = sAlfabetico;
	}

	public Integer getiTotalPersonasEntidades() {
		return iTotalPersonasEntidades;
	}

	public void setiTotalPersonasEntidades(Integer iTotalPersonasEntidades) {
		this.iTotalPersonasEntidades = iTotalPersonasEntidades;
	}

	public String getsSignoImporteAnual() {
		return sSignoImporteAnual;
	}

	public void setsSignoImporteAnual(String sSignoImporteAnual) {
		this.sSignoImporteAnual = sSignoImporteAnual;
	}

	public Float getfImporteAnual() {
		return fImporteAnual;
	}

	public void setfImporteAnual(Float fImporteAnual) {
		if (fImporteAnual > 0) {
			this.fImporteAnual = fImporteAnual;
		}
	}

	public Integer getiNumTotalMuebles() {
		return iNumTotalMuebles;
	}

	public void setiNumTotalMuebles(Integer iNumTotalMuebles) {
		if (iNumTotalMuebles > 0) {
			this.iNumTotalMuebles = iNumTotalMuebles;
		}
	}

	public Integer getIDENTIFICATIVO() {
		return IDENTIFICATIVO;
	}
	
}
