package org.javacream.web.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RulesBean {

	/**
	 * Es gibt die "Java Beans"-Spezifikation: Eine Property wird �ber zwei
	 * spezielle Methoden definiert: get<PropertyName>() und
	 * set<PropertyName>(value) f�r alle Datentypen. Es gibt eine Ausnahme:
	 * logische Properties d�rfen auch is<PropertyName> genannt werden
	 * 
	 * @return
	 */
	public boolean isSimpleLinkAvailable() {
		return true;
	}
}
