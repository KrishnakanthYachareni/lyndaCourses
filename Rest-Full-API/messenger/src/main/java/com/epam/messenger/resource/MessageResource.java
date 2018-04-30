/**
 * 
 */
package com.epam.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.epam.messenger.model.Message;
import com.epam.messenger.service.MessageService;

/**
 * @author Krishnakanth_Yachare
 *
 */
/*
 * If all the methods produce & consume same type then can we can keep that
 * annotation here. Other wise we can declare that annotations at method
 * definitions.
 * 
 * @Consumes(MediaType.APPLICATION_JSON)
 * 
 * @Produces(MediaType.APPLICATION_JSON)
 */
@Path("/messages")
public class MessageResource {

	private MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Message> getMessage() {
		return messageService.getAllMessages();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message msg) {
		return messageService.addMessage(msg);
	}

	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id, Message msg) {
		msg.setId(id);
		return messageService.updateMessage(msg);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message test(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}

}
