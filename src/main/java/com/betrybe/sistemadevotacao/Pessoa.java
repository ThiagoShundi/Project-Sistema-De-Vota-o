package com.betrybe.sistemadevotacao;

/**
 * Class Pessoa.
 */
public abstract class Pessoa {
  private String nome;

  /**
   *  Constructor Pessoa.
   */
  public Pessoa(String nome) {
    this.nome = nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}

