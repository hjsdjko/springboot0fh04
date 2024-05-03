package com.entity.model;

import com.entity.MeishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
public class MeishixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美食名称
	 */
	
	private String meishimingcheng;
		
	/**
	 * 菜系分类
	 */
	
	private String caixifenlei;
		
	/**
	 * 美食照片
	 */
	
	private String meishizhaopian;
		
	/**
	 * 美食口味
	 */
	
	private String meishikouwei;
		
	/**
	 * 美食详情
	 */
	
	private String meishixiangqing;
		
	/**
	 * 餐厅账号
	 */
	
	private String cantingzhanghao;
		
	/**
	 * 餐厅名称
	 */
	
	private String cantingmingcheng;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：美食名称
	 */
	 
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
				
	
	/**
	 * 设置：菜系分类
	 */
	 
	public void setCaixifenlei(String caixifenlei) {
		this.caixifenlei = caixifenlei;
	}
	
	/**
	 * 获取：菜系分类
	 */
	public String getCaixifenlei() {
		return caixifenlei;
	}
				
	
	/**
	 * 设置：美食照片
	 */
	 
	public void setMeishizhaopian(String meishizhaopian) {
		this.meishizhaopian = meishizhaopian;
	}
	
	/**
	 * 获取：美食照片
	 */
	public String getMeishizhaopian() {
		return meishizhaopian;
	}
				
	
	/**
	 * 设置：美食口味
	 */
	 
	public void setMeishikouwei(String meishikouwei) {
		this.meishikouwei = meishikouwei;
	}
	
	/**
	 * 获取：美食口味
	 */
	public String getMeishikouwei() {
		return meishikouwei;
	}
				
	
	/**
	 * 设置：美食详情
	 */
	 
	public void setMeishixiangqing(String meishixiangqing) {
		this.meishixiangqing = meishixiangqing;
	}
	
	/**
	 * 获取：美食详情
	 */
	public String getMeishixiangqing() {
		return meishixiangqing;
	}
				
	
	/**
	 * 设置：餐厅账号
	 */
	 
	public void setCantingzhanghao(String cantingzhanghao) {
		this.cantingzhanghao = cantingzhanghao;
	}
	
	/**
	 * 获取：餐厅账号
	 */
	public String getCantingzhanghao() {
		return cantingzhanghao;
	}
				
	
	/**
	 * 设置：餐厅名称
	 */
	 
	public void setCantingmingcheng(String cantingmingcheng) {
		this.cantingmingcheng = cantingmingcheng;
	}
	
	/**
	 * 获取：餐厅名称
	 */
	public String getCantingmingcheng() {
		return cantingmingcheng;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
