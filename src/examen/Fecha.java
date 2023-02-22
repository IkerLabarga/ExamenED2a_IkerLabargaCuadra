package examen;
/**
 * 
 * @author dam107
 * @version 1.0
 */

public class Fecha {
	/**
	 * Inicializamos la variable booleana fechaValida que nos indicara si la fecha introducida es valida.
	 */
	public static boolean fechaValida;
	/**
	 * Metodo que nos comprueba si la fecha es correcta o no
	 * @param anio introducimos el año 
	 * @param mes introducimos el mes 
	 * @param dia introducimos el dia
	 * @return devolvera true si la fecha es valida y false si no.
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}