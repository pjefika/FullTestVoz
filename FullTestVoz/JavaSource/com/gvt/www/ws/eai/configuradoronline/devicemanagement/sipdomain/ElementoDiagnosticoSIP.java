/**
 * ElementoDiagnosticoSIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain;

public class ElementoDiagnosticoSIP  implements java.io.Serializable {
    private int deviceId;

    private java.lang.String tipo;

    private java.lang.String serialNumber;

    private java.lang.String macAddress;

    private java.lang.String statusCPE;

    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP[] diagnosticosSIP;

    private com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento;

    public ElementoDiagnosticoSIP() {
    }

    public ElementoDiagnosticoSIP(
           int deviceId,
           java.lang.String tipo,
           java.lang.String serialNumber,
           java.lang.String macAddress,
           java.lang.String statusCPE,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP[] diagnosticosSIP,
           com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento) {
           this.deviceId = deviceId;
           this.tipo = tipo;
           this.serialNumber = serialNumber;
           this.macAddress = macAddress;
           this.statusCPE = statusCPE;
           this.diagnosticosSIP = diagnosticosSIP;
           this.modeloEquipamento = modeloEquipamento;
    }


    /**
     * Gets the deviceId value for this ElementoDiagnosticoSIP.
     * 
     * @return deviceId
     */
    public int getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this ElementoDiagnosticoSIP.
     * 
     * @param deviceId
     */
    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the tipo value for this ElementoDiagnosticoSIP.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ElementoDiagnosticoSIP.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the serialNumber value for this ElementoDiagnosticoSIP.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ElementoDiagnosticoSIP.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the macAddress value for this ElementoDiagnosticoSIP.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this ElementoDiagnosticoSIP.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the statusCPE value for this ElementoDiagnosticoSIP.
     * 
     * @return statusCPE
     */
    public java.lang.String getStatusCPE() {
        return statusCPE;
    }


    /**
     * Sets the statusCPE value for this ElementoDiagnosticoSIP.
     * 
     * @param statusCPE
     */
    public void setStatusCPE(java.lang.String statusCPE) {
        this.statusCPE = statusCPE;
    }


    /**
     * Gets the diagnosticosSIP value for this ElementoDiagnosticoSIP.
     * 
     * @return diagnosticosSIP
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP[] getDiagnosticosSIP() {
        return diagnosticosSIP;
    }


    /**
     * Sets the diagnosticosSIP value for this ElementoDiagnosticoSIP.
     * 
     * @param diagnosticosSIP
     */
    public void setDiagnosticosSIP(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP[] diagnosticosSIP) {
        this.diagnosticosSIP = diagnosticosSIP;
    }


    /**
     * Gets the modeloEquipamento value for this ElementoDiagnosticoSIP.
     * 
     * @return modeloEquipamento
     */
    public com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento getModeloEquipamento() {
        return modeloEquipamento;
    }


    /**
     * Sets the modeloEquipamento value for this ElementoDiagnosticoSIP.
     * 
     * @param modeloEquipamento
     */
    public void setModeloEquipamento(com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementoDiagnosticoSIP)) return false;
        ElementoDiagnosticoSIP other = (ElementoDiagnosticoSIP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceId == other.getDeviceId() &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.statusCPE==null && other.getStatusCPE()==null) || 
             (this.statusCPE!=null &&
              this.statusCPE.equals(other.getStatusCPE()))) &&
            ((this.diagnosticosSIP==null && other.getDiagnosticosSIP()==null) || 
             (this.diagnosticosSIP!=null &&
              java.util.Arrays.equals(this.diagnosticosSIP, other.getDiagnosticosSIP()))) &&
            ((this.modeloEquipamento==null && other.getModeloEquipamento()==null) || 
             (this.modeloEquipamento!=null &&
              this.modeloEquipamento.equals(other.getModeloEquipamento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getDeviceId();
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getStatusCPE() != null) {
            _hashCode += getStatusCPE().hashCode();
        }
        if (getDiagnosticosSIP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticosSIP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticosSIP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModeloEquipamento() != null) {
            _hashCode += getModeloEquipamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementoDiagnosticoSIP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ElementoDiagnosticoSIP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "statusCPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticosSIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "diagnosticosSIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIP"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "diagnosticoSIP"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "modeloEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/modeloEquipamento", "ModeloEquipamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
