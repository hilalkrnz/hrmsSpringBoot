package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface MernisCheckService {
	
	boolean checkIfRealPerson(User user);

}
