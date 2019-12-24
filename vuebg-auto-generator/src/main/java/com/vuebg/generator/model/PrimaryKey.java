package com.vuebg.generator.model;

/**
 * 主键
 * @author suphowe
 * @date 2019-12-23
 */
public class PrimaryKey {

    /** 名称 */
    private String name;
    /** 所属表名称 */
    private String tableName;
    /** 字段 */
    private String cloumn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCloumn() {
        return cloumn;
    }

    public void setCloumn(String cloumn) {
        this.cloumn = cloumn;
    }

}
