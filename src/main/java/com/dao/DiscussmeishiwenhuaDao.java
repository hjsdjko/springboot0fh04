package com.dao;

import com.entity.DiscussmeishiwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishiwenhuaVO;
import com.entity.view.DiscussmeishiwenhuaView;


/**
 * 美食文化评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
public interface DiscussmeishiwenhuaDao extends BaseMapper<DiscussmeishiwenhuaEntity> {
	
	List<DiscussmeishiwenhuaVO> selectListVO(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
	
	DiscussmeishiwenhuaVO selectVO(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
	
	List<DiscussmeishiwenhuaView> selectListView(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);

	List<DiscussmeishiwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
	
	DiscussmeishiwenhuaView selectView(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
	

}
