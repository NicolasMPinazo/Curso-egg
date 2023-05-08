/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package com.mycompany.poo.Entidades;

import java.util.Scanner;

public class Account {

    Scanner scanner = new Scanner(System.in);

    private Integer numberAccount;
    private Integer DNI;
    private Double currentBalance;
    private Double interests;

    public Account() {
    }

    public Account(Integer numberAccount, Integer DNI, Double interests) {
        this.numberAccount = numberAccount;
        this.DNI = DNI;
        this.interests = interests;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getInterests() {
        return interests;
    }

    public void setInterests(Double interests) {
        this.interests = interests;
    }

    public Account createAccount() {

        Account account = new Account();

        System.out.println("Number Account: ");
        setNumberAccount(scanner.nextInt());
        System.out.println("DNI: ");
        setDNI(scanner.nextInt());

        return account;

    }

    public Double depositMoney() {

        System.out.println("Deposit Money?: ");
        Double depositMoney = scanner.nextDouble();

        setCurrentBalance(getCurrentBalance() + depositMoney);

        return getCurrentBalance();
        
    }
    
    public  Double extractMoney(){
        
        System.out.println(" Extract Money?: ");
        Double extractMoney = scanner.nextDouble();
        
        if (extractMoney > getCurrentBalance()){
            setCurrentBalance(0.0);
        }else{
            setCurrentBalance(getCurrentBalance() - extractMoney);
        }
        
        return getCurrentBalance();
        
    }
    
    public void quickExtraction(){
        
        System.out.println("Quick Extraction:?  ");
        Double quickExtraction = scanner.nextDouble();
        
        Double maximumExtraction = (20*getCurrentBalance())/100;
        
        while(maximumExtraction>quickExtraction){
            System.out.println("For quick withdrawal only a maximum of 20% is allowed.Retry");
            quickExtraction = scanner.nextDouble();          
        }
        setCurrentBalance(getCurrentBalance() - quickExtraction);
        
       }
    
    public void checkBalance(){
        
        System.out.println("Your balance is:" +getCurrentBalance());
        
    }
    
    public void consultData(){
        
        System.out.println("Your data Is:" + getDNI()+ getNumberAccount());
    }

    @Override
    public String toString() {
        return "Account{" + "Number Account: " + numberAccount + ", DNI: " + DNI + ", Current Balance: " + currentBalance + '}';
    }
    
    

}
