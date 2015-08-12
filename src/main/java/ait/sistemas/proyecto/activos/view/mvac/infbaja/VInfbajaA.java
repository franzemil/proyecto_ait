package ait.sistemas.proyecto.activos.view.mvac.infbaja;

import java.util.List;

import ait.sistemas.proyecto.activos.data.service.Impl.MovimientoImpl;
import ait.sistemas.proyecto.common.component.BarMessage;
import ait.sistemas.proyecto.common.component.Messages;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Responsive;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@CDIView(value = VInfbajaA.ID)
public class VInfbajaA extends VerticalLayout implements View, ClickListener {
	
	private static final long serialVersionUID = 1L;
	public static final String ID = "/act/mvac/infbaja/a";
	
	private FormInfbaja frm_solicitud;
	private CssLayout hl_errores;
	private Button btn_limpiar;
	private Button btn_agregar;
	private Button btn_cargar;
	
	private final MovimientoImpl movimientoimpl = new MovimientoImpl();
	
	public VInfbajaA() {
		frm_solicitud = new FormInfbaja();
		this.btn_limpiar = new Button("Limpiar");
		this.btn_agregar = new Button("Agregar");
		this.btn_cargar = new Button("Cargar Activos");
		this.btn_cargar.addClickListener(this);
		this.btn_agregar.addClickListener(this);
		this.btn_limpiar.addClickListener(this);
		
		this.hl_errores = new CssLayout();
		
		addComponent(buildNavBar());
		addComponent(buildFormContent());
		addComponent(buildButtonBar());
		Responsive.makeResponsive(this);
	}
	
	private Component buildButtonBar() {
		CssLayout buttonContent = new CssLayout();
		this.btn_agregar.setStyleName("ait-buttons-btn");
		buttonContent.addComponent(this.btn_agregar);
		this.btn_limpiar.setStyleName("ait-buttons-btn");
		buttonContent.addStyleName("ait-buttons");
		buttonContent.addComponent(this.btn_limpiar);
		return buttonContent;
	}
	
	private Component buildFormContent() {
		
		VerticalLayout formContent = new VerticalLayout();
		formContent.setSpacing(true);
		Panel gridPanel = new Panel("Activos Fijos Disponibles : Selecciona los Activos");
		gridPanel.setWidth("100%");
		gridPanel.setCaption("Activos Disponibles");
		gridPanel.setContent(this.frm_solicitud.getgrid_solicitud());
		formContent.setMargin(true);
		formContent.addComponent(frm_solicitud);
		formContent.addComponent(gridPanel);
		formContent.addComponent(btn_cargar);
		Responsive.makeResponsive(formContent);
		return formContent;
	}
	
	private Component buildNavBar() {
		Panel navPanel = new Panel();
		navPanel.addStyleName("ait-content-nav");
		HorizontalLayout nav = new HorizontalLayout();
		nav.addComponent(new Label("Activos>>"));
		nav.addComponent(new Label("Movimiento de Activos>>"));
		nav.addComponent(new Label("Informe de Bajas>>"));
		nav.addComponent(new Label("<strong>Agregar</strong>", ContentMode.HTML));
		navPanel.setContent(nav);
		return navPanel;
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
	
	private void buildMessages(List<BarMessage> mensages) {
		this.hl_errores.removeAllComponents();
		hl_errores.addStyleName("ait-error-bar");
		this.addComponent(this.hl_errores);
		
		for (BarMessage barMessage : mensages) {
			Label lbError = new Label(barMessage.getComponetName() + ":" + barMessage.getErrorName());
			lbError.setStyleName(barMessage.getType());
			this.hl_errores.addComponent(lbError);
		}
		
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		
		if (event.getButton() == this.btn_cargar) {
			
			if (this.frm_solicitud.validate()) {
				
		if (event.getButton() == this.btn_agregar) {
				if (movimientoimpl.addMovimiento(this.frm_solicitud.getData())>0) {
					this.frm_solicitud.clear();
					Notification.show(Messages.SUCCESS_MESSAGE);
				}
				else{
					Notification.show(Messages.NOT_SUCCESS_MESSAGE, Type.ERROR_MESSAGE);
				}
		}
		} else {
			Notification.show(Messages.NOT_SUCCESS_MESSAGE, Type.ERROR_MESSAGE);
		}
		buildMessages(this.frm_solicitud.getMensajes());
		this.frm_solicitud.clearMessages();
	}
		if (event.getButton() == this.btn_limpiar) {
			frm_solicitud.update();
			// this.frm_solicitud.updateId();
			
		}
	}
	
}