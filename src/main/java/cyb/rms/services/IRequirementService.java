package cyb.rms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cyb.rms.entities.*;
import cyb.rms.exceptions.DaoException;

@Service
public interface IRequirementService {
	
	public Requirement addRequirement(Requirement req) throws DaoException;

	public Requirement removeRequirement(Requirement req) throws DaoException;

	public Requirement updateRequirement(Requirement req) throws DaoException;

	public List<Requirement> listRequirements() throws DaoException;

	public Requirement findRequirementById(long id) throws DaoException;

}
