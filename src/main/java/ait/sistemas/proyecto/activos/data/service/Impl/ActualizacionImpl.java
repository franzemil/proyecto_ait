package ait.sistemas.proyecto.activos.data.service.Impl;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import ait.sistemas.proyecto.activos.component.model.Actualizacion;
import ait.sistemas.proyecto.activos.data.model.ActivosModel;

public class ActualizacionImpl {
	private EntityManagerFactory emf;
	private EntityManager em;

	public ActualizacionImpl() {
		this.emf = Persistence.createEntityManagerFactory("AIT-Activos");
		this.em = emf.createEntityManager();
	}

public int add_Actualizacion (Actualizacion table) {
	String strQuery = String.format("EXEC Reva_Actualizacion_I "
			+ "@Fecha_Actual=?1");
	Query query = this.em.createNativeQuery(strQuery);
	query.setParameter(1, new SimpleDateFormat("yyyy-MM-dd").format(table.getFecha())+"T00:00:00");
	
	try{
		int result = (Integer) query.getSingleResult();
		return result;
	}catch(Exception e){
		return 0;
	}
	
}
@SuppressWarnings("unchecked")
public List<ActivosModel> getActualizacion(short id_dependencia, String fecha) {
	Query query = em.createNativeQuery("Reva_Actualizacion_Q " + "@ACT_Dependencia=?1 , @Fecha_Reporte=?2", ActivosModel.class);
	query.setHint(QueryHints.REFRESH, HintValues.TRUE);
	query.setParameter(1, id_dependencia);
	query.setParameter(2, fecha);
	List<ActivosModel> resultlist = query.getResultList();
	return resultlist;
}
@SuppressWarnings("unchecked")
public List<ActivosModel> getResumenActualizacion(short id_dependencia) {
	Query query = em.createNativeQuery("Reva_ResumenAct_Q " + "@ACT_Dependencia=?1 ", ActivosModel.class);
	query.setHint(QueryHints.REFRESH, HintValues.TRUE);
	query.setParameter(1, id_dependencia);
	List<ActivosModel> resultlist = query.getResultList();
	return resultlist;
}

}