package controller;

import model.DeclaranteTipoA;

public class DeclaranteTipoAController {
	
	public static void crearNuevoDeclaranteTipoA(String sNombre, String sPrimerApellido, String sSegundoApellido, Integer iTelefono,
			Integer iIdentificativo, String sAlfabetico, Integer iTotalPersonasEntidades, String sSignoImporteAnual,
			Float fImporteAnual, Integer iNumTotalMuebles) {
			
		DeclaranteTipoA declarante = new DeclaranteTipoA(sNombre, sPrimerApellido, sSegundoApellido, iTelefono, iIdentificativo, sAlfabetico, 
				iTotalPersonasEntidades, sSignoImporteAnual, fImporteAnual, iNumTotalMuebles);
	}
}
