package com.ai.yc.common.service.atom.menu;

import java.util.List;

import com.ai.yc.common.dao.mapper.bo.SysMenu;

public interface ISysMenuAtomService {
	
	 List<SysMenu> findByUserId(String userId);
}
