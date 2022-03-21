package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "orderStatus", "orderDecision" })
public class ScreeningStatus {

    private OrderStatus orderStatus;
    private String OrderDecision;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getOrderDecision() {
        return OrderDecision;
    }

    @XmlElement(name = "OrderDecision")
    public void setOrderDecision(String orderDecision) {
        OrderDecision = orderDecision;
    }

    @XmlElement(name = "OrderStatus")
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
