package com.springboot.org.crud.Mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springboot.org.crud.model.Title;


public class TitleMapper implements RowMapper<Title> {

	@Override
	public Title mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Title(rs.getInt(1),rs.getString(2),rs.getDate(3));
	}


}