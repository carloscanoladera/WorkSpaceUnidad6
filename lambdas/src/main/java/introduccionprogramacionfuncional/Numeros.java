package introduccionprogramacionfuncional;

@FunctionalInterface
interface Numeros <T extends Number> {
	
	public void operacionesunarias(T n);
	
}