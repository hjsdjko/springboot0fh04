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


import com.dao.DiscussmeishiwenhuaDao;
import com.entity.DiscussmeishiwenhuaEntity;
import com.service.DiscussmeishiwenhuaService;
import com.entity.vo.DiscussmeishiwenhuaVO;
import com.entity.view.DiscussmeishiwenhuaView;

@Service("discussmeishiwenhuaService")
public class DiscussmeishiwenhuaServiceImpl extends ServiceImpl<DiscussmeishiwenhuaDao, DiscussmeishiwenhuaEntity> implements DiscussmeishiwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishiwenhuaEntity> page = this.selectPage(
                new Query<DiscussmeishiwenhuaEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishiwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishiwenhuaEntity> wrapper) {
		  Page<DiscussmeishiwenhuaView> page =new Query<DiscussmeishiwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishiwenhuaVO> selectListVO(Wrapper<DiscussmeishiwenhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishiwenhuaVO selectVO(Wrapper<DiscussmeishiwenhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishiwenhuaView> selectListView(Wrapper<DiscussmeishiwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishiwenhuaView selectView(Wrapper<DiscussmeishiwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
