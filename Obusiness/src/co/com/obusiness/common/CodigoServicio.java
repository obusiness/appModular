package co.com.obusiness.common;


public enum CodigoServicio {
	
	//El nombre de cada servicio debe coincidir con el nombre del bean
	//en el archivo de configuración de spring
	AUTENTICACION_SERVICE("validaUsuarioService"),
	INFORMACION_SOLICITUD("informacionSolicitudService"),
	INFORMACION_PERSONAS("informacionPersonasService"),
	CAPACIDAD_ENDEUDAMIENTO("capacidadEndeudamientoService"),
	INFORMACION_GENERAL("informacionGeneralService"),
	INFORMACION_FINANCIERA("informacionFinancieraService"),
	INFORMACION_LABORAL("informacionLaboralService"),
	LISTAS_TIPO("listasTipoService"),
	TIPOS_PERIODICIDAD("tipodePeriodicidadService"),
	MESSAGE_QUEUE_BPM("messageQueueService"),
	RESULTADO_BPM("resultadoBPMService"),
	ENTREVISTA_SARLAFT("entrevistaSarlaftService"),
	TRANSACCION_MONEDA("transaccionMonedaExtranjeraService"),
	DATACREDITO("dataCreditoService"),
	DETALLE_PERSONA("detallePersonaService"),
	DETALLE_CREDITO("detalleCreditoService"),
	CHEQUES_RESTRICTIVOS("chequesRestrictivosService"),
	CUOTAS_EXTRAS("cuotasExtrasService"),
	REFINANCIAR_REESTRUCTURAR("refinanciarReestructurarService"),
	DESTINACION_DESEMBOLSO("destinacionDesembolsoService"),
	BASES_EXTERNAS("basesExternasService"),
	IDENTIDAD_CLIENTE("identidadClienteService"),
	REFERENCIA_PERSONAL("referenciaPersonalService"),
	REFERENCIA_FAMILIAR("referenciaFamiliarService"),
	DIRECCIONES_CLIENTE("direccionesClienteService"),
	FORMATO_SEGURO("formatoSeguroService"),
	FAMILIAR_SOLICITANTE("familiarSolicitanteService"),
	CONTACTO_SOLICITANTE("contactoSolicitanteService"),	
	TITULAR("titularService"),
	DOCUMENTO_SOPORTE("documentoSoporteService"),
	LIBRANZA_SERVICE("libranzaService"),
	VISITA_COMERCIAL_SERVICE("visitaComercialService"),
	VERIFICACION_COMITE("verificacionComiteService"),
	DETALLE_CLIENTE("detalleClienteService"),
	INFORMACION_VIVIENDA("informacionViviendaService"),
	DOCUMENTOS_UCM("documentosUCMService")
	;

	private String serviceName;
	
	private CodigoServicio(String serviceName) {
		this.serviceName = serviceName;
	}
	
	@Override
	public String toString() {
		return this.serviceName;
	}
	
}
