package com.vuebg.generator.model;

import com.vuebg.generator.params.ConnParam;

import java.util.ArrayList;
import java.util.List;


/**
 * 代码生成数据模型
 * @author suphowe
 * @date 2019-12-23
 */
public class GenerateModel {

	private String outPutFolderPath;
	private String basePackage = "com.vuebg.output";
	private ConnParam connParam;
	private List<TableModel> tableModels = new ArrayList<>();
	
	public String getOutPutFolderPath() {
		return outPutFolderPath;
	}
	public void setOutPutFolderPath(String outPutFolderPath) {
		this.outPutFolderPath = outPutFolderPath;
	}
	public String getBasePackage() {
		return basePackage;
	}
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	public ConnParam getConnParam() {
		return connParam;
	}
	public void setConnParam(ConnParam connParam) {
		this.connParam = connParam;
	}
	public List<TableModel> getTableModels() {
		return tableModels;
	}
	public void setTableModels(List<TableModel> tableModels) {
		this.tableModels = tableModels;
	}

}
