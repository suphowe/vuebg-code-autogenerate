package com.vuebg.generator.service;

import com.vuebg.generator.model.GenerateModel;
import com.vuebg.generator.model.Table;
import com.vuebg.generator.params.ConnParam;

import java.io.IOException;
import java.util.List;


/**
 * 代码生成服务
 * @author suphowe
 * @date 2019-12-23
 */
public interface GenerateService {

	/**
	 * 是否可以连接
	 * @param connParam
	 * @return
	 */
	public boolean testConnection(ConnParam connParam);

	/**
	 * 反向查找数据表
	 * @param connParam
	 * @return
	 */
	public List<Table> getTables(ConnParam connParam);

	/**
	 * 获取代码生成数据模型
	 * @param generateModel
	 * @return
	 */
	public GenerateModel getGenerateModel(GenerateModel generateModel);

	/**
	 * 生成代码文件
	 * @param generateModel
	 * @return
	 * @throws IOException 
	 */
	public boolean generateModels(GenerateModel generateModel) throws Exception;


}
