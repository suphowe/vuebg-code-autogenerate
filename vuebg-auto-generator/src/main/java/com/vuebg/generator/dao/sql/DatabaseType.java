package com.vuebg.generator.dao.sql;


import com.vuebg.generator.converter.CommonMetaDataConverter;
import com.vuebg.generator.converter.MySQLMetaDataConverter;
import com.vuebg.generator.converter.OracleMetaDataConverter;
import com.vuebg.generator.dao.IMetaDataConverter;

/**
 * 数据库查询语句文件
 * @author suphowe
 * @date 2019-12-23
 */
public enum DatabaseType {

	Oracle {

		@Override
		public String getFileName() {
			return FOLDER + "/Oracle.xml";
		}

		@Override
		public IMetaDataConverter getConverter() {
			return OracleMetaDataConverter.getInstance();
		}
		
	},
	
	MySql5 {
		@Override
		public String getFileName() {
			return FOLDER + "/MySQL5.xml";
		}

		@Override
		public IMetaDataConverter getConverter() {
			return MySQLMetaDataConverter.getInstance();
		}
	}, 
	
	MSSQLServer {
		@Override
		public String getFileName() {
			return FOLDER + "/MSSQL.xml";
		}
	};
	
	private static final String FOLDER	= 
			DatabaseType.class.getPackage().getName().replace('.', '/');
	
	abstract public String getFileName();
	
	public IMetaDataConverter getConverter() {
		return CommonMetaDataConverter.getInstance();
	}
}
