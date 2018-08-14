package com.edwin.fsg.common;


/**
 * 系统常量
 * 
 * @author yulang
 */
public class Constants {

	public static final String COOKIES_NAME_SESSION="EDWIN_YU_LOGIN"; // 单文件并发线程数。
	
	/**
	 * 图片上传服务地址
	 */
	public static final Integer USER_REDIS_EXPIRSE= 60 * 24 * 7;

	/**
	 * 文件上传服务地址
	 */
	//public static final String FILE_SERVER_URL;

	/**
	 * 当前用户信息
	 */
	public static final String CUR_USER = "CUR_USER";

	/**
	 * 当前国商书院的用户
	 */
	public static final String CUR_SY_MEMBER = "CUR_SY_MEMBER";

	/**
	 * session中的用户信息key
	 */
	public static final String SESSION_KEY_USER = "SESSION_KEY_USER";

	/**
	 * 当前配件的用户
	 */
	public static final String PARTS_KEY_USER = "PARTS_KEY_USER";

	/**
	 * session中的国商书院的用户信息key
	 */
	public static final String SESSION_KEY_SY_MEMBER = "SESSION_KEY_SY_MEMBER";

	/**
	 * session中的国商书院的评论用户信息key
	 */
	public static final String SESSION_KEY_SY_COMMENT = "SESSION_KEY_SY_COMMENT";

	/**
	 * Threadlocal中的用户信息key
	 */
	public static final String ThreadLOCAL_KEY_USER = "ThreadLOCAL_KEY_USER";

	/**
	 * 短信验证的请求地址
	 */
	//public static final String SHORTMESSAGE_ADDRESS;

	/**
	 * 短信验证端口
	 */
	public static int SHORTMESSAGE_PORT;

	/**
	 * 短信验证账号
	 */
	public static String SHORTMESSAGE_ACCOUNT;

	/**
	 * 短信验证密码
	 */
	public static String SHORTMESSAGE_TOKEN;

	/**
	 * 短信验证用户ID
	 */
	public static int SHORTMESSAGE_USERID;

	/**
	 * 短信验证内容
	 */
	public static String SHORTMESSAGE_BODY;

	/**
	 * 短信验证内容签名
	 */
	public static String SHORTMESSAGE_SIGNATURE;

	/**
	 * 短信验证码的长度
	 */
	public static int SHORTMESSAGE_RANDOMCODELENGTH;

	/**
	 * 短信验证的有效时间
	 */
	public static int SHORTMESSAGE_VALIDTIME;

	/**
	 * 短信签名编码
	 */
	public static String SHORTMESSAGE_EXTNO;

	/**
	 * 域名
	 */
	public static String DOMAIN;

	// 激光推送
	public static String MASTERSECRET_JGTS;

	public static String API_KEY_JGTS;
     
	public static final String FASTDFS_CONF="classpath:tracker_server.conf";
	
	/**
	 * 系统,用户的ID为-9999
	 */
	public static final Long SYSTEM_USER_ID = -9999L;

	static {
//		Loader loader = Loader.getInstance();
//		MASTERSECRET_JGTS = loader.getProps("jgts.mastersecet");
//		API_KEY_JGTS = loader.getProps("jgts.apikey");
//		//IMAGE_SERVER_URL = loader.getProps("image.upload.server");
//		//FILE_SERVER_URL = loader.getProps("file.upload.server");
//		SHORTMESSAGE_ADDRESS = loader.getProps("shortMessage.address");
//		SHORTMESSAGE_PORT = Integer.valueOf(loader.getProps("shortMessage.port"));
//		SHORTMESSAGE_ACCOUNT = loader.getProps("shortMessage.account");
//		SHORTMESSAGE_TOKEN = loader.getProps("shortMessage.token");
//		SHORTMESSAGE_USERID = Integer.valueOf(loader.getProps("shortMessage.userId"));
//		SHORTMESSAGE_BODY = loader.getProps("shortMessage.body");
//		SHORTMESSAGE_SIGNATURE = loader.getProps("shortMessage.signature");
//		SHORTMESSAGE_RANDOMCODELENGTH = Integer.valueOf(loader.getProps("shortMessage.randomCodeLength"));
//		SHORTMESSAGE_VALIDTIME = Integer.valueOf(loader.getProps("shortMessage.validTime"));
//		SHORTMESSAGE_EXTNO = loader.getProps("shortMessage.extno");
//		DOMAIN = loader.getProps("domain");
	}

	public enum MODULE {
		/**
		 * 前端用户模块
		 */
		FRONT("front"),

		/**
		 * 管理员模块
		 */
		MANAGER("manager");

		private final String path;

		MODULE(String path) {
			this.path = path;
		}

		
		public String toString() {
			return this.path;
		}

	}

	/**
	 * controller返回值状态
	 */
	public enum CONTROLLER_RESULT {
		/** 成功 */
		SUCCESS(1),

		/** 未知错误 */
		ERROR(-999),

		/** 业务异常 */
		SERVICE_EXCEPTION(-998),

		/** 未登录 */
		NOT_LOGIN(-1),

		/** 参数为空 */
		NULL_PARAMETER(-2),

		/** 对象为空 */
		NULL_OBJECT(-3),

		/** 没有操作权限 */
		UNAUTHORIZED(-4),

		/** 用户名错误 */
		ERROR_USERNAME(-5),

		/** 密码错误 */
		ERROR_PASSWORD(-6),

		/** 对象已存在 */
		ISEXIST(-7),

		/** 已离职 */
		IS_QUIT(-8),

		/** 验证码错误 */
		ERROR_VERIFICATION(-9),

		/** 密码不一致 */
		ERROR_REPASSWORD(-10),

		/** 短信验证码错误 */
		ERROR_MESSAGE_VERIFICATION(-11),

		/** 图片过大 */
		ERROR_IMAGE_SIZE(-12),

		/** 图片上传失败 */
		ERROR_IMAGE(-13);

		private final Integer value;

		CONTROLLER_RESULT(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 商品状态对应值
	 */
	public enum PRODUCT_STATUS {
		/** 待上架 */
		WAIT_PUBLISH(1),

		/** 待审核 */
		WAIT_CHECK(2),

		/** 审核通过 */
		CHECK_PASS(3),

		/** 审核不通过 */
		CHECK_FAIL(4),

		/** 已下架 */
		NOT_PUBLISH(5),

		/** 已删除 */
		DELETE(6);

		private final Integer value;

		PRODUCT_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 商城用户类型
	 * 
	 * @author Chris li
	 * 
	 */
	public enum USER_TYPE {
		/** 买家 */
		BUYER(1),

		/** 卖家 */
		SELLER(2);

		private final Integer value;

		USER_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 支付方式：1支付宝、2公司转账、3微信支付、4网银在线支付、5易宝支付
	 * 
	 * @author Chris li
	 * 
	 */
	public enum PAYMENT {
		/**
		 * 1支付宝
		 */
		ALIPAY(1),
		/**
		 * 2公司转账
		 */
		COMPANY_TRANSFER(2),
		/**
		 * 3微信支付
		 */
		WEIXIN(3),
		/**
		 * 4网银在线支付
		 */
		UNIONPAY(4),
		/**
		 * 5易宝支付
		 */
		YEEPAY(5);

		private final Integer value;

		PAYMENT(Integer value) {
			this.value = value;
		}

		public Integer intValue() {
			return this.value;
		}
	}

	/**
	 * 商城订单状态
	 * 
	 * @author Chris li
	 * 
	 */
	public enum ORDER_STATUS {
		/**
		 * 未付款状态
		 */
		UNPAYMENT(1),
		/**
		 * 已付款状态
		 */
		PAYMENTED(2),
		/**
		 * 卖家已发货状态
		 */
		SELLER_SEND(3),
		/**
		 * 已签收状态
		 */
		SIGNIN(4),
		/**
		 * 成交状态
		 */
		BARGAIN(5),
		/**
		 * 退款状态
		 */
		REFUND_MONEY(6),
		/**
		 * 取消状态
		 */
		CANCEL(7),
		/**
		 * 退货状态
		 */
		REFUND_GOODS(8),
		/**
		 * 等待买家发货状态
		 */
		WAIT_BUYER_SEND(9),
		/**
		 * 买家已发货状态
		 */
		BUYER_SEND(10),
		/**
		 * 成功,流程结束
		 */
		SUCCESS(11),
		/**
		 * 线下转账
		 */
		OFFLINE_TRANSFER(12),
		/**
		 * 线下转账退款
		 */
		OFFLINE_TRANSFER_REFUND(13),
		/**
		 * 线下转账退货
		 */
		OFFLINE_TRANSFER_GOODS(14);

		private final Integer value;

		ORDER_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 商城订单日志操作动作
	 * 
	 * @author Chris li
	 * 
	 */
	public enum ORDERLOG_OPERATE {
		/**
		 * 生成订单
		 */
		CREATE_ORDER("生成订单"),
		/**
		 * 买家付款
		 */
		PAY_ORDER("买家付款"),
		/**
		 * 买家付款超时,系统自动取消订单
		 */
		PAY_TIMEOUT_CANCEL_ORDER("买家付款超时,系统自动取消订单"),
		/**
		 * 买家取消订单
		 */
		BUYER_CANCEL_ORDER("买家取消订单"),
		/**
		 * 买家申请退款
		 */
		BUYER_APPLY_REFUND_MONEY("买家申请退款"),
		/**
		 * 卖家发货
		 */
		SELLER_SEND_GOODS("卖家发货"),
		/**
		 * 买家取消退款
		 */
		BUYER_CANCEL_REFUND_MONEY("买家取消退款"),
		/**
		 * 卖家同意退款
		 */
		SELLER_AGREE_REFUND_MONEY("卖家同意退款"),
		/**
		 * 买家签收
		 */
		BUYER_SIGNIN("买家签收"),
		/**
		 * 买家签收超时,系统自动签收
		 */
		SYSTEM_AUTO_SIGNIN("买家签收超时,系统自动签收"),
		/**
		 * 买家申请退货
		 */
		BUYER_APPLY_REFUND_GOODS("买家申请退货"),
		/**
		 * 成交,系统完成交易
		 */
		SYSTEM_CLOSE_THE_DEAL("成交,系统完成交易"),
		/**
		 * 交易成功,自动关闭单据
		 */
		SUCCESS_COMMENT_THEN_CLOSE_ORDER("评论成功,关闭单据"),
		/**
		 * 单据被取消,自动关闭单据
		 */
		CANCEL_AUTO_CLOSE_ORDER("单据被取消,自动关闭单据"),
		/**
		 * 卖家同意退货
		 */
		SELLER_AGREE_REFUND_GOODS("卖家同意退货"),
		/**
		 * 买家撤销退货
		 */
		BUYER_CANCEL_REFUND_GOODS("买家撤销退货"),
		/**
		 * 买家发货超时,系统自动签收
		 */
		BUYER_SEND_GOODS_TIMEOUT_SYSTEM_SIGNIN("买家发货超时,系统自动签收"),
		/**
		 * 买家发货
		 */
		BUYER_SEND_GOODS("买家发货"),
		/**
		 * 卖家已收货,取消订单
		 */
		SELLER_RECEIVE_GOODS_CANCEL_ORDER("卖家已收货,取消订单"),
		/**
		 * 线下转账
		 */
		OFFLINE_TRANSFER("线下转账"),
		/**
		 * 线下转账退款
		 */
		OFFLINE_TRANSFER_REFUND("线下转账退款"),
		/**
		 * 线下转账退货
		 */
		OFFLINE_TRANSFER_GOODS("线下转账退货"),
		/**
		 * 退货订单
		 */
		REFUND_GOODS_ORDER("退货订单"),
		/**
		 * 退款订单
		 */
		REFUND_MONEY_ORDER("退款订单");

		private final String msg;

		ORDERLOG_OPERATE(String msg) {
			this.msg = msg;
		}

		public String msg() {
			return this.msg;
		}
	}

	/**
	 * 订单操作中的错误
	 * 
	 * @author Chris li
	 * 
	 */
	public enum ORDER_ERROR_MSG {
		/** 用户与订单不匹配 */
		USER_ID_ORDER_UNMATCHED("该订单不属于当前操作用户"),

		/** 用户类型与操作不匹配 */
		USER_TYPE_OPERATE_UNMATCHED("该用户无权执行此操作"),

		/** 用户与订单不匹配 */
		ORDER_OPERATE_UNMATCHED("该订单无法进行此操作");

		private final String errorMsg;

		ORDER_ERROR_MSG(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}
	}

	/**
	 * 是否为默认地址
	 * 
	 * @author 王定仁
	 * 
	 */
	public enum IS_DEFAULT {
		/**
		 * 默认地址
		 */
		TRUE(1),
		/**
		 * 不是默认地址
		 */
		FALSE(2);

		private final Integer value;

		IS_DEFAULT(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 订单来源
	 * 
	 * @author Chris li
	 * 
	 */
	public enum ORDER_SOURCE {
		/**
		 * PC端
		 */
		PC(1),
		/**
		 * 移动端
		 */
		APP(2);

		private final Integer value;

		ORDER_SOURCE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 订单类型
	 * 
	 * @author Chris li
	 * 
	 */
	public enum ORDER_TYPE {
		/**
		 * 一般订单
		 */
		COMMON(1),
		/**
		 * 团购订单
		 */
		GROUPBUYING(2),
		/**
		 * 秒杀订单
		 */
		SECKILL(3),
		/**
		 * 众筹订单
		 */
		CROWDFUNDING(4);

		private final Integer value;

		ORDER_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 支付状态
	 * 
	 * @author 王定仁
	 * 
	 */
	public enum IS_PAY {
		/**
		 * 已支付
		 */
		PAID(1),
		/**
		 * 未支付
		 */
		NOPAID(2);

		private final Integer value;

		IS_PAY(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 物流公司开通状态
	 */
	public enum LOGISTICS_STATUS {
		/**
		 * 已开通
		 */
		AVALIABLE(1),
		/**
		 * 未开通
		 */
		DISABLED(2);

		private final Integer value;

		LOGISTICS_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 结算页入口
	 * 
	 * @author Chris li
	 * 
	 */
	public enum SUM_ENTRY {
		/**
		 * 购物车
		 */
		CART(1),

		/**
		 * 商品详情页
		 */
		PRODUCT_DETAIL(2);

		private final Integer value;

		SUM_ENTRY(Integer value) {
			this.value = value;
		}

		public Integer intValue() {
			return this.value;
		}
	}

	/**
	 * 秒杀状态
	 */
	public enum SECKILL_STATUS {
		/** 已经结束 */
		FINISHED(1),

		/** 进行中 */
		SECKILLING(2),

		/** 即将开始 */
		TO_BEGIN(3);

		private final Integer value;

		SECKILL_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * 秒杀状态String
	 */
	public enum SECKILL_STATUS_STRING {
		/** 已经结束 */
		FINISHED("已经结束"),

		/** 进行中 */
		SECKILLING("抢购中"),

		/** 即将开始 */
		TO_BEGIN("即将开始 ");

		private final String value;

		SECKILL_STATUS_STRING(String value) {
			this.value = value;
		}

		public String stringValue() {
			return this.value;
		}
	}

	/**
	 * 配件信息类型
	 * 
	 * @author wangdingren
	 * 
	 */
	public enum CONSULT_STATUS {
		/**
		 * 最新测评
		 */
		NEWEST(1),
		/**
		 * 本周推荐
		 */
		RECOMMEND(2),
		/**
		 * 新品上市
		 */
		NEWARRIVAL(3),
		/**
		 * 配件导购
		 */
		SHOPPING(4),
		/**
		 * 配件测评
		 */
		APPRAISAL(5),
		/**
		 * 配件解答
		 */
		ANSWER(6);

		private final Integer value;

		CONSULT_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 评论对像：1视频、2文章、3评论、4图片
	 * @author jushisi
	 * @date 2016-12-14
	 */
	public enum COMMENT_OBJECT {
		/**
		 * 视频
		 */
		VIDEO(1),
		/**
		 * 文章
		 */
		ARTICLE(2),
		/**
		 * 评论
		 */
		COMMENT(3),
		/**
		 * 图片
		 */
		PHOTO(4);

		private final Integer value;

		COMMENT_OBJECT(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 发布人类型：1老师、2用户（学员）、3后台管理员
	 * @author jushisi
	 * @date 2016-12-14
	 */
	public enum PUBLISHER_TYPE {
		/**
		 * 老师
		 */
		TEACHER(1),
		/**
		 * 用户（学员）
		 */
		MEMBER(2),
		/**
		 * 后台管理员
		 */
		ADMIN(3);

		private final Integer value;

		PUBLISHER_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 视频类型：1课堂实录、2名师授课、3互动现场、4学员采访、5课程感言 6：门店管理课件 7：销售终端课件
	 *               8：配件销售课件 9：手机相关课件 10：pop教学视频 11：企业舞蹈视频 12：士气展示视频
	 *               13：魔法气球教学视频 14：沙盘演练视频
	 * @author jushisi
	 * @date 2016-12-14
	 */
	public enum VIDEO_TYPE {
		/**
		 * 课堂实录
		 */
		KTSL(1),
		/**
		 * 名师授课
		 */
		MSSK(2),
		/**
		 * 学员采访
		 */
		HDXC(3),
		/**
		 * 学员采访
		 */
		XYCF(4),
		/**
		 * 课程感言
		 */
		KCGY(5),
		/**
		 * pop教学视频
		 */
		POPJXSP(10),
		/**
		 * 企业舞蹈视频
		 */
		QYWDSP(11),
		/**
		 * 士气展示视频
		 */
		SQZSSP(12),
		/**
		 * 魔法气球教学视频
		 */
		MFQQJXSP(13),
		/**
		 * 沙盘演练视频
		 */
		SPYLSP(14);

		private final Integer value;

		VIDEO_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * PPT类型
	 * 
	 */
	public enum PPT_TYPE {
		/**
		 * 门店管理课件
		 */
		MDGLKJ(1),
		/**
		 * 销售终端课件
		 */
		XSZDKJ(2),
		/**
		 * 配件销售课件
		 */
		PJXSKJ(3),
		/**
		 * 手机相关课件
		 */
		SJXGKJ(4);

		private final Integer value;

		PPT_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 是否为会员 1：会员 2：非会员
	 * @author wangdingren
	 * @date 2016-12-20
	 */
	public enum IF_THE_MEMBER {
		/**
		 * 会员
		 */
		MEMBER(1),
		/**
		 * 非会员
		 */
		NOTMEMBER(2);

		private final Integer value;

		IF_THE_MEMBER(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 文章类型
	 * @author wangdingren
	 * @date 2016-12-29
	 */
	public enum ARTICLE_TYPE {
		/**
		 * 学习日记
		 */
		XXRJ(1),
		/**
		 * 精彩分享
		 */
		JCFX(2),
		/**
		 * 成功案例
		 */
		CGAL(3),
		/**
		 * 疑难解答
		 */
		YNJD(4),
		/**
		 * 名师观点
		 */
		MSGD(5),
		/**
		 * 经典案例
		 */
		JDAL(6),
		/**
		 * 课堂案例
		 */
		KTAL(7),
		/**
		 * 热门新闻
		 */
		RMXW(8);

		private final Integer value;

		ARTICLE_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 当前课程是否为最热课程
	 * @author wangdingren
	 * @date 2017-3-29
	 */
	public enum INFORM_TYPE {
		/**
		 * 一般课程
		 */
		ORDINARY(0),
		/**
		 * 最热课程
		 */
		HOTTEST(1);

		private final Integer value;

		INFORM_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 区分筛选
	 * @author wangdingren
	 * @date 2017-3-29
	 */
	public enum SORT_TYPES {
		/**
		 * 综合排序
		 */
		ONE(1),
		/**
		 * 价格倒序
		 */
		TWO(2),
		/**
		 * 价格倒序
		 */
		THREE(3),
		/**
		 * 销量排序
		 */
		FOUR(4);

		private final Integer value;

		SORT_TYPES(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 首页横向栏目
	 * @author wangdingren
	 * @date 2017-4-27
	 */
	public enum CROSSWISE_TYPE {
		/**
		 * 新品首发
		 */
		XPSF(1),
		/**
		 * 打折促销
		 */
		DZCX(2);

		private final Integer value;

		CROSSWISE_TYPE(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 联邦官网类型
	 * @author wangdingren
	 * @date 2017-6-8
	 */
	public enum GW_CONSULT_STATUS {
		/**
		 * 联邦新闻
		 */
		LBBYK(1),
		/**
		 * 最新热刊
		 */
		ZXRK(2),
		/**
		 * 联邦会员
		 */
		LBHY(3),

		/**
		 * 联邦招聘
		 */
		LBZP(4),

		/**
		 * 公司简介
		 */
		GSJJ(5),
		/**
		 * 联邦集团愿景
		 */
		LBJTYJ(6),
		/**
		 * 联邦集团服务支撑
		 */
		LBJTFWZC(7),
		/**
		 * 联邦集团核心团队
		 */
		LBJTHXTD(8),

		/**
		 * 七星手机连锁
		 */
		QXSJLS(9),

		/**
		 * 七星的由来
		 */
		QXDYL(10),
		/**
		 * 七星梦
		 */
		QXM(11),
		/**
		 * 企业文化
		 */
		QYWH(12),
		/**
		 * 连锁店训
		 */
		LSDX(3),

		/**
		 * 疑难解答
		 */
		YNJD(4);

		private final Integer value;

		GW_CONSULT_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 联邦合作商类别
	 * 
	 * @author wangdingren
	 * @date 2017-6-8
	 * 
	 */
	public enum HZS_TYPE {
		/**
		 * 联邦集团战略合作伙伴
		 */
		PARTNER(1),

		/**
		 * 联邦集团合作厂家
		 */
		VENDER(2);

		private final Integer value;

		HZS_TYPE(Integer value) {
			this.value = value;
		}

		public Integer intValue() {
			return this.value;
		}
	}

	/**
	 * @Description: 联邦官网类型
	 * @author wangdingren
	 * @date 2017-6-8
	 */
	public enum GW_BANNER_STATUS {
		/**
		 * 首页
		 */
		SYGG(1),
		/**
		 * 集团简介
		 */
		JTJJ(2),
		/**
		 * 集团简介子图
		 */
		JTJJZT(3),

		/**
		 * 七星手机连锁
		 */
		QXSJLS(4),

		/**
		 * 半月刊
		 */
		BYK(5),

		/**
		 * 加入我们
		 */
		JRWM(6);

		private final Integer value;

		GW_BANNER_STATUS(Integer value) {
			this.value = value;
		}

		public int intValue() {
			return this.value;
		}
	}
   
	 public interface  REDIS_LOCK{
	    String CLOSE_ORDER_TASK_LOCK = "CLOSE_ORDER_TASK_LOCK";//关闭订单的分布式锁
	 }

}
