package org.zendesk.client.v2.model.events;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganizationActivityEvent extends Event {
	private String subject;
	private String body;
	private List<Long> recipients;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<Long> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Long> recipients) {
		this.recipients = recipients;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("OrganizationActivityEvent");
		sb.append("{subject='").append(subject);
		sb.append(", body=").append(body);
		sb.append(", recipients=").append(recipients);
		sb.append('}');
		return sb.toString();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}