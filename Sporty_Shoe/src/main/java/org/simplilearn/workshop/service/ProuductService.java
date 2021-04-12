package org.simplilearn.workshop.service;

import java.util.List;


import org.simplilearn.workshop.model.Prouduct;

public interface ProuductService {

	public List<Prouduct> getProuducts();
	
	public void saveProuduct(Prouduct theProuduct);

	public Prouduct getProuduct(int theId);

	public void deleteProuduct(int theId);
}
