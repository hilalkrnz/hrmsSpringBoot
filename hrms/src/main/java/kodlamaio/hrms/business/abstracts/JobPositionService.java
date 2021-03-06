package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utities.results.DataResult;
import kodlamaio.hrms.core.utities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);

}
