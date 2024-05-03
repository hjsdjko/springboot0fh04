package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CantingDao;
import com.entity.CantingEntity;
import com.service.CantingService;
import com.entity.vo.CantingVO;
import com.entity.view.CantingView;

@Service("cantingService")
public class CantingServiceImpl extends ServiceImpl<CantingDao, CantingEntity> implements CantingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CantingEntity> page = this.selectPage(
                new Query<CantingEntity>(params).getPage(),
                new EntityWrapper<CantingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CantingEntity> wrapper) {
		  Page<CantingView> page =new Query<CantingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CantingVO> selectListVO(Wrapper<CantingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CantingVO selectVO(Wrapper<CantingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CantingView> selectListView(Wrapper<CantingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CantingView selectView(Wrapper<CantingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
