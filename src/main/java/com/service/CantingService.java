package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CantingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CantingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CantingView;


/**
 * 餐厅
 *
 * @author 
 * @email 
 * @date 2023-01-07 10:12:42
 */
public interface CantingService extends IService<CantingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CantingVO> selectListVO(Wrapper<CantingEntity> wrapper);
   	
   	CantingVO selectVO(@Param("ew") Wrapper<CantingEntity> wrapper);
   	
   	List<CantingView> selectListView(Wrapper<CantingEntity> wrapper);
   	
   	CantingView selectView(@Param("ew") Wrapper<CantingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CantingEntity> wrapper);
   	

}

