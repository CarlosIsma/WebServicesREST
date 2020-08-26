/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "multicines")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Multicines.findAll", query = "SELECT m FROM Multicines m"),
    @NamedQuery(name = "Multicines.findById", query = "SELECT m FROM Multicines m WHERE m.id = :id"),
    @NamedQuery(name = "Multicines.findByTitulo", query = "SELECT m FROM Multicines m WHERE m.titulo = :titulo"),
    @NamedQuery(name = "Multicines.findByGenero", query = "SELECT m FROM Multicines m WHERE m.genero = :genero"),
    @NamedQuery(name = "Multicines.findByIdioma", query = "SELECT m FROM Multicines m WHERE m.idioma = :idioma"),
    @NamedQuery(name = "Multicines.findByDuracion", query = "SELECT m FROM Multicines m WHERE m.duracion = :duracion"),
    @NamedQuery(name = "Multicines.findByCalificacion", query = "SELECT m FROM Multicines m WHERE m.calificacion = :calificacion"),
    @NamedQuery(name = "Multicines.findByResumen", query = "SELECT m FROM Multicines m WHERE m.resumen = :resumen"),
    @NamedQuery(name = "Multicines.findByAnioProduccion", query = "SELECT m FROM Multicines m WHERE m.anioProduccion = :anioProduccion"),
    @NamedQuery(name = "Multicines.findByFormato", query = "SELECT m FROM Multicines m WHERE m.formato = :formato"),
    @NamedQuery(name = "Multicines.findByDirector", query = "SELECT m FROM Multicines m WHERE m.director = :director"),
    @NamedQuery(name = "Multicines.findByClasificacion", query = "SELECT m FROM Multicines m WHERE m.clasificacion = :clasificacion")})
public class Multicines implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idioma")
    private String idioma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "duracion")
    private String duracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "resumen")
    private String resumen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio_produccion")
    @Temporal(TemporalType.DATE)
    private Date anioProduccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "formato")
    private String formato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "clasificacion")
    private String clasificacion;

    public Multicines() {
    }

    public Multicines(Integer id) {
        this.id = id;
    }

    public Multicines(Integer id, String titulo, String genero, String idioma, String duracion, String calificacion, String resumen, Date anioProduccion, String formato, String director, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.resumen = resumen;
        this.anioProduccion = anioProduccion;
        this.formato = formato;
        this.director = director;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getAnioProduccion() {
        return anioProduccion;
    }

    public void setAnioProduccion(Date anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Multicines)) {
            return false;
        }
        Multicines other = (Multicines) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restful.entidades.Multicines[ id=" + id + " ]";
    }
    
}
