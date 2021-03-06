package demo.controller;

/**
 * Created by Administrator on 2016/10/11.
 */

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import demo.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhengyunfei on 2016/9/2.
 * 用户反馈api接口
 */
@RestController
@Api(value = "0:系统返回状态", description = "系统返回状态", produces = "application/json",position =15 )
public class ResultStatusController {
    @Autowired
    UserMapper userMapper;

    @ApiOperation(httpMethod = "POST", value = "系统返回状态",position = 1,nickname = "系统返回状态", notes = "" +
            "<h4>系统返回状态</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            " SUCCESS(0, \"成功\"),\n" +
            "    USERNAME_OR_PASSWORD_ERROR(1001, \"手机号或密码错误\"),\n" +
            "    USER_NOT_FOUND(1002, \"用户不存在\"),\n" +
            "    USER_NOT_LOGIN(1003, \"用户未登录\"),\n" +
            "    MOBEILE_ERROR(1004, \"手机号码格式错误\"),\n" +
            "    TOKEN_ERROR(1005, \"登录失效，请重新登录\"),\n" +
            "    NOT_FOUND(404, \"NOT FOUND\"),\n" +
            "    PARAM_IS_NOT_NULL(1006, \"PARAM IS NOT NULL\"),\n" +
            "    PASSWORD_REG(1007, \"请设置6-16位数字或字母组成的密码\"),\n" +
            "    CODE_ERROR(1008, \"验证码错误\"),\n" +
            "    MOBEILE_SEND_CODE_ERROR(1009, \"您的操作过于频繁，请明天再试\"),\n" +
            "    MOBEILE_TEST_SEND_CODE_ERROR(1010, \"该手机号码为测试手机号码,不用发送验证码\"),\n" +
            "    IMAGE_CODE_ERROR(1011, \"图形验证码错误\"),\n" +
            "    CODE_COUNT_ERROR(1012, \"验证码输入次数超过3次\"),\n" +
            "    USER_NAME_ERROR(1013, \"真实姓名错误\"),\n" +
            "    EMAILFMT_ERROR(1014, \"邮箱格式错误\"),\n" +
            "    IDCARD_ERROR(1015, \"身份证格式错误\"),\n" +
            "    COMPANY_ERROR(1016, \"所在公司填写错误\"),\n" +
            "    POSITION_ERROR(1017, \"职位填写错误\"),\n" +
            "    ASSEST_ERROR(1018, \"请选择金融资产量\"),\n" +
            "    ARPM_ERROR(1019, \"请选择近三年平均收入\"),\n" +
            "    IDCARD_PHOTO_ERROR(1020, \"请上传身份证照片\"),\n" +
            "    USER_CAR_PHOTO_ERROR(1021, \"请上传名片\"),\n" +
            "    UPLOAD_IMAGE_TYPE_ERROR(1022, \"该文件类型不支持，请上传jpg、png、tmp格式的图片\"),\n" +
            "    UPLOAD_IMAGE_MAX_SIZE_ERROR(1023, \"您上传的图片过大，请上传3M以下的图片\"),\n" +
            "    ORGASSEST_ERROR(1024, \"请选择机构净资产\"),\n" +
            "    NO_USER_ERROR(1025, \"该手机号码未注册\"),\n" +
            "    EXSIT_USER_ERROR(1026, \"该手机号已经注册\"),\n" +
            "    UPDATE_PASSWORD_SUCCCESS(1027, \"密码更新成功\"),\n" +
            "    UPLOAD_IMAGE_ERROR(1028, \"请上传图片\"),\n" +
            "    ORG_NAME_ERROR(1029, \"机构名称填写错误\"),\n" +
            "    ORG_DUTYPERSON_NAME_ERROR(1030, \"机构负责人姓名填写错误\"),\n" +
            "    ORG_DUTYPERSON_POSITION_ERROR(1031, \"机构负责人职位填写错误\"),\n" +
            "    ORG_DUTYPERSON_EMAIL_ERROR(1032, \"机构负责人邮箱填写错误\"),\n" +
            "    DATE_FORMAT_ERROR(1033, \"日期格式错误\"),\n" +
            "    NOT_FIND_FUND_ERROR(1034, \"您预约的产品不存在，请刷新页面或联系客服人员\"),\n" +
            "    ERROR(1035, \"服务器错误\"),\n" +
            "    FEED_BACK_ERROR(1036, \"反馈内容不能为空\"),\n" +
            "    UPLOAD_IMAGE_NAME_ERROR(1037, \"图片上传name参数传递错误\"),\n" +
            "    USER_ACCOUNT_DONG_JIE(1038, \"您的账户已被冻结\\n如有疑问请联系客服400-6547-828\"),\n" +
            "    ORG_DUTYPERSON_CARD_URL(1039, \"请上传机构负责人名片\"),\n" +
            "    ORG_LICENSE_URL(1040, \"请上传机构营业执照\"),\n" +
            "    IMAGE_CODE_NOT_NULL(1041, \"请填写图形验证码\"),\n" +
            "    AUTH_ERROR(1042, \"凭证无效\"),\n" +
            "    ILLEGAL_OPTION_ERROR(1043, \"非法操作\"),\n" +
            "    SEX_NOTNULL_ERROR(1044, \"请选择性别\"),\n" +
            "    CODE_SEND_SUCCESS(1045, \"验证码发送成功\"),\n" +
            "    DATA_SUBMISSION_SUCCESS(1046, \"提交成功！\\n\\n我们将在1~2个工作日内与您取得联系\"),\n" +
            "    PRE_SUCCESS(1047, \"预约成功！\\n\\n我们会尽快联系您\"),\n" +
            "    IDCARD_EXSIT_ERROR(1048, \"此身份证号已被占用\"),\n" +
            "    USER_NAME_ISNULL_ERROR(1049, \"请填写真实姓名\"),\n" +
            "    EMAILFMT_ISNULL_ERROR(1050, \"请填写邮箱\"),\n" +
            "    IDCARD_ISNULL_ERROR(1051, \"请填写身份证号码\"),\n" +
            "    COMPANY_ISNULL_ERROR(1052, \"请填写所在公司\"),\n" +
            "    POSITION_ISNULL_ERROR(1053, \"请填写职位\"),\n" +
            "    ORG_NAME_ISNULL_ERROR(1054, \"请填写机构名称\"),\n" +
            "    ORG_DUTYPERSON_NAME_ISNULL_ERROR(1055, \"请填写机构负责人姓名\"),\n" +
            "    ORG_DUTYPERSON_POSITION_ISNULL_ERROR(1056, \"请填写机构负责人职位\"),\n" +
            "    ORG_DUTYPERSON_EMAIL_ISNULL_ERROR(1057, \"请填写机构负责人邮箱\"),\n" +
            "    OTHER_PHONE_LOGIN_ERROR(1058, \"登陆失效,您的账号已在其他设备上登陆\"),\n" +
            "    NO_MORE(1059, \"没有更多数据了\"),\n" +
            "    REGISTER_STEP_ERROR(1060, \"\"),\n" +
            "    PT_CONTENT_ERROR(1061, \"请填写私人定制内容\"),\n" +
            "    PT_CONTENT_MORE_ERROR(1061, \"私人定制内容字数过多\");"+


            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/status", method = RequestMethod.POST)
    @ResponseBody
    public Object rule(){
        String myJsonData="";
        return myJsonData;
    }
    @ApiOperation(httpMethod = "POST", value = "系统正则表达式",position = 1,nickname = "正则表达式", notes = "" +
            "<h4>系统返回状态</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>"+
            "\"[\\u4e00-\\u9fa5\\\\w]+\";//验证格式：数字、字母、中文\n" +
            "\"\\\\w{3,20}\";//验证格式：用户名3-20位字母或数字\n" +
            "\"\\\\w{6,16}\";//验证格式：密码6-16位字母或数字\n" +
            "\"^[1][3,4,5,7,8][0-9]{9}$\";//验证格式：手机号码验证\n" +
            "\"(([\\\\u4E00-\\\\u9FA5]{1,15})|([a-zA-Z]{2,30})|([[a-zA-Z]\\\\u4E00-\\\\u9FA5]{2,30}))\";//验证格式：1-30个字符或汉字\n" +
            "\"(([\\\\u4E00-\\\\u9FA5]{1,30})|([a-zA-Z]{2,60})|([[a-zA-Z]\\\\u4E00-\\\\u9FA5]{2,60}))\";//验证格式：2-60个字符或者汉字\n" +
            "\"\\\\w+([-+.]\\\\w+)*@\\\\w+([-.]\\\\w+)*\\\\.\\\\w+([-.]\\\\w+)*\";\t//验证格式：邮箱格式\n" +
            "\"[1-9][0-9]{5}\";//验证格式：邮编格式\n" +
            "\"[男|女]\";\n" +
            "\"(([\\\\u4E00-\\\\u9FA5]{1,30})|([a-zA-Z]{2,60})|([[a-zA-Z]\\\\u4E00-\\\\u9FA5]{2,60}))\";//校验格式：2-60字符或者汉字\n" +
            "\"\\\\d{4}-\\\\d{2}-\\\\d{2}\";//日期格式校验 年-月-日的形式\n" +
            "\"\\\\d{4}-\\\\d{2}-\\\\d{2} \\\\d{2}:\\\\d{2}:\\\\d{2}\";//日期格式校验 年-月-日的形式"+

            "</code></pre></div>"
    )
    @RequestMapping(value = "/api/rule", method = RequestMethod.POST)
    @ResponseBody
    public Object investor(){
        String myJsonData="";
        return myJsonData;
    }
}
