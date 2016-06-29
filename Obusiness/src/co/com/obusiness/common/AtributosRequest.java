package co.com.obusiness.common;

public enum AtributosRequest {
	TIPO_SELECCION("tipoSeleccion"), 
	INDICE_SELECCION("indiceSeleccion");

	private String atributo;

	private AtributosRequest(String atributo) {
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return this.atributo;
	}
}
