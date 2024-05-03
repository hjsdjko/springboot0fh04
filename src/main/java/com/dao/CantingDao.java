package com.dao;

import com.entity.CantingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CantingVO;
import com.entity.view.CantingView;


/**
 * 餐厅
 * 
 * @author 
 * @email 
 * @date 2023-01-07 10:12:42
 */
public interface CantingDao extends BaseMapper<CantingEntity> {
	
	List<CantingVO> selectListVO(@Param("ew") Wrapper<CantingEntity> wrapper);
	
	CantingVO selectVO(@Param("ew") Wrapper<CantingEntity> wrapper);
	
	List<CantingView> selectListView(@Param("ew") Wrapper<CantingEntity> wrapper);

	List<CantingView> selectListView(Pagination page,@Param("ew") Wrapper<CantingEntity> wrapper);
	
	CantingView selectView(@Param("ew") Wrapper<CantingEntity> wrapper);
	

}
