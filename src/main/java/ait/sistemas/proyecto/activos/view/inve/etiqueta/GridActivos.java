package ait.sistemas.proyecto.activos.view.inve.etiqueta;

import ait.sistemas.proyecto.activos.data.model.ActivosModel;
import ait.sistemas.proyecto.activos.data.service.Impl.ActivoImpl;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.Responsive;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Grid;

public class GridActivos extends Grid {
	
	private ActivoImpl activoimpl = new ActivoImpl();
	private static final long serialVersionUID = 1L;
	private BeanItemContainer<ActivosModel> bean_activos;
	
	public GridActivos() {
		setWidth("100%");
		buildGrid();
	}
	
	public void update() {
		this.removeAllColumns();
		bean_activos = null;
		buildGrid();
	}
	
	public void buildGrid() {
		bean_activos = new BeanItemContainer<ActivosModel>(ActivosModel.class);
		// bean_activos.addAll(activoimpl.getactivos());
		
		setContainerDataSource(bean_activos);
		setHeightMode(HeightMode.ROW);
		setHeightByRows(5);
		
		removeColumn("ACT_Nombre_Empleado");
		removeColumn("ACT_APaterno_Empleado");
		removeColumn("ACT_AMaterno_Empleado");
		removeColumn("ACT_Inmueble");
		removeColumn("ACT_NIT_Proveedor");
		removeColumn("ACT_Fecha_Asignacion");
		removeColumn("ACT_Fecha_Baja");
		removeColumn("ACT_Fecha_Comodato");
		removeColumn("ACT_Fecha_Compra");
		removeColumn("ACT_Fecha_Incorporacion");
		removeColumn("ACT_Fecha_Registro");
		removeColumn("ACT_Fecha_Vencimiento_Garantia");
		removeColumn("ACT_Fecha_Vencimiento_Mantenimiento");
		removeColumn("ACT_Fecha_Vencimiento_Seguro");
		removeColumn("ACT_Fuente_Financiamiento_ID");
		removeColumn("ACT_Fuente_Financiamiento");
		removeColumn("ACT_Grupo_Contable_ID");
		removeColumn("ACT_Grupo_Contable");
		removeColumn("ACT_Tipo_Cambio_Dolar");
		removeColumn("ACT_Tipo_Cambio_UFV");
		removeColumn("ACT_Actualizacion_Acumulada_Gestion_Anterior");
		removeColumn("ACT_Actualizacion_Acumulada");
		removeColumn("ACT_Depresiacion_Acumulada");
		removeColumn("ACT_Depreciacion_Acumulada_Gestion_Anterior");
		removeColumn("ACT_DAA");
		removeColumn("ACT_CA");
		removeColumn("ACT_Auxiliar_Contable_ID");
		removeColumn("ACT_Auxiliar_Contable");
		removeColumn("ACT_CI_Empleado_Asignado");
		removeColumn("ACT_Ubicacion_Fisica_Activo_ID");
		removeColumn("ACT_Ubicacion_Fisica_Activo");
		removeColumn("ACT_Ubicacion_Imagen");
		removeColumn("ACT_Valor");
		removeColumn("ACT_Valor_Neto");
		removeColumn("ACT_Vida_Util");
		removeColumn("ACT_Dependencia_Codigo_Activo");
		removeColumn("ACT_Dependencia_ID");
		removeColumn("ACT_Dependencia");
		removeColumn("ACT_No_Comprobante_Gasto");
		removeColumn("ACT_No_Contrato_Mantenimiento");
		removeColumn("ACT_No_Folio_Real");
		removeColumn("ACT_No_Garantia");
		removeColumn("ACT_No_Informe_Baja");
		removeColumn("ACT_No_Poliza_Seguro");
		removeColumn("ACT_No_RUAT");
		removeColumn("ACT_No_Serie");
		removeColumn("ACT_Tipo_Activo");
		removeColumn("ACT_Marca");
		removeColumn("ACT_Organismo_Financiador_ID");
		removeColumn("ACT_Organismo_Financiador");
		removeColumn("ACT_No_Acta_Entrega");
		removeColumn("ACT_Partidas_Presupuestarias");
		
		getColumn("ACT_Codigo_Activo").setHeaderCaption("CODIGO").setExpandRatio(1);
		getColumn("ACT_Nombre_Activo").setHeaderCaption("NOMBRE ACTIVO").setExpandRatio(4);
		getColumn("ACT_Nombre_Proveedor").setHeaderCaption("NOMBRE PROVEEDOR").setExpandRatio(3);
		
		Responsive.makeResponsive(this);
	}
	
	public void buildGrid(short dependencia) {
		bean_activos = new BeanItemContainer<ActivosModel>(ActivosModel.class);
		bean_activos.addAll(activoimpl.getactivosbydependencia(dependencia));
		setContainerDataSource(bean_activos);
		setHeightMode(HeightMode.ROW);
		setHeightByRows(7);
		setSelectionMode(SelectionMode.MULTI);
		Responsive.makeResponsive(this);
	}
	
	public void buildGrid(short dependencia, short unidad_organizacional) {
		bean_activos = new BeanItemContainer<ActivosModel>(ActivosModel.class);
		bean_activos.addAll(activoimpl.getactivos(unidad_organizacional));
		
		setContainerDataSource(bean_activos);
		setHeightMode(HeightMode.ROW);
		setHeightByRows(5);
		
		Responsive.makeResponsive(this);
	}
	
	public void buildGrid(String ci_usuario) {
		bean_activos = new BeanItemContainer<ActivosModel>(ActivosModel.class);
		bean_activos.addAll(activoimpl.getactivos(ci_usuario));
		
		setContainerDataSource(bean_activos);
		setHeightMode(HeightMode.ROW);
		setHeightByRows(5);
		
		Responsive.makeResponsive(this);
	}
}