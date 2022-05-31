package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utils.Utilidades;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		String sOpcion = "2";
		int iAnioFichero = 1800;
		int iNumDeclaracion = 30;

		while (sOpcion.equals("2")) {
			System.out.println(Utilidades.printMenuPrincipal());
			sOpcion = teclado.readLine();

			if (sOpcion.equals("1")) {
				System.out.println(Utilidades.printGenerarDeclaracionMenu());
				while (iAnioFichero < 1900 || iAnioFichero > 2022) {
					System.out.println("Indique el anio sobre el que se va a generar el fichero: \n");
					iAnioFichero = Integer.parseInt(teclado.readLine());
					if (iAnioFichero < 1900 || iAnioFichero > 2022) {
						System.out.println("ERROR: El anio debe estar entre 1900 y 2022.");
					}

					while (iNumDeclaracion <= 0) {
						System.out.println("Indique su Nombre: ");
						iNumDeclaracion = Integer.parseInt(teclado.readLine());
						if (iNumDeclaracion <= 0) {
							System.out.println("ERROR: El numero de la declaración debe ser mayor a 0.");
						}

					}

				}

			} else if (sOpcion.equals("2")) {
				System.out.println("SALIENDO...");
				System.exit(0);

			} else {
				System.out.println("ERROR: Debe indicar 1 o 2.");
			}
		}

	}
}
