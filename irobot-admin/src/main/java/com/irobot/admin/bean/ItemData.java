//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.07.06 ʱ�� 03:37:51 PM CST 
//


package com.irobot.admin.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rec-key" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="item-status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="call-no-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="call-no-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="on-hold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="requested" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="session-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "item",
        "sessionId"
})
@XmlRootElement(name = "item-data")
public class ItemData {

    protected List<Item> item;
    @XmlElement(name = "session-id", required = true)
    protected String sessionId;

    /**
     * Gets the value of the item property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * ��ȡsessionId���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * ����sessionId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     *
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rec-key" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="item-status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="call-no-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="call-no-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="on-hold" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="requested" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expected" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "recKey",
            "barcode",
            "subLibrary",
            "collection",
            "itemStatus",
            "note",
            "callNo1",
            "callNo2",
            "description",
            "chronologicalI",
            "chronologicalJ",
            "chronologicalK",
            "enumerationA",
            "enumerationB",
            "enumerationC",
            "library",
            "onHold",
            "requested",
            "expected"
    })
    public static class Item {

        @XmlElement(name = "rec-key")
        protected long recKey;
        protected long barcode;
        @XmlElement(name = "sub-library", required = true)
        protected String subLibrary;
        @XmlElement(required = true)
        protected String collection;
        @XmlElement(name = "item-status")
        protected byte itemStatus;
        @XmlElement(required = true)
        protected String note;
        @XmlElement(name = "call-no-1", required = true)
        protected String callNo1;
        @XmlElement(name = "call-no-2", required = true)
        protected String callNo2;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "chronological-i", required = true)
        protected String chronologicalI;
        @XmlElement(name = "chronological-j", required = true)
        protected String chronologicalJ;
        @XmlElement(name = "chronological-k", required = true)
        protected String chronologicalK;
        @XmlElement(name = "enumeration-a", required = true)
        protected String enumerationA;
        @XmlElement(name = "enumeration-b", required = true)
        protected String enumerationB;
        @XmlElement(name = "enumeration-c", required = true)
        protected String enumerationC;
        @XmlElement(required = true)
        protected String library;
        @XmlElement(name = "on-hold", required = true)
        protected String onHold;
        @XmlElement(required = true)
        protected String requested;
        @XmlElement(required = true)
        protected String expected;

        /**
         * ��ȡrecKey���Ե�ֵ��
         */
        public long getRecKey() {
            return recKey;
        }

        /**
         * ����recKey���Ե�ֵ��
         */
        public void setRecKey(long value) {
            this.recKey = value;
        }

        /**
         * ��ȡbarcode���Ե�ֵ��
         */
        public long getBarcode() {
            return barcode;
        }

        /**
         * ����barcode���Ե�ֵ��
         */
        public void setBarcode(long value) {
            this.barcode = value;
        }

        /**
         * ��ȡsubLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSubLibrary() {
            return subLibrary;
        }

        /**
         * ����subLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSubLibrary(String value) {
            this.subLibrary = value;
        }

        /**
         * ��ȡcollection���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCollection() {
            return collection;
        }

        /**
         * ����collection���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCollection(String value) {
            this.collection = value;
        }

        /**
         * ��ȡitemStatus���Ե�ֵ��
         */
        public byte getItemStatus() {
            return itemStatus;
        }

        /**
         * ����itemStatus���Ե�ֵ��
         */
        public void setItemStatus(byte value) {
            this.itemStatus = value;
        }

        /**
         * ��ȡnote���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNote() {
            return note;
        }

        /**
         * ����note���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNote(String value) {
            this.note = value;
        }

        /**
         * ��ȡcallNo1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCallNo1() {
            return callNo1;
        }

        /**
         * ����callNo1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCallNo1(String value) {
            this.callNo1 = value;
        }

        /**
         * ��ȡcallNo2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCallNo2() {
            return callNo2;
        }

        /**
         * ����callNo2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCallNo2(String value) {
            this.callNo2 = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡchronologicalI���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChronologicalI() {
            return chronologicalI;
        }

        /**
         * ����chronologicalI���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChronologicalI(String value) {
            this.chronologicalI = value;
        }

        /**
         * ��ȡchronologicalJ���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChronologicalJ() {
            return chronologicalJ;
        }

        /**
         * ����chronologicalJ���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChronologicalJ(String value) {
            this.chronologicalJ = value;
        }

        /**
         * ��ȡchronologicalK���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChronologicalK() {
            return chronologicalK;
        }

        /**
         * ����chronologicalK���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChronologicalK(String value) {
            this.chronologicalK = value;
        }

        /**
         * ��ȡenumerationA���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnumerationA() {
            return enumerationA;
        }

        /**
         * ����enumerationA���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnumerationA(String value) {
            this.enumerationA = value;
        }

        /**
         * ��ȡenumerationB���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnumerationB() {
            return enumerationB;
        }

        /**
         * ����enumerationB���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnumerationB(String value) {
            this.enumerationB = value;
        }

        /**
         * ��ȡenumerationC���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnumerationC() {
            return enumerationC;
        }

        /**
         * ����enumerationC���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnumerationC(String value) {
            this.enumerationC = value;
        }

        /**
         * ��ȡlibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLibrary() {
            return library;
        }

        /**
         * ����library���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLibrary(String value) {
            this.library = value;
        }

        /**
         * ��ȡonHold���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOnHold() {
            return onHold;
        }

        /**
         * ����onHold���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOnHold(String value) {
            this.onHold = value;
        }

        /**
         * ��ȡrequested���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRequested() {
            return requested;
        }

        /**
         * ����requested���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRequested(String value) {
            this.requested = value;
        }

        /**
         * ��ȡexpected���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExpected() {
            return expected;
        }

        /**
         * ����expected���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExpected(String value) {
            this.expected = value;
        }

    }

}
