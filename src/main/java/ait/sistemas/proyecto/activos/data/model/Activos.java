package ait.sistemas.proyecto.activos.data.model;

import java.io.Serializable;

import javax.persistence.*;

import ait.sistemas.proyecto.activos.data.model.pk.ActivosPK;

import java.math.BigDecimal;
import java.sql.Time;


/**
 * The persistent class for the Activos database table.
 * 
 */
@Entity
@NamedQuery(name="Activos.findAll", query="SELECT a FROM Activos a")
public class Activos implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Id
	private ActivosPK id;

	private String ACT_Auxiliar_Contable;

	private String ACT_CI_Empleado_Asignado;

	private Time ACT_Fecha_Asignacion;

	private Time ACT_Fecha_Baja;

	private Time ACT_Fecha_Comodato;

	private Time ACT_Fecha_Compra;

	private Time ACT_Fecha_Incorporacion;

	private Time ACT_Fecha_Registro;

	private Time ACT_Fecha_Vencimiento_Garantia;

	private Time ACT_Fecha_Vencimiento_Mantenimiento;

	private Time ACT_Fecha_Vencimiento_Seguro;

	private int ACT_Fuente_Financiamiento;

	private String ACT_Grupo_Contable;

	private long ACT_No_Acta_Entrega;

	private long ACT_No_Comprobante_Gasto;

	private String ACT_No_Contrato_Mantenimiento;

	private String ACT_No_Folio_Real;

	private String ACT_No_Garantia;

	private long ACT_No_Informe_Baja;

	private String ACT_No_Poliza_Seguro;

	private String ACT_No_RUAT;

	private String ACT_No_Serie;

	private String ACT_Nombre_Activo;

	private short ACT_Organismo_Financiador;

	private int ACT_Proveedor;

	private short ACT_Tipo_Activo;

	private BigDecimal ACT_Tipo_Cambio;

	private int ACT_Ubicacion_Fisica_Activo;

	private String ACT_Ubicacion_Imagen;

	private BigDecimal ACT_Valor;

	private int ACT_Vida_Util;

	public Activos() {
	}

	public ActivosPK getId() {
		return this.id;
	}

	public void setId(ActivosPK id) {
		this.id = id;
	}

	public String getACT_Auxiliar_Contable() {
		return this.ACT_Auxiliar_Contable;
	}

	public void setACT_Auxiliar_Contable(String ACT_Auxiliar_Contable) {
		this.ACT_Auxiliar_Contable = ACT_Auxiliar_Contable;
	}

	public String getACT_CI_Empleado_Asignado() {
		return this.ACT_CI_Empleado_Asignado;
	}

	public void setACT_CI_Empleado_Asignado(String ACT_CI_Empleado_Asignado) {
		this.ACT_CI_Empleado_Asignado = ACT_CI_Empleado_Asignado;
	}

	public Time getACT_Fecha_Asignacion() {
		return this.ACT_Fecha_Asignacion;
	}

	public void setACT_Fecha_Asignacion(Time ACT_Fecha_Asignacion) {
		this.ACT_Fecha_Asignacion = ACT_Fecha_Asignacion;
	}

	public Time getACT_Fecha_Baja() {
		return this.ACT_Fecha_Baja;
	}

	public void setACT_Fecha_Baja(Time ACT_Fecha_Baja) {
		this.ACT_Fecha_Baja = ACT_Fecha_Baja;
	}

	public Time getACT_Fecha_Comodato() {
		return this.ACT_Fecha_Comodato;
	}

	public void setACT_Fecha_Comodato(Time ACT_Fecha_Comodato) {
		this.ACT_Fecha_Comodato = ACT_Fecha_Comodato;
	}

	public Time getACT_Fecha_Compra() {
		return this.ACT_Fecha_Compra;
	}

	public void setACT_Fecha_Compra(Time ACT_Fecha_Compra) {
		this.ACT_Fecha_Compra = ACT_Fecha_Compra;
	}

	public Time getACT_Fecha_Incorporacion() {
		return this.ACT_Fecha_Incorporacion;
	}

	public void setACT_Fecha_Incorporacion(Time ACT_Fecha_Incorporacion) {
		this.ACT_Fecha_Incorporacion = ACT_Fecha_Incorporacion;
	}

	public Time getACT_Fecha_Registro() {
		return this.ACT_Fecha_Registro;
	}

	public void setACT_Fecha_Registro(Time ACT_Fecha_Registro) {
		this.ACT_Fecha_Registro = ACT_Fecha_Registro;
	}

	public Time getACT_Fecha_Vencimiento_Garantia() {
		return this.ACT_Fecha_Vencimiento_Garantia;
	}

	public void setACT_Fecha_Vencimiento_Garantia(Time ACT_Fecha_Vencimiento_Garantia) {
		this.ACT_Fecha_Vencimiento_Garantia = ACT_Fecha_Vencimiento_Garantia;
	}

	public Time getACT_Fecha_Vencimiento_Mantenimiento() {
		return this.ACT_Fecha_Vencimiento_Mantenimiento;
	}

	public void setACT_Fecha_Vencimiento_Mantenimiento(Time ACT_Fecha_Vencimiento_Mantenimiento) {
		this.ACT_Fecha_Vencimiento_Mantenimiento = ACT_Fecha_Vencimiento_Mantenimiento;
	}

	public Time getACT_Fecha_Vencimiento_Seguro() {
		return this.ACT_Fecha_Vencimiento_Seguro;
	}

	public void setACT_Fecha_Vencimiento_Seguro(Time ACT_Fecha_Vencimiento_Seguro) {
		this.ACT_Fecha_Vencimiento_Seguro = ACT_Fecha_Vencimiento_Seguro;
	}

	public int getACT_Fuente_Financiamiento() {
		return this.ACT_Fuente_Financiamiento;
	}

	public void setACT_Fuente_Financiamiento(int ACT_Fuente_Financiamiento) {
		this.ACT_Fuente_Financiamiento = ACT_Fuente_Financiamiento;
	}

	public String getACT_Grupo_Contable() {
		return this.ACT_Grupo_Contable;
	}

	public void setACT_Grupo_Contable(String ACT_Grupo_Contable) {
		this.ACT_Grupo_Contable = ACT_Grupo_Contable;
	}

	public long getACT_No_Acta_Entrega() {
		return this.ACT_No_Acta_Entrega;
	}

	public void setACT_No_Acta_Entrega(long ACT_No_Acta_Entrega) {
		this.ACT_No_Acta_Entrega = ACT_No_Acta_Entrega;
	}

	public long getACT_No_Comprobante_Gasto() {
		return this.ACT_No_Comprobante_Gasto;
	}

	public void setACT_No_Comprobante_Gasto(long ACT_No_Comprobante_Gasto) {
		this.ACT_No_Comprobante_Gasto = ACT_No_Comprobante_Gasto;
	}

	public String getACT_No_Contrato_Mantenimiento() {
		return this.ACT_No_Contrato_Mantenimiento;
	}

	public void setACT_No_Contrato_Mantenimiento(String ACT_No_Contrato_Mantenimiento) {
		this.ACT_No_Contrato_Mantenimiento = ACT_No_Contrato_Mantenimiento;
	}

	public String getACT_No_Folio_Real() {
		return this.ACT_No_Folio_Real;
	}

	public void setACT_No_Folio_Real(String ACT_No_Folio_Real) {
		this.ACT_No_Folio_Real = ACT_No_Folio_Real;
	}

	public String getACT_No_Garantia() {
		return this.ACT_No_Garantia;
	}

	public void setACT_No_Garantia(String ACT_No_Garantia) {
		this.ACT_No_Garantia = ACT_No_Garantia;
	}

	public long getACT_No_Informe_Baja() {
		return this.ACT_No_Informe_Baja;
	}

	public void setACT_No_Informe_Baja(long ACT_No_Informe_Baja) {
		this.ACT_No_Informe_Baja = ACT_No_Informe_Baja;
	}

	public String getACT_No_Poliza_Seguro() {
		return this.ACT_No_Poliza_Seguro;
	}

	public void setACT_No_Poliza_Seguro(String ACT_No_Poliza_Seguro) {
		this.ACT_No_Poliza_Seguro = ACT_No_Poliza_Seguro;
	}

	public String getACT_No_RUAT() {
		return this.ACT_No_RUAT;
	}

	public void setACT_No_RUAT(String ACT_No_RUAT) {
		this.ACT_No_RUAT = ACT_No_RUAT;
	}

	public String getACT_No_Serie() {
		return this.ACT_No_Serie;
	}

	public void setACT_No_Serie(String ACT_No_Serie) {
		this.ACT_No_Serie = ACT_No_Serie;
	}

	public String getACT_Nombre_Activo() {
		return this.ACT_Nombre_Activo;
	}

	public void setACT_Nombre_Activo(String ACT_Nombre_Activo) {
		this.ACT_Nombre_Activo = ACT_Nombre_Activo;
	}

	public short getACT_Organismo_Financiador() {
		return this.ACT_Organismo_Financiador;
	}

	public void setACT_Organismo_Financiador(short ACT_Organismo_Financiador) {
		this.ACT_Organismo_Financiador = ACT_Organismo_Financiador;
	}

	public int getACT_Proveedor() {
		return this.ACT_Proveedor;
	}

	public void setACT_Proveedor(int ACT_Proveedor) {
		this.ACT_Proveedor = ACT_Proveedor;
	}

	public short getACT_Tipo_Activo() {
		return this.ACT_Tipo_Activo;
	}

	public void setACT_Tipo_Activo(short ACT_Tipo_Activo) {
		this.ACT_Tipo_Activo = ACT_Tipo_Activo;
	}

	public BigDecimal getACT_Tipo_Cambio() {
		return this.ACT_Tipo_Cambio;
	}

	public void setACT_Tipo_Cambio(BigDecimal ACT_Tipo_Cambio) {
		this.ACT_Tipo_Cambio = ACT_Tipo_Cambio;
	}

	public int getACT_Ubicacion_Fisica_Activo() {
		return this.ACT_Ubicacion_Fisica_Activo;
	}

	public void setACT_Ubicacion_Fisica_Activo(int ACT_Ubicacion_Fisica_Activo) {
		this.ACT_Ubicacion_Fisica_Activo = ACT_Ubicacion_Fisica_Activo;
	}

	public String getACT_Ubicacion_Imagen() {
		return this.ACT_Ubicacion_Imagen;
	}

	public void setACT_Ubicacion_Imagen(String ACT_Ubicacion_Imagen) {
		this.ACT_Ubicacion_Imagen = ACT_Ubicacion_Imagen;
	}

	public BigDecimal getACT_Valor() {
		return this.ACT_Valor;
	}

	public void setACT_Valor(BigDecimal ACT_Valor) {
		this.ACT_Valor = ACT_Valor;
	}

	public int getACT_Vida_Util() {
		return this.ACT_Vida_Util;
	}

	public void setACT_Vida_Util(int ACT_Vida_Util) {
		this.ACT_Vida_Util = ACT_Vida_Util;
	}

}