package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 餐厅信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
@TableName("cantingxinxi")
public class CantingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CantingxinxiEntity() {
		
	}
	
	public CantingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐厅账号
	 */
					
	private String cantingzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
