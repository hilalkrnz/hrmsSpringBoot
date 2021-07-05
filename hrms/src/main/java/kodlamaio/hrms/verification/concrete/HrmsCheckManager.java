package kodlamaio.hrms.verification.concrete;

import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.verification.abstracts.HrmsCheckService;

public class HrmsCheckManager implements HrmsCheckService{

	@Override
	public boolean checkIfConfirmHrms(User user) {
		
		return true;
	}

}
