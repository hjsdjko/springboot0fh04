package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishiwenhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishiwenhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiwenhuaView;


/**
 * 美食文化
 *
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
public interface MeishiwenhuaService extends IService<MeishiwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishiwenhuaVO> selectListVO(Wrapper<MeishiwenhuaEntity> wrapper);
   	
   	MeishiwenhuaVO selectVO(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
   	
   	List<MeishiwenhuaView> selectListView(Wrapper<MeishiwenhuaEntity> wrapper);
   	
   	MeishiwenhuaView selectView(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishiwenhuaEntity> wrapper);
   	

}

