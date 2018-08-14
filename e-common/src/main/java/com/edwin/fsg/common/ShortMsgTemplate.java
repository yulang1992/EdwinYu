package com.edwin.fsg.common;

/**
 * 短信内容模板
 * 
 * @author Chris li
 * 
 */
public class ShortMsgTemplate {
	// 短信验证内容签名
	private static String shortMessageSignature = Constants.SHORTMESSAGE_SIGNATURE;

	/**
	 * 订单提交成功 ,买家信息
	 * 
	 * @param productName
	 *            商品名称
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderSubmitToBuyer(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您选购的商品已成功生成订单" + orderNum + "，请尽快支付。";
		return messageTemplate;
	}

	/**
	 * 订单提交成功 ,卖家信息
	 * 
	 * @param productName
	 *            商品名称
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderSubmitToSeller(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的商品已由用户生成订单" + orderNum + "，快去向买家促成这笔订单吧！";
		return messageTemplate;
	}

	/**
	 * 订单支付成功 ,买家信息
	 * 
	 * @param productName
	 *            商品名称
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderPayFinishedToBuyer(String orderNum, Double price) {
		String messageTemplate = "【" + shortMessageSignature + "】您的订单" + orderNum + "已通过支付方式支付成功，金额" + price + "元。商家将尽快为您包装订单商品，进行发货，请耐心等待。";
		return messageTemplate;
	}

	/**
	 * 订单支付成功 ,卖家信息
	 * 
	 * @param productName
	 *            商品名称
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderPayFinishedToSeller(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的商品订单" + orderNum + "已由用户完成支付。请您尽快包装商品，选择相应方式发货并维护物流单号。";
		return messageTemplate;
	}

	/**
	 * 卖家已发货 ,买家信息
	 * 
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String sendGoodsToBuyer(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的订单商品" + orderNum + "已发货，正在配送中，请您耐心等待注意签收。提示：系统将在商家发货七天后自动默认签收。";
		return messageTemplate;
	}

	/**
	 * 买家已签收 ,买家信息
	 * 
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String signedToBuyer(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的订单" + orderNum + "已由系统确认签收。我们将在七天后向商家打款，您可以在此期间申请退货。如果您对订单商品存在任何疑问，请您在7天内登录"
				+ shortMessageSignature + "[个人中心—我的订单]进行相关售后申请，超过期限，我们将默认该订单交易成功。";
		return messageTemplate;
	}

	/**
	 * 买家已签收 ,卖家信息
	 * 
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String signedToSeller(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的订单" + orderNum + "买家已确认签收。若买家七天无任何退款退货申诉操作，则我们将及时给您结算订单款项。";
		return messageTemplate;
	}

	/**
	 * 订单交易成功 ,买家信息
	 * 
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderFinshiedToBuyer(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】您的订单" + orderNum + "已交易成功，感谢您对" + shortMessageSignature + "的支持与厚爱，欢迎您再次选购。";
		return messageTemplate;
	}

	/**
	 * 订单交易成功 ,卖家信息
	 * 
	 * @param orderNum
	 *            订单号
	 * @return
	 */
	public static String orderFinshiedToSeller(String orderNum) {
		String messageTemplate = "【" + shortMessageSignature + "】恭喜您，您的商品订单" + orderNum + "已交易成功，我们将及时将结算款打入您的账户，请根据银行周期注意查收。感谢您对"
				+ shortMessageSignature + "的支持与青睐。";
		return messageTemplate;
	}
}
