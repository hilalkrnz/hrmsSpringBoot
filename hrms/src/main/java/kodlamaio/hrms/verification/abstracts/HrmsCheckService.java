package kodlamaio.hrms.verification.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface HrmsCheckService {
	
	boolean checkIfConfirmHrms(User user);

}
