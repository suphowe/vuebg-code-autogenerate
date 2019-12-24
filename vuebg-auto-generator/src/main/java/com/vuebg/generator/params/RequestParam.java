package com.vuebg.generator.params;

/**
 * 查询参数封装
 * @author suphowe
 * @date 2019-12-23
 */
public class RequestParam extends ConnParam {

	private static final long serialVersionUID = 1L;
	
	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
