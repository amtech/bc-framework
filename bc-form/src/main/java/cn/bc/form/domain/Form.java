package cn.bc.form.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.bc.identity.domain.FileEntityImpl;

/**
 * 表单
 * 
 * @author dragon
 * 
 */
@Entity
@Table(name = "BC_FORM")
public class Form extends FileEntityImpl {
	private static final long serialVersionUID = 1L;
	private String uid; //附件编码
	private String type;// 类别
	private String subject;// 标题
	private String template;// 模板编码
	
	
	@Column(name = "UID_")
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	@Column(name = "TYPE_")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "TPL_")
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
	
	
}
