//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.07.08 ʱ�� 03:03:48 PM CST 
//


package com.irobot.admin.bean;

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
 *         &lt;element name="z303">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="z303-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-proxy-for-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-primary-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-name-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-user-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-user-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-con-lng" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-1" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-n-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-1-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-1-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-n-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-2-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-2-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-3" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-n-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-delinq-3-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-delinq-3-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-budget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-profile-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-ill-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-home-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-field-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-field-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-field-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-note-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-note-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-salutation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-ill-total-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-ill-active-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-dispatch-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-birth-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-export-consent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-proxy-id-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-send-all-letters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-plain-html" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-want-sms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-plif-modification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-title-req-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z303-gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z303-birthplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="z304">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="z304-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z304-address-0" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-address-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-email-address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-date-from" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z304-date-to" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z304-address-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z304-telephone-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-telephone-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-telephone-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-sms-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z304-update-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="z304-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="z305">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="z305-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-bor-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-bor-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-registration-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-expiry-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-loan-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-photo-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-over-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-multi-hold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-loan-check" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-hold-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-renew-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-rr-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-ignore-late-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-last-activity-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-photo-charge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-no-loan" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-no-hold" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-no-photo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-no-cash" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-cash-limit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="z305-credit-debit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="z305-delinq-1" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-n-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-delinq-1-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-1-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-delinq-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-n-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-delinq-2-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-2-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-delinq-3" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-n-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-delinq-3-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="z305-delinq-3-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-field-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-field-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-field-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-hold-on-shelf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-end-block-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-booking-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-booking-ignore-hours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="z305-rush-cat-request" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="item-l">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="z36">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z36-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z36-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z36-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-loan-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-loan-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-effective-due-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-due-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-returned-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-returned-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-item-status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-bor-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-letter-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-letter-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-no-renewal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-note-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-note-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-loan-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-loan-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-return-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-return-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-renew-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-renew-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-renew-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-bor-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z36-note-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-recall-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-recall-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-last-renew-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-original-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-loan-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-proxy-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-recall-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-return-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-return-sub-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-delivery-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z36-tail-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="z30">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="z13">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="z13u">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z13u-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z13u-user-defined-1-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-2-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-3-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-4-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-5-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-6-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13u-user-defined-6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-7-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-8-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-9-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-10-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-11-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-12-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-12" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13u-user-defined-13-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-14-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-14" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-15-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13u-user-defined-15" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="current-fine" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="due-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="due-hour" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fine">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="z31">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z31-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-sequence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="z31-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z31-credit-debit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-sum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-vat-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="z31-net-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="z31-payment-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-receipt-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-payment-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-transfer-department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z31-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-recall-transfer-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z31-recall-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z31-recall-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="z30">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="z13">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
        "z303",
        "z304",
        "z305",
        "itemL",
        "balance",
        "sign",
        "fine",
        "sessionId"
})
@XmlRootElement(name = "bor-info")
public class BorInfo {

    @XmlElement(required = true)
    protected Z303 z303;
    @XmlElement(required = true)
    protected Z304 z304;
    @XmlElement(required = true)
    protected Z305 z305;
    @XmlElement(name = "item-l", required = true)
    protected ItemL itemL;
    protected float balance;
    @XmlElement(required = true)
    protected String sign;
    @XmlElement(required = true)
    protected Fine fine;
    @XmlElement(name = "session-id", required = true)
    protected String sessionId;

    /**
     * ��ȡz303���Ե�ֵ��
     *
     * @return possible object is
     * {@link Z303 }
     */
    public Z303 getZ303() {
        return z303;
    }

    /**
     * ����z303���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Z303 }
     */
    public void setZ303(Z303 value) {
        this.z303 = value;
    }

    /**
     * ��ȡz304���Ե�ֵ��
     *
     * @return possible object is
     * {@link Z304 }
     */
    public Z304 getZ304() {
        return z304;
    }

    /**
     * ����z304���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Z304 }
     */
    public void setZ304(Z304 value) {
        this.z304 = value;
    }

    /**
     * ��ȡz305���Ե�ֵ��
     *
     * @return possible object is
     * {@link Z305 }
     */
    public Z305 getZ305() {
        return z305;
    }

    /**
     * ����z305���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Z305 }
     */
    public void setZ305(Z305 value) {
        this.z305 = value;
    }

    /**
     * ��ȡitemL���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemL }
     */
    public ItemL getItemL() {
        return itemL;
    }

    /**
     * ����itemL���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemL }
     */
    public void setItemL(ItemL value) {
        this.itemL = value;
    }

    /**
     * ��ȡbalance���Ե�ֵ��
     */
    public float getBalance() {
        return balance;
    }

    /**
     * ����balance���Ե�ֵ��
     */
    public void setBalance(float value) {
        this.balance = value;
    }

    /**
     * ��ȡsign���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSign() {
        return sign;
    }

    /**
     * ����sign���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * ��ȡfine���Ե�ֵ��
     *
     * @return possible object is
     * {@link Fine }
     */
    public Fine getFine() {
        return fine;
    }

    /**
     * ����fine���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Fine }
     */
    public void setFine(Fine value) {
        this.fine = value;
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
     *         &lt;element name="z31">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z31-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-sequence" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="z31-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z31-credit-debit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-sum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-vat-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="z31-net-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="z31-payment-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-target" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-receipt-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-payment-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-transfer-department" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z31-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-recall-transfer-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z31-recall-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z31-recall-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="z30">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="z13">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "z31",
            "z30",
            "z13"
    })
    public static class Fine {

        @XmlElement(required = true)
        protected Z31 z31;
        @XmlElement(required = true)
        protected Z30 z30;
        @XmlElement(required = true)
        protected Z13 z13;

        /**
         * ��ȡz31���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z31 }
         */
        public Z31 getZ31() {
            return z31;
        }

        /**
         * ����z31���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z31 }
         */
        public void setZ31(Z31 value) {
            this.z31 = value;
        }

        /**
         * ��ȡz30���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z30 }
         */
        public Z30 getZ30() {
            return z30;
        }

        /**
         * ����z30���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z30 }
         */
        public void setZ30(Z30 value) {
            this.z30 = value;
        }

        /**
         * ��ȡz13���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z13 }
         */
        public Z13 getZ13() {
            return z13;
        }

        /**
         * ����z13���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z13 }
         */
        public void setZ13(Z13 value) {
            this.z13 = value;
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
         *         &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z13DocNumber",
                "z13Year",
                "z13OpenDate",
                "z13UpdateDate",
                "z13CallNoKey",
                "z13CallNoCode",
                "z13CallNo",
                "z13AuthorCode",
                "z13Author",
                "z13TitleCode",
                "z13Title",
                "z13ImprintCode",
                "z13Imprint",
                "z13IsbnIssnCode",
                "z13IsbnIssn"
        })
        public static class Z13 {

            @XmlElement(name = "z13-doc-number")
            protected int z13DocNumber;
            @XmlElement(name = "z13-year")
            protected short z13Year;
            @XmlElement(name = "z13-open-date", required = true)
            protected String z13OpenDate;
            @XmlElement(name = "z13-update-date", required = true)
            protected String z13UpdateDate;
            @XmlElement(name = "z13-call-no-key", required = true)
            protected String z13CallNoKey;
            @XmlElement(name = "z13-call-no-code")
            protected short z13CallNoCode;
            @XmlElement(name = "z13-call-no", required = true)
            protected String z13CallNo;
            @XmlElement(name = "z13-author-code", required = true)
            protected String z13AuthorCode;
            @XmlElement(name = "z13-author", required = true)
            protected String z13Author;
            @XmlElement(name = "z13-title-code")
            protected short z13TitleCode;
            @XmlElement(name = "z13-title", required = true)
            protected String z13Title;
            @XmlElement(name = "z13-imprint-code")
            protected short z13ImprintCode;
            @XmlElement(name = "z13-imprint", required = true)
            protected String z13Imprint;
            @XmlElement(name = "z13-isbn-issn-code")
            protected byte z13IsbnIssnCode;
            @XmlElement(name = "z13-isbn-issn", required = true)
            protected String z13IsbnIssn;

            /**
             * ��ȡz13DocNumber���Ե�ֵ��
             */
            public int getZ13DocNumber() {
                return z13DocNumber;
            }

            /**
             * ����z13DocNumber���Ե�ֵ��
             */
            public void setZ13DocNumber(int value) {
                this.z13DocNumber = value;
            }

            /**
             * ��ȡz13Year���Ե�ֵ��
             */
            public short getZ13Year() {
                return z13Year;
            }

            /**
             * ����z13Year���Ե�ֵ��
             */
            public void setZ13Year(short value) {
                this.z13Year = value;
            }

            /**
             * ��ȡz13OpenDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13OpenDate() {
                return z13OpenDate;
            }

            /**
             * ����z13OpenDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13OpenDate(String value) {
                this.z13OpenDate = value;
            }

            /**
             * ��ȡz13UpdateDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UpdateDate() {
                return z13UpdateDate;
            }

            /**
             * ����z13UpdateDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UpdateDate(String value) {
                this.z13UpdateDate = value;
            }

            /**
             * ��ȡz13CallNoKey���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13CallNoKey() {
                return z13CallNoKey;
            }

            /**
             * ����z13CallNoKey���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13CallNoKey(String value) {
                this.z13CallNoKey = value;
            }

            /**
             * ��ȡz13CallNoCode���Ե�ֵ��
             */
            public short getZ13CallNoCode() {
                return z13CallNoCode;
            }

            /**
             * ����z13CallNoCode���Ե�ֵ��
             */
            public void setZ13CallNoCode(short value) {
                this.z13CallNoCode = value;
            }

            /**
             * ��ȡz13CallNo���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13CallNo() {
                return z13CallNo;
            }

            /**
             * ����z13CallNo���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13CallNo(String value) {
                this.z13CallNo = value;
            }

            /**
             * ��ȡz13AuthorCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13AuthorCode() {
                return z13AuthorCode;
            }

            /**
             * ����z13AuthorCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13AuthorCode(String value) {
                this.z13AuthorCode = value;
            }

            /**
             * ��ȡz13Author���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Author() {
                return z13Author;
            }

            /**
             * ����z13Author���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Author(String value) {
                this.z13Author = value;
            }

            /**
             * ��ȡz13TitleCode���Ե�ֵ��
             */
            public short getZ13TitleCode() {
                return z13TitleCode;
            }

            /**
             * ����z13TitleCode���Ե�ֵ��
             */
            public void setZ13TitleCode(short value) {
                this.z13TitleCode = value;
            }

            /**
             * ��ȡz13Title���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Title() {
                return z13Title;
            }

            /**
             * ����z13Title���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Title(String value) {
                this.z13Title = value;
            }

            /**
             * ��ȡz13ImprintCode���Ե�ֵ��
             */
            public short getZ13ImprintCode() {
                return z13ImprintCode;
            }

            /**
             * ����z13ImprintCode���Ե�ֵ��
             */
            public void setZ13ImprintCode(short value) {
                this.z13ImprintCode = value;
            }

            /**
             * ��ȡz13Imprint���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Imprint() {
                return z13Imprint;
            }

            /**
             * ����z13Imprint���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Imprint(String value) {
                this.z13Imprint = value;
            }

            /**
             * ��ȡz13IsbnIssnCode���Ե�ֵ��
             */
            public byte getZ13IsbnIssnCode() {
                return z13IsbnIssnCode;
            }

            /**
             * ����z13IsbnIssnCode���Ե�ֵ��
             */
            public void setZ13IsbnIssnCode(byte value) {
                this.z13IsbnIssnCode = value;
            }

            /**
             * ��ȡz13IsbnIssn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13IsbnIssn() {
                return z13IsbnIssn;
            }

            /**
             * ����z13IsbnIssn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13IsbnIssn(String value) {
                this.z13IsbnIssn = value;
            }

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
         *         &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z30DocNumber",
                "z30ItemSequence",
                "z30Barcode",
                "z30SubLibrary",
                "z30Material",
                "z30ItemStatus",
                "z30OpenDate",
                "z30UpdateDate",
                "z30Cataloger",
                "z30DateLastReturn",
                "z30HourLastReturn",
                "z30IpLastReturn",
                "z30NoLoans",
                "z30Alpha",
                "z30Collection",
                "z30CallNoType",
                "z30CallNo",
                "z30CallNoKey",
                "z30CallNo2Type",
                "xxxTag",
                "z30CallNo2Key",
                "z30Description",
                "z30NoteOpac",
                "z30NoteCirculation",
                "z30NoteInternal",
                "z30OrderNumber",
                "z30InventoryNumber",
                "z30InventoryNumberDate",
                "z30LastShelfReportDate",
                "z30Price",
                "z30ShelfReportNumber",
                "z30OnShelfDate",
                "z30OnShelfSeq",
                "z30DocNumber2",
                "z30ScheduleSequence2",
                "z30CopySequence2",
                "z30VendorCode",
                "z30InvoiceNumber",
                "z30LineNumber",
                "z30Pages",
                "z30IssueDate",
                "z30ExpectedArrivalDate",
                "z30ArrivalDate",
                "z30ItemStatistic",
                "z30ItemProcessStatus",
                "z30CopyId",
                "z30HolDocNumber",
                "z30TempLocation",
                "z30EnumerationA",
                "z30EnumerationB",
                "z30EnumerationC",
                "z30EnumerationD",
                "z30EnumerationE",
                "z30EnumerationF",
                "z30EnumerationG",
                "z30EnumerationH",
                "z30ChronologicalI",
                "z30ChronologicalJ",
                "z30ChronologicalK",
                "z30ChronologicalL",
                "z30ChronologicalM",
                "z30SuppIndexO",
                "z3085XType",
                "z30DepositoryId",
                "z30LinkingNumber",
                "z30GapIndicator",
                "z30MaintenanceCount",
                "z30ProcessStatusDate"
        })
        public static class Z30 {

            @XmlElement(name = "z30-doc-number")
            protected int z30DocNumber;
            @XmlElement(name = "z30-item-sequence")
            protected byte z30ItemSequence;
            @XmlElement(name = "z30-barcode")
            protected long z30Barcode;
            @XmlElement(name = "z30-sub-library", required = true)
            protected String z30SubLibrary;
            @XmlElement(name = "z30-material", required = true)
            protected String z30Material;
            @XmlElement(name = "z30-item-status", required = true)
            protected String z30ItemStatus;
            @XmlElement(name = "z30-open-date", required = true)
            protected String z30OpenDate;
            @XmlElement(name = "z30-update-date", required = true)
            protected String z30UpdateDate;
            @XmlElement(name = "z30-cataloger", required = true)
            protected String z30Cataloger;
            @XmlElement(name = "z30-date-last-return", required = true)
            protected String z30DateLastReturn;
            @XmlElement(name = "z30-hour-last-return", required = true)
            protected String z30HourLastReturn;
            @XmlElement(name = "z30-ip-last-return", required = true)
            protected String z30IpLastReturn;
            @XmlElement(name = "z30-no-loans")
            protected byte z30NoLoans;
            @XmlElement(name = "z30-alpha", required = true)
            protected String z30Alpha;
            @XmlElement(name = "z30-collection", required = true)
            protected String z30Collection;
            @XmlElement(name = "z30-call-no-type")
            protected byte z30CallNoType;
            @XmlElement(name = "z30-call-no", required = true)
            protected String z30CallNo;
            @XmlElement(name = "z30-call-no-key", required = true)
            protected String z30CallNoKey;
            @XmlElement(name = "z30-call-no-2-type", required = true)
            protected String z30CallNo2Type;
            @XmlElement(name = "xxx-tag", required = true)
            protected String xxxTag;
            @XmlElement(name = "z30-call-no-2-key", required = true)
            protected String z30CallNo2Key;
            @XmlElement(name = "z30-description", required = true)
            protected String z30Description;
            @XmlElement(name = "z30-note-opac", required = true)
            protected String z30NoteOpac;
            @XmlElement(name = "z30-note-circulation", required = true)
            protected String z30NoteCirculation;
            @XmlElement(name = "z30-note-internal", required = true)
            protected String z30NoteInternal;
            @XmlElement(name = "z30-order-number")
            protected int z30OrderNumber;
            @XmlElement(name = "z30-inventory-number", required = true)
            protected String z30InventoryNumber;
            @XmlElement(name = "z30-inventory-number-date", required = true)
            protected String z30InventoryNumberDate;
            @XmlElement(name = "z30-last-shelf-report-date")
            protected byte z30LastShelfReportDate;
            @XmlElement(name = "z30-price")
            protected float z30Price;
            @XmlElement(name = "z30-shelf-report-number", required = true)
            protected String z30ShelfReportNumber;
            @XmlElement(name = "z30-on-shelf-date")
            protected byte z30OnShelfDate;
            @XmlElement(name = "z30-on-shelf-seq")
            protected byte z30OnShelfSeq;
            @XmlElement(name = "z30-doc-number-2")
            protected byte z30DocNumber2;
            @XmlElement(name = "z30-schedule-sequence-2")
            protected byte z30ScheduleSequence2;
            @XmlElement(name = "z30-copy-sequence-2")
            protected byte z30CopySequence2;
            @XmlElement(name = "z30-vendor-code", required = true)
            protected String z30VendorCode;
            @XmlElement(name = "z30-invoice-number", required = true)
            protected String z30InvoiceNumber;
            @XmlElement(name = "z30-line-number")
            protected byte z30LineNumber;
            @XmlElement(name = "z30-pages", required = true)
            protected String z30Pages;
            @XmlElement(name = "z30-issue-date", required = true)
            protected String z30IssueDate;
            @XmlElement(name = "z30-expected-arrival-date", required = true)
            protected String z30ExpectedArrivalDate;
            @XmlElement(name = "z30-arrival-date", required = true)
            protected String z30ArrivalDate;
            @XmlElement(name = "z30-item-statistic", required = true)
            protected String z30ItemStatistic;
            @XmlElement(name = "z30-item-process-status", required = true)
            protected String z30ItemProcessStatus;
            @XmlElement(name = "z30-copy-id")
            protected byte z30CopyId;
            @XmlElement(name = "z30-hol-doc-number")
            protected int z30HolDocNumber;
            @XmlElement(name = "z30-temp-location", required = true)
            protected String z30TempLocation;
            @XmlElement(name = "z30-enumeration-a", required = true)
            protected String z30EnumerationA;
            @XmlElement(name = "z30-enumeration-b", required = true)
            protected String z30EnumerationB;
            @XmlElement(name = "z30-enumeration-c", required = true)
            protected String z30EnumerationC;
            @XmlElement(name = "z30-enumeration-d", required = true)
            protected String z30EnumerationD;
            @XmlElement(name = "z30-enumeration-e", required = true)
            protected String z30EnumerationE;
            @XmlElement(name = "z30-enumeration-f", required = true)
            protected String z30EnumerationF;
            @XmlElement(name = "z30-enumeration-g", required = true)
            protected String z30EnumerationG;
            @XmlElement(name = "z30-enumeration-h", required = true)
            protected String z30EnumerationH;
            @XmlElement(name = "z30-chronological-i", required = true)
            protected String z30ChronologicalI;
            @XmlElement(name = "z30-chronological-j", required = true)
            protected String z30ChronologicalJ;
            @XmlElement(name = "z30-chronological-k", required = true)
            protected String z30ChronologicalK;
            @XmlElement(name = "z30-chronological-l", required = true)
            protected String z30ChronologicalL;
            @XmlElement(name = "z30-chronological-m", required = true)
            protected String z30ChronologicalM;
            @XmlElement(name = "z30-supp-index-o", required = true)
            protected String z30SuppIndexO;
            @XmlElement(name = "z30-85x-type", required = true)
            protected String z3085XType;
            @XmlElement(name = "z30-depository-id", required = true)
            protected String z30DepositoryId;
            @XmlElement(name = "z30-linking-number")
            protected byte z30LinkingNumber;
            @XmlElement(name = "z30-gap-indicator", required = true)
            protected String z30GapIndicator;
            @XmlElement(name = "z30-maintenance-count")
            protected byte z30MaintenanceCount;
            @XmlElement(name = "z30-process-status-date")
            protected byte z30ProcessStatusDate;

            /**
             * ��ȡz30DocNumber���Ե�ֵ��
             */
            public int getZ30DocNumber() {
                return z30DocNumber;
            }

            /**
             * ����z30DocNumber���Ե�ֵ��
             */
            public void setZ30DocNumber(int value) {
                this.z30DocNumber = value;
            }

            /**
             * ��ȡz30ItemSequence���Ե�ֵ��
             */
            public byte getZ30ItemSequence() {
                return z30ItemSequence;
            }

            /**
             * ����z30ItemSequence���Ե�ֵ��
             */
            public void setZ30ItemSequence(byte value) {
                this.z30ItemSequence = value;
            }

            /**
             * ��ȡz30Barcode���Ե�ֵ��
             */
            public long getZ30Barcode() {
                return z30Barcode;
            }

            /**
             * ����z30Barcode���Ե�ֵ��
             */
            public void setZ30Barcode(long value) {
                this.z30Barcode = value;
            }

            /**
             * ��ȡz30SubLibrary���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30SubLibrary() {
                return z30SubLibrary;
            }

            /**
             * ����z30SubLibrary���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30SubLibrary(String value) {
                this.z30SubLibrary = value;
            }

            /**
             * ��ȡz30Material���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Material() {
                return z30Material;
            }

            /**
             * ����z30Material���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Material(String value) {
                this.z30Material = value;
            }

            /**
             * ��ȡz30ItemStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemStatus() {
                return z30ItemStatus;
            }

            /**
             * ����z30ItemStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemStatus(String value) {
                this.z30ItemStatus = value;
            }

            /**
             * ��ȡz30OpenDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30OpenDate() {
                return z30OpenDate;
            }

            /**
             * ����z30OpenDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30OpenDate(String value) {
                this.z30OpenDate = value;
            }

            /**
             * ��ȡz30UpdateDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30UpdateDate() {
                return z30UpdateDate;
            }

            /**
             * ����z30UpdateDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30UpdateDate(String value) {
                this.z30UpdateDate = value;
            }

            /**
             * ��ȡz30Cataloger���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Cataloger() {
                return z30Cataloger;
            }

            /**
             * ����z30Cataloger���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Cataloger(String value) {
                this.z30Cataloger = value;
            }

            /**
             * ��ȡz30DateLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30DateLastReturn() {
                return z30DateLastReturn;
            }

            /**
             * ����z30DateLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30DateLastReturn(String value) {
                this.z30DateLastReturn = value;
            }

            /**
             * ��ȡz30HourLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30HourLastReturn() {
                return z30HourLastReturn;
            }

            /**
             * ����z30HourLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30HourLastReturn(String value) {
                this.z30HourLastReturn = value;
            }

            /**
             * ��ȡz30IpLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30IpLastReturn() {
                return z30IpLastReturn;
            }

            /**
             * ����z30IpLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30IpLastReturn(String value) {
                this.z30IpLastReturn = value;
            }

            /**
             * ��ȡz30NoLoans���Ե�ֵ��
             */
            public byte getZ30NoLoans() {
                return z30NoLoans;
            }

            /**
             * ����z30NoLoans���Ե�ֵ��
             */
            public void setZ30NoLoans(byte value) {
                this.z30NoLoans = value;
            }

            /**
             * ��ȡz30Alpha���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Alpha() {
                return z30Alpha;
            }

            /**
             * ����z30Alpha���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Alpha(String value) {
                this.z30Alpha = value;
            }

            /**
             * ��ȡz30Collection���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Collection() {
                return z30Collection;
            }

            /**
             * ����z30Collection���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Collection(String value) {
                this.z30Collection = value;
            }

            /**
             * ��ȡz30CallNoType���Ե�ֵ��
             */
            public byte getZ30CallNoType() {
                return z30CallNoType;
            }

            /**
             * ����z30CallNoType���Ե�ֵ��
             */
            public void setZ30CallNoType(byte value) {
                this.z30CallNoType = value;
            }

            /**
             * ��ȡz30CallNo���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo() {
                return z30CallNo;
            }

            /**
             * ����z30CallNo���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo(String value) {
                this.z30CallNo = value;
            }

            /**
             * ��ȡz30CallNoKey���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNoKey() {
                return z30CallNoKey;
            }

            /**
             * ����z30CallNoKey���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNoKey(String value) {
                this.z30CallNoKey = value;
            }

            /**
             * ��ȡz30CallNo2Type���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo2Type() {
                return z30CallNo2Type;
            }

            /**
             * ����z30CallNo2Type���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo2Type(String value) {
                this.z30CallNo2Type = value;
            }

            /**
             * ��ȡxxxTag���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getXxxTag() {
                return xxxTag;
            }

            /**
             * ����xxxTag���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXxxTag(String value) {
                this.xxxTag = value;
            }

            /**
             * ��ȡz30CallNo2Key���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo2Key() {
                return z30CallNo2Key;
            }

            /**
             * ����z30CallNo2Key���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo2Key(String value) {
                this.z30CallNo2Key = value;
            }

            /**
             * ��ȡz30Description���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Description() {
                return z30Description;
            }

            /**
             * ����z30Description���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Description(String value) {
                this.z30Description = value;
            }

            /**
             * ��ȡz30NoteOpac���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteOpac() {
                return z30NoteOpac;
            }

            /**
             * ����z30NoteOpac���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteOpac(String value) {
                this.z30NoteOpac = value;
            }

            /**
             * ��ȡz30NoteCirculation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteCirculation() {
                return z30NoteCirculation;
            }

            /**
             * ����z30NoteCirculation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteCirculation(String value) {
                this.z30NoteCirculation = value;
            }

            /**
             * ��ȡz30NoteInternal���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteInternal() {
                return z30NoteInternal;
            }

            /**
             * ����z30NoteInternal���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteInternal(String value) {
                this.z30NoteInternal = value;
            }

            /**
             * ��ȡz30OrderNumber���Ե�ֵ��
             */
            public int getZ30OrderNumber() {
                return z30OrderNumber;
            }

            /**
             * ����z30OrderNumber���Ե�ֵ��
             */
            public void setZ30OrderNumber(int value) {
                this.z30OrderNumber = value;
            }

            /**
             * ��ȡz30InventoryNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30InventoryNumber() {
                return z30InventoryNumber;
            }

            /**
             * ����z30InventoryNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30InventoryNumber(String value) {
                this.z30InventoryNumber = value;
            }

            /**
             * ��ȡz30InventoryNumberDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30InventoryNumberDate() {
                return z30InventoryNumberDate;
            }

            /**
             * ����z30InventoryNumberDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30InventoryNumberDate(String value) {
                this.z30InventoryNumberDate = value;
            }

            /**
             * ��ȡz30LastShelfReportDate���Ե�ֵ��
             */
            public byte getZ30LastShelfReportDate() {
                return z30LastShelfReportDate;
            }

            /**
             * ����z30LastShelfReportDate���Ե�ֵ��
             */
            public void setZ30LastShelfReportDate(byte value) {
                this.z30LastShelfReportDate = value;
            }

            /**
             * ��ȡz30Price���Ե�ֵ��
             */
            public float getZ30Price() {
                return z30Price;
            }

            /**
             * ����z30Price���Ե�ֵ��
             */
            public void setZ30Price(float value) {
                this.z30Price = value;
            }

            /**
             * ��ȡz30ShelfReportNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ShelfReportNumber() {
                return z30ShelfReportNumber;
            }

            /**
             * ����z30ShelfReportNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ShelfReportNumber(String value) {
                this.z30ShelfReportNumber = value;
            }

            /**
             * ��ȡz30OnShelfDate���Ե�ֵ��
             */
            public byte getZ30OnShelfDate() {
                return z30OnShelfDate;
            }

            /**
             * ����z30OnShelfDate���Ե�ֵ��
             */
            public void setZ30OnShelfDate(byte value) {
                this.z30OnShelfDate = value;
            }

            /**
             * ��ȡz30OnShelfSeq���Ե�ֵ��
             */
            public byte getZ30OnShelfSeq() {
                return z30OnShelfSeq;
            }

            /**
             * ����z30OnShelfSeq���Ե�ֵ��
             */
            public void setZ30OnShelfSeq(byte value) {
                this.z30OnShelfSeq = value;
            }

            /**
             * ��ȡz30DocNumber2���Ե�ֵ��
             */
            public byte getZ30DocNumber2() {
                return z30DocNumber2;
            }

            /**
             * ����z30DocNumber2���Ե�ֵ��
             */
            public void setZ30DocNumber2(byte value) {
                this.z30DocNumber2 = value;
            }

            /**
             * ��ȡz30ScheduleSequence2���Ե�ֵ��
             */
            public byte getZ30ScheduleSequence2() {
                return z30ScheduleSequence2;
            }

            /**
             * ����z30ScheduleSequence2���Ե�ֵ��
             */
            public void setZ30ScheduleSequence2(byte value) {
                this.z30ScheduleSequence2 = value;
            }

            /**
             * ��ȡz30CopySequence2���Ե�ֵ��
             */
            public byte getZ30CopySequence2() {
                return z30CopySequence2;
            }

            /**
             * ����z30CopySequence2���Ե�ֵ��
             */
            public void setZ30CopySequence2(byte value) {
                this.z30CopySequence2 = value;
            }

            /**
             * ��ȡz30VendorCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30VendorCode() {
                return z30VendorCode;
            }

            /**
             * ����z30VendorCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30VendorCode(String value) {
                this.z30VendorCode = value;
            }

            /**
             * ��ȡz30InvoiceNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30InvoiceNumber() {
                return z30InvoiceNumber;
            }

            /**
             * ����z30InvoiceNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30InvoiceNumber(String value) {
                this.z30InvoiceNumber = value;
            }

            /**
             * ��ȡz30LineNumber���Ե�ֵ��
             */
            public byte getZ30LineNumber() {
                return z30LineNumber;
            }

            /**
             * ����z30LineNumber���Ե�ֵ��
             */
            public void setZ30LineNumber(byte value) {
                this.z30LineNumber = value;
            }

            /**
             * ��ȡz30Pages���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Pages() {
                return z30Pages;
            }

            /**
             * ����z30Pages���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Pages(String value) {
                this.z30Pages = value;
            }

            /**
             * ��ȡz30IssueDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30IssueDate() {
                return z30IssueDate;
            }

            /**
             * ����z30IssueDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30IssueDate(String value) {
                this.z30IssueDate = value;
            }

            /**
             * ��ȡz30ExpectedArrivalDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ExpectedArrivalDate() {
                return z30ExpectedArrivalDate;
            }

            /**
             * ����z30ExpectedArrivalDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ExpectedArrivalDate(String value) {
                this.z30ExpectedArrivalDate = value;
            }

            /**
             * ��ȡz30ArrivalDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ArrivalDate() {
                return z30ArrivalDate;
            }

            /**
             * ����z30ArrivalDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ArrivalDate(String value) {
                this.z30ArrivalDate = value;
            }

            /**
             * ��ȡz30ItemStatistic���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemStatistic() {
                return z30ItemStatistic;
            }

            /**
             * ����z30ItemStatistic���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemStatistic(String value) {
                this.z30ItemStatistic = value;
            }

            /**
             * ��ȡz30ItemProcessStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemProcessStatus() {
                return z30ItemProcessStatus;
            }

            /**
             * ����z30ItemProcessStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemProcessStatus(String value) {
                this.z30ItemProcessStatus = value;
            }

            /**
             * ��ȡz30CopyId���Ե�ֵ��
             */
            public byte getZ30CopyId() {
                return z30CopyId;
            }

            /**
             * ����z30CopyId���Ե�ֵ��
             */
            public void setZ30CopyId(byte value) {
                this.z30CopyId = value;
            }

            /**
             * ��ȡz30HolDocNumber���Ե�ֵ��
             */
            public int getZ30HolDocNumber() {
                return z30HolDocNumber;
            }

            /**
             * ����z30HolDocNumber���Ե�ֵ��
             */
            public void setZ30HolDocNumber(int value) {
                this.z30HolDocNumber = value;
            }

            /**
             * ��ȡz30TempLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30TempLocation() {
                return z30TempLocation;
            }

            /**
             * ����z30TempLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30TempLocation(String value) {
                this.z30TempLocation = value;
            }

            /**
             * ��ȡz30EnumerationA���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationA() {
                return z30EnumerationA;
            }

            /**
             * ����z30EnumerationA���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationA(String value) {
                this.z30EnumerationA = value;
            }

            /**
             * ��ȡz30EnumerationB���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationB() {
                return z30EnumerationB;
            }

            /**
             * ����z30EnumerationB���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationB(String value) {
                this.z30EnumerationB = value;
            }

            /**
             * ��ȡz30EnumerationC���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationC() {
                return z30EnumerationC;
            }

            /**
             * ����z30EnumerationC���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationC(String value) {
                this.z30EnumerationC = value;
            }

            /**
             * ��ȡz30EnumerationD���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationD() {
                return z30EnumerationD;
            }

            /**
             * ����z30EnumerationD���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationD(String value) {
                this.z30EnumerationD = value;
            }

            /**
             * ��ȡz30EnumerationE���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationE() {
                return z30EnumerationE;
            }

            /**
             * ����z30EnumerationE���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationE(String value) {
                this.z30EnumerationE = value;
            }

            /**
             * ��ȡz30EnumerationF���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationF() {
                return z30EnumerationF;
            }

            /**
             * ����z30EnumerationF���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationF(String value) {
                this.z30EnumerationF = value;
            }

            /**
             * ��ȡz30EnumerationG���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationG() {
                return z30EnumerationG;
            }

            /**
             * ����z30EnumerationG���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationG(String value) {
                this.z30EnumerationG = value;
            }

            /**
             * ��ȡz30EnumerationH���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationH() {
                return z30EnumerationH;
            }

            /**
             * ����z30EnumerationH���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationH(String value) {
                this.z30EnumerationH = value;
            }

            /**
             * ��ȡz30ChronologicalI���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalI() {
                return z30ChronologicalI;
            }

            /**
             * ����z30ChronologicalI���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalI(String value) {
                this.z30ChronologicalI = value;
            }

            /**
             * ��ȡz30ChronologicalJ���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalJ() {
                return z30ChronologicalJ;
            }

            /**
             * ����z30ChronologicalJ���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalJ(String value) {
                this.z30ChronologicalJ = value;
            }

            /**
             * ��ȡz30ChronologicalK���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalK() {
                return z30ChronologicalK;
            }

            /**
             * ����z30ChronologicalK���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalK(String value) {
                this.z30ChronologicalK = value;
            }

            /**
             * ��ȡz30ChronologicalL���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalL() {
                return z30ChronologicalL;
            }

            /**
             * ����z30ChronologicalL���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalL(String value) {
                this.z30ChronologicalL = value;
            }

            /**
             * ��ȡz30ChronologicalM���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalM() {
                return z30ChronologicalM;
            }

            /**
             * ����z30ChronologicalM���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalM(String value) {
                this.z30ChronologicalM = value;
            }

            /**
             * ��ȡz30SuppIndexO���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30SuppIndexO() {
                return z30SuppIndexO;
            }

            /**
             * ����z30SuppIndexO���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30SuppIndexO(String value) {
                this.z30SuppIndexO = value;
            }

            /**
             * ��ȡz3085XType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ3085XType() {
                return z3085XType;
            }

            /**
             * ����z3085XType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ3085XType(String value) {
                this.z3085XType = value;
            }

            /**
             * ��ȡz30DepositoryId���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30DepositoryId() {
                return z30DepositoryId;
            }

            /**
             * ����z30DepositoryId���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30DepositoryId(String value) {
                this.z30DepositoryId = value;
            }

            /**
             * ��ȡz30LinkingNumber���Ե�ֵ��
             */
            public byte getZ30LinkingNumber() {
                return z30LinkingNumber;
            }

            /**
             * ����z30LinkingNumber���Ե�ֵ��
             */
            public void setZ30LinkingNumber(byte value) {
                this.z30LinkingNumber = value;
            }

            /**
             * ��ȡz30GapIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30GapIndicator() {
                return z30GapIndicator;
            }

            /**
             * ����z30GapIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30GapIndicator(String value) {
                this.z30GapIndicator = value;
            }

            /**
             * ��ȡz30MaintenanceCount���Ե�ֵ��
             */
            public byte getZ30MaintenanceCount() {
                return z30MaintenanceCount;
            }

            /**
             * ����z30MaintenanceCount���Ե�ֵ��
             */
            public void setZ30MaintenanceCount(byte value) {
                this.z30MaintenanceCount = value;
            }

            /**
             * ��ȡz30ProcessStatusDate���Ե�ֵ��
             */
            public byte getZ30ProcessStatusDate() {
                return z30ProcessStatusDate;
            }

            /**
             * ����z30ProcessStatusDate���Ե�ֵ��
             */
            public void setZ30ProcessStatusDate(byte value) {
                this.z30ProcessStatusDate = value;
            }

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
         *         &lt;element name="z31-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-sequence" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="z31-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z31-credit-debit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-sum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-vat-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="z31-net-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="z31-payment-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-target" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-receipt-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-payment-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-transfer-department" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z31-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-recall-transfer-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z31-recall-transfer-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z31-recall-transfer-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z31Id",
                "z31Sequence",
                "z31Date",
                "z31Status",
                "z31SubLibrary",
                "z31Type",
                "z31CreditDebit",
                "z31Sum",
                "z31VatSum",
                "z31NetSum",
                "z31PaymentDate",
                "z31PaymentHour",
                "z31PaymentCataloger",
                "z31PaymentTarget",
                "z31PaymentIp",
                "z31PaymentReceiptNumber",
                "z31PaymentMode",
                "z31PaymentIdentifier",
                "z31Description",
                "z31TransferDepartment",
                "z31TransferDate",
                "z31TransferNumber",
                "z31RecallTransferStatus",
                "z31RecallTransferDate",
                "z31RecallTransferNumber"
        })
        public static class Z31 {

            @XmlElement(name = "z31-id", required = true)
            protected String z31Id;
            @XmlElement(name = "z31-sequence")
            protected long z31Sequence;
            @XmlElement(name = "z31-date", required = true)
            protected String z31Date;
            @XmlElement(name = "z31-status", required = true)
            protected String z31Status;
            @XmlElement(name = "z31-sub-library", required = true)
            protected String z31SubLibrary;
            @XmlElement(name = "z31-type")
            protected byte z31Type;
            @XmlElement(name = "z31-credit-debit", required = true)
            protected String z31CreditDebit;
            @XmlElement(name = "z31-sum", required = true)
            protected String z31Sum;
            @XmlElement(name = "z31-vat-sum")
            protected float z31VatSum;
            @XmlElement(name = "z31-net-sum")
            protected float z31NetSum;
            @XmlElement(name = "z31-payment-date", required = true)
            protected String z31PaymentDate;
            @XmlElement(name = "z31-payment-hour", required = true)
            protected String z31PaymentHour;
            @XmlElement(name = "z31-payment-cataloger", required = true)
            protected String z31PaymentCataloger;
            @XmlElement(name = "z31-payment-target", required = true)
            protected String z31PaymentTarget;
            @XmlElement(name = "z31-payment-ip", required = true)
            protected String z31PaymentIp;
            @XmlElement(name = "z31-payment-receipt-number", required = true)
            protected String z31PaymentReceiptNumber;
            @XmlElement(name = "z31-payment-mode", required = true)
            protected String z31PaymentMode;
            @XmlElement(name = "z31-payment-identifier", required = true)
            protected String z31PaymentIdentifier;
            @XmlElement(name = "z31-description", required = true)
            protected String z31Description;
            @XmlElement(name = "z31-transfer-department", required = true)
            protected String z31TransferDepartment;
            @XmlElement(name = "z31-transfer-date")
            protected byte z31TransferDate;
            @XmlElement(name = "z31-transfer-number", required = true)
            protected String z31TransferNumber;
            @XmlElement(name = "z31-recall-transfer-status", required = true)
            protected String z31RecallTransferStatus;
            @XmlElement(name = "z31-recall-transfer-date")
            protected byte z31RecallTransferDate;
            @XmlElement(name = "z31-recall-transfer-number", required = true)
            protected String z31RecallTransferNumber;

            /**
             * ��ȡz31Id���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31Id() {
                return z31Id;
            }

            /**
             * ����z31Id���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31Id(String value) {
                this.z31Id = value;
            }

            /**
             * ��ȡz31Sequence���Ե�ֵ��
             */
            public long getZ31Sequence() {
                return z31Sequence;
            }

            /**
             * ����z31Sequence���Ե�ֵ��
             */
            public void setZ31Sequence(long value) {
                this.z31Sequence = value;
            }

            /**
             * ��ȡz31Date���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31Date() {
                return z31Date;
            }

            /**
             * ����z31Date���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31Date(String value) {
                this.z31Date = value;
            }

            /**
             * ��ȡz31Status���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31Status() {
                return z31Status;
            }

            /**
             * ����z31Status���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31Status(String value) {
                this.z31Status = value;
            }

            /**
             * ��ȡz31SubLibrary���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31SubLibrary() {
                return z31SubLibrary;
            }

            /**
             * ����z31SubLibrary���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31SubLibrary(String value) {
                this.z31SubLibrary = value;
            }

            /**
             * ��ȡz31Type���Ե�ֵ��
             */
            public byte getZ31Type() {
                return z31Type;
            }

            /**
             * ����z31Type���Ե�ֵ��
             */
            public void setZ31Type(byte value) {
                this.z31Type = value;
            }

            /**
             * ��ȡz31CreditDebit���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31CreditDebit() {
                return z31CreditDebit;
            }

            /**
             * ����z31CreditDebit���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31CreditDebit(String value) {
                this.z31CreditDebit = value;
            }

            /**
             * ��ȡz31Sum���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31Sum() {
                return z31Sum;
            }

            /**
             * ����z31Sum���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31Sum(String value) {
                this.z31Sum = value;
            }

            /**
             * ��ȡz31VatSum���Ե�ֵ��
             */
            public float getZ31VatSum() {
                return z31VatSum;
            }

            /**
             * ����z31VatSum���Ե�ֵ��
             */
            public void setZ31VatSum(float value) {
                this.z31VatSum = value;
            }

            /**
             * ��ȡz31NetSum���Ե�ֵ��
             */
            public float getZ31NetSum() {
                return z31NetSum;
            }

            /**
             * ����z31NetSum���Ե�ֵ��
             */
            public void setZ31NetSum(float value) {
                this.z31NetSum = value;
            }

            /**
             * ��ȡz31PaymentDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentDate() {
                return z31PaymentDate;
            }

            /**
             * ����z31PaymentDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentDate(String value) {
                this.z31PaymentDate = value;
            }

            /**
             * ��ȡz31PaymentHour���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentHour() {
                return z31PaymentHour;
            }

            /**
             * ����z31PaymentHour���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentHour(String value) {
                this.z31PaymentHour = value;
            }

            /**
             * ��ȡz31PaymentCataloger���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentCataloger() {
                return z31PaymentCataloger;
            }

            /**
             * ����z31PaymentCataloger���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentCataloger(String value) {
                this.z31PaymentCataloger = value;
            }

            /**
             * ��ȡz31PaymentTarget���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentTarget() {
                return z31PaymentTarget;
            }

            /**
             * ����z31PaymentTarget���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentTarget(String value) {
                this.z31PaymentTarget = value;
            }

            /**
             * ��ȡz31PaymentIp���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentIp() {
                return z31PaymentIp;
            }

            /**
             * ����z31PaymentIp���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentIp(String value) {
                this.z31PaymentIp = value;
            }

            /**
             * ��ȡz31PaymentReceiptNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentReceiptNumber() {
                return z31PaymentReceiptNumber;
            }

            /**
             * ����z31PaymentReceiptNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentReceiptNumber(String value) {
                this.z31PaymentReceiptNumber = value;
            }

            /**
             * ��ȡz31PaymentMode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentMode() {
                return z31PaymentMode;
            }

            /**
             * ����z31PaymentMode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentMode(String value) {
                this.z31PaymentMode = value;
            }

            /**
             * ��ȡz31PaymentIdentifier���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31PaymentIdentifier() {
                return z31PaymentIdentifier;
            }

            /**
             * ����z31PaymentIdentifier���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31PaymentIdentifier(String value) {
                this.z31PaymentIdentifier = value;
            }

            /**
             * ��ȡz31Description���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31Description() {
                return z31Description;
            }

            /**
             * ����z31Description���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31Description(String value) {
                this.z31Description = value;
            }

            /**
             * ��ȡz31TransferDepartment���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31TransferDepartment() {
                return z31TransferDepartment;
            }

            /**
             * ����z31TransferDepartment���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31TransferDepartment(String value) {
                this.z31TransferDepartment = value;
            }

            /**
             * ��ȡz31TransferDate���Ե�ֵ��
             */
            public byte getZ31TransferDate() {
                return z31TransferDate;
            }

            /**
             * ����z31TransferDate���Ե�ֵ��
             */
            public void setZ31TransferDate(byte value) {
                this.z31TransferDate = value;
            }

            /**
             * ��ȡz31TransferNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31TransferNumber() {
                return z31TransferNumber;
            }

            /**
             * ����z31TransferNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31TransferNumber(String value) {
                this.z31TransferNumber = value;
            }

            /**
             * ��ȡz31RecallTransferStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31RecallTransferStatus() {
                return z31RecallTransferStatus;
            }

            /**
             * ����z31RecallTransferStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31RecallTransferStatus(String value) {
                this.z31RecallTransferStatus = value;
            }

            /**
             * ��ȡz31RecallTransferDate���Ե�ֵ��
             */
            public byte getZ31RecallTransferDate() {
                return z31RecallTransferDate;
            }

            /**
             * ����z31RecallTransferDate���Ե�ֵ��
             */
            public void setZ31RecallTransferDate(byte value) {
                this.z31RecallTransferDate = value;
            }

            /**
             * ��ȡz31RecallTransferNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ31RecallTransferNumber() {
                return z31RecallTransferNumber;
            }

            /**
             * ����z31RecallTransferNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ31RecallTransferNumber(String value) {
                this.z31RecallTransferNumber = value;
            }

        }

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
     *         &lt;element name="z36">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z36-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z36-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z36-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-loan-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-loan-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-effective-due-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-due-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-returned-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-returned-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-item-status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-bor-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-letter-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-letter-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-no-renewal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-note-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-note-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-loan-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-loan-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-return-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-return-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-renew-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-renew-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-renew-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-bor-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z36-note-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-recall-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-recall-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-last-renew-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-original-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-loan-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-proxy-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-recall-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-return-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-return-sub-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-delivery-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z36-tail-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="z30">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="z13">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="z13u">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="z13u-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="z13u-user-defined-1-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-2-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-3-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-4-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-5-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-6-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13u-user-defined-6" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-7-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-7" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-8-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-8" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-9-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-9" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-10-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-10" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-11-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-11" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-12-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-12" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="z13u-user-defined-13-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-13" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-14-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-14" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-15-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="z13u-user-defined-15" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="current-fine" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="due-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="due-hour" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "z36",
            "z30",
            "z13",
            "z13U",
            "currentFine",
            "dueDate",
            "dueHour"
    })
    public static class ItemL {

        @XmlElement(required = true)
        protected Z36 z36;
        @XmlElement(required = true)
        protected Z30 z30;
        @XmlElement(required = true)
        protected Z13 z13;
        @XmlElement(name = "z13u", required = true)
        protected Z13U z13U;
        @XmlElement(name = "current-fine")
        protected float currentFine;
        @XmlElement(name = "due-date")
        protected int dueDate;
        @XmlElement(name = "due-hour")
        protected short dueHour;

        /**
         * ��ȡz36���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z36 }
         */
        public Z36 getZ36() {
            return z36;
        }

        /**
         * ����z36���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z36 }
         */
        public void setZ36(Z36 value) {
            this.z36 = value;
        }

        /**
         * ��ȡz30���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z30 }
         */
        public Z30 getZ30() {
            return z30;
        }

        /**
         * ����z30���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z30 }
         */
        public void setZ30(Z30 value) {
            this.z30 = value;
        }

        /**
         * ��ȡz13���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z13 }
         */
        public Z13 getZ13() {
            return z13;
        }

        /**
         * ����z13���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z13 }
         */
        public void setZ13(Z13 value) {
            this.z13 = value;
        }

        /**
         * ��ȡz13U���Ե�ֵ��
         *
         * @return possible object is
         * {@link Z13U }
         */
        public Z13U getZ13U() {
            return z13U;
        }

        /**
         * ����z13U���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Z13U }
         */
        public void setZ13U(Z13U value) {
            this.z13U = value;
        }

        /**
         * ��ȡcurrentFine���Ե�ֵ��
         */
        public float getCurrentFine() {
            return currentFine;
        }

        /**
         * ����currentFine���Ե�ֵ��
         */
        public void setCurrentFine(float value) {
            this.currentFine = value;
        }

        /**
         * ��ȡdueDate���Ե�ֵ��
         */
        public int getDueDate() {
            return dueDate;
        }

        /**
         * ����dueDate���Ե�ֵ��
         */
        public void setDueDate(int value) {
            this.dueDate = value;
        }

        /**
         * ��ȡdueHour���Ե�ֵ��
         */
        public short getDueHour() {
            return dueHour;
        }

        /**
         * ����dueHour���Ե�ֵ��
         */
        public void setDueHour(short value) {
            this.dueHour = value;
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
         *         &lt;element name="z13-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z13-year" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-call-no-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-author-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-author" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-title-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-imprint-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13-imprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13-isbn-issn-code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z13-isbn-issn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z13DocNumber",
                "z13Year",
                "z13OpenDate",
                "z13UpdateDate",
                "z13CallNoKey",
                "z13CallNoCode",
                "z13CallNo",
                "z13AuthorCode",
                "z13Author",
                "z13TitleCode",
                "z13Title",
                "z13ImprintCode",
                "z13Imprint",
                "z13IsbnIssnCode",
                "z13IsbnIssn"
        })
        public static class Z13 {

            @XmlElement(name = "z13-doc-number")
            protected int z13DocNumber;
            @XmlElement(name = "z13-year")
            protected short z13Year;
            @XmlElement(name = "z13-open-date", required = true)
            protected String z13OpenDate;
            @XmlElement(name = "z13-update-date", required = true)
            protected String z13UpdateDate;
            @XmlElement(name = "z13-call-no-key", required = true)
            protected String z13CallNoKey;
            @XmlElement(name = "z13-call-no-code")
            protected short z13CallNoCode;
            @XmlElement(name = "z13-call-no", required = true)
            protected String z13CallNo;
            @XmlElement(name = "z13-author-code", required = true)
            protected String z13AuthorCode;
            @XmlElement(name = "z13-author", required = true)
            protected String z13Author;
            @XmlElement(name = "z13-title-code")
            protected short z13TitleCode;
            @XmlElement(name = "z13-title", required = true)
            protected String z13Title;
            @XmlElement(name = "z13-imprint-code")
            protected short z13ImprintCode;
            @XmlElement(name = "z13-imprint", required = true)
            protected String z13Imprint;
            @XmlElement(name = "z13-isbn-issn-code")
            protected byte z13IsbnIssnCode;
            @XmlElement(name = "z13-isbn-issn", required = true)
            protected String z13IsbnIssn;

            /**
             * ��ȡz13DocNumber���Ե�ֵ��
             */
            public int getZ13DocNumber() {
                return z13DocNumber;
            }

            /**
             * ����z13DocNumber���Ե�ֵ��
             */
            public void setZ13DocNumber(int value) {
                this.z13DocNumber = value;
            }

            /**
             * ��ȡz13Year���Ե�ֵ��
             */
            public short getZ13Year() {
                return z13Year;
            }

            /**
             * ����z13Year���Ե�ֵ��
             */
            public void setZ13Year(short value) {
                this.z13Year = value;
            }

            /**
             * ��ȡz13OpenDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13OpenDate() {
                return z13OpenDate;
            }

            /**
             * ����z13OpenDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13OpenDate(String value) {
                this.z13OpenDate = value;
            }

            /**
             * ��ȡz13UpdateDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UpdateDate() {
                return z13UpdateDate;
            }

            /**
             * ����z13UpdateDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UpdateDate(String value) {
                this.z13UpdateDate = value;
            }

            /**
             * ��ȡz13CallNoKey���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13CallNoKey() {
                return z13CallNoKey;
            }

            /**
             * ����z13CallNoKey���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13CallNoKey(String value) {
                this.z13CallNoKey = value;
            }

            /**
             * ��ȡz13CallNoCode���Ե�ֵ��
             */
            public short getZ13CallNoCode() {
                return z13CallNoCode;
            }

            /**
             * ����z13CallNoCode���Ե�ֵ��
             */
            public void setZ13CallNoCode(short value) {
                this.z13CallNoCode = value;
            }

            /**
             * ��ȡz13CallNo���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13CallNo() {
                return z13CallNo;
            }

            /**
             * ����z13CallNo���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13CallNo(String value) {
                this.z13CallNo = value;
            }

            /**
             * ��ȡz13AuthorCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13AuthorCode() {
                return z13AuthorCode;
            }

            /**
             * ����z13AuthorCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13AuthorCode(String value) {
                this.z13AuthorCode = value;
            }

            /**
             * ��ȡz13Author���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Author() {
                return z13Author;
            }

            /**
             * ����z13Author���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Author(String value) {
                this.z13Author = value;
            }

            /**
             * ��ȡz13TitleCode���Ե�ֵ��
             */
            public short getZ13TitleCode() {
                return z13TitleCode;
            }

            /**
             * ����z13TitleCode���Ե�ֵ��
             */
            public void setZ13TitleCode(short value) {
                this.z13TitleCode = value;
            }

            /**
             * ��ȡz13Title���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Title() {
                return z13Title;
            }

            /**
             * ����z13Title���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Title(String value) {
                this.z13Title = value;
            }

            /**
             * ��ȡz13ImprintCode���Ե�ֵ��
             */
            public short getZ13ImprintCode() {
                return z13ImprintCode;
            }

            /**
             * ����z13ImprintCode���Ե�ֵ��
             */
            public void setZ13ImprintCode(short value) {
                this.z13ImprintCode = value;
            }

            /**
             * ��ȡz13Imprint���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13Imprint() {
                return z13Imprint;
            }

            /**
             * ����z13Imprint���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13Imprint(String value) {
                this.z13Imprint = value;
            }

            /**
             * ��ȡz13IsbnIssnCode���Ե�ֵ��
             */
            public byte getZ13IsbnIssnCode() {
                return z13IsbnIssnCode;
            }

            /**
             * ����z13IsbnIssnCode���Ե�ֵ��
             */
            public void setZ13IsbnIssnCode(byte value) {
                this.z13IsbnIssnCode = value;
            }

            /**
             * ��ȡz13IsbnIssn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13IsbnIssn() {
                return z13IsbnIssn;
            }

            /**
             * ����z13IsbnIssn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13IsbnIssn(String value) {
                this.z13IsbnIssn = value;
            }

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
         *         &lt;element name="z13u-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z13u-user-defined-1-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-2-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-3-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-4-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-5-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-6-code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13u-user-defined-6" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-7-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-7" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-8-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-8" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-9-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-9" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-10-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-10" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-11-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-11" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-12-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-12" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="z13u-user-defined-13-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-13" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-14-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-14" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-15-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z13u-user-defined-15" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z13UDocNumber",
                "z13UUserDefined1Code",
                "z13UUserDefined1",
                "z13UUserDefined2Code",
                "z13UUserDefined2",
                "z13UUserDefined3Code",
                "z13UUserDefined3",
                "z13UUserDefined4Code",
                "z13UUserDefined4",
                "z13UUserDefined5Code",
                "z13UUserDefined5",
                "z13UUserDefined6Code",
                "z13UUserDefined6",
                "z13UUserDefined7Code",
                "z13UUserDefined7",
                "z13UUserDefined8Code",
                "z13UUserDefined8",
                "z13UUserDefined9Code",
                "z13UUserDefined9",
                "z13UUserDefined10Code",
                "z13UUserDefined10",
                "z13UUserDefined11Code",
                "z13UUserDefined11",
                "z13UUserDefined12Code",
                "z13UUserDefined12",
                "z13UUserDefined13Code",
                "z13UUserDefined13",
                "z13UUserDefined14Code",
                "z13UUserDefined14",
                "z13UUserDefined15Code",
                "z13UUserDefined15"
        })
        public static class Z13U {

            @XmlElement(name = "z13u-doc-number")
            protected int z13UDocNumber;
            @XmlElement(name = "z13u-user-defined-1-code", required = true)
            protected String z13UUserDefined1Code;
            @XmlElement(name = "z13u-user-defined-1", required = true)
            protected String z13UUserDefined1;
            @XmlElement(name = "z13u-user-defined-2-code", required = true)
            protected String z13UUserDefined2Code;
            @XmlElement(name = "z13u-user-defined-2", required = true)
            protected String z13UUserDefined2;
            @XmlElement(name = "z13u-user-defined-3-code", required = true)
            protected String z13UUserDefined3Code;
            @XmlElement(name = "z13u-user-defined-3", required = true)
            protected String z13UUserDefined3;
            @XmlElement(name = "z13u-user-defined-4-code", required = true)
            protected String z13UUserDefined4Code;
            @XmlElement(name = "z13u-user-defined-4", required = true)
            protected String z13UUserDefined4;
            @XmlElement(name = "z13u-user-defined-5-code", required = true)
            protected String z13UUserDefined5Code;
            @XmlElement(name = "z13u-user-defined-5", required = true)
            protected String z13UUserDefined5;
            @XmlElement(name = "z13u-user-defined-6-code")
            protected short z13UUserDefined6Code;
            @XmlElement(name = "z13u-user-defined-6", required = true)
            protected String z13UUserDefined6;
            @XmlElement(name = "z13u-user-defined-7-code", required = true)
            protected String z13UUserDefined7Code;
            @XmlElement(name = "z13u-user-defined-7", required = true)
            protected String z13UUserDefined7;
            @XmlElement(name = "z13u-user-defined-8-code", required = true)
            protected String z13UUserDefined8Code;
            @XmlElement(name = "z13u-user-defined-8", required = true)
            protected String z13UUserDefined8;
            @XmlElement(name = "z13u-user-defined-9-code", required = true)
            protected String z13UUserDefined9Code;
            @XmlElement(name = "z13u-user-defined-9", required = true)
            protected String z13UUserDefined9;
            @XmlElement(name = "z13u-user-defined-10-code", required = true)
            protected String z13UUserDefined10Code;
            @XmlElement(name = "z13u-user-defined-10", required = true)
            protected String z13UUserDefined10;
            @XmlElement(name = "z13u-user-defined-11-code", required = true)
            protected String z13UUserDefined11Code;
            @XmlElement(name = "z13u-user-defined-11", required = true)
            protected String z13UUserDefined11;
            @XmlElement(name = "z13u-user-defined-12-code", required = true)
            protected String z13UUserDefined12Code;
            @XmlElement(name = "z13u-user-defined-12")
            protected short z13UUserDefined12;
            @XmlElement(name = "z13u-user-defined-13-code", required = true)
            protected String z13UUserDefined13Code;
            @XmlElement(name = "z13u-user-defined-13", required = true)
            protected String z13UUserDefined13;
            @XmlElement(name = "z13u-user-defined-14-code", required = true)
            protected String z13UUserDefined14Code;
            @XmlElement(name = "z13u-user-defined-14", required = true)
            protected String z13UUserDefined14;
            @XmlElement(name = "z13u-user-defined-15-code", required = true)
            protected String z13UUserDefined15Code;
            @XmlElement(name = "z13u-user-defined-15", required = true)
            protected String z13UUserDefined15;

            /**
             * ��ȡz13UDocNumber���Ե�ֵ��
             */
            public int getZ13UDocNumber() {
                return z13UDocNumber;
            }

            /**
             * ����z13UDocNumber���Ե�ֵ��
             */
            public void setZ13UDocNumber(int value) {
                this.z13UDocNumber = value;
            }

            /**
             * ��ȡz13UUserDefined1Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined1Code() {
                return z13UUserDefined1Code;
            }

            /**
             * ����z13UUserDefined1Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined1Code(String value) {
                this.z13UUserDefined1Code = value;
            }

            /**
             * ��ȡz13UUserDefined1���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined1() {
                return z13UUserDefined1;
            }

            /**
             * ����z13UUserDefined1���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined1(String value) {
                this.z13UUserDefined1 = value;
            }

            /**
             * ��ȡz13UUserDefined2Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined2Code() {
                return z13UUserDefined2Code;
            }

            /**
             * ����z13UUserDefined2Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined2Code(String value) {
                this.z13UUserDefined2Code = value;
            }

            /**
             * ��ȡz13UUserDefined2���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined2() {
                return z13UUserDefined2;
            }

            /**
             * ����z13UUserDefined2���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined2(String value) {
                this.z13UUserDefined2 = value;
            }

            /**
             * ��ȡz13UUserDefined3Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined3Code() {
                return z13UUserDefined3Code;
            }

            /**
             * ����z13UUserDefined3Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined3Code(String value) {
                this.z13UUserDefined3Code = value;
            }

            /**
             * ��ȡz13UUserDefined3���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined3() {
                return z13UUserDefined3;
            }

            /**
             * ����z13UUserDefined3���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined3(String value) {
                this.z13UUserDefined3 = value;
            }

            /**
             * ��ȡz13UUserDefined4Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined4Code() {
                return z13UUserDefined4Code;
            }

            /**
             * ����z13UUserDefined4Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined4Code(String value) {
                this.z13UUserDefined4Code = value;
            }

            /**
             * ��ȡz13UUserDefined4���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined4() {
                return z13UUserDefined4;
            }

            /**
             * ����z13UUserDefined4���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined4(String value) {
                this.z13UUserDefined4 = value;
            }

            /**
             * ��ȡz13UUserDefined5Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined5Code() {
                return z13UUserDefined5Code;
            }

            /**
             * ����z13UUserDefined5Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined5Code(String value) {
                this.z13UUserDefined5Code = value;
            }

            /**
             * ��ȡz13UUserDefined5���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined5() {
                return z13UUserDefined5;
            }

            /**
             * ����z13UUserDefined5���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined5(String value) {
                this.z13UUserDefined5 = value;
            }

            /**
             * ��ȡz13UUserDefined6Code���Ե�ֵ��
             */
            public short getZ13UUserDefined6Code() {
                return z13UUserDefined6Code;
            }

            /**
             * ����z13UUserDefined6Code���Ե�ֵ��
             */
            public void setZ13UUserDefined6Code(short value) {
                this.z13UUserDefined6Code = value;
            }

            /**
             * ��ȡz13UUserDefined6���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined6() {
                return z13UUserDefined6;
            }

            /**
             * ����z13UUserDefined6���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined6(String value) {
                this.z13UUserDefined6 = value;
            }

            /**
             * ��ȡz13UUserDefined7Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined7Code() {
                return z13UUserDefined7Code;
            }

            /**
             * ����z13UUserDefined7Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined7Code(String value) {
                this.z13UUserDefined7Code = value;
            }

            /**
             * ��ȡz13UUserDefined7���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined7() {
                return z13UUserDefined7;
            }

            /**
             * ����z13UUserDefined7���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined7(String value) {
                this.z13UUserDefined7 = value;
            }

            /**
             * ��ȡz13UUserDefined8Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined8Code() {
                return z13UUserDefined8Code;
            }

            /**
             * ����z13UUserDefined8Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined8Code(String value) {
                this.z13UUserDefined8Code = value;
            }

            /**
             * ��ȡz13UUserDefined8���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined8() {
                return z13UUserDefined8;
            }

            /**
             * ����z13UUserDefined8���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined8(String value) {
                this.z13UUserDefined8 = value;
            }

            /**
             * ��ȡz13UUserDefined9Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined9Code() {
                return z13UUserDefined9Code;
            }

            /**
             * ����z13UUserDefined9Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined9Code(String value) {
                this.z13UUserDefined9Code = value;
            }

            /**
             * ��ȡz13UUserDefined9���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined9() {
                return z13UUserDefined9;
            }

            /**
             * ����z13UUserDefined9���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined9(String value) {
                this.z13UUserDefined9 = value;
            }

            /**
             * ��ȡz13UUserDefined10Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined10Code() {
                return z13UUserDefined10Code;
            }

            /**
             * ����z13UUserDefined10Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined10Code(String value) {
                this.z13UUserDefined10Code = value;
            }

            /**
             * ��ȡz13UUserDefined10���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined10() {
                return z13UUserDefined10;
            }

            /**
             * ����z13UUserDefined10���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined10(String value) {
                this.z13UUserDefined10 = value;
            }

            /**
             * ��ȡz13UUserDefined11Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined11Code() {
                return z13UUserDefined11Code;
            }

            /**
             * ����z13UUserDefined11Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined11Code(String value) {
                this.z13UUserDefined11Code = value;
            }

            /**
             * ��ȡz13UUserDefined11���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined11() {
                return z13UUserDefined11;
            }

            /**
             * ����z13UUserDefined11���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined11(String value) {
                this.z13UUserDefined11 = value;
            }

            /**
             * ��ȡz13UUserDefined12Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined12Code() {
                return z13UUserDefined12Code;
            }

            /**
             * ����z13UUserDefined12Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined12Code(String value) {
                this.z13UUserDefined12Code = value;
            }

            /**
             * ��ȡz13UUserDefined12���Ե�ֵ��
             */
            public short getZ13UUserDefined12() {
                return z13UUserDefined12;
            }

            /**
             * ����z13UUserDefined12���Ե�ֵ��
             */
            public void setZ13UUserDefined12(short value) {
                this.z13UUserDefined12 = value;
            }

            /**
             * ��ȡz13UUserDefined13Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined13Code() {
                return z13UUserDefined13Code;
            }

            /**
             * ����z13UUserDefined13Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined13Code(String value) {
                this.z13UUserDefined13Code = value;
            }

            /**
             * ��ȡz13UUserDefined13���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined13() {
                return z13UUserDefined13;
            }

            /**
             * ����z13UUserDefined13���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined13(String value) {
                this.z13UUserDefined13 = value;
            }

            /**
             * ��ȡz13UUserDefined14Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined14Code() {
                return z13UUserDefined14Code;
            }

            /**
             * ����z13UUserDefined14Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined14Code(String value) {
                this.z13UUserDefined14Code = value;
            }

            /**
             * ��ȡz13UUserDefined14���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined14() {
                return z13UUserDefined14;
            }

            /**
             * ����z13UUserDefined14���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined14(String value) {
                this.z13UUserDefined14 = value;
            }

            /**
             * ��ȡz13UUserDefined15Code���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined15Code() {
                return z13UUserDefined15Code;
            }

            /**
             * ����z13UUserDefined15Code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined15Code(String value) {
                this.z13UUserDefined15Code = value;
            }

            /**
             * ��ȡz13UUserDefined15���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ13UUserDefined15() {
                return z13UUserDefined15;
            }

            /**
             * ����z13UUserDefined15���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ13UUserDefined15(String value) {
                this.z13UUserDefined15 = value;
            }

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
         *         &lt;element name="z30-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-barcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="z30-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-cataloger" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-date-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-hour-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-ip-last-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-no-loans" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-collection" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-2-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xxx-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-call-no-2-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-opac" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-circulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-note-internal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-order-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-inventory-number" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="z30-inventory-number-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-last-shelf-report-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-price" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="z30-shelf-report-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-on-shelf-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-on-shelf-seq" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-doc-number-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-schedule-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-copy-sequence-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-vendor-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-invoice-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-line-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-issue-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-expected-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-arrival-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-statistic" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-item-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-copy-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-hol-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z30-temp-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-a" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-b" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-c" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-d" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-e" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-f" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-g" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-enumeration-h" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-i" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-j" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-k" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-l" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-chronological-m" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-supp-index-o" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-85x-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-depository-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-linking-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-gap-indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z30-maintenance-count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z30-process-status-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z30DocNumber",
                "z30ItemSequence",
                "z30Barcode",
                "z30SubLibrary",
                "z30Material",
                "z30ItemStatus",
                "z30OpenDate",
                "z30UpdateDate",
                "z30Cataloger",
                "z30DateLastReturn",
                "z30HourLastReturn",
                "z30IpLastReturn",
                "z30NoLoans",
                "z30Alpha",
                "z30Collection",
                "z30CallNoType",
                "z30CallNo",
                "z30CallNoKey",
                "z30CallNo2Type",
                "xxxTag",
                "z30CallNo2Key",
                "z30Description",
                "z30NoteOpac",
                "z30NoteCirculation",
                "z30NoteInternal",
                "z30OrderNumber",
                "z30InventoryNumber",
                "z30InventoryNumberDate",
                "z30LastShelfReportDate",
                "z30Price",
                "z30ShelfReportNumber",
                "z30OnShelfDate",
                "z30OnShelfSeq",
                "z30DocNumber2",
                "z30ScheduleSequence2",
                "z30CopySequence2",
                "z30VendorCode",
                "z30InvoiceNumber",
                "z30LineNumber",
                "z30Pages",
                "z30IssueDate",
                "z30ExpectedArrivalDate",
                "z30ArrivalDate",
                "z30ItemStatistic",
                "z30ItemProcessStatus",
                "z30CopyId",
                "z30HolDocNumber",
                "z30TempLocation",
                "z30EnumerationA",
                "z30EnumerationB",
                "z30EnumerationC",
                "z30EnumerationD",
                "z30EnumerationE",
                "z30EnumerationF",
                "z30EnumerationG",
                "z30EnumerationH",
                "z30ChronologicalI",
                "z30ChronologicalJ",
                "z30ChronologicalK",
                "z30ChronologicalL",
                "z30ChronologicalM",
                "z30SuppIndexO",
                "z3085XType",
                "z30DepositoryId",
                "z30LinkingNumber",
                "z30GapIndicator",
                "z30MaintenanceCount",
                "z30ProcessStatusDate"
        })
        public static class Z30 {

            @XmlElement(name = "z30-doc-number")
            protected int z30DocNumber;
            @XmlElement(name = "z30-item-sequence")
            protected byte z30ItemSequence;
            @XmlElement(name = "z30-barcode")
            protected long z30Barcode;
            @XmlElement(name = "z30-sub-library", required = true)
            protected String z30SubLibrary;
            @XmlElement(name = "z30-material", required = true)
            protected String z30Material;
            @XmlElement(name = "z30-item-status", required = true)
            protected String z30ItemStatus;
            @XmlElement(name = "z30-open-date", required = true)
            protected String z30OpenDate;
            @XmlElement(name = "z30-update-date", required = true)
            protected String z30UpdateDate;
            @XmlElement(name = "z30-cataloger", required = true)
            protected String z30Cataloger;
            @XmlElement(name = "z30-date-last-return", required = true)
            protected String z30DateLastReturn;
            @XmlElement(name = "z30-hour-last-return", required = true)
            protected String z30HourLastReturn;
            @XmlElement(name = "z30-ip-last-return", required = true)
            protected String z30IpLastReturn;
            @XmlElement(name = "z30-no-loans")
            protected byte z30NoLoans;
            @XmlElement(name = "z30-alpha", required = true)
            protected String z30Alpha;
            @XmlElement(name = "z30-collection", required = true)
            protected String z30Collection;
            @XmlElement(name = "z30-call-no-type", required = true)
            protected String z30CallNoType;
            @XmlElement(name = "z30-call-no", required = true)
            protected String z30CallNo;
            @XmlElement(name = "z30-call-no-key", required = true)
            protected String z30CallNoKey;
            @XmlElement(name = "z30-call-no-2-type", required = true)
            protected String z30CallNo2Type;
            @XmlElement(name = "xxx-tag", required = true)
            protected String xxxTag;
            @XmlElement(name = "z30-call-no-2-key", required = true)
            protected String z30CallNo2Key;
            @XmlElement(name = "z30-description", required = true)
            protected String z30Description;
            @XmlElement(name = "z30-note-opac", required = true)
            protected String z30NoteOpac;
            @XmlElement(name = "z30-note-circulation", required = true)
            protected String z30NoteCirculation;
            @XmlElement(name = "z30-note-internal", required = true)
            protected String z30NoteInternal;
            @XmlElement(name = "z30-order-number")
            protected int z30OrderNumber;
            @XmlElement(name = "z30-inventory-number")
            protected long z30InventoryNumber;
            @XmlElement(name = "z30-inventory-number-date", required = true)
            protected String z30InventoryNumberDate;
            @XmlElement(name = "z30-last-shelf-report-date")
            protected byte z30LastShelfReportDate;
            @XmlElement(name = "z30-price")
            protected float z30Price;
            @XmlElement(name = "z30-shelf-report-number", required = true)
            protected String z30ShelfReportNumber;
            @XmlElement(name = "z30-on-shelf-date")
            protected byte z30OnShelfDate;
            @XmlElement(name = "z30-on-shelf-seq")
            protected byte z30OnShelfSeq;
            @XmlElement(name = "z30-doc-number-2")
            protected byte z30DocNumber2;
            @XmlElement(name = "z30-schedule-sequence-2")
            protected byte z30ScheduleSequence2;
            @XmlElement(name = "z30-copy-sequence-2")
            protected byte z30CopySequence2;
            @XmlElement(name = "z30-vendor-code", required = true)
            protected String z30VendorCode;
            @XmlElement(name = "z30-invoice-number", required = true)
            protected String z30InvoiceNumber;
            @XmlElement(name = "z30-line-number")
            protected byte z30LineNumber;
            @XmlElement(name = "z30-pages", required = true)
            protected String z30Pages;
            @XmlElement(name = "z30-issue-date", required = true)
            protected String z30IssueDate;
            @XmlElement(name = "z30-expected-arrival-date", required = true)
            protected String z30ExpectedArrivalDate;
            @XmlElement(name = "z30-arrival-date", required = true)
            protected String z30ArrivalDate;
            @XmlElement(name = "z30-item-statistic", required = true)
            protected String z30ItemStatistic;
            @XmlElement(name = "z30-item-process-status", required = true)
            protected String z30ItemProcessStatus;
            @XmlElement(name = "z30-copy-id")
            protected byte z30CopyId;
            @XmlElement(name = "z30-hol-doc-number")
            protected int z30HolDocNumber;
            @XmlElement(name = "z30-temp-location", required = true)
            protected String z30TempLocation;
            @XmlElement(name = "z30-enumeration-a", required = true)
            protected String z30EnumerationA;
            @XmlElement(name = "z30-enumeration-b", required = true)
            protected String z30EnumerationB;
            @XmlElement(name = "z30-enumeration-c", required = true)
            protected String z30EnumerationC;
            @XmlElement(name = "z30-enumeration-d", required = true)
            protected String z30EnumerationD;
            @XmlElement(name = "z30-enumeration-e", required = true)
            protected String z30EnumerationE;
            @XmlElement(name = "z30-enumeration-f", required = true)
            protected String z30EnumerationF;
            @XmlElement(name = "z30-enumeration-g", required = true)
            protected String z30EnumerationG;
            @XmlElement(name = "z30-enumeration-h", required = true)
            protected String z30EnumerationH;
            @XmlElement(name = "z30-chronological-i", required = true)
            protected String z30ChronologicalI;
            @XmlElement(name = "z30-chronological-j", required = true)
            protected String z30ChronologicalJ;
            @XmlElement(name = "z30-chronological-k", required = true)
            protected String z30ChronologicalK;
            @XmlElement(name = "z30-chronological-l", required = true)
            protected String z30ChronologicalL;
            @XmlElement(name = "z30-chronological-m", required = true)
            protected String z30ChronologicalM;
            @XmlElement(name = "z30-supp-index-o", required = true)
            protected String z30SuppIndexO;
            @XmlElement(name = "z30-85x-type", required = true)
            protected String z3085XType;
            @XmlElement(name = "z30-depository-id", required = true)
            protected String z30DepositoryId;
            @XmlElement(name = "z30-linking-number")
            protected byte z30LinkingNumber;
            @XmlElement(name = "z30-gap-indicator", required = true)
            protected String z30GapIndicator;
            @XmlElement(name = "z30-maintenance-count")
            protected byte z30MaintenanceCount;
            @XmlElement(name = "z30-process-status-date")
            protected int z30ProcessStatusDate;

            /**
             * ��ȡz30DocNumber���Ե�ֵ��
             */
            public int getZ30DocNumber() {
                return z30DocNumber;
            }

            /**
             * ����z30DocNumber���Ե�ֵ��
             */
            public void setZ30DocNumber(int value) {
                this.z30DocNumber = value;
            }

            /**
             * ��ȡz30ItemSequence���Ե�ֵ��
             */
            public byte getZ30ItemSequence() {
                return z30ItemSequence;
            }

            /**
             * ����z30ItemSequence���Ե�ֵ��
             */
            public void setZ30ItemSequence(byte value) {
                this.z30ItemSequence = value;
            }

            /**
             * ��ȡz30Barcode���Ե�ֵ��
             */
            public long getZ30Barcode() {
                return z30Barcode;
            }

            /**
             * ����z30Barcode���Ե�ֵ��
             */
            public void setZ30Barcode(long value) {
                this.z30Barcode = value;
            }

            /**
             * ��ȡz30SubLibrary���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30SubLibrary() {
                return z30SubLibrary;
            }

            /**
             * ����z30SubLibrary���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30SubLibrary(String value) {
                this.z30SubLibrary = value;
            }

            /**
             * ��ȡz30Material���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Material() {
                return z30Material;
            }

            /**
             * ����z30Material���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Material(String value) {
                this.z30Material = value;
            }

            /**
             * ��ȡz30ItemStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemStatus() {
                return z30ItemStatus;
            }

            /**
             * ����z30ItemStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemStatus(String value) {
                this.z30ItemStatus = value;
            }

            /**
             * ��ȡz30OpenDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30OpenDate() {
                return z30OpenDate;
            }

            /**
             * ����z30OpenDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30OpenDate(String value) {
                this.z30OpenDate = value;
            }

            /**
             * ��ȡz30UpdateDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30UpdateDate() {
                return z30UpdateDate;
            }

            /**
             * ����z30UpdateDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30UpdateDate(String value) {
                this.z30UpdateDate = value;
            }

            /**
             * ��ȡz30Cataloger���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Cataloger() {
                return z30Cataloger;
            }

            /**
             * ����z30Cataloger���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Cataloger(String value) {
                this.z30Cataloger = value;
            }

            /**
             * ��ȡz30DateLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30DateLastReturn() {
                return z30DateLastReturn;
            }

            /**
             * ����z30DateLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30DateLastReturn(String value) {
                this.z30DateLastReturn = value;
            }

            /**
             * ��ȡz30HourLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30HourLastReturn() {
                return z30HourLastReturn;
            }

            /**
             * ����z30HourLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30HourLastReturn(String value) {
                this.z30HourLastReturn = value;
            }

            /**
             * ��ȡz30IpLastReturn���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30IpLastReturn() {
                return z30IpLastReturn;
            }

            /**
             * ����z30IpLastReturn���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30IpLastReturn(String value) {
                this.z30IpLastReturn = value;
            }

            /**
             * ��ȡz30NoLoans���Ե�ֵ��
             */
            public byte getZ30NoLoans() {
                return z30NoLoans;
            }

            /**
             * ����z30NoLoans���Ե�ֵ��
             */
            public void setZ30NoLoans(byte value) {
                this.z30NoLoans = value;
            }

            /**
             * ��ȡz30Alpha���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Alpha() {
                return z30Alpha;
            }

            /**
             * ����z30Alpha���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Alpha(String value) {
                this.z30Alpha = value;
            }

            /**
             * ��ȡz30Collection���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Collection() {
                return z30Collection;
            }

            /**
             * ����z30Collection���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Collection(String value) {
                this.z30Collection = value;
            }

            /**
             * ��ȡz30CallNoType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNoType() {
                return z30CallNoType;
            }

            /**
             * ����z30CallNoType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNoType(String value) {
                this.z30CallNoType = value;
            }

            /**
             * ��ȡz30CallNo���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo() {
                return z30CallNo;
            }

            /**
             * ����z30CallNo���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo(String value) {
                this.z30CallNo = value;
            }

            /**
             * ��ȡz30CallNoKey���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNoKey() {
                return z30CallNoKey;
            }

            /**
             * ����z30CallNoKey���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNoKey(String value) {
                this.z30CallNoKey = value;
            }

            /**
             * ��ȡz30CallNo2Type���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo2Type() {
                return z30CallNo2Type;
            }

            /**
             * ����z30CallNo2Type���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo2Type(String value) {
                this.z30CallNo2Type = value;
            }

            /**
             * ��ȡxxxTag���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getXxxTag() {
                return xxxTag;
            }

            /**
             * ����xxxTag���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXxxTag(String value) {
                this.xxxTag = value;
            }

            /**
             * ��ȡz30CallNo2Key���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30CallNo2Key() {
                return z30CallNo2Key;
            }

            /**
             * ����z30CallNo2Key���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30CallNo2Key(String value) {
                this.z30CallNo2Key = value;
            }

            /**
             * ��ȡz30Description���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Description() {
                return z30Description;
            }

            /**
             * ����z30Description���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Description(String value) {
                this.z30Description = value;
            }

            /**
             * ��ȡz30NoteOpac���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteOpac() {
                return z30NoteOpac;
            }

            /**
             * ����z30NoteOpac���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteOpac(String value) {
                this.z30NoteOpac = value;
            }

            /**
             * ��ȡz30NoteCirculation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteCirculation() {
                return z30NoteCirculation;
            }

            /**
             * ����z30NoteCirculation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteCirculation(String value) {
                this.z30NoteCirculation = value;
            }

            /**
             * ��ȡz30NoteInternal���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30NoteInternal() {
                return z30NoteInternal;
            }

            /**
             * ����z30NoteInternal���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30NoteInternal(String value) {
                this.z30NoteInternal = value;
            }

            /**
             * ��ȡz30OrderNumber���Ե�ֵ��
             */
            public int getZ30OrderNumber() {
                return z30OrderNumber;
            }

            /**
             * ����z30OrderNumber���Ե�ֵ��
             */
            public void setZ30OrderNumber(int value) {
                this.z30OrderNumber = value;
            }

            /**
             * ��ȡz30InventoryNumber���Ե�ֵ��
             */
            public long getZ30InventoryNumber() {
                return z30InventoryNumber;
            }

            /**
             * ����z30InventoryNumber���Ե�ֵ��
             */
            public void setZ30InventoryNumber(long value) {
                this.z30InventoryNumber = value;
            }

            /**
             * ��ȡz30InventoryNumberDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30InventoryNumberDate() {
                return z30InventoryNumberDate;
            }

            /**
             * ����z30InventoryNumberDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30InventoryNumberDate(String value) {
                this.z30InventoryNumberDate = value;
            }

            /**
             * ��ȡz30LastShelfReportDate���Ե�ֵ��
             */
            public byte getZ30LastShelfReportDate() {
                return z30LastShelfReportDate;
            }

            /**
             * ����z30LastShelfReportDate���Ե�ֵ��
             */
            public void setZ30LastShelfReportDate(byte value) {
                this.z30LastShelfReportDate = value;
            }

            /**
             * ��ȡz30Price���Ե�ֵ��
             */
            public float getZ30Price() {
                return z30Price;
            }

            /**
             * ����z30Price���Ե�ֵ��
             */
            public void setZ30Price(float value) {
                this.z30Price = value;
            }

            /**
             * ��ȡz30ShelfReportNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ShelfReportNumber() {
                return z30ShelfReportNumber;
            }

            /**
             * ����z30ShelfReportNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ShelfReportNumber(String value) {
                this.z30ShelfReportNumber = value;
            }

            /**
             * ��ȡz30OnShelfDate���Ե�ֵ��
             */
            public byte getZ30OnShelfDate() {
                return z30OnShelfDate;
            }

            /**
             * ����z30OnShelfDate���Ե�ֵ��
             */
            public void setZ30OnShelfDate(byte value) {
                this.z30OnShelfDate = value;
            }

            /**
             * ��ȡz30OnShelfSeq���Ե�ֵ��
             */
            public byte getZ30OnShelfSeq() {
                return z30OnShelfSeq;
            }

            /**
             * ����z30OnShelfSeq���Ե�ֵ��
             */
            public void setZ30OnShelfSeq(byte value) {
                this.z30OnShelfSeq = value;
            }

            /**
             * ��ȡz30DocNumber2���Ե�ֵ��
             */
            public byte getZ30DocNumber2() {
                return z30DocNumber2;
            }

            /**
             * ����z30DocNumber2���Ե�ֵ��
             */
            public void setZ30DocNumber2(byte value) {
                this.z30DocNumber2 = value;
            }

            /**
             * ��ȡz30ScheduleSequence2���Ե�ֵ��
             */
            public byte getZ30ScheduleSequence2() {
                return z30ScheduleSequence2;
            }

            /**
             * ����z30ScheduleSequence2���Ե�ֵ��
             */
            public void setZ30ScheduleSequence2(byte value) {
                this.z30ScheduleSequence2 = value;
            }

            /**
             * ��ȡz30CopySequence2���Ե�ֵ��
             */
            public byte getZ30CopySequence2() {
                return z30CopySequence2;
            }

            /**
             * ����z30CopySequence2���Ե�ֵ��
             */
            public void setZ30CopySequence2(byte value) {
                this.z30CopySequence2 = value;
            }

            /**
             * ��ȡz30VendorCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30VendorCode() {
                return z30VendorCode;
            }

            /**
             * ����z30VendorCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30VendorCode(String value) {
                this.z30VendorCode = value;
            }

            /**
             * ��ȡz30InvoiceNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30InvoiceNumber() {
                return z30InvoiceNumber;
            }

            /**
             * ����z30InvoiceNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30InvoiceNumber(String value) {
                this.z30InvoiceNumber = value;
            }

            /**
             * ��ȡz30LineNumber���Ե�ֵ��
             */
            public byte getZ30LineNumber() {
                return z30LineNumber;
            }

            /**
             * ����z30LineNumber���Ե�ֵ��
             */
            public void setZ30LineNumber(byte value) {
                this.z30LineNumber = value;
            }

            /**
             * ��ȡz30Pages���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30Pages() {
                return z30Pages;
            }

            /**
             * ����z30Pages���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30Pages(String value) {
                this.z30Pages = value;
            }

            /**
             * ��ȡz30IssueDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30IssueDate() {
                return z30IssueDate;
            }

            /**
             * ����z30IssueDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30IssueDate(String value) {
                this.z30IssueDate = value;
            }

            /**
             * ��ȡz30ExpectedArrivalDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ExpectedArrivalDate() {
                return z30ExpectedArrivalDate;
            }

            /**
             * ����z30ExpectedArrivalDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ExpectedArrivalDate(String value) {
                this.z30ExpectedArrivalDate = value;
            }

            /**
             * ��ȡz30ArrivalDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ArrivalDate() {
                return z30ArrivalDate;
            }

            /**
             * ����z30ArrivalDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ArrivalDate(String value) {
                this.z30ArrivalDate = value;
            }

            /**
             * ��ȡz30ItemStatistic���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemStatistic() {
                return z30ItemStatistic;
            }

            /**
             * ����z30ItemStatistic���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemStatistic(String value) {
                this.z30ItemStatistic = value;
            }

            /**
             * ��ȡz30ItemProcessStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ItemProcessStatus() {
                return z30ItemProcessStatus;
            }

            /**
             * ����z30ItemProcessStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ItemProcessStatus(String value) {
                this.z30ItemProcessStatus = value;
            }

            /**
             * ��ȡz30CopyId���Ե�ֵ��
             */
            public byte getZ30CopyId() {
                return z30CopyId;
            }

            /**
             * ����z30CopyId���Ե�ֵ��
             */
            public void setZ30CopyId(byte value) {
                this.z30CopyId = value;
            }

            /**
             * ��ȡz30HolDocNumber���Ե�ֵ��
             */
            public int getZ30HolDocNumber() {
                return z30HolDocNumber;
            }

            /**
             * ����z30HolDocNumber���Ե�ֵ��
             */
            public void setZ30HolDocNumber(int value) {
                this.z30HolDocNumber = value;
            }

            /**
             * ��ȡz30TempLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30TempLocation() {
                return z30TempLocation;
            }

            /**
             * ����z30TempLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30TempLocation(String value) {
                this.z30TempLocation = value;
            }

            /**
             * ��ȡz30EnumerationA���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationA() {
                return z30EnumerationA;
            }

            /**
             * ����z30EnumerationA���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationA(String value) {
                this.z30EnumerationA = value;
            }

            /**
             * ��ȡz30EnumerationB���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationB() {
                return z30EnumerationB;
            }

            /**
             * ����z30EnumerationB���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationB(String value) {
                this.z30EnumerationB = value;
            }

            /**
             * ��ȡz30EnumerationC���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationC() {
                return z30EnumerationC;
            }

            /**
             * ����z30EnumerationC���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationC(String value) {
                this.z30EnumerationC = value;
            }

            /**
             * ��ȡz30EnumerationD���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationD() {
                return z30EnumerationD;
            }

            /**
             * ����z30EnumerationD���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationD(String value) {
                this.z30EnumerationD = value;
            }

            /**
             * ��ȡz30EnumerationE���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationE() {
                return z30EnumerationE;
            }

            /**
             * ����z30EnumerationE���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationE(String value) {
                this.z30EnumerationE = value;
            }

            /**
             * ��ȡz30EnumerationF���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationF() {
                return z30EnumerationF;
            }

            /**
             * ����z30EnumerationF���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationF(String value) {
                this.z30EnumerationF = value;
            }

            /**
             * ��ȡz30EnumerationG���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationG() {
                return z30EnumerationG;
            }

            /**
             * ����z30EnumerationG���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationG(String value) {
                this.z30EnumerationG = value;
            }

            /**
             * ��ȡz30EnumerationH���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30EnumerationH() {
                return z30EnumerationH;
            }

            /**
             * ����z30EnumerationH���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30EnumerationH(String value) {
                this.z30EnumerationH = value;
            }

            /**
             * ��ȡz30ChronologicalI���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalI() {
                return z30ChronologicalI;
            }

            /**
             * ����z30ChronologicalI���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalI(String value) {
                this.z30ChronologicalI = value;
            }

            /**
             * ��ȡz30ChronologicalJ���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalJ() {
                return z30ChronologicalJ;
            }

            /**
             * ����z30ChronologicalJ���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalJ(String value) {
                this.z30ChronologicalJ = value;
            }

            /**
             * ��ȡz30ChronologicalK���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalK() {
                return z30ChronologicalK;
            }

            /**
             * ����z30ChronologicalK���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalK(String value) {
                this.z30ChronologicalK = value;
            }

            /**
             * ��ȡz30ChronologicalL���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalL() {
                return z30ChronologicalL;
            }

            /**
             * ����z30ChronologicalL���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalL(String value) {
                this.z30ChronologicalL = value;
            }

            /**
             * ��ȡz30ChronologicalM���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30ChronologicalM() {
                return z30ChronologicalM;
            }

            /**
             * ����z30ChronologicalM���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30ChronologicalM(String value) {
                this.z30ChronologicalM = value;
            }

            /**
             * ��ȡz30SuppIndexO���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30SuppIndexO() {
                return z30SuppIndexO;
            }

            /**
             * ����z30SuppIndexO���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30SuppIndexO(String value) {
                this.z30SuppIndexO = value;
            }

            /**
             * ��ȡz3085XType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ3085XType() {
                return z3085XType;
            }

            /**
             * ����z3085XType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ3085XType(String value) {
                this.z3085XType = value;
            }

            /**
             * ��ȡz30DepositoryId���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30DepositoryId() {
                return z30DepositoryId;
            }

            /**
             * ����z30DepositoryId���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30DepositoryId(String value) {
                this.z30DepositoryId = value;
            }

            /**
             * ��ȡz30LinkingNumber���Ե�ֵ��
             */
            public byte getZ30LinkingNumber() {
                return z30LinkingNumber;
            }

            /**
             * ����z30LinkingNumber���Ե�ֵ��
             */
            public void setZ30LinkingNumber(byte value) {
                this.z30LinkingNumber = value;
            }

            /**
             * ��ȡz30GapIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ30GapIndicator() {
                return z30GapIndicator;
            }

            /**
             * ����z30GapIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ30GapIndicator(String value) {
                this.z30GapIndicator = value;
            }

            /**
             * ��ȡz30MaintenanceCount���Ե�ֵ��
             */
            public byte getZ30MaintenanceCount() {
                return z30MaintenanceCount;
            }

            /**
             * ����z30MaintenanceCount���Ե�ֵ��
             */
            public void setZ30MaintenanceCount(byte value) {
                this.z30MaintenanceCount = value;
            }

            /**
             * ��ȡz30ProcessStatusDate���Ե�ֵ��
             */
            public int getZ30ProcessStatusDate() {
                return z30ProcessStatusDate;
            }

            /**
             * ����z30ProcessStatusDate���Ե�ֵ��
             */
            public void setZ30ProcessStatusDate(int value) {
                this.z30ProcessStatusDate = value;
            }

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
         *         &lt;element name="z36-doc-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z36-item-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-number" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="z36-material" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-loan-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-loan-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-effective-due-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-due-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-returned-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-returned-hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-item-status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-bor-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-letter-number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-letter-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-no-renewal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-note-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-note-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-loan-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-loan-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-return-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-return-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-renew-cataloger-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-renew-cataloger-ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-renew-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-bor-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="z36-note-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-recall-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-recall-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-last-renew-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-original-due-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-process-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-loan-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-proxy-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-recall-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-return-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-return-sub-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-source" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-delivery-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="z36-tail-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "z36DocNumber",
                "z36ItemSequence",
                "z36Number",
                "z36Material",
                "z36SubLibrary",
                "z36Status",
                "z36LoanDate",
                "z36LoanHour",
                "z36EffectiveDueDate",
                "z36DueDate",
                "z36DueHour",
                "z36ReturnedDate",
                "z36ReturnedHour",
                "z36ItemStatus",
                "z36BorStatus",
                "z36LetterNumber",
                "z36LetterDate",
                "z36NoRenewal",
                "z36Note1",
                "z36Note2",
                "z36LoanCatalogerName",
                "z36LoanCatalogerIp",
                "z36ReturnCatalogerName",
                "z36ReturnCatalogerIp",
                "z36RenewCatalogerName",
                "z36RenewCatalogerIp",
                "z36RenewMode",
                "z36BorType",
                "z36NoteAlpha",
                "z36RecallDate",
                "z36RecallDueDate",
                "z36LastRenewDate",
                "z36OriginalDueDate",
                "z36ProcessStatus",
                "z36LoanType",
                "z36ProxyId",
                "z36RecallType",
                "z36ReturnLocation",
                "z36ReturnSubLocation",
                "z36Source",
                "z36DeliveryTime",
                "z36TailTime"
        })
        public static class Z36 {

            @XmlElement(name = "z36-doc-number")
            protected int z36DocNumber;
            @XmlElement(name = "z36-item-sequence")
            protected byte z36ItemSequence;
            @XmlElement(name = "z36-number")
            protected int z36Number;
            @XmlElement(name = "z36-material", required = true)
            protected String z36Material;
            @XmlElement(name = "z36-sub-library", required = true)
            protected String z36SubLibrary;
            @XmlElement(name = "z36-status", required = true)
            protected String z36Status;
            @XmlElement(name = "z36-loan-date", required = true)
            protected String z36LoanDate;
            @XmlElement(name = "z36-loan-hour", required = true)
            protected String z36LoanHour;
            @XmlElement(name = "z36-effective-due-date")
            protected byte z36EffectiveDueDate;
            @XmlElement(name = "z36-due-date", required = true)
            protected String z36DueDate;
            @XmlElement(name = "z36-due-hour", required = true)
            protected String z36DueHour;
            @XmlElement(name = "z36-returned-date", required = true)
            protected String z36ReturnedDate;
            @XmlElement(name = "z36-returned-hour", required = true)
            protected String z36ReturnedHour;
            @XmlElement(name = "z36-item-status")
            protected byte z36ItemStatus;
            @XmlElement(name = "z36-bor-status", required = true)
            protected String z36BorStatus;
            @XmlElement(name = "z36-letter-number")
            protected byte z36LetterNumber;
            @XmlElement(name = "z36-letter-date", required = true)
            protected String z36LetterDate;
            @XmlElement(name = "z36-no-renewal")
            protected byte z36NoRenewal;
            @XmlElement(name = "z36-note-1", required = true)
            protected String z36Note1;
            @XmlElement(name = "z36-note-2", required = true)
            protected String z36Note2;
            @XmlElement(name = "z36-loan-cataloger-name", required = true)
            protected String z36LoanCatalogerName;
            @XmlElement(name = "z36-loan-cataloger-ip", required = true)
            protected String z36LoanCatalogerIp;
            @XmlElement(name = "z36-return-cataloger-name", required = true)
            protected String z36ReturnCatalogerName;
            @XmlElement(name = "z36-return-cataloger-ip", required = true)
            protected String z36ReturnCatalogerIp;
            @XmlElement(name = "z36-renew-cataloger-name", required = true)
            protected String z36RenewCatalogerName;
            @XmlElement(name = "z36-renew-cataloger-ip", required = true)
            protected String z36RenewCatalogerIp;
            @XmlElement(name = "z36-renew-mode", required = true)
            protected String z36RenewMode;
            @XmlElement(name = "z36-bor-type")
            protected byte z36BorType;
            @XmlElement(name = "z36-note-alpha", required = true)
            protected String z36NoteAlpha;
            @XmlElement(name = "z36-recall-date", required = true)
            protected String z36RecallDate;
            @XmlElement(name = "z36-recall-due-date", required = true)
            protected String z36RecallDueDate;
            @XmlElement(name = "z36-last-renew-date", required = true)
            protected String z36LastRenewDate;
            @XmlElement(name = "z36-original-due-date", required = true)
            protected String z36OriginalDueDate;
            @XmlElement(name = "z36-process-status", required = true)
            protected String z36ProcessStatus;
            @XmlElement(name = "z36-loan-type", required = true)
            protected String z36LoanType;
            @XmlElement(name = "z36-proxy-id", required = true)
            protected String z36ProxyId;
            @XmlElement(name = "z36-recall-type", required = true)
            protected String z36RecallType;
            @XmlElement(name = "z36-return-location", required = true)
            protected String z36ReturnLocation;
            @XmlElement(name = "z36-return-sub-location", required = true)
            protected String z36ReturnSubLocation;
            @XmlElement(name = "z36-source", required = true)
            protected String z36Source;
            @XmlElement(name = "z36-delivery-time", required = true)
            protected String z36DeliveryTime;
            @XmlElement(name = "z36-tail-time", required = true)
            protected String z36TailTime;

            /**
             * ��ȡz36DocNumber���Ե�ֵ��
             */
            public int getZ36DocNumber() {
                return z36DocNumber;
            }

            /**
             * ����z36DocNumber���Ե�ֵ��
             */
            public void setZ36DocNumber(int value) {
                this.z36DocNumber = value;
            }

            /**
             * ��ȡz36ItemSequence���Ե�ֵ��
             */
            public byte getZ36ItemSequence() {
                return z36ItemSequence;
            }

            /**
             * ����z36ItemSequence���Ե�ֵ��
             */
            public void setZ36ItemSequence(byte value) {
                this.z36ItemSequence = value;
            }

            /**
             * ��ȡz36Number���Ե�ֵ��
             */
            public int getZ36Number() {
                return z36Number;
            }

            /**
             * ����z36Number���Ե�ֵ��
             */
            public void setZ36Number(int value) {
                this.z36Number = value;
            }

            /**
             * ��ȡz36Material���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36Material() {
                return z36Material;
            }

            /**
             * ����z36Material���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36Material(String value) {
                this.z36Material = value;
            }

            /**
             * ��ȡz36SubLibrary���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36SubLibrary() {
                return z36SubLibrary;
            }

            /**
             * ����z36SubLibrary���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36SubLibrary(String value) {
                this.z36SubLibrary = value;
            }

            /**
             * ��ȡz36Status���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36Status() {
                return z36Status;
            }

            /**
             * ����z36Status���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36Status(String value) {
                this.z36Status = value;
            }

            /**
             * ��ȡz36LoanDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LoanDate() {
                return z36LoanDate;
            }

            /**
             * ����z36LoanDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LoanDate(String value) {
                this.z36LoanDate = value;
            }

            /**
             * ��ȡz36LoanHour���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LoanHour() {
                return z36LoanHour;
            }

            /**
             * ����z36LoanHour���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LoanHour(String value) {
                this.z36LoanHour = value;
            }

            /**
             * ��ȡz36EffectiveDueDate���Ե�ֵ��
             */
            public byte getZ36EffectiveDueDate() {
                return z36EffectiveDueDate;
            }

            /**
             * ����z36EffectiveDueDate���Ե�ֵ��
             */
            public void setZ36EffectiveDueDate(byte value) {
                this.z36EffectiveDueDate = value;
            }

            /**
             * ��ȡz36DueDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36DueDate() {
                return z36DueDate;
            }

            /**
             * ����z36DueDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36DueDate(String value) {
                this.z36DueDate = value;
            }

            /**
             * ��ȡz36DueHour���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36DueHour() {
                return z36DueHour;
            }

            /**
             * ����z36DueHour���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36DueHour(String value) {
                this.z36DueHour = value;
            }

            /**
             * ��ȡz36ReturnedDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnedDate() {
                return z36ReturnedDate;
            }

            /**
             * ����z36ReturnedDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnedDate(String value) {
                this.z36ReturnedDate = value;
            }

            /**
             * ��ȡz36ReturnedHour���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnedHour() {
                return z36ReturnedHour;
            }

            /**
             * ����z36ReturnedHour���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnedHour(String value) {
                this.z36ReturnedHour = value;
            }

            /**
             * ��ȡz36ItemStatus���Ե�ֵ��
             */
            public byte getZ36ItemStatus() {
                return z36ItemStatus;
            }

            /**
             * ����z36ItemStatus���Ե�ֵ��
             */
            public void setZ36ItemStatus(byte value) {
                this.z36ItemStatus = value;
            }

            /**
             * ��ȡz36BorStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36BorStatus() {
                return z36BorStatus;
            }

            /**
             * ����z36BorStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36BorStatus(String value) {
                this.z36BorStatus = value;
            }

            /**
             * ��ȡz36LetterNumber���Ե�ֵ��
             */
            public byte getZ36LetterNumber() {
                return z36LetterNumber;
            }

            /**
             * ����z36LetterNumber���Ե�ֵ��
             */
            public void setZ36LetterNumber(byte value) {
                this.z36LetterNumber = value;
            }

            /**
             * ��ȡz36LetterDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LetterDate() {
                return z36LetterDate;
            }

            /**
             * ����z36LetterDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LetterDate(String value) {
                this.z36LetterDate = value;
            }

            /**
             * ��ȡz36NoRenewal���Ե�ֵ��
             */
            public byte getZ36NoRenewal() {
                return z36NoRenewal;
            }

            /**
             * ����z36NoRenewal���Ե�ֵ��
             */
            public void setZ36NoRenewal(byte value) {
                this.z36NoRenewal = value;
            }

            /**
             * ��ȡz36Note1���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36Note1() {
                return z36Note1;
            }

            /**
             * ����z36Note1���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36Note1(String value) {
                this.z36Note1 = value;
            }

            /**
             * ��ȡz36Note2���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36Note2() {
                return z36Note2;
            }

            /**
             * ����z36Note2���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36Note2(String value) {
                this.z36Note2 = value;
            }

            /**
             * ��ȡz36LoanCatalogerName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LoanCatalogerName() {
                return z36LoanCatalogerName;
            }

            /**
             * ����z36LoanCatalogerName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LoanCatalogerName(String value) {
                this.z36LoanCatalogerName = value;
            }

            /**
             * ��ȡz36LoanCatalogerIp���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LoanCatalogerIp() {
                return z36LoanCatalogerIp;
            }

            /**
             * ����z36LoanCatalogerIp���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LoanCatalogerIp(String value) {
                this.z36LoanCatalogerIp = value;
            }

            /**
             * ��ȡz36ReturnCatalogerName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnCatalogerName() {
                return z36ReturnCatalogerName;
            }

            /**
             * ����z36ReturnCatalogerName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnCatalogerName(String value) {
                this.z36ReturnCatalogerName = value;
            }

            /**
             * ��ȡz36ReturnCatalogerIp���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnCatalogerIp() {
                return z36ReturnCatalogerIp;
            }

            /**
             * ����z36ReturnCatalogerIp���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnCatalogerIp(String value) {
                this.z36ReturnCatalogerIp = value;
            }

            /**
             * ��ȡz36RenewCatalogerName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RenewCatalogerName() {
                return z36RenewCatalogerName;
            }

            /**
             * ����z36RenewCatalogerName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RenewCatalogerName(String value) {
                this.z36RenewCatalogerName = value;
            }

            /**
             * ��ȡz36RenewCatalogerIp���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RenewCatalogerIp() {
                return z36RenewCatalogerIp;
            }

            /**
             * ����z36RenewCatalogerIp���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RenewCatalogerIp(String value) {
                this.z36RenewCatalogerIp = value;
            }

            /**
             * ��ȡz36RenewMode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RenewMode() {
                return z36RenewMode;
            }

            /**
             * ����z36RenewMode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RenewMode(String value) {
                this.z36RenewMode = value;
            }

            /**
             * ��ȡz36BorType���Ե�ֵ��
             */
            public byte getZ36BorType() {
                return z36BorType;
            }

            /**
             * ����z36BorType���Ե�ֵ��
             */
            public void setZ36BorType(byte value) {
                this.z36BorType = value;
            }

            /**
             * ��ȡz36NoteAlpha���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36NoteAlpha() {
                return z36NoteAlpha;
            }

            /**
             * ����z36NoteAlpha���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36NoteAlpha(String value) {
                this.z36NoteAlpha = value;
            }

            /**
             * ��ȡz36RecallDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RecallDate() {
                return z36RecallDate;
            }

            /**
             * ����z36RecallDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RecallDate(String value) {
                this.z36RecallDate = value;
            }

            /**
             * ��ȡz36RecallDueDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RecallDueDate() {
                return z36RecallDueDate;
            }

            /**
             * ����z36RecallDueDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RecallDueDate(String value) {
                this.z36RecallDueDate = value;
            }

            /**
             * ��ȡz36LastRenewDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LastRenewDate() {
                return z36LastRenewDate;
            }

            /**
             * ����z36LastRenewDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LastRenewDate(String value) {
                this.z36LastRenewDate = value;
            }

            /**
             * ��ȡz36OriginalDueDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36OriginalDueDate() {
                return z36OriginalDueDate;
            }

            /**
             * ����z36OriginalDueDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36OriginalDueDate(String value) {
                this.z36OriginalDueDate = value;
            }

            /**
             * ��ȡz36ProcessStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ProcessStatus() {
                return z36ProcessStatus;
            }

            /**
             * ����z36ProcessStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ProcessStatus(String value) {
                this.z36ProcessStatus = value;
            }

            /**
             * ��ȡz36LoanType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36LoanType() {
                return z36LoanType;
            }

            /**
             * ����z36LoanType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36LoanType(String value) {
                this.z36LoanType = value;
            }

            /**
             * ��ȡz36ProxyId���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ProxyId() {
                return z36ProxyId;
            }

            /**
             * ����z36ProxyId���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ProxyId(String value) {
                this.z36ProxyId = value;
            }

            /**
             * ��ȡz36RecallType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36RecallType() {
                return z36RecallType;
            }

            /**
             * ����z36RecallType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36RecallType(String value) {
                this.z36RecallType = value;
            }

            /**
             * ��ȡz36ReturnLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnLocation() {
                return z36ReturnLocation;
            }

            /**
             * ����z36ReturnLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnLocation(String value) {
                this.z36ReturnLocation = value;
            }

            /**
             * ��ȡz36ReturnSubLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36ReturnSubLocation() {
                return z36ReturnSubLocation;
            }

            /**
             * ����z36ReturnSubLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36ReturnSubLocation(String value) {
                this.z36ReturnSubLocation = value;
            }

            /**
             * ��ȡz36Source���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36Source() {
                return z36Source;
            }

            /**
             * ����z36Source���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36Source(String value) {
                this.z36Source = value;
            }

            /**
             * ��ȡz36DeliveryTime���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36DeliveryTime() {
                return z36DeliveryTime;
            }

            /**
             * ����z36DeliveryTime���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36DeliveryTime(String value) {
                this.z36DeliveryTime = value;
            }

            /**
             * ��ȡz36TailTime���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getZ36TailTime() {
                return z36TailTime;
            }

            /**
             * ����z36TailTime���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setZ36TailTime(String value) {
                this.z36TailTime = value;
            }

        }

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
     *         &lt;element name="z303-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-proxy-for-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-primary-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-name-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-user-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-user-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-con-lng" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-alpha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-1" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-n-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-1-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-1-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-n-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-2-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-2-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-3" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-n-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-delinq-3-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-delinq-3-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-budget" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-profile-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-ill-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-home-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-field-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-field-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-field-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-note-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-note-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-salutation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-ill-total-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-ill-active-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-dispatch-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-birth-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-export-consent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-proxy-id-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-send-all-letters" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-plain-html" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-want-sms" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-plif-modification" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-title-req-limit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z303-gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z303-birthplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "z303Id",
            "z303ProxyForId",
            "z303PrimaryId",
            "z303NameKey",
            "z303UserType",
            "z303UserLibrary",
            "z303OpenDate",
            "z303UpdateDate",
            "z303ConLng",
            "z303Alpha",
            "z303Name",
            "z303Title",
            "z303Delinq1",
            "z303DelinqN1",
            "z303Delinq1UpdateDate",
            "z303Delinq1CatName",
            "z303Delinq2",
            "z303DelinqN2",
            "z303Delinq2UpdateDate",
            "z303Delinq2CatName",
            "z303Delinq3",
            "z303DelinqN3",
            "z303Delinq3UpdateDate",
            "z303Delinq3CatName",
            "z303Budget",
            "z303ProfileId",
            "z303IllLibrary",
            "z303HomeLibrary",
            "z303Field1",
            "z303Field2",
            "z303Field3",
            "z303Note1",
            "z303Note2",
            "z303Salutation",
            "z303IllTotalLimit",
            "z303IllActiveLimit",
            "z303DispatchLibrary",
            "z303BirthDate",
            "z303ExportConsent",
            "z303ProxyIdType",
            "z303SendAllLetters",
            "z303PlainHtml",
            "z303WantSms",
            "z303PlifModification",
            "z303TitleReqLimit",
            "z303Gender",
            "z303Birthplace"
    })
    public static class Z303 {

        @XmlElement(name = "z303-id", required = true)
        protected String z303Id;
        @XmlElement(name = "z303-proxy-for-id", required = true)
        protected String z303ProxyForId;
        @XmlElement(name = "z303-primary-id", required = true)
        protected String z303PrimaryId;
        @XmlElement(name = "z303-name-key", required = true)
        protected String z303NameKey;
        @XmlElement(name = "z303-user-type", required = true)
        protected String z303UserType;
        @XmlElement(name = "z303-user-library", required = true)
        protected String z303UserLibrary;
        @XmlElement(name = "z303-open-date", required = true)
        protected String z303OpenDate;
        @XmlElement(name = "z303-update-date", required = true)
        protected String z303UpdateDate;
        @XmlElement(name = "z303-con-lng", required = true)
        protected String z303ConLng;
        @XmlElement(name = "z303-alpha", required = true)
        protected String z303Alpha;
        @XmlElement(name = "z303-name", required = true)
        protected String z303Name;
        @XmlElement(name = "z303-title", required = true)
        protected String z303Title;
        @XmlElement(name = "z303-delinq-1")
        protected byte z303Delinq1;
        @XmlElement(name = "z303-delinq-n-1", required = true)
        protected String z303DelinqN1;
        @XmlElement(name = "z303-delinq-1-update-date")
        protected byte z303Delinq1UpdateDate;
        @XmlElement(name = "z303-delinq-1-cat-name", required = true)
        protected String z303Delinq1CatName;
        @XmlElement(name = "z303-delinq-2")
        protected byte z303Delinq2;
        @XmlElement(name = "z303-delinq-n-2", required = true)
        protected String z303DelinqN2;
        @XmlElement(name = "z303-delinq-2-update-date")
        protected byte z303Delinq2UpdateDate;
        @XmlElement(name = "z303-delinq-2-cat-name", required = true)
        protected String z303Delinq2CatName;
        @XmlElement(name = "z303-delinq-3")
        protected byte z303Delinq3;
        @XmlElement(name = "z303-delinq-n-3", required = true)
        protected String z303DelinqN3;
        @XmlElement(name = "z303-delinq-3-update-date")
        protected byte z303Delinq3UpdateDate;
        @XmlElement(name = "z303-delinq-3-cat-name", required = true)
        protected String z303Delinq3CatName;
        @XmlElement(name = "z303-budget", required = true)
        protected String z303Budget;
        @XmlElement(name = "z303-profile-id", required = true)
        protected String z303ProfileId;
        @XmlElement(name = "z303-ill-library", required = true)
        protected String z303IllLibrary;
        @XmlElement(name = "z303-home-library", required = true)
        protected String z303HomeLibrary;
        @XmlElement(name = "z303-field-1", required = true)
        protected String z303Field1;
        @XmlElement(name = "z303-field-2", required = true)
        protected String z303Field2;
        @XmlElement(name = "z303-field-3", required = true)
        protected String z303Field3;
        @XmlElement(name = "z303-note-1", required = true)
        protected String z303Note1;
        @XmlElement(name = "z303-note-2", required = true)
        protected String z303Note2;
        @XmlElement(name = "z303-salutation", required = true)
        protected String z303Salutation;
        @XmlElement(name = "z303-ill-total-limit")
        protected byte z303IllTotalLimit;
        @XmlElement(name = "z303-ill-active-limit")
        protected byte z303IllActiveLimit;
        @XmlElement(name = "z303-dispatch-library", required = true)
        protected String z303DispatchLibrary;
        @XmlElement(name = "z303-birth-date", required = true)
        protected String z303BirthDate;
        @XmlElement(name = "z303-export-consent", required = true)
        protected String z303ExportConsent;
        @XmlElement(name = "z303-proxy-id-type")
        protected byte z303ProxyIdType;
        @XmlElement(name = "z303-send-all-letters", required = true)
        protected String z303SendAllLetters;
        @XmlElement(name = "z303-plain-html", required = true)
        protected String z303PlainHtml;
        @XmlElement(name = "z303-want-sms", required = true)
        protected String z303WantSms;
        @XmlElement(name = "z303-plif-modification", required = true)
        protected String z303PlifModification;
        @XmlElement(name = "z303-title-req-limit")
        protected byte z303TitleReqLimit;
        @XmlElement(name = "z303-gender", required = true)
        protected String z303Gender;
        @XmlElement(name = "z303-birthplace", required = true)
        protected String z303Birthplace;

        /**
         * ��ȡz303Id���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Id() {
            return z303Id;
        }

        /**
         * ����z303Id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Id(String value) {
            this.z303Id = value;
        }

        /**
         * ��ȡz303ProxyForId���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303ProxyForId() {
            return z303ProxyForId;
        }

        /**
         * ����z303ProxyForId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303ProxyForId(String value) {
            this.z303ProxyForId = value;
        }

        /**
         * ��ȡz303PrimaryId���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303PrimaryId() {
            return z303PrimaryId;
        }

        /**
         * ����z303PrimaryId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303PrimaryId(String value) {
            this.z303PrimaryId = value;
        }

        /**
         * ��ȡz303NameKey���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303NameKey() {
            return z303NameKey;
        }

        /**
         * ����z303NameKey���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303NameKey(String value) {
            this.z303NameKey = value;
        }

        /**
         * ��ȡz303UserType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303UserType() {
            return z303UserType;
        }

        /**
         * ����z303UserType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303UserType(String value) {
            this.z303UserType = value;
        }

        /**
         * ��ȡz303UserLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303UserLibrary() {
            return z303UserLibrary;
        }

        /**
         * ����z303UserLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303UserLibrary(String value) {
            this.z303UserLibrary = value;
        }

        /**
         * ��ȡz303OpenDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303OpenDate() {
            return z303OpenDate;
        }

        /**
         * ����z303OpenDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303OpenDate(String value) {
            this.z303OpenDate = value;
        }

        /**
         * ��ȡz303UpdateDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303UpdateDate() {
            return z303UpdateDate;
        }

        /**
         * ����z303UpdateDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303UpdateDate(String value) {
            this.z303UpdateDate = value;
        }

        /**
         * ��ȡz303ConLng���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303ConLng() {
            return z303ConLng;
        }

        /**
         * ����z303ConLng���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303ConLng(String value) {
            this.z303ConLng = value;
        }

        /**
         * ��ȡz303Alpha���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Alpha() {
            return z303Alpha;
        }

        /**
         * ����z303Alpha���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Alpha(String value) {
            this.z303Alpha = value;
        }

        /**
         * ��ȡz303Name���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Name() {
            return z303Name;
        }

        /**
         * ����z303Name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Name(String value) {
            this.z303Name = value;
        }

        /**
         * ��ȡz303Title���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Title() {
            return z303Title;
        }

        /**
         * ����z303Title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Title(String value) {
            this.z303Title = value;
        }

        /**
         * ��ȡz303Delinq1���Ե�ֵ��
         */
        public byte getZ303Delinq1() {
            return z303Delinq1;
        }

        /**
         * ����z303Delinq1���Ե�ֵ��
         */
        public void setZ303Delinq1(byte value) {
            this.z303Delinq1 = value;
        }

        /**
         * ��ȡz303DelinqN1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303DelinqN1() {
            return z303DelinqN1;
        }

        /**
         * ����z303DelinqN1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303DelinqN1(String value) {
            this.z303DelinqN1 = value;
        }

        /**
         * ��ȡz303Delinq1UpdateDate���Ե�ֵ��
         */
        public byte getZ303Delinq1UpdateDate() {
            return z303Delinq1UpdateDate;
        }

        /**
         * ����z303Delinq1UpdateDate���Ե�ֵ��
         */
        public void setZ303Delinq1UpdateDate(byte value) {
            this.z303Delinq1UpdateDate = value;
        }

        /**
         * ��ȡz303Delinq1CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Delinq1CatName() {
            return z303Delinq1CatName;
        }

        /**
         * ����z303Delinq1CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Delinq1CatName(String value) {
            this.z303Delinq1CatName = value;
        }

        /**
         * ��ȡz303Delinq2���Ե�ֵ��
         */
        public byte getZ303Delinq2() {
            return z303Delinq2;
        }

        /**
         * ����z303Delinq2���Ե�ֵ��
         */
        public void setZ303Delinq2(byte value) {
            this.z303Delinq2 = value;
        }

        /**
         * ��ȡz303DelinqN2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303DelinqN2() {
            return z303DelinqN2;
        }

        /**
         * ����z303DelinqN2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303DelinqN2(String value) {
            this.z303DelinqN2 = value;
        }

        /**
         * ��ȡz303Delinq2UpdateDate���Ե�ֵ��
         */
        public byte getZ303Delinq2UpdateDate() {
            return z303Delinq2UpdateDate;
        }

        /**
         * ����z303Delinq2UpdateDate���Ե�ֵ��
         */
        public void setZ303Delinq2UpdateDate(byte value) {
            this.z303Delinq2UpdateDate = value;
        }

        /**
         * ��ȡz303Delinq2CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Delinq2CatName() {
            return z303Delinq2CatName;
        }

        /**
         * ����z303Delinq2CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Delinq2CatName(String value) {
            this.z303Delinq2CatName = value;
        }

        /**
         * ��ȡz303Delinq3���Ե�ֵ��
         */
        public byte getZ303Delinq3() {
            return z303Delinq3;
        }

        /**
         * ����z303Delinq3���Ե�ֵ��
         */
        public void setZ303Delinq3(byte value) {
            this.z303Delinq3 = value;
        }

        /**
         * ��ȡz303DelinqN3���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303DelinqN3() {
            return z303DelinqN3;
        }

        /**
         * ����z303DelinqN3���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303DelinqN3(String value) {
            this.z303DelinqN3 = value;
        }

        /**
         * ��ȡz303Delinq3UpdateDate���Ե�ֵ��
         */
        public byte getZ303Delinq3UpdateDate() {
            return z303Delinq3UpdateDate;
        }

        /**
         * ����z303Delinq3UpdateDate���Ե�ֵ��
         */
        public void setZ303Delinq3UpdateDate(byte value) {
            this.z303Delinq3UpdateDate = value;
        }

        /**
         * ��ȡz303Delinq3CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Delinq3CatName() {
            return z303Delinq3CatName;
        }

        /**
         * ����z303Delinq3CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Delinq3CatName(String value) {
            this.z303Delinq3CatName = value;
        }

        /**
         * ��ȡz303Budget���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Budget() {
            return z303Budget;
        }

        /**
         * ����z303Budget���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Budget(String value) {
            this.z303Budget = value;
        }

        /**
         * ��ȡz303ProfileId���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303ProfileId() {
            return z303ProfileId;
        }

        /**
         * ����z303ProfileId���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303ProfileId(String value) {
            this.z303ProfileId = value;
        }

        /**
         * ��ȡz303IllLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303IllLibrary() {
            return z303IllLibrary;
        }

        /**
         * ����z303IllLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303IllLibrary(String value) {
            this.z303IllLibrary = value;
        }

        /**
         * ��ȡz303HomeLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303HomeLibrary() {
            return z303HomeLibrary;
        }

        /**
         * ����z303HomeLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303HomeLibrary(String value) {
            this.z303HomeLibrary = value;
        }

        /**
         * ��ȡz303Field1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Field1() {
            return z303Field1;
        }

        /**
         * ����z303Field1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Field1(String value) {
            this.z303Field1 = value;
        }

        /**
         * ��ȡz303Field2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Field2() {
            return z303Field2;
        }

        /**
         * ����z303Field2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Field2(String value) {
            this.z303Field2 = value;
        }

        /**
         * ��ȡz303Field3���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Field3() {
            return z303Field3;
        }

        /**
         * ����z303Field3���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Field3(String value) {
            this.z303Field3 = value;
        }

        /**
         * ��ȡz303Note1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Note1() {
            return z303Note1;
        }

        /**
         * ����z303Note1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Note1(String value) {
            this.z303Note1 = value;
        }

        /**
         * ��ȡz303Note2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Note2() {
            return z303Note2;
        }

        /**
         * ����z303Note2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Note2(String value) {
            this.z303Note2 = value;
        }

        /**
         * ��ȡz303Salutation���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Salutation() {
            return z303Salutation;
        }

        /**
         * ����z303Salutation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Salutation(String value) {
            this.z303Salutation = value;
        }

        /**
         * ��ȡz303IllTotalLimit���Ե�ֵ��
         */
        public byte getZ303IllTotalLimit() {
            return z303IllTotalLimit;
        }

        /**
         * ����z303IllTotalLimit���Ե�ֵ��
         */
        public void setZ303IllTotalLimit(byte value) {
            this.z303IllTotalLimit = value;
        }

        /**
         * ��ȡz303IllActiveLimit���Ե�ֵ��
         */
        public byte getZ303IllActiveLimit() {
            return z303IllActiveLimit;
        }

        /**
         * ����z303IllActiveLimit���Ե�ֵ��
         */
        public void setZ303IllActiveLimit(byte value) {
            this.z303IllActiveLimit = value;
        }

        /**
         * ��ȡz303DispatchLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303DispatchLibrary() {
            return z303DispatchLibrary;
        }

        /**
         * ����z303DispatchLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303DispatchLibrary(String value) {
            this.z303DispatchLibrary = value;
        }

        /**
         * ��ȡz303BirthDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303BirthDate() {
            return z303BirthDate;
        }

        /**
         * ����z303BirthDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303BirthDate(String value) {
            this.z303BirthDate = value;
        }

        /**
         * ��ȡz303ExportConsent���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303ExportConsent() {
            return z303ExportConsent;
        }

        /**
         * ����z303ExportConsent���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303ExportConsent(String value) {
            this.z303ExportConsent = value;
        }

        /**
         * ��ȡz303ProxyIdType���Ե�ֵ��
         */
        public byte getZ303ProxyIdType() {
            return z303ProxyIdType;
        }

        /**
         * ����z303ProxyIdType���Ե�ֵ��
         */
        public void setZ303ProxyIdType(byte value) {
            this.z303ProxyIdType = value;
        }

        /**
         * ��ȡz303SendAllLetters���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303SendAllLetters() {
            return z303SendAllLetters;
        }

        /**
         * ����z303SendAllLetters���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303SendAllLetters(String value) {
            this.z303SendAllLetters = value;
        }

        /**
         * ��ȡz303PlainHtml���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303PlainHtml() {
            return z303PlainHtml;
        }

        /**
         * ����z303PlainHtml���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303PlainHtml(String value) {
            this.z303PlainHtml = value;
        }

        /**
         * ��ȡz303WantSms���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303WantSms() {
            return z303WantSms;
        }

        /**
         * ����z303WantSms���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303WantSms(String value) {
            this.z303WantSms = value;
        }

        /**
         * ��ȡz303PlifModification���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303PlifModification() {
            return z303PlifModification;
        }

        /**
         * ����z303PlifModification���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303PlifModification(String value) {
            this.z303PlifModification = value;
        }

        /**
         * ��ȡz303TitleReqLimit���Ե�ֵ��
         */
        public byte getZ303TitleReqLimit() {
            return z303TitleReqLimit;
        }

        /**
         * ����z303TitleReqLimit���Ե�ֵ��
         */
        public void setZ303TitleReqLimit(byte value) {
            this.z303TitleReqLimit = value;
        }

        /**
         * ��ȡz303Gender���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Gender() {
            return z303Gender;
        }

        /**
         * ����z303Gender���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Gender(String value) {
            this.z303Gender = value;
        }

        /**
         * ��ȡz303Birthplace���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ303Birthplace() {
            return z303Birthplace;
        }

        /**
         * ����z303Birthplace���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ303Birthplace(String value) {
            this.z303Birthplace = value;
        }

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
     *         &lt;element name="z304-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-sequence" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z304-address-0" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-address-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-email-address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-date-from" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z304-date-to" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z304-address-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z304-telephone-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-telephone-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-telephone-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-sms-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z304-update-date" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="z304-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "z304Id",
            "z304Sequence",
            "z304Address0",
            "z304Address1",
            "z304Zip",
            "z304EmailAddress",
            "z304Telephone",
            "z304DateFrom",
            "z304DateTo",
            "z304AddressType",
            "z304Telephone2",
            "z304Telephone3",
            "z304Telephone4",
            "z304SmsNumber",
            "z304UpdateDate",
            "z304CatName"
    })
    public static class Z304 {

        @XmlElement(name = "z304-id", required = true)
        protected String z304Id;
        @XmlElement(name = "z304-sequence")
        protected byte z304Sequence;
        @XmlElement(name = "z304-address-0", required = true)
        protected String z304Address0;
        @XmlElement(name = "z304-address-1", required = true)
        protected String z304Address1;
        @XmlElement(name = "z304-zip", required = true)
        protected String z304Zip;
        @XmlElement(name = "z304-email-address", required = true)
        protected String z304EmailAddress;
        @XmlElement(name = "z304-telephone", required = true)
        protected String z304Telephone;
        @XmlElement(name = "z304-date-from")
        protected byte z304DateFrom;
        @XmlElement(name = "z304-date-to")
        protected byte z304DateTo;
        @XmlElement(name = "z304-address-type")
        protected byte z304AddressType;
        @XmlElement(name = "z304-telephone-2", required = true)
        protected String z304Telephone2;
        @XmlElement(name = "z304-telephone-3", required = true)
        protected String z304Telephone3;
        @XmlElement(name = "z304-telephone-4", required = true)
        protected String z304Telephone4;
        @XmlElement(name = "z304-sms-number", required = true)
        protected String z304SmsNumber;
        @XmlElement(name = "z304-update-date")
        protected int z304UpdateDate;
        @XmlElement(name = "z304-cat-name", required = true)
        protected String z304CatName;

        /**
         * ��ȡz304Id���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Id() {
            return z304Id;
        }

        /**
         * ����z304Id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Id(String value) {
            this.z304Id = value;
        }

        /**
         * ��ȡz304Sequence���Ե�ֵ��
         */
        public byte getZ304Sequence() {
            return z304Sequence;
        }

        /**
         * ����z304Sequence���Ե�ֵ��
         */
        public void setZ304Sequence(byte value) {
            this.z304Sequence = value;
        }

        /**
         * ��ȡz304Address0���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Address0() {
            return z304Address0;
        }

        /**
         * ����z304Address0���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Address0(String value) {
            this.z304Address0 = value;
        }

        /**
         * ��ȡz304Address1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Address1() {
            return z304Address1;
        }

        /**
         * ����z304Address1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Address1(String value) {
            this.z304Address1 = value;
        }

        /**
         * ��ȡz304Zip���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Zip() {
            return z304Zip;
        }

        /**
         * ����z304Zip���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Zip(String value) {
            this.z304Zip = value;
        }

        /**
         * ��ȡz304EmailAddress���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304EmailAddress() {
            return z304EmailAddress;
        }

        /**
         * ����z304EmailAddress���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304EmailAddress(String value) {
            this.z304EmailAddress = value;
        }

        /**
         * ��ȡz304Telephone���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Telephone() {
            return z304Telephone;
        }

        /**
         * ����z304Telephone���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Telephone(String value) {
            this.z304Telephone = value;
        }

        /**
         * ��ȡz304DateFrom���Ե�ֵ��
         */
        public byte getZ304DateFrom() {
            return z304DateFrom;
        }

        /**
         * ����z304DateFrom���Ե�ֵ��
         */
        public void setZ304DateFrom(byte value) {
            this.z304DateFrom = value;
        }

        /**
         * ��ȡz304DateTo���Ե�ֵ��
         */
        public byte getZ304DateTo() {
            return z304DateTo;
        }

        /**
         * ����z304DateTo���Ե�ֵ��
         */
        public void setZ304DateTo(byte value) {
            this.z304DateTo = value;
        }

        /**
         * ��ȡz304AddressType���Ե�ֵ��
         */
        public byte getZ304AddressType() {
            return z304AddressType;
        }

        /**
         * ����z304AddressType���Ե�ֵ��
         */
        public void setZ304AddressType(byte value) {
            this.z304AddressType = value;
        }

        /**
         * ��ȡz304Telephone2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Telephone2() {
            return z304Telephone2;
        }

        /**
         * ����z304Telephone2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Telephone2(String value) {
            this.z304Telephone2 = value;
        }

        /**
         * ��ȡz304Telephone3���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Telephone3() {
            return z304Telephone3;
        }

        /**
         * ����z304Telephone3���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Telephone3(String value) {
            this.z304Telephone3 = value;
        }

        /**
         * ��ȡz304Telephone4���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304Telephone4() {
            return z304Telephone4;
        }

        /**
         * ����z304Telephone4���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304Telephone4(String value) {
            this.z304Telephone4 = value;
        }

        /**
         * ��ȡz304SmsNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304SmsNumber() {
            return z304SmsNumber;
        }

        /**
         * ����z304SmsNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304SmsNumber(String value) {
            this.z304SmsNumber = value;
        }

        /**
         * ��ȡz304UpdateDate���Ե�ֵ��
         */
        public int getZ304UpdateDate() {
            return z304UpdateDate;
        }

        /**
         * ����z304UpdateDate���Ե�ֵ��
         */
        public void setZ304UpdateDate(int value) {
            this.z304UpdateDate = value;
        }

        /**
         * ��ȡz304CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ304CatName() {
            return z304CatName;
        }

        /**
         * ����z304CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ304CatName(String value) {
            this.z304CatName = value;
        }

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
     *         &lt;element name="z305-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-sub-library" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-open-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-update-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-bor-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-bor-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-registration-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-expiry-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-note" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-loan-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-photo-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-over-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-multi-hold" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-loan-check" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-hold-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-renew-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-rr-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-ignore-late-return" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-last-activity-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-photo-charge" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-no-loan" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-no-hold" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-no-photo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-no-cash" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-cash-limit" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="z305-credit-debit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-sum" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="z305-delinq-1" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-n-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-delinq-1-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-1-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-delinq-2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-n-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-delinq-2-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-2-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-delinq-3" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-n-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-delinq-3-update-date" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="z305-delinq-3-cat-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-field-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-field-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-field-3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-hold-on-shelf" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-end-block-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-booking-permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-booking-ignore-hours" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="z305-rush-cat-request" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "z305Id",
            "z305SubLibrary",
            "z305OpenDate",
            "z305UpdateDate",
            "z305BorType",
            "z305BorStatus",
            "z305RegistrationDate",
            "z305ExpiryDate",
            "z305Note",
            "z305LoanPermission",
            "z305PhotoPermission",
            "z305OverPermission",
            "z305MultiHold",
            "z305LoanCheck",
            "z305HoldPermission",
            "z305RenewPermission",
            "z305RrPermission",
            "z305IgnoreLateReturn",
            "z305LastActivityDate",
            "z305PhotoCharge",
            "z305NoLoan",
            "z305NoHold",
            "z305NoPhoto",
            "z305NoCash",
            "z305CashLimit",
            "z305CreditDebit",
            "z305Sum",
            "z305Delinq1",
            "z305DelinqN1",
            "z305Delinq1UpdateDate",
            "z305Delinq1CatName",
            "z305Delinq2",
            "z305DelinqN2",
            "z305Delinq2UpdateDate",
            "z305Delinq2CatName",
            "z305Delinq3",
            "z305DelinqN3",
            "z305Delinq3UpdateDate",
            "z305Delinq3CatName",
            "z305Field1",
            "z305Field2",
            "z305Field3",
            "z305HoldOnShelf",
            "z305EndBlockDate",
            "z305BookingPermission",
            "z305BookingIgnoreHours",
            "z305RushCatRequest"
    })
    public static class Z305 {

        @XmlElement(name = "z305-id", required = true)
        protected String z305Id;
        @XmlElement(name = "z305-sub-library", required = true)
        protected String z305SubLibrary;
        @XmlElement(name = "z305-open-date", required = true)
        protected String z305OpenDate;
        @XmlElement(name = "z305-update-date", required = true)
        protected String z305UpdateDate;
        @XmlElement(name = "z305-bor-type", required = true)
        protected String z305BorType;
        @XmlElement(name = "z305-bor-status", required = true)
        protected String z305BorStatus;
        @XmlElement(name = "z305-registration-date")
        protected byte z305RegistrationDate;
        @XmlElement(name = "z305-expiry-date", required = true)
        protected String z305ExpiryDate;
        @XmlElement(name = "z305-note", required = true)
        protected String z305Note;
        @XmlElement(name = "z305-loan-permission", required = true)
        protected String z305LoanPermission;
        @XmlElement(name = "z305-photo-permission", required = true)
        protected String z305PhotoPermission;
        @XmlElement(name = "z305-over-permission", required = true)
        protected String z305OverPermission;
        @XmlElement(name = "z305-multi-hold", required = true)
        protected String z305MultiHold;
        @XmlElement(name = "z305-loan-check", required = true)
        protected String z305LoanCheck;
        @XmlElement(name = "z305-hold-permission", required = true)
        protected String z305HoldPermission;
        @XmlElement(name = "z305-renew-permission", required = true)
        protected String z305RenewPermission;
        @XmlElement(name = "z305-rr-permission", required = true)
        protected String z305RrPermission;
        @XmlElement(name = "z305-ignore-late-return", required = true)
        protected String z305IgnoreLateReturn;
        @XmlElement(name = "z305-last-activity-date", required = true)
        protected String z305LastActivityDate;
        @XmlElement(name = "z305-photo-charge", required = true)
        protected String z305PhotoCharge;
        @XmlElement(name = "z305-no-loan")
        protected byte z305NoLoan;
        @XmlElement(name = "z305-no-hold")
        protected byte z305NoHold;
        @XmlElement(name = "z305-no-photo")
        protected byte z305NoPhoto;
        @XmlElement(name = "z305-no-cash")
        protected byte z305NoCash;
        @XmlElement(name = "z305-cash-limit")
        protected float z305CashLimit;
        @XmlElement(name = "z305-credit-debit", required = true)
        protected String z305CreditDebit;
        @XmlElement(name = "z305-sum")
        protected float z305Sum;
        @XmlElement(name = "z305-delinq-1")
        protected byte z305Delinq1;
        @XmlElement(name = "z305-delinq-n-1", required = true)
        protected String z305DelinqN1;
        @XmlElement(name = "z305-delinq-1-update-date")
        protected byte z305Delinq1UpdateDate;
        @XmlElement(name = "z305-delinq-1-cat-name", required = true)
        protected String z305Delinq1CatName;
        @XmlElement(name = "z305-delinq-2")
        protected byte z305Delinq2;
        @XmlElement(name = "z305-delinq-n-2", required = true)
        protected String z305DelinqN2;
        @XmlElement(name = "z305-delinq-2-update-date")
        protected byte z305Delinq2UpdateDate;
        @XmlElement(name = "z305-delinq-2-cat-name", required = true)
        protected String z305Delinq2CatName;
        @XmlElement(name = "z305-delinq-3")
        protected byte z305Delinq3;
        @XmlElement(name = "z305-delinq-n-3", required = true)
        protected String z305DelinqN3;
        @XmlElement(name = "z305-delinq-3-update-date")
        protected byte z305Delinq3UpdateDate;
        @XmlElement(name = "z305-delinq-3-cat-name", required = true)
        protected String z305Delinq3CatName;
        @XmlElement(name = "z305-field-1", required = true)
        protected String z305Field1;
        @XmlElement(name = "z305-field-2", required = true)
        protected String z305Field2;
        @XmlElement(name = "z305-field-3", required = true)
        protected String z305Field3;
        @XmlElement(name = "z305-hold-on-shelf", required = true)
        protected String z305HoldOnShelf;
        @XmlElement(name = "z305-end-block-date", required = true)
        protected String z305EndBlockDate;
        @XmlElement(name = "z305-booking-permission", required = true)
        protected String z305BookingPermission;
        @XmlElement(name = "z305-booking-ignore-hours", required = true)
        protected String z305BookingIgnoreHours;
        @XmlElement(name = "z305-rush-cat-request", required = true)
        protected String z305RushCatRequest;

        /**
         * ��ȡz305Id���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Id() {
            return z305Id;
        }

        /**
         * ����z305Id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Id(String value) {
            this.z305Id = value;
        }

        /**
         * ��ȡz305SubLibrary���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305SubLibrary() {
            return z305SubLibrary;
        }

        /**
         * ����z305SubLibrary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305SubLibrary(String value) {
            this.z305SubLibrary = value;
        }

        /**
         * ��ȡz305OpenDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305OpenDate() {
            return z305OpenDate;
        }

        /**
         * ����z305OpenDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305OpenDate(String value) {
            this.z305OpenDate = value;
        }

        /**
         * ��ȡz305UpdateDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305UpdateDate() {
            return z305UpdateDate;
        }

        /**
         * ����z305UpdateDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305UpdateDate(String value) {
            this.z305UpdateDate = value;
        }

        /**
         * ��ȡz305BorType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305BorType() {
            return z305BorType;
        }

        /**
         * ����z305BorType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305BorType(String value) {
            this.z305BorType = value;
        }

        /**
         * ��ȡz305BorStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305BorStatus() {
            return z305BorStatus;
        }

        /**
         * ����z305BorStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305BorStatus(String value) {
            this.z305BorStatus = value;
        }

        /**
         * ��ȡz305RegistrationDate���Ե�ֵ��
         */
        public byte getZ305RegistrationDate() {
            return z305RegistrationDate;
        }

        /**
         * ����z305RegistrationDate���Ե�ֵ��
         */
        public void setZ305RegistrationDate(byte value) {
            this.z305RegistrationDate = value;
        }

        /**
         * ��ȡz305ExpiryDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305ExpiryDate() {
            return z305ExpiryDate;
        }

        /**
         * ����z305ExpiryDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305ExpiryDate(String value) {
            this.z305ExpiryDate = value;
        }

        /**
         * ��ȡz305Note���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Note() {
            return z305Note;
        }

        /**
         * ����z305Note���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Note(String value) {
            this.z305Note = value;
        }

        /**
         * ��ȡz305LoanPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305LoanPermission() {
            return z305LoanPermission;
        }

        /**
         * ����z305LoanPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305LoanPermission(String value) {
            this.z305LoanPermission = value;
        }

        /**
         * ��ȡz305PhotoPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305PhotoPermission() {
            return z305PhotoPermission;
        }

        /**
         * ����z305PhotoPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305PhotoPermission(String value) {
            this.z305PhotoPermission = value;
        }

        /**
         * ��ȡz305OverPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305OverPermission() {
            return z305OverPermission;
        }

        /**
         * ����z305OverPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305OverPermission(String value) {
            this.z305OverPermission = value;
        }

        /**
         * ��ȡz305MultiHold���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305MultiHold() {
            return z305MultiHold;
        }

        /**
         * ����z305MultiHold���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305MultiHold(String value) {
            this.z305MultiHold = value;
        }

        /**
         * ��ȡz305LoanCheck���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305LoanCheck() {
            return z305LoanCheck;
        }

        /**
         * ����z305LoanCheck���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305LoanCheck(String value) {
            this.z305LoanCheck = value;
        }

        /**
         * ��ȡz305HoldPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305HoldPermission() {
            return z305HoldPermission;
        }

        /**
         * ����z305HoldPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305HoldPermission(String value) {
            this.z305HoldPermission = value;
        }

        /**
         * ��ȡz305RenewPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305RenewPermission() {
            return z305RenewPermission;
        }

        /**
         * ����z305RenewPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305RenewPermission(String value) {
            this.z305RenewPermission = value;
        }

        /**
         * ��ȡz305RrPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305RrPermission() {
            return z305RrPermission;
        }

        /**
         * ����z305RrPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305RrPermission(String value) {
            this.z305RrPermission = value;
        }

        /**
         * ��ȡz305IgnoreLateReturn���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305IgnoreLateReturn() {
            return z305IgnoreLateReturn;
        }

        /**
         * ����z305IgnoreLateReturn���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305IgnoreLateReturn(String value) {
            this.z305IgnoreLateReturn = value;
        }

        /**
         * ��ȡz305LastActivityDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305LastActivityDate() {
            return z305LastActivityDate;
        }

        /**
         * ����z305LastActivityDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305LastActivityDate(String value) {
            this.z305LastActivityDate = value;
        }

        /**
         * ��ȡz305PhotoCharge���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305PhotoCharge() {
            return z305PhotoCharge;
        }

        /**
         * ����z305PhotoCharge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305PhotoCharge(String value) {
            this.z305PhotoCharge = value;
        }

        /**
         * ��ȡz305NoLoan���Ե�ֵ��
         */
        public byte getZ305NoLoan() {
            return z305NoLoan;
        }

        /**
         * ����z305NoLoan���Ե�ֵ��
         */
        public void setZ305NoLoan(byte value) {
            this.z305NoLoan = value;
        }

        /**
         * ��ȡz305NoHold���Ե�ֵ��
         */
        public byte getZ305NoHold() {
            return z305NoHold;
        }

        /**
         * ����z305NoHold���Ե�ֵ��
         */
        public void setZ305NoHold(byte value) {
            this.z305NoHold = value;
        }

        /**
         * ��ȡz305NoPhoto���Ե�ֵ��
         */
        public byte getZ305NoPhoto() {
            return z305NoPhoto;
        }

        /**
         * ����z305NoPhoto���Ե�ֵ��
         */
        public void setZ305NoPhoto(byte value) {
            this.z305NoPhoto = value;
        }

        /**
         * ��ȡz305NoCash���Ե�ֵ��
         */
        public byte getZ305NoCash() {
            return z305NoCash;
        }

        /**
         * ����z305NoCash���Ե�ֵ��
         */
        public void setZ305NoCash(byte value) {
            this.z305NoCash = value;
        }

        /**
         * ��ȡz305CashLimit���Ե�ֵ��
         */
        public float getZ305CashLimit() {
            return z305CashLimit;
        }

        /**
         * ����z305CashLimit���Ե�ֵ��
         */
        public void setZ305CashLimit(float value) {
            this.z305CashLimit = value;
        }

        /**
         * ��ȡz305CreditDebit���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305CreditDebit() {
            return z305CreditDebit;
        }

        /**
         * ����z305CreditDebit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305CreditDebit(String value) {
            this.z305CreditDebit = value;
        }

        /**
         * ��ȡz305Sum���Ե�ֵ��
         */
        public float getZ305Sum() {
            return z305Sum;
        }

        /**
         * ����z305Sum���Ե�ֵ��
         */
        public void setZ305Sum(float value) {
            this.z305Sum = value;
        }

        /**
         * ��ȡz305Delinq1���Ե�ֵ��
         */
        public byte getZ305Delinq1() {
            return z305Delinq1;
        }

        /**
         * ����z305Delinq1���Ե�ֵ��
         */
        public void setZ305Delinq1(byte value) {
            this.z305Delinq1 = value;
        }

        /**
         * ��ȡz305DelinqN1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305DelinqN1() {
            return z305DelinqN1;
        }

        /**
         * ����z305DelinqN1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305DelinqN1(String value) {
            this.z305DelinqN1 = value;
        }

        /**
         * ��ȡz305Delinq1UpdateDate���Ե�ֵ��
         */
        public byte getZ305Delinq1UpdateDate() {
            return z305Delinq1UpdateDate;
        }

        /**
         * ����z305Delinq1UpdateDate���Ե�ֵ��
         */
        public void setZ305Delinq1UpdateDate(byte value) {
            this.z305Delinq1UpdateDate = value;
        }

        /**
         * ��ȡz305Delinq1CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Delinq1CatName() {
            return z305Delinq1CatName;
        }

        /**
         * ����z305Delinq1CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Delinq1CatName(String value) {
            this.z305Delinq1CatName = value;
        }

        /**
         * ��ȡz305Delinq2���Ե�ֵ��
         */
        public byte getZ305Delinq2() {
            return z305Delinq2;
        }

        /**
         * ����z305Delinq2���Ե�ֵ��
         */
        public void setZ305Delinq2(byte value) {
            this.z305Delinq2 = value;
        }

        /**
         * ��ȡz305DelinqN2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305DelinqN2() {
            return z305DelinqN2;
        }

        /**
         * ����z305DelinqN2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305DelinqN2(String value) {
            this.z305DelinqN2 = value;
        }

        /**
         * ��ȡz305Delinq2UpdateDate���Ե�ֵ��
         */
        public byte getZ305Delinq2UpdateDate() {
            return z305Delinq2UpdateDate;
        }

        /**
         * ����z305Delinq2UpdateDate���Ե�ֵ��
         */
        public void setZ305Delinq2UpdateDate(byte value) {
            this.z305Delinq2UpdateDate = value;
        }

        /**
         * ��ȡz305Delinq2CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Delinq2CatName() {
            return z305Delinq2CatName;
        }

        /**
         * ����z305Delinq2CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Delinq2CatName(String value) {
            this.z305Delinq2CatName = value;
        }

        /**
         * ��ȡz305Delinq3���Ե�ֵ��
         */
        public byte getZ305Delinq3() {
            return z305Delinq3;
        }

        /**
         * ����z305Delinq3���Ե�ֵ��
         */
        public void setZ305Delinq3(byte value) {
            this.z305Delinq3 = value;
        }

        /**
         * ��ȡz305DelinqN3���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305DelinqN3() {
            return z305DelinqN3;
        }

        /**
         * ����z305DelinqN3���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305DelinqN3(String value) {
            this.z305DelinqN3 = value;
        }

        /**
         * ��ȡz305Delinq3UpdateDate���Ե�ֵ��
         */
        public byte getZ305Delinq3UpdateDate() {
            return z305Delinq3UpdateDate;
        }

        /**
         * ����z305Delinq3UpdateDate���Ե�ֵ��
         */
        public void setZ305Delinq3UpdateDate(byte value) {
            this.z305Delinq3UpdateDate = value;
        }

        /**
         * ��ȡz305Delinq3CatName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Delinq3CatName() {
            return z305Delinq3CatName;
        }

        /**
         * ����z305Delinq3CatName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Delinq3CatName(String value) {
            this.z305Delinq3CatName = value;
        }

        /**
         * ��ȡz305Field1���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Field1() {
            return z305Field1;
        }

        /**
         * ����z305Field1���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Field1(String value) {
            this.z305Field1 = value;
        }

        /**
         * ��ȡz305Field2���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Field2() {
            return z305Field2;
        }

        /**
         * ����z305Field2���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Field2(String value) {
            this.z305Field2 = value;
        }

        /**
         * ��ȡz305Field3���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305Field3() {
            return z305Field3;
        }

        /**
         * ����z305Field3���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305Field3(String value) {
            this.z305Field3 = value;
        }

        /**
         * ��ȡz305HoldOnShelf���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305HoldOnShelf() {
            return z305HoldOnShelf;
        }

        /**
         * ����z305HoldOnShelf���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305HoldOnShelf(String value) {
            this.z305HoldOnShelf = value;
        }

        /**
         * ��ȡz305EndBlockDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305EndBlockDate() {
            return z305EndBlockDate;
        }

        /**
         * ����z305EndBlockDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305EndBlockDate(String value) {
            this.z305EndBlockDate = value;
        }

        /**
         * ��ȡz305BookingPermission���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305BookingPermission() {
            return z305BookingPermission;
        }

        /**
         * ����z305BookingPermission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305BookingPermission(String value) {
            this.z305BookingPermission = value;
        }

        /**
         * ��ȡz305BookingIgnoreHours���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305BookingIgnoreHours() {
            return z305BookingIgnoreHours;
        }

        /**
         * ����z305BookingIgnoreHours���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305BookingIgnoreHours(String value) {
            this.z305BookingIgnoreHours = value;
        }

        /**
         * ��ȡz305RushCatRequest���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getZ305RushCatRequest() {
            return z305RushCatRequest;
        }

        /**
         * ����z305RushCatRequest���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setZ305RushCatRequest(String value) {
            this.z305RushCatRequest = value;
        }

    }

}
