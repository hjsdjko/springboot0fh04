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


import com.dao.CaixifenleiDao;
import com.entity.CaixifenleiEntity;
import com.service.CaixifenleiService;
import com.entity.vo.CaixifenleiVO;
import com.entity.view.CaixifenleiView;

@Service("caixifenleiService")
public class CaixifenleiServiceImpl extends ServiceImpl<CaixifenleiDao, CaixifenleiEntity> implements CaixifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaixifenleiEntity> page = this.selectPage(
                new Query<CaixifenleiEntity>(params).getPage(),
                new EntityWrapper<CaixifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaixifenleiEntity> wrapper) {
		  Page<CaixifenleiView> page =new Query<CaixifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaixifenleiVO> selectListVO(Wrapper<CaixifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaixifenleiVO selectVO(Wrapper<CaixifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaixifenleiView> selectListView(Wrapper<CaixifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaixifenleiView selectView(Wrapper<CaixifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
