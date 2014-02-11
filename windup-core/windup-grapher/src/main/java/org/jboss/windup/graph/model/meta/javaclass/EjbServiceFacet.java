package org.jboss.windup.graph.model.meta.javaclass;

import org.jboss.windup.graph.renderer.Label;

import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.modules.typedgraph.TypeValue;

@TypeValue("EJBServiceFacet")
public interface EjbServiceFacet extends JavaClassMetaFacet {

	@Label
	@Property("ejbServiceName")
	public String getEjbServiceName();

	@Property("ejbServiceName")
	public String setEjbServiceName(String ejbServiceName);
	
}
