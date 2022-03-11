package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "orderId" })
public class LinkedApplicants {

    private int orderId;

    @XmlElement(name = "orderId")
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}
