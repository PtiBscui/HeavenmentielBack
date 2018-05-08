package heavenmentiel.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.databind.JsonNode;

import heavenmentiel.models.Event;
import heavenmentiel.repositories.EventRepo;

@Service
@Transactional
@CrossOrigin(origins = "http://localhost:4200")
public class EventService {
	@Autowired EventRepo evr;
	
	public Event getEventById(long id)
	{
		return evr.getById(id);
	}
	
	public JsonNode getAll() {
		return evr.getAll();
	}
	
	public JsonNode getAllByDate() {
		return evr.getAllByDate();
	}
	
	public JsonNode getLastFiveAdd() {
		return evr.getLastFiveAdd();
	}
	
	public JsonNode getMultiCriteria(String name, Date datemin, Date datemax, String place, String[] types, Float pricemin, Float pricemax) {
		return evr.getMultiCriteria(name, datemin, datemax, place, types, pricemin, pricemax);
	}
	public String createEvent(Event event) {
		return evr.createEvent(event);
	}
	
	public void updateEvent(Event event) {
		evr.update(event);
	}
	
	public JsonNode getTypes() {
		return evr.getTypes();
	}
	
}
