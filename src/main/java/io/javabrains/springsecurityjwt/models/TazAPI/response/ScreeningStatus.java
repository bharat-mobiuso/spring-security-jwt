package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "orderStatus" })
public class ScreeningStatus {

    private String OrderStatus;

    public String getOrderStatus() {
        return OrderStatus;
    }

    @XmlElement(name = "OrderStatus")
    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }
}
