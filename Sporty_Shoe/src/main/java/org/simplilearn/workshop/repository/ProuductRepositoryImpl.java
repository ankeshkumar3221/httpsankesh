package org.simplilearn.workshop.repository;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simplilearn.workshop.model.Prouduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "ProuductRepository")
public class ProuductRepositoryImpl implements ProuductRepository {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Prouduct> getProuducts() {
         // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //create a query .. sort by price
        Query<Prouduct> theQuery =
                currentSession.createQuery("from Prouduct order by price",Prouduct.class);
        
        //execute query and get result list
        List<Prouduct> Prouducts = theQuery.getResultList();
        
        return Prouducts;
    }
    
    @Override
	public void saveProuduct(Prouduct theProuduct) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theProuduct);
		
	}

	@Override
	public Prouduct getProuduct(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Prouduct theProuduct = currentSession.get(Prouduct.class, theId);
		
		return theProuduct;
	}

	@Override
	public void deleteProuduct(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Prouduct where id=:prouductId");
		theQuery.setParameter("prouductId", theId);
		
		theQuery.executeUpdate();		
	}

}
