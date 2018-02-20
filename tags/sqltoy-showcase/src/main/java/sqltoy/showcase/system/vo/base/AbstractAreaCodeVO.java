/**
 *@Generated by sagacity-quickvo 4.0
 */
package sqltoy.showcase.system.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sys_area_code,Remark:地区代码表   
 */
@Entity(tableName="sys_area_code",pk_constraint="PRIMARY")
public abstract class AbstractAreaCodeVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //areaCode,areaName,cityCode,cityName,provinceCode,provinceName,showIndex,status
	 
	 //not null properties
	 //areaCode,areaName,showIndex,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 5393261397874921423L;
	
	/**
	 * 地区码
	 */
	@Id(strategy="assign")
	@Column(name="AREA_CODE",length=6L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String areaCode;
	
	/**
	 * 地区名称
	 */
	@Column(name="AREA_NAME",length=40L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String areaName;
	
	/**
	 * 城市代码
	 */
	@Column(name="CITY_CODE",length=6L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cityCode;
	
	/**
	 * 城市名称
	 */
	@Column(name="CITY_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cityName;
	
	/**
	 * 省份代码
	 */
	@Column(name="PROVINCE_CODE",length=6L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String provinceCode;
	
	/**
	 * 省份名称
	 */
	@Column(name="PROVINCE_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String provinceName;
	
	/**
	 * 显示顺序
	 */
	@Column(name="SHOW_INDEX",length=10L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer showIndex;
	
	/**
	 * 启用标志
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.CHAR,nullable=false)
	protected String status;
	


	/** default constructor */
	public AbstractAreaCodeVO() {
	}
	
	/** pk constructor */
	public AbstractAreaCodeVO(String areaCode)
	{
		this.areaCode=areaCode;
	}

	/** minimal constructor */
	public AbstractAreaCodeVO(String areaCode,String areaName,Integer showIndex,String status)
	{
		this.areaCode=areaCode;
		this.areaName=areaName;
		this.showIndex=showIndex;
		this.status=status;
	}

	/** full constructor */
	public AbstractAreaCodeVO(String areaCode,String areaName,String cityCode,String cityName,String provinceCode,String provinceName,Integer showIndex,String status)
	{
		this.areaCode=areaCode;
		this.areaName=areaName;
		this.cityCode=cityCode;
		this.cityName=cityName;
		this.provinceCode=provinceCode;
		this.provinceName=provinceName;
		this.showIndex=showIndex;
		this.status=status;
	}
	
	/**
	 *@param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode=areaCode;
	}
		
	/**
	 *@return the AreaCode
	 */
	public String getAreaCode() {
	    return this.areaCode;
	}
	
	/**
	 *@param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName=areaName;
	}
		
	/**
	 *@return the AreaName
	 */
	public String getAreaName() {
	    return this.areaName;
	}
	
	/**
	 *@param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode=cityCode;
	}
		
	/**
	 *@return the CityCode
	 */
	public String getCityCode() {
	    return this.cityCode;
	}
	
	/**
	 *@param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName=cityName;
	}
		
	/**
	 *@return the CityName
	 */
	public String getCityName() {
	    return this.cityName;
	}
	
	/**
	 *@param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode=provinceCode;
	}
		
	/**
	 *@return the ProvinceCode
	 */
	public String getProvinceCode() {
	    return this.provinceCode;
	}
	
	/**
	 *@param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName=provinceName;
	}
		
	/**
	 *@return the ProvinceName
	 */
	public String getProvinceName() {
	    return this.provinceName;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public void setShowIndex(Integer showIndex) {
		this.showIndex=showIndex;
	}
		
	/**
	 *@return the ShowIndex
	 */
	public Integer getShowIndex() {
	    return this.showIndex;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(String status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public String getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("areaCode=").append(getAreaCode()).append("\n");
		columnsBuffer.append("areaName=").append(getAreaName()).append("\n");
		columnsBuffer.append("cityCode=").append(getCityCode()).append("\n");
		columnsBuffer.append("cityName=").append(getCityName()).append("\n");
		columnsBuffer.append("provinceCode=").append(getProvinceCode()).append("\n");
		columnsBuffer.append("provinceName=").append(getProvinceName()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
