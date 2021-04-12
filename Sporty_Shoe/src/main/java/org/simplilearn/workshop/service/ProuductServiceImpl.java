package org.simplilearn.workshop.service;

import java.util.List;


import org.simplilearn.workshop.model.Prouduct;

import org.simplilearn.workshop.repository.ProuductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "prouductService")
public class ProuductServiceImpl implements ProuductService {
   
	@Autowired
    private ProuductRepository prouductRepository;
    @Override
    @Transactional
    public List<Prouduct> getProuducts() {
        return prouductRepository.getProuducts();
    }
    
    @Override
	@Transactional
	public void saveProuduct(Prouduct theProuduct) {

    	prouductRepository.saveProuduct(theProuduct);
	}

	@Override
	@Transactional
	public Prouduct getProuduct(int theId) {
		
		return prouductRepository.getProuduct(theId);
	}

	@Override
	@Transactional
	public void deleteProuduct(int theId) {
		
		prouductRepository.deleteProuduct(theId);
	}


}

