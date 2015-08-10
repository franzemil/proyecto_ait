package ait.sistemas.proyecto.activos.component.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Movimiento de Activos para asginar un activo a un usuario
 * @author franzemil
 *
 */
public class Asignacion {
	
	private short id_dependencia;
	private short id_unidad_organizacional_origen;
	private long nro_documento;
	private String id_usuario;
	
	private Date fecha_registro;
	private Date fecha_movimiento;	
	private List<Detalle> detalles;
	private String observacion;
	
	
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Asignacion() {
		this.detalles = new ArrayList<Detalle>();
	}

	public Asignacion(short id_dependencia, short id_unidad_organizacional_origen, long nro_documento,
			Date fecha_registro, Date fecha_movimiento, List<Detalle> detalles) {
		this.id_dependencia = id_dependencia;
		this.id_unidad_organizacional_origen = id_unidad_organizacional_origen;
		this.nro_documento = nro_documento;
		this.fecha_registro = fecha_registro;
		this.fecha_movimiento = fecha_movimiento;
		this.detalles = detalles;
	}

	public short getId_dependencia() {
		return id_dependencia;
	}

	public void setId_dependencia(short id_dependencia) {
		this.id_dependencia = id_dependencia;
	}

	public short getId_unidad_organizacional_origen() {
		return id_unidad_organizacional_origen;
	}

	public void setId_unidad_organizacional_origen(short id_unidad_organizacional_origen) {
		this.id_unidad_organizacional_origen = id_unidad_organizacional_origen;
	}

	public long getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(long nro_documento) {
		this.nro_documento = nro_documento;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public void addDetalle(Detalle detalle){
		this.detalles.add(detalle);	
	}

	public String getUsuario() {
		return id_usuario;
	}

	public void setUsuario(String usuario) {
		this.id_usuario = usuario;
	}
	
}
