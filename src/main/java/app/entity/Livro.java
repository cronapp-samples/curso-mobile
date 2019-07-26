package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;
import cronapi.CronapiSearchable;


/**
 * Classe que representa a tabela LIVRO
 * @generated
 */
@Entity
@Table(name = "\"LIVRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Livro")
public class Livro implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "autor", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String autor;

  /**
  * @generated
  */
  @Column(name = "isbn", nullable = false, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String isbn;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="LjjFEx-qJeUAAAAAAAACwrVUG6hxEzJjW-OtO5uVno5mEqudVeZRt0M0YlrhoZoB")
  
  private java.lang.String foto;

  /**
  * @generated
  */
  @Column(name = "lat", nullable = true, unique = false, length=15, precision=15, scale=10, insertable=true, updatable=true)
  
  private java.math.BigDecimal lat;

  /**
   * Construtor
   * @generated
   */
  public Livro(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Livro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Livro setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém autor
   * return autor
   * @generated
   */
  
  public java.lang.String getAutor(){
    return this.autor;
  }

  /**
   * Define autor
   * @param autor autor
   * @generated
   */
  public Livro setAutor(java.lang.String autor){
    this.autor = autor;
    return this;
  }

  /**
   * Obtém isbn
   * return isbn
   * @generated
   */
  
  public java.lang.String getIsbn(){
    return this.isbn;
  }

  /**
   * Define isbn
   * @param isbn isbn
   * @generated
   */
  public Livro setIsbn(java.lang.String isbn){
    this.isbn = isbn;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Livro setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * Obtém lat
   * return lat
   * @generated
   */
  
  public java.math.BigDecimal getLat(){
    return this.lat;
  }

  /**
   * Define lat
   * @param lat lat
   * @generated
   */
  public Livro setLat(java.math.BigDecimal lat){
    this.lat = lat;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Livro object = (Livro)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
