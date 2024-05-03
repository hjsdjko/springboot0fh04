package com.entity.model;

import com.entity.CantingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐厅信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
public class CantingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐厅名称
	 */
	
	private String cantingmingcheng;
		
	/**
	 * 餐厅位置
	 */
	
	private String cantingweizhi;
		
	/**
	 * 餐厅电话
	 */
	
	private String cantingdianhua;
		
	/**
	 * 餐厅封面
	 */
	
	private String cantingfengmian;
		
	/**
	 * 餐厅详情
	 */
	
	private String cantingxiangqing;
				
	
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
	 * 设置：餐厅位置
	 */
	 
	public void setCantingweizhi(String cantingweizhi) {
		this.cantingweizhi = cantingweizhi;
	}
	
	/**
	 * 获取：餐厅位置
	 */
	public String getCantingweizhi() {
		return cantingweizhi;
	}
				
	
	/**
	 * 设置：餐厅电话
	 */
	 
	public void setCantingdianhua(String cantingdianhua) {
		this.cantingdianhua = cantingdianhua;
	}
	
	/**
	 * 获取：餐厅电话
	 */
	public String getCantingdianhua() {
		return cantingdianhua;
	}
				
	
	/**
	 * 设置：餐厅封面
	 */
	 
	public void setCantingfengmian(String cantingfengmian) {
		this.cantingfengmian = cantingfengmian;
	}
	
	/**
	 * 获取：餐厅封面
	 */
	public String getCantingfengmian() {
		return cantingfengmian;
	}
				
	
	/**
	 * 设置：餐厅详情
	 */
	 
	public void setCantingxiangqing(String cantingxiangqing) {
		this.cantingxiangqing = cantingxiangqing;
	}
	
	/**
	 * 获取：餐厅详情
	 */
	public String getCantingxiangqing() {
		return cantingxiangqing;
	}
			
}
