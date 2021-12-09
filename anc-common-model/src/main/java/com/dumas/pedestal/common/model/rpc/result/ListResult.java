package com.dumas.pedestal.common.model.rpc.result;

import com.dumas.pedestal.common.model.constant.CommonApiConstant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 无分页的批量数据返回格式
 *
 * @author dumas
 * @date 2021/12/06 11:07 AM
 */
@Setter
@Getter
@ToString
public class ListResult<T> {
    /**
     * 返回码
     * 0: 成功
     */
    private String code;

    /**
     * 返回描述
     * （记录接口执行情况说明信息）
     */
    private String msg;

    private ListInfoDTO<T> data;

    /**
     * 是否成功
     *
     * @return
     */
    public boolean isSucceed() {
        return CommonApiConstant.API_RESPONSE_SUCCESS_CODE.equals(code);
    }
}
