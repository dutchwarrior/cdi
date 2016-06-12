package org.speranza.ex24pag55Event;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class InventoryService24 {

	@Inject
	private Logger logger;
	public List<Book24> inventory = new ArrayList<Book24>();
	
	
	public void addBook(@Observes @Add Book24 book) {
		logger.log(Level.FINER, "aggiunto libro");
		inventory.add(book);
	}
	
	public void removeBook(@Observes @Remove Book24 book) {
		logger.warning("rimosso libro");
		inventory.remove(book);
	}
	
	public List<Book24> getInventory() {
		return inventory;
	}
}
