package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;

  }

  public void receberVoto() {
    this.votos += 1;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public int getVotos() {
    return votos;
  }

}
