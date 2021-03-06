package cyb.rms.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cyb.rms.daos.IEmployeeDao;
import cyb.rms.daos.IProjectDao;
import cyb.rms.entities.Project;
import cyb.rms.exceptions.DaoException;
import cyb.rms.services.IProjectService;

@Service
public class ProjectService implements IProjectService {

	@Autowired
	IProjectDao projDao;
	
	@Override
	public Project addProject(Project proj) throws DaoException {
		return projDao.addProject(proj);
	}

	@Override
	public Project removeProject(Project proj) throws DaoException {
		return projDao.removeProject(proj);
	}

	@Override
	public Project updateProject(Project proj) throws DaoException {
		return projDao.updateProject(proj);
	}

	@Override
	public List<Project> listProjects() throws DaoException {
		return projDao.listProjects();
	}

	@Override
	public Project findProjectById(long id) throws DaoException {
		return projDao.getProjectById(id);
	}
	
	

}
