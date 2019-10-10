package com.cartisan.huiduoduo.params;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author colin
 */
@Data
public class GeneralizeApplyParam {
    @ApiModelProperty(value = "用户Id", required = true)
    @NotBlank(message = "用户Id不能为空")
    private String userId;

    @ApiModelProperty(value = "姓名")
    @NotBlank(message = "用户Id不能为空")
    private String name;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "职业")
    private String profession;

    @ApiModelProperty(value = "银行卡号")
    private String debitCart;

    @ApiModelProperty(value = "银行")
    private String bank;
}
