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


import com.dao.MeishiwenhuaDao;
import com.entity.MeishiwenhuaEntity;
import com.service.MeishiwenhuaService;
import com.entity.vo.MeishiwenhuaVO;
import com.entity.view.MeishiwenhuaView;

@Service("meishiwenhuaService")
public class MeishiwenhuaServiceImpl extends ServiceImpl<MeishiwenhuaDao, MeishiwenhuaEntity> implements MeishiwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishiwenhuaEntity> page = this.selectPage(
                new Query<MeishiwenhuaEntity>(params).getPage(),
                new EntityWrapper<MeishiwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishiwenhuaEntity> wrapper) {
		  Page<MeishiwenhuaView> page =new Query<MeishiwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishiwenhuaVO> selectListVO(Wrapper<MeishiwenhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishiwenhuaVO selectVO(Wrapper<MeishiwenhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishiwenhuaView> selectListView(Wrapper<MeishiwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishiwenhuaView selectView(Wrapper<MeishiwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
