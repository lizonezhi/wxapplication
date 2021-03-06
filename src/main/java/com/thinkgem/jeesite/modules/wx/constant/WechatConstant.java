package com.thinkgem.jeesite.modules.wx.constant;

import com.thinkgem.jeesite.modules.wx.utils.UUIDUtils;

public class WechatConstant {

    //微信分配的小程序ID
    public static final String appid = "wx90e34a4cc94f201e";

    //秘钥
    public static final String appSecret = "1068f4d305f1f0b133ad11d3da5e825c";

    //key
    public static final String key = "123456789123456789123456789abcde";

    //微信支付分配的商户号
    public static final String mch_id = "1507475751";

    //随机字符串，长度要求在32位以内。推荐随机数生成算法
    public static final String nonce_str = UUIDUtils.timeBasedStr();

    //商品简单描述，该字段请按照规范传递，具体请见参数规定
    public static final String body = "test";

    //APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。
    public static final String spbill_create_ip = "118.24.91.136";

    //异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
    public static final String notify_url = "118.24.91.136:8080/jeesite/api/wx/result";

    //小程序取值如下：JSAPI，详细说明见参数规定
    public static final String trade_type = "JSAPI";

    //支付成功的消息模板id
    public static final String order_pay_success_template_id = "9hW0Nzw89l0qcBo_lOJ8Sl0VN2MPmA2AjA_aKuuCyu4";

    //支付失败的消息模板id
    public static final String order_pay_fail_template_id = "s7u-_XMSUjjOPy4YSN3FhLG9jPrbBcjXsXYmqFDEjx8";

    // 桌号的统一跳转链接
    public static final String table_number_jump_link = "pages/list1/list1";

    // 生成的小程序码的宽度，如果想完善的话可以后台设置
    public static final int qr_code_width = 400;

}
