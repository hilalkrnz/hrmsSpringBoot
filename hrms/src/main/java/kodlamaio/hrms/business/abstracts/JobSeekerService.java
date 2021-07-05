package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utities.results.DataResult;
import kodlamaio.hrms.core.utities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
}
