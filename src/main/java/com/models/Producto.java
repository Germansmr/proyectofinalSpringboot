package com.models;

public class Producto {

    private long id;
    private String name;
    private long price;
    private long priceWithTaxes;
    private long productTypeId;
    private String productTypeName;

    public Producto(long id, String name, long price, long productTypeId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productTypeId = productTypeId;
        this.priceWithTaxes=calcularIva(price);
    }


    private long calcularIva(long price){


        long Iva = price/100*21;

        long precioIva = price + Iva;

        return precioIva;

    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPriceWithTaxes() {
        return priceWithTaxes;
    }

    public void setPriceWithTaxes(long priceWithTaxes) {
        this.priceWithTaxes = priceWithTaxes;
    }

    public long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }


}
