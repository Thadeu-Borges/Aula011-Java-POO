/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011;

/**
 *
 * @author AAAA
 */
public final class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public final void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
