package com.entity.view;

import com.entity.CaixifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜系分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
@TableName("caixifenlei")
public class CaixifenleiView  extends CaixifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaixifenleiView(){
	}
 
 	public CaixifenleiView(CaixifenleiEntity caixifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, caixifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
