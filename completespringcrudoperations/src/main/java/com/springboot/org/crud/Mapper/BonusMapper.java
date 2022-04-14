package com.springboot.org.crud.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springboot.org.crud.model.Bonus;




public class BonusMapper implements RowMapper<Bonus> {

	@Override
	public Bonus mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Bonus(rs.getInt(1),rs.getInt(2),rs.getDate(3));
	}

}
