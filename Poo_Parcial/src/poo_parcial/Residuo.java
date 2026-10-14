/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial;

/**
 *
 * @author simonhoyos
 */
public class Residuo {
    private float vidrio;
    private float papel;
    private float plastico;
    private float metal;
    private float residuosOrganicos;
    
    public Residuo(float vidrio, float papel,float plastico,float metal,float residuosOrganicos){
        this.vidrio=vidrio;
        this.papel=papel;
        this.plastico=plastico;
        this.metal=metal;
        this.residuosOrganicos=residuosOrganicos;
    }

    public float getVidrio() {
        return vidrio;
    }

    public float getPapel() {
        return papel;
    }

    public float getPlastico() {
        return plastico;
    }

    public float getMetal() {
        return metal;
    }

    public float getResiduosOrganicos() {
        return residuosOrganicos;
    }
    
}
