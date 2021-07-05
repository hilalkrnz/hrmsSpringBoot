package kodlamaio.hrms.verification.concrete;

import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.verification.abstracts.EmailCheckService;

public class EmailCheckManager implements EmailCheckService {

	@Override
	public boolean CheckIfRealEmail(User user) {
	
		return true;
	}

}
