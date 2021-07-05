package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface EmailCheckService {
	
	boolean CheckIfRealEmail(User user);

}
