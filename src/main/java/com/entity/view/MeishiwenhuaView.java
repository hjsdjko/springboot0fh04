package com.entity.view;

import com.entity.MeishiwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食文化
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
@TableName("meishiwenhua")
public class MeishiwenhuaView  extends MeishiwenhuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishiwenhuaView(){
	}
 
 	public MeishiwenhuaView(MeishiwenhuaEntity meishiwenhuaEntity){
 	try {
			BeanUtils.copyProperties(this, meishiwenhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
