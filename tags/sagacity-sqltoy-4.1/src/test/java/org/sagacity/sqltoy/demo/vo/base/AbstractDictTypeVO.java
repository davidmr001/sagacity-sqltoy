/**
 *@Generated by QuickVO Tools 1.6
 */
package org.sagacity.sqltoy.demo.vo.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.OneToMany;
import org.sagacity.sqltoy.demo.vo.DictDetailVO;

/**
 * @project sqltoy-orm
 * @version 1.0.0 数据字典分类表 DictTypeVO generated by SAG_DICT_TYPE
 */
@Entity(tableName = "SAG_DICT_TYPE",pk_constraint="pk_SAG_DICT_TYPE")
public abstract class AbstractDictTypeVO implements Serializable,
		java.lang.Cloneable {
	/*--------------- properties string,handier to copy ---------------------*/
	// full properties
	// dictTypeCode,dictTypeName,dictTypeNameEn,appCode,comments,dataSize,dataType,operator,operateDate,segmentName,segmentType,segmentDictType,enabled

	// not null properties
	// dictTypeCode,dictTypeName,appCode,dataType,enabled

	/**
	 * 字典类型编码
	 */
	@Id(strategy = "assign")
	@Column(name = "DICT_TYPE_CODE", length = 50L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String dictTypeCode;

	/**
	 * 字典类型名称
	 */
	@Column(name = "DICT_TYPE_NAME", length = 100L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String dictTypeName;

	/**
	 * 字典类型名称
	 */
	@Column(name = "DICT_TYPE_NAME_EN", length = 200L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String dictTypeNameEn;

	/**
	 * 归属应用
	 */
	@Column(name = "APP_CODE", length = 30L, type = java.sql.Types.VARCHAR, nullable = false)
	protected String appCode;

	/**
	 * 字典类型描述
	 */
	@Column(name = "COMMENTS", length = 500L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String comments;

	/**
	 * 字典KEY数据长度
	 */
	@Column(name = "DATA_SIZE", length = 4L, type = java.sql.Types.INTEGER, nullable = true)
	protected Integer dataSize;

	/**
	 * 字典KEY数据类型
	 */
	@Column(name = "DATA_TYPE", length = 1L, defaultValue = "0", type = java.sql.Types.INTEGER, nullable = false)
	protected Integer dataType;

	/**
	 * 修改人
	 */
	@Column(name = "OPERATOR", length = 22L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String operator;

	/**
	 * 修改日期
	 */
	@Column(name = "OPERATE_DATE", length = 7L, type = java.sql.Types.DATE, nullable = true)
	protected Date operateDate;

	/**
	 * 扩展属性1名称
	 */
	@Column(name = "SEGMENT_NAME", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String segmentName;

	/**
	 * 扩展属性1类型
	 */
	@Column(name = "SEGMENT_TYPE", length = 8L, defaultValue = "0", type = java.sql.Types.INTEGER, nullable = true)
	protected Integer segmentType;

	/**
	 * 扩展属性来源字典
	 */
	@Column(name = "SEGMENT_DICT_TYPE", length = 50L, type = java.sql.Types.VARCHAR, nullable = true)
	protected String segmentDictType;

	/**
	 * 启用标志
	 */
	@Column(name = "ENABLED", length = 1L, defaultValue = "1", type = java.sql.Types.INTEGER, nullable = false)
	protected Integer enabled;

	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields = { "dictTypeCode" }, mappedTable = "SAG_DICT_DETAIL", mappedColumns = { "DICT_TYPE_CODE" }, 
			mappedFields = { "dictTypeCode" }, load = "ENABLED=1", update = "delete")
	protected List<DictDetailVO> dictDetailVOs = new ArrayList<DictDetailVO>();

	/** default constructor */
	public AbstractDictTypeVO() {
	}

	/** pk constructor */
	public AbstractDictTypeVO(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}

	/** minimal constructor */
	public AbstractDictTypeVO(String dictTypeCode, String dictTypeName,
			String appCode, Integer dataType, Integer enabled) {
		this.dictTypeCode = dictTypeCode;
		this.dictTypeName = dictTypeName;
		this.appCode = appCode;
		this.dataType = dataType;
		this.enabled = enabled;
	}

	/** full constructor */
	public AbstractDictTypeVO(String dictTypeCode, String dictTypeName,
			String dictTypeNameEn, String appCode, String comments,
			Integer dataSize, Integer dataType, String operator,
			Date operateDate, String segmentName, Integer segmentType,
			String segmentDictType, Integer enabled) {
		this.dictTypeCode = dictTypeCode;
		this.dictTypeName = dictTypeName;
		this.dictTypeNameEn = dictTypeNameEn;
		this.appCode = appCode;
		this.comments = comments;
		this.dataSize = dataSize;
		this.dataType = dataType;
		this.operator = operator;
		this.operateDate = operateDate;
		this.segmentName = segmentName;
		this.segmentType = segmentType;
		this.segmentDictType = segmentDictType;
		this.enabled = enabled;
	}

	/**
	 * @param dictTypeCode
	 *            the dictTypeCode to set
	 */
	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}

	/**
	 * @return the DictTypeCode
	 */
	public String getDictTypeCode() {
		return this.dictTypeCode;
	}

	/**
	 * @param dictTypeName
	 *            the dictTypeName to set
	 */
	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}

	/**
	 * @return the DictTypeName
	 */
	public String getDictTypeName() {
		return this.dictTypeName;
	}

	/**
	 * @param dictTypeNameEn
	 *            the dictTypeNameEn to set
	 */
	public void setDictTypeNameEn(String dictTypeNameEn) {
		this.dictTypeNameEn = dictTypeNameEn;
	}

	/**
	 * @return the DictTypeNameEn
	 */
	public String getDictTypeNameEn() {
		return this.dictTypeNameEn;
	}

	/**
	 * @param appCode
	 *            the appCode to set
	 */
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	/**
	 * @return the AppCode
	 */
	public String getAppCode() {
		return this.appCode;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the Comments
	 */
	public String getComments() {
		return this.comments;
	}

	/**
	 * @param dataSize
	 *            the dataSize to set
	 */
	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	/**
	 * @return the DataSize
	 */
	public Integer getDataSize() {
		return this.dataSize;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	/**
	 * @return the DataType
	 */
	public Integer getDataType() {
		return this.dataType;
	}

	/**
	 * @param operator
	 *            the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the Operator
	 */
	public String getOperator() {
		return this.operator;
	}

	/**
	 * @param operateDate
	 *            the operateDate to set
	 */
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	/**
	 * @return the OperateDate
	 */
	public Date getOperateDate() {
		return this.operateDate;
	}

	/**
	 * @param segmentName
	 *            the segmentName to set
	 */
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}

	/**
	 * @return the SegmentName
	 */
	public String getSegmentName() {
		return this.segmentName;
	}

	/**
	 * @param segmentType
	 *            the segmentType to set
	 */
	public void setSegmentType(Integer segmentType) {
		this.segmentType = segmentType;
	}

	/**
	 * @return the SegmentType
	 */
	public Integer getSegmentType() {
		return this.segmentType;
	}

	/**
	 * @param segmentDictType
	 *            the segmentDictType to set
	 */
	public void setSegmentDictType(String segmentDictType) {
		this.segmentDictType = segmentDictType;
	}

	/**
	 * @return the SegmentDictType
	 */
	public String getSegmentDictType() {
		return this.segmentDictType;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the Enabled
	 */
	public Integer getEnabled() {
		return this.enabled;
	}

	/**
	 * @return the dictDetailVOs
	 */
	public List<DictDetailVO> getDictDetailVOs() {
		return this.dictDetailVOs;
	}

	public void setDictDetailVOs(List<DictDetailVO> dictDetailVOs) {
		this.dictDetailVOs = dictDetailVOs;
	}

	/**
	 * @todo vo columns to String
	 */
	public String toString() {
		StringBuffer columnsBuffer = new StringBuffer();
		columnsBuffer.append("dictTypeCode=").append(getDictTypeCode())
				.append("\n");
		columnsBuffer.append("dictTypeName=").append(getDictTypeName())
				.append("\n");
		columnsBuffer.append("dictTypeNameEn=").append(getDictTypeNameEn())
				.append("\n");
		columnsBuffer.append("appCode=").append(getAppCode()).append("\n");
		columnsBuffer.append("comments=").append(getComments()).append("\n");
		columnsBuffer.append("dataSize=").append(getDataSize()).append("\n");
		columnsBuffer.append("dataType=").append(getDataType()).append("\n");
		columnsBuffer.append("operator=").append(getOperator()).append("\n");
		columnsBuffer.append("operateDate=").append(getOperateDate())
				.append("\n");
		columnsBuffer.append("segmentName=").append(getSegmentName())
				.append("\n");
		columnsBuffer.append("segmentType=").append(getSegmentType())
				.append("\n");
		columnsBuffer.append("segmentDictType=").append(getSegmentDictType())
				.append("\n");
		columnsBuffer.append("enabled=").append(getEnabled()).append("\n");
		return columnsBuffer.toString();
	}
}