/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "booksauthors")
public class BookAuthor implements Serializable{
   
    @Id
    @GeneratedValue
    @JoinColumn(name="seq_no")
    private Integer seq_No;
    
    
    @ManyToOne
    @JoinColumn(name="isbn")
    private Books livro;    
        
    
   
    @ManyToOne
    @JoinColumn(name="author_id")
    private Authors autor_id;
    
    public BookAuthor() {
    }

    public Integer getSeq_No() {
        return seq_No;
    }

    public void setSeq_No(Integer seq_No) {
        this.seq_No = seq_No;
    }

     
}
