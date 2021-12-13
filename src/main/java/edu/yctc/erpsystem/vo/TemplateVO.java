package edu.yctc.erpsystem.vo;

import java.util.Date;

/**
 * 仓库管理表视图
 *
 * @author qiang
 */
public class TemplateVO {

    /**
     * 主键
     */
    private String id;

    /**
     * t_dict主键（模板类型）
     */
    private String dictId;

    /**
     * 模板类型名称
     */
    private String typeText;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 模板路径
     */
    private String url;

    /**
     * 模板说明
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建日期
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TemplateVO{" +
                "id='" + id + '\'' +
                ", dictId='" + dictId + '\'' +
                ", typeText='" + typeText + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", remark='" + remark + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }

}
