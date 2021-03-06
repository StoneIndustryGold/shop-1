package shop.service;

import java.util.List;
import java.util.Map;

import shop.model.Order;

public interface OrderService {

    Order create(Long userId, Long shippingAddressId);

    Order findOne(Long userId, Long id);

    List<Order> findAll(Long userId);

    String payForm(Long userId, Long id);
    
    /**
     * 支付宝验签
     * @param paramMap 所有请求参数
     * @throws AlipaySignatureException 若签名无效
     */
    void verifySignature(Map<String, String> paramMap) throws AlipaySignatureException;

    void handlePayResult(Map<String, String> paramMap);

}
