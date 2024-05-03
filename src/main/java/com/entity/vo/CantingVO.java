package com.entity.vo;

import com.entity.CantingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐厅
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-07 10:12:42
 */
public class CantingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
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
	 * 余额
	 */
	
	private Float money;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：余额
	 */
	 
	public void setMoney(Float money) {
		this.money = money;
	}
	
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}
			
}
