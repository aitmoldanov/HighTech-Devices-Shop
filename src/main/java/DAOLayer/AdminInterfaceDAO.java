package DAOLayer;

import Exceptions.MyException;

import java.util.List;

public interface AdminInterfaceDAO {
	public boolean add(Object newObject) throws MyException;
	public boolean remove(int id) throws MyException;
	public boolean update(Object newObject) throws MyException;
	public List<?> readAll() throws MyException;
}
