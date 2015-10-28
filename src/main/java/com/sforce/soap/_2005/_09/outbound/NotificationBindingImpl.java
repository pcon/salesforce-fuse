package com.sforce.soap._2005._09.outbound;

import javax.jws.WebService;
import java.util.logging.Logger;
import java.util.logging.Level;

public class NotificationBindingImpl implements com.sforce.soap._2005._09.outbound.NotificationPort {
	private static final Logger logger = Logger.getLogger(NotificationBindingImpl.class.getName());

	public boolean notifications(java.lang.String organizationId, java.lang.String actionId, java.lang.String sessionId, java.lang.String enterpriseUrl, java.lang.String partnerUrl, java.util.List<com.sforce.soap._2005._09.outbound.CaseNotification> notification) {
		for (com.sforce.soap._2005._09.outbound.CaseNotification notif : notification) {
			logger.log(Level.SEVERE, (java.lang.String)(notif.getSObject().getCaseNumber().getValue()));
			logger.log(Level.SEVERE, (java.lang.String)(notif.getSObject().getSubject().getValue()));
		}

		return true;
	}
}