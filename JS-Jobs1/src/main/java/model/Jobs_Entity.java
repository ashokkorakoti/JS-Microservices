package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs_Entity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long jobId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="mandatory_skill")
	private String mandatory_skill;

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMandatory_skill() {
		return mandatory_skill;
	}

	public void setMandatory_skill(String mandatory_skill) {
		this.mandatory_skill = mandatory_skill;
	}
	
}
