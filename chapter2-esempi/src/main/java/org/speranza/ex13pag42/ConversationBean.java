package org.speranza.ex13pag42;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ConversationBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Conversation conversation;

	private int counter;
	
	@PostConstruct
	public void init(){
		counter = 0;
	}
	
	public void initConversation() {
		if(!FacesContext.getCurrentInstance().isPostback() && conversation.isTransient()) {
			conversation.begin();
		}
	}
	
	public String handleFirstStepSubmit(){
		return "step2?faces-redirect=true";
	}
	

	public String handleThirdStepSubmit(){
		return "step3?faces-redirect=true";
	}
	
	public String endConversation(){
		if(!conversation.isTransient()){
			conversation.end();
		}
		return "step1?faces-redirect=true";
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Conversation getConversation() {
		return conversation;
	}
	
	public void increment() {
		counter++;
	}
}
