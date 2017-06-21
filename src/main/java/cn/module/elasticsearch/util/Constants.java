package cn.module.elasticsearch.util;

/**
 * Created by hxm on 2016/5/19.
 */
public class Constants {

    public static final String MESSAGE_NAME = "message";

    public static final String MESSAGE_TYPE = "message_type";

    public static final String MESSAGE_SUCC = "successful";

    public static final String MESSAGE_FAIL = "failed";

    public static final String HASYES = "是";

    public static final String HASNO = "否";

    public static final String HASOPEN = "开";			//用于开关

    public static final String HASCLOSE = "关";          //用于开关

    public static final String INTERCEPTIONMARK = "#@@#"; //字符串截取标记

    public static final String SYMBOL_GT = ">";

    public static final String SYMBOL_LT = "<";

    public static final String BOUND_IN = "inbound";

    public static final String BOUND_OUT = "outbound";

    public static final String AVAIL = "avail";

    public static final String RATE = "rate";

    public static final String INV = "inv";

    public static final String  BOUND_IN_TYPE_RESULT="inbound_process_data_result";

    public static final String  BOUND_IN_TYPE_TIME="inbound_process_data_time"; // 新版弃用

//    public static final String  BOUND_OUT_TYPE_RESULT="outbound_send_data_result";//9-8修改
    public static final String  BOUND_OUT_TYPE_RESULT="outbound_send_data";

    public static final String  BOUND_OUT_TYPE_COUNT="outbound_send_data_count";  //此documentType 暂不考虑

    public static final String  ES_TIME_FORMAT="yyyy/MM/dd H:m:ss";



}
