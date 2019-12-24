package com.vuebg.generator.service;

import com.vuebg.generator.model.*;
import com.vuebg.generator.params.ConnParam;

import java.util.List;
import java.util.Map;


/**
 * 数据库元信息查询服务
 * @author suphowe
 * @date 2019-12-23
 */
public interface DatabaseService {
	
    /**
     * 通用查询方法
     * @param connParam 连接参数
     * @param sql 要查询的sql语句
     * @param params 查询条件数组
     * @return
     */
	List<Map<String, String>> query(ConnParam connParam, String sql, String[] params);
	
	/**
     * 查询表集合
     * @param connParam 连接参数
     * @return
     */
	List<Table> getTables(ConnParam connParam);
	
	/**
     * 查询表的字段集
     * @param connParam 连接参数
     * @param tableName
     * @return
     */
	List<Column> getColumns(ConnParam connParam, String tableName);
	
	/**
     * 查询主键集
     * @param connParam 连接参数
     * @param tableName
     * @return
     */
	List<PrimaryKey> getPrimaryKeys(ConnParam connParam, String tableName);
	
	/**
     * 查询外键集
     * @param connParam 连接参数
     * @param tableName
     * @return
     */
	List<ForeignKey> getForeignKeys(ConnParam connParam, String tableName);
	
	/**
     * 查询索引集
     * @param connParam 连接参数
     * @return
     */
	List<Index> getIndexes(ConnParam connParam, String tableName);
	
	/**
     * 查询触发器集
     * @param connParam 连接参数
     * @param tableName
     * @return
     */
	List<Trigger> getTriggers(ConnParam connParam, String tableName);
	
	/**
	 * 测试数据库是否可以连接
	 * @param connParam
	 * @return
	 */
	boolean canConnect(ConnParam connParam);
	
	
}
