/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.user;

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


public abstract class Users {

    /*  
        variables 
        dentro del programa estas variables deben ser extraidas de la base de datos
    */

    protected int idUser;
    protected int statusConnection;
    protected String statusAdmin;
    protected String passwordUser;
    protected String nameUser;

    Users(){
        this.statusConnection = 0;
        this.statusAdmin = "NA";
    };

        /*setters*/
    public void setNameUser(String nameUser){
        this.nameUser = nameUser;
    };
    
    public void setPasswordUser(String passwordUser){
        this.passwordUser = passwordUser;
    };
    
    protected void setStatusAdmin(String LevelAdmin){
        this.statusAdmin = LevelAdmin;
    };
    
    protected void setIdUser(int idUser){
        this.idUser = idUser;
    };

        /*getters*/
    public String setNameUser(){
        return this.nameUser;
    };
    
    public int setIdUser(){
        return this.idUser;
    };
    
        /*METHODS*/
    public int Autentication(String password, int IdUser){
        if(password == this.passwordUser && IdUser == this.idUser){
            this.statusConnection = 1;
        }else{
            System.out.println("el ID o la contraseña no coincide");
        };
        return this.statusConnection;
    };
}