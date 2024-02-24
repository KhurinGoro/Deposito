package cuentas;

/**
 *
 * @author Javier Maján Jiménez
 * Clase que representa una cuenta bancaria
 */
public class CCuenta {

    /**
     * Método get para el atributo nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para el atributo nombre
     * @param nombre que modifica el atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get para el atributo cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método set para el atributo cuenta
     * @param cuenta que modifica el atributo cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get para el atributo saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método set para el atributo saldo
     * @param saldo que modifica el atributo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método get para el atributo tipoInterés
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método set para el atributo tipoInterés
     * @param tipoInterés que modifica el atributo tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Atributos nombre, cuenta, saldo y tipoInterés de la clase CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parámetros que tiene la clase CCuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo     * 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método estado que devuelve el estado de la cuenta
     * @return getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar que sirve para incrementar el saldo de la cuenta
     *  y lanza una excepción cuando la cantidad es menor que 0
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método retirar que sirve para reducir el saldo de la cuenta
     *  y lanza una excepción cuando la cantidad es menor o igual a 0,
     *  o bien, el estado de la cuenta es menor que la cantidad que se quiere
     *  retirar.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
