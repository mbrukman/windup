package org.jboss.windup.graph.model.meta.xml;

import org.jboss.windup.graph.model.meta.javaclass.HibernateEntityFacet;
import org.jboss.windup.graph.renderer.Label;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.frames.Adjacency;
import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.modules.typedgraph.TypeValue;

@TypeValue("HibernateConfigurationFacet")
public interface HibernateConfigurationFacet extends XmlMetaFacet {

	@Label
	@Property("specificationVersion")
	public String getSpecificationVersion();

	@Property("specificationVersion")
	public void setSpecificationVersion(String version);
	
	@Adjacency(label="hibernateEntity", direction=Direction.OUT)
	public Iterable<HibernateEntityFacet> getHibernateEntity();

	@Adjacency(label="hibernateEntity", direction=Direction.OUT)
	public void addHibernateEntityReference(HibernateEntityFacet hibernateEntity);

}
