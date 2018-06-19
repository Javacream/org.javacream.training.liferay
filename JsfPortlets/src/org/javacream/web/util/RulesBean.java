package org.javacream.web.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RulesBean {

	/**
	 * Es gibt die "Java Beans"-Spezifikation: Eine Property wird über zwei
	 * spezielle Methoden definiert: get<PropertyName>() und
	 * set<PropertyName>(value) für alle Datentypen. Es gibt eine Ausnahme:
	 * logische Properties dürfen auch is<PropertyName> genannt werden
	 * 
	 * @return
	 */
	public boolean isSimpleLinkAvailable() {
		return true;
	}
}
