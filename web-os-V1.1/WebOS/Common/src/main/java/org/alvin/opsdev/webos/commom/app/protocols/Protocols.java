package org.alvin.opsdev.webos.commom.app.protocols;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

/**
 * @类说明:远程协议实体类
 * @author:唐植超
 * @date:2018-05-12 16:51:08
 **/
@Setter
@Getter
public class Protocols {

	//数据库中的字段
	private Long id;// 主键
	private String domain;// ad域
	private String user;// 用户名
	private String ip;// ip地址
	private Integer port;// 端口
	private String password;// 密码
	private Long author;// 作者
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date create_time;// 时间
	private Byte status;// 状态
	private Byte type;// 协议类型

	//此处可添加查询显示辅助字段


}