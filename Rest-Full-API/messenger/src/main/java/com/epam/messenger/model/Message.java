/**
 * 
 */
package com.epam.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Krishnakanth_Yachare
 *
 */
@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String author;

	public Message() {
	}

	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.created = new Date();
		this.message = message;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id2) {
		this.id = id2;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
