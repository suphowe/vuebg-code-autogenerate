package com.vuebg.generator.utils;


import com.vuebg.generator.dao.DatabaseDAOFactory;
import com.vuebg.generator.dao.IDatabaseDAO;
import com.vuebg.generator.exceptions.DAOException;
import com.vuebg.generator.params.ConnParam;

/**
 * 连接工具类
 * @author suphowe
 * @date 2019-12-23
 */
public class ConnUtils {

	/**
	 * 测试数据库连接
	 * @param connParam
	 * @return
	 */
	public static boolean testConnection(ConnParam connParam) {
		IDatabaseDAO dao = DatabaseDAOFactory.getDAO(connParam);
		if (dao != null) {
			try {
				dao.openConnection();
				System.out.println("数据库连接成功!");
				return true;
			} catch (Exception e) {
				System.out.println("数据库连接失败,请检查端口号、用户名或密码 !");
			} finally {
				try {
					dao.closeConnection();
				} catch (DAOException e) {
				}
			}
		}
		return false;
	}
}
