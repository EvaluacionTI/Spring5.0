package pe.etg.bbva.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema="public", name="APXt02_notes")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value= {"createdAt", "updateAt"}, allowGetters=true)
public class CENoteIdentity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	@NotBlank
	private String title;
	
	@Column(name="content")
	@NotBlank
	private String content;
	
//	@Column(nullable=false, updatable=false)
//	@Temporal(TemporalType.TIMESTAMP)
//	@CreatedDate
	@Column(name="createAt")
	private Date createAt;
	
//	@Column(nullable=true, updatable=true)
//	@Temporal(TemporalType.TIMESTAMP)
//	@LastModifiedDate
	@Column(name="updateAt")
	private Date updateAt;

	protected CENoteIdentity() {}
	
	public CENoteIdentity(String psTitle, String psContent) {
		this.title = psTitle;
		this.content = psContent;
		this.createAt = new Date();
		this.updateAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return String.format("CENote [id=%s, title=%s, content=%s, createAt=%s, updateAt=%s]", id, title, content,
				createAt, updateAt);
	}
}
