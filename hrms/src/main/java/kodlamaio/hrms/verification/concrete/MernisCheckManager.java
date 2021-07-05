package kodlamaio.hrms.verification.concrete;

import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.verification.abstracts.MernisCheckService;

public class MernisCheckManager implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
