package sample.dao;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class SampleDao {

	private BasicDataSource dataSource;

	public BasicDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

}
