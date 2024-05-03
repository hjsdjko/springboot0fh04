package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MeishiwenhuaEntity;
import com.entity.view.MeishiwenhuaView;

import com.service.MeishiwenhuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 美食文化
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-07 10:12:43
 */
@RestController
@RequestMapping("/meishiwenhua")
public class MeishiwenhuaController {
    @Autowired
    private MeishiwenhuaService meishiwenhuaService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeishiwenhuaEntity meishiwenhua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			meishiwenhua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MeishiwenhuaEntity> ew = new EntityWrapper<MeishiwenhuaEntity>();

		PageUtils page = meishiwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishiwenhua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeishiwenhuaEntity meishiwenhua, 
		HttpServletRequest request){
        EntityWrapper<MeishiwenhuaEntity> ew = new EntityWrapper<MeishiwenhuaEntity>();

		PageUtils page = meishiwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishiwenhua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeishiwenhuaEntity meishiwenhua){
       	EntityWrapper<MeishiwenhuaEntity> ew = new EntityWrapper<MeishiwenhuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meishiwenhua, "meishiwenhua")); 
        return R.ok().put("data", meishiwenhuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeishiwenhuaEntity meishiwenhua){
        EntityWrapper< MeishiwenhuaEntity> ew = new EntityWrapper< MeishiwenhuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meishiwenhua, "meishiwenhua")); 
		MeishiwenhuaView meishiwenhuaView =  meishiwenhuaService.selectView(ew);
		return R.ok("查询美食文化成功").put("data", meishiwenhuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeishiwenhuaEntity meishiwenhua = meishiwenhuaService.selectById(id);
        return R.ok().put("data", meishiwenhua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeishiwenhuaEntity meishiwenhua = meishiwenhuaService.selectById(id);
        return R.ok().put("data", meishiwenhua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeishiwenhuaEntity meishiwenhua, HttpServletRequest request){
    	meishiwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishiwenhua);
        meishiwenhuaService.insert(meishiwenhua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeishiwenhuaEntity meishiwenhua, HttpServletRequest request){
    	meishiwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishiwenhua);
        meishiwenhuaService.insert(meishiwenhua);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MeishiwenhuaEntity meishiwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meishiwenhua);
        meishiwenhuaService.updateById(meishiwenhua);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meishiwenhuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MeishiwenhuaEntity> wrapper = new EntityWrapper<MeishiwenhuaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = meishiwenhuaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
