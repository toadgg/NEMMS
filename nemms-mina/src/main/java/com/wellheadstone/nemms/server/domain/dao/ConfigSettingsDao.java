package com.wellheadstone.nemms.server.domain.dao;

import org.springframework.stereotype.Repository;

import com.wellheadstone.nemms.data.jdbc.BaseDao;
import com.wellheadstone.nemms.server.domain.po.ConfigSettingsPo;

/**
 * 数据访问实现类
 */
@Repository
public class ConfigSettingsDao extends BaseDao<ConfigSettingsPo> {

	public ConfigSettingsDao() {
		super(ConfigSettingsPo.EntityName, ConfigSettingsPo.Id);
	}
}
