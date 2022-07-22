/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.product;

/**
 * @author RODX - JonhDuranM - Solkep
 * @organization  TDDS - Team Developers Dynamics Solutions
 */


        /**
         * 
         * 
         *  Necesita Reestructuracion
         * 
         * 
         */



public class products {
    
    /*  
        variables 
        dentro del programa estas variables deben ser extraidas de la base de datos
    */
    
    protected String IdProduct;
    protected String NameProduct;
    protected double PriceProduct;
    
        /*Setters*/
    public void setIdProduct(String IdProduct){
        this.IdProduct = IdProduct;
    };
    
    public void setNameProduct(String NameProduct){
        this.NameProduct = NameProduct;
    };
    
    public void setPriceProduct(double PriceProduct){
        this.PriceProduct = PriceProduct;
    };
    
        /*Getters*/
    public String getIdProduct() {
        return IdProduct;
    };
    
    public String getNameProduct(){
        return this.NameProduct;
    };

    public double getPriceProduct(){
        return this.PriceProduct;
    };
    
        /*Methods*/
    
}
