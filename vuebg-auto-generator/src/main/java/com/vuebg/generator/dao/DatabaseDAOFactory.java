package com.vuebg.generator.dao;


import com.vuebg.generator.constants.DBMSConstants;
import com.vuebg.generator.dao.impl.CommonDatabaseDAOImpl;
import com.vuebg.generator.dao.impl.MySql5DatabaseDAO;
import com.vuebg.generator.dao.sql.DatabaseType;
import com.vuebg.generator.params.ConnParam;

/**
 * 查询器生成工厂
 * @author suphowe
 * @date 2019-12-23
 */
public class DatabaseDAOFactory {

	public static IDatabaseDAO getDAO(ConnParam connParam) {
		String upperCaseDbName = connParam.getDbType().toUpperCase();
		
		if (upperCaseDbName.contains(DBMSConstants.ORACLE)) {
			return new CommonDatabaseDAOImpl(connParam, DatabaseType.Oracle);
		}  else if (upperCaseDbName.contains(DBMSConstants.SQL_SERVER) || upperCaseDbName.contains(DBMSConstants.SQLSERVER)) {
			return new CommonDatabaseDAOImpl(connParam, DatabaseType.MSSQLServer);
		} else if (upperCaseDbName.contains(DBMSConstants.MYSQL)) {
			return new MySql5DatabaseDAO(connParam, DatabaseType.MySql5);
//		} else if (upperCaseDbName.contains(DBMSConstants.SYBASE)) {
//
//		} else if (upperCaseDbName.contains(DBMSConstants.POSTGRE_SQL)) {
//			
//		} else if (upperCaseDbName.contains(DBMSConstants.DB2)) {
//			
//		} else if (upperCaseDbName.contains(DBMSConstants.HSQLDB)) {
//			
//		} else if (upperCaseDbName.contains((DBMSConstants.FIREBIRD)) {
//			
//		} else if (upperCaseDbName.contains(DBMSConstants.DERBY)) {
//			
		} else {
			
		}
		return new MySql5DatabaseDAO(connParam, DatabaseType.MySql5);
	}
}
