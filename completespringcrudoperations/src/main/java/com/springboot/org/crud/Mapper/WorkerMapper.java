package com.springboot.org.crud.Mapper;





import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springboot.org.crud.model.Worker;

public class WorkerMapper implements RowMapper<Worker> {
	public Worker mapRow(ResultSet result, int rowNum) throws SQLException {
		Worker worker = new Worker();
		worker.setworkerId(result.getInt("worker_id"));
		worker.setfirstName(result.getString("first_name"));
		worker.setlastName(result.getString("last_name"));
		worker.setSalary(result.getInt("salary"));
		worker.setjoiningDate(result.getDate("joining_date"));
		worker.setDepartment(result.getString("department"));
		return worker;
	}
}