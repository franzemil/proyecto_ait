package ait.sistemas.proyecto.activos.view.rrhh.ciudad;

import java.util.List;

import ait.sistemas.proyecto.activos.data.service.Impl.CiudadImpl;
import ait.sistemas.proyecto.common.component.BarMessage;

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
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@CDIView(value = VCiudadA.ID)
public class VCiudadA extends VerticalLayout implements View, ClickListener {

	private static final long serialVersionUID = 1L;
	public static final String ID = "/act/rrhh/ciudad/a";
	
	private FormCiudad frm_ciudad;
	private CssLayout hl_errores;
	private Button btn_limpiar;
	private Button btn_agregar;
	private GridCiudad grid_ciudad;
	private final CiudadImpl ciudad_impl = new CiudadImpl();
	

	public VCiudadA() {
		frm_ciudad= new FormCiudad();
		this.btn_limpiar= new Button("Limpiar");
		this.btn_agregar= new Button("Agregar");
		this.btn_agregar.addClickListener(this);
		this.btn_limpiar.addClickListener(this);

		this.grid_ciudad = new GridCiudad();
		this.hl_errores = new CssLayout();
		
		addComponent(buildNavBar());
		addComponent(buildFormContent());
		addComponent(buildButtonBar());
	}
	

	private Component buildButtonBar() {
		CssLayout buttonContent = new CssLayout();
		buttonContent.addStyleName("ait-buttons");

		buttonContent.addComponent(this.btn_agregar);
		buttonContent.addComponent(this.btn_limpiar);
		return buttonContent;
	}

	private Component buildFormContent() {
				
		VerticalLayout formContent = new VerticalLayout();
		formContent.setSpacing(true	);
		Panel frmPanel = new Panel();
		frmPanel.setWidth("100%");
		frmPanel.setCaption("Formulario Ciudad");
		frmPanel.setContent(this.frm_ciudad);
		formContent.setMargin(true);
		formContent.addComponent(frmPanel);
		Panel gridPanel = new Panel();
		gridPanel.setWidth("100%");
		gridPanel.setCaption("Grid Ciudad");
		gridPanel.setContent(this.grid_ciudad);
		formContent.setMargin(true);
		formContent.addComponent(frmPanel);
		formContent.addComponent(gridPanel);
		Responsive.makeResponsive(formContent);
		return formContent;
	}

	private Component buildNavBar() {
		Panel navPanel = new Panel();
		navPanel.addStyleName("ait-content-nav");
		HorizontalLayout nav = new HorizontalLayout();
		nav.addComponent(new Label("Activos>>"));
		nav.addComponent(new Label("Recursos Humanos>>"));
		nav.addComponent(new Label("Ciudad>>"));
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
			Label lbError = new Label(new Label(barMessage.getComponetName()+":"+barMessage.getErrorName()));
			lbError.setStyleName(barMessage.getType());
			this.hl_errores.addComponent(lbError);
		}
		
	
	}

	@Override
	public void buttonClick(ClickEvent event) {
		if (event.getButton() == this.btn_agregar) {
			if(this.frm_ciudad.validate()){
				this.ciudad_impl.add(this.frm_ciudad.getData());
				grid_ciudad.update();
				this.frm_ciudad.update();
				this.frm_ciudad.updateId();
			}else{
				
			}
			buildMessages(this.frm_ciudad.getMensajes());
			this.frm_ciudad.clearMessages();
		}
		if (event.getButton() == this.btn_limpiar) {
			this.frm_ciudad.update();
			this.frm_ciudad.updateId();
		}
	}
	

}