package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Assort;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 10:39
 *
 * @Email 1206966083@qq.com
 */
public interface IAssortService {
    ServerResponse<List<Assort>> selectList(Integer cusId);
    ServerResponse<Assort> selectById(Integer assId);
    ServerResponse<String> updateAssort(Assort assort);
    ServerResponse<String> insertAssort(Assort assort);
    ServerResponse<String> deleteById(Integer assId);
}
